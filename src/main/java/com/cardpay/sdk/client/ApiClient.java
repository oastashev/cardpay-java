package com.cardpay.sdk.client;

import com.cardpay.sdk.api.AuthApi;
import com.cardpay.sdk.model.ApiTokens;
import com.cardpay.sdk.model.OAuthError;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.cardpay.sdk.model.OAuthError.NameEnum.TOKEN;
import static java.lang.System.currentTimeMillis;
import static java.lang.ThreadLocal.withInitial;

public class ApiClient {
    private String baseUrl;
    private String terminalCode;
    private String password;

    private Map<String, Interceptor> apiAuthorizations;
    private OkHttpClient.Builder okBuilder;
    private Retrofit.Builder adapterBuilder;

    private JSON json;

    public ApiClient() {
        apiAuthorizations = new LinkedHashMap<>();
        createDefaultAdapter();
    }

    public ApiClient(String baseUrl, String terminalCode, String password) {
        this.baseUrl = !baseUrl.endsWith("/") ? baseUrl + "/" : baseUrl;

        this.terminalCode = terminalCode;
        this.password = password;

        apiAuthorizations = new LinkedHashMap<>();
        createDefaultAdapter();
    }

  private void createDefaultAdapter() {
      this.json = new JSON();

      this.okBuilder = new OkHttpClient.Builder();
      this.okBuilder.addInterceptor(new UserAgentInterceptor("CardpaySdk/1.4.2.3/Java"));

      adapterBuilder = new Retrofit
              .Builder()
              .baseUrl(this.baseUrl)
              .addConverterFactory(ScalarsConverterFactory.create())
              .addConverterFactory(GsonCustomConverterFactory.create(this.json.getGson()));

        addAuthorization("Bearer", new TokenManagerInterceptor(
                createService(AuthApi.class),
                this.json,
                this.terminalCode,
                this.password
        ));
    }

    public <S> S createService(Class<S> serviceClass) {
        return adapterBuilder
                .client(okBuilder.build())
                .build()
                .create(serviceClass);
    }

    public ApiClient addLogging(HttpLoggingInterceptor.Level level) {
        okBuilder.addInterceptor(new HttpLoggingInterceptor().setLevel(level));
        return this;
    }

    /**
     * Adds an authorization to be used by the client
     *
     * @param authName      Authentication name
     * @param authorization Authorization interceptor
     * @return ApiClient
     */
    private ApiClient addAuthorization(String authName, Interceptor authorization) {
        if (apiAuthorizations.containsKey(authName)) {
            throw new RuntimeException("auth name \"" + authName + "\" already in api authorizations");
        }
        apiAuthorizations.put(authName, authorization);
        okBuilder.addInterceptor(authorization);
        return this;
    }

}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverterToString(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T convert(ResponseBody value) throws IOException {
        String returned = value.string();
        try {
            return gson.fromJson(returned, type);
        } catch (JsonParseException e) {
            return (T) returned;
        }
    }
}

class GsonCustomConverterFactory extends Converter.Factory {
    private final Gson gson;
    private final GsonConverterFactory gsonConverterFactory;

    public static GsonCustomConverterFactory create(Gson gson) {
        return new GsonCustomConverterFactory(gson);
    }

    private GsonCustomConverterFactory(Gson gson) {
        if (gson == null)
            throw new NullPointerException("gson == null");
        this.gson = gson;
        this.gsonConverterFactory = GsonConverterFactory.create(gson);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (type.equals(String.class))
            return new GsonResponseBodyConverterToString<Object>(gson, type);
        else
            return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
}

class UserAgentInterceptor implements Interceptor {
    private String userAgent;

    UserAgentInterceptor(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request userAgentRequest = chain.request()
                .newBuilder()
                .header("User-Agent", this.userAgent)
                .build();
        return chain.proceed(userAgentRequest);
    }
}

class TokenManagerInterceptor implements Interceptor {

    private static final long TOKEN_MIN_VALIDITY = 10000;

    private final AuthApi authApi;
    private JSON json;

    private final String terminalCode;
    private final String password;

    private ThreadLocal<ApiTokens> tokens = withInitial(() -> null);

    TokenManagerInterceptor(AuthApi authApi, JSON json, String terminalCode, String password) {
        this.terminalCode = terminalCode;
        this.password = password;
        this.json = json;
        this.authApi = authApi;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        if (request.url().encodedPath().contains("/api/auth/token")) {
            return chain.proceed(request);
        }

        Response response = proceed(chain, request, obtainToken());

        if (!response.isSuccessful() && response.body() != null) {
            if (isBadRequest(response)) {
                throw parseApiError(response);
            }

            OAuthError error = json.getGson().fromJson(response.body().string(), OAuthError.class);
            if (error.getName() != TOKEN) {
                throw new IOException(error.getMessage());
            }

            response = proceed(chain, request, obtainNewToken());

            if (!response.isSuccessful() && response.body() != null) {
                throw parseApiError(response);
            }
        }

        return response;
    }

    private boolean isBadRequest(Response response) {
        return response.code() == HttpURLConnection.HTTP_BAD_REQUEST;
    }

    private Response proceed(Chain chain, Request request, ApiTokens token) throws IOException {
        return chain.proceed(
                request.newBuilder()
                        .addHeader("Authorization", "Bearer " + token.getAccessToken())
                        .build()
        );
    }

    private ApiTokens obtainNewToken() throws IOException {
        ApiTokens token = tokens.get();
        try {
            if (token == null
                    || token.getRefreshToken() == null
                    || isExpired(token.getRefreshExpiresIn())
            ) {
                token = obtainByPassword(password, terminalCode);
            } else {
                token = obtainByRefreshToken(token.getRefreshToken());
            }
        } catch (IOException e) {
            token = obtainByPassword(password, terminalCode);
        }

        token.setExpiresIn(token.getExpiresIn() * 1000 + currentTimeMillis());
        token.setRefreshExpiresIn(token.getRefreshExpiresIn() * 1000 + currentTimeMillis());

        tokens.set(token);
        return token;
    }

    private ApiTokens obtainByRefreshToken(String refreshToken) throws IOException {
        retrofit2.Response<ApiTokens> response = authApi
                .obtainTokens("refresh_token", "", refreshToken, "")
                .execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            throw parseAuthError(response);
        }
    }

    private ApiTokens obtainByPassword(String password, String terminalCode) throws IOException {
        retrofit2.Response<ApiTokens> response = authApi
                .obtainTokens("password", password, "", terminalCode)
                .execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            throw parseAuthError(response);
        }
    }

    private IOException parseAuthError(retrofit2.Response<ApiTokens> response) throws IOException {
        if (response.errorBody() == null) {
            return new IOException("Unknown auth error");
        } else {
            OAuthError error = json.getGson().fromJson(response.errorBody().string(), OAuthError.class);
            return new IOException(error.getMessage());
        }
    }

    private IOException parseApiError(Response response) throws IOException {
        if (response.body() == null) {
            return new IOException("Unknown API error");
        } else {
            com.cardpay.sdk.model.Error apiError = json.getGson().fromJson(response.body().string(), com.cardpay.sdk.model.Error.class);
            return new IOException(apiError.getMessage());
        }
    }

    private ApiTokens obtainToken() throws IOException {
        ApiTokens token = this.tokens.get();
        if (token == null || isExpired(token.getExpiresIn())) {
            token = obtainNewToken();
        }
        return token;
    }

    private boolean isExpired(long expiresAt) {
        return expiresAt - currentTimeMillis() < TOKEN_MIN_VALIDITY;
    }

}
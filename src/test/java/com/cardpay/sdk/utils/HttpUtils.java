package com.cardpay.sdk.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HttpUtils {

    private final static Logger log = LoggerFactory.getLogger(HttpUtils.class);

    public static void doGet(String url) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        OkHttpClient client = new OkHttpClient();
        try {
            Response response = client.newCall(request).execute();
            log.info("{}", response);
            log.info("BODY: {}", response.body().string());
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

}

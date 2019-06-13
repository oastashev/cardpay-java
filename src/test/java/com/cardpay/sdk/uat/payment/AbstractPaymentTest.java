package com.cardpay.sdk.uat.payment;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.model.*;
import com.cardpay.sdk.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static com.cardpay.sdk.utils.DataUtils.cardAccount;
import static com.cardpay.sdk.utils.DataUtils.createPaymentRequest;
import static java.lang.System.currentTimeMillis;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public abstract class AbstractPaymentTest {

    final Logger log = LoggerFactory.getLogger(getClass());
    protected PaymentsApi payments;

    PaymentCreationResponse createPayment(PaymentRequest payment) throws IOException {
        try {
            Response<PaymentCreationResponse> response = payments.createPayment(payment).execute();

            log.info("{}", response);

            return response.body();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    PaymentResponse fetchPaymentByMerchantOrderId(String merchantOrderId) throws IOException {
        Call<PaymentsList> call = payments.getPayments(
                String.valueOf(currentTimeMillis()),
                null,
                null,
                100,
                merchantOrderId,
                null,
                null,
                null
        );
        Response<PaymentsList> response = call.execute();
        assertTrue(response.message(), response.isSuccessful());

        PaymentsList body = response.body();
        assertNotNull(body);

        log.info("{}", body);

        List<PaymentResponse> data = body.getData();
        return data.size() > 0 ? data.get(0) : null;
    }

    PaymentResponse fetchPaymentById(String paymentId) throws IOException {
        return payments.getPayment(paymentId).execute().body();
    }

    protected PaymentResponse doPayment(String pan) throws IOException {
        PaymentRequest paymentRequest = createPaymentRequest();
        paymentRequest.cardAccount(cardAccount(pan));

        log.info("{}", paymentRequest);

        PaymentCreationResponse creationResponse = createPayment(paymentRequest);
        assertNotNull(creationResponse);

        // Emulate customer behaviour performing GET request to redirect url
        HttpUtils.doGet(creationResponse.getRedirectUrl());

        String merchantOrderId = paymentRequest.getMerchantOrder().getId();

        PaymentResponse paymentResponse = fetchPaymentByMerchantOrderId(merchantOrderId);
        assertNotNull(paymentResponse);

        PaymentData paymentData = paymentResponse.getPaymentData();
        assertNotNull(paymentData);

        String paymentId = paymentData.getId();

        return fetchPaymentById(paymentId);
    }
}

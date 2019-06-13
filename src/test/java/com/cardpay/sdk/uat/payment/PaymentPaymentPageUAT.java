package com.cardpay.sdk.uat.payment;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.PaymentCreationResponse;
import com.cardpay.sdk.model.PaymentRequest;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static com.cardpay.sdk.Config.CARDPAY_API_URL;
import static com.cardpay.sdk.Config.PAYMENTPAGE_PASSWORD;
import static com.cardpay.sdk.Config.PAYMENTPAGE_TERMINAL_CODE;
import static com.cardpay.sdk.utils.DataUtils.createPaymentRequest;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class PaymentPaymentPageUAT extends AbstractPaymentTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Before
    public void setup() {
        payments = new ApiClient(CARDPAY_API_URL, PAYMENTPAGE_TERMINAL_CODE, PAYMENTPAGE_PASSWORD)
                .addLogging(HttpLoggingInterceptor.Level.BASIC)
                .createService(PaymentsApi.class);
    }

    @Test
    public void createPayment() throws IOException {
        final PaymentRequest paymentRequest = createPaymentRequest();
        log.info("{}", paymentRequest);

        PaymentCreationResponse creationResponse = createPayment(paymentRequest);
        final String redirectUrl = creationResponse.getRedirectUrl();

        assertNotNull(redirectUrl);
        assertFalse(redirectUrl.isEmpty());
    }
}
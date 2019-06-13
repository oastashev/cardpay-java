package com.cardpay.sdk.uat.payment;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.PaymentResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static com.cardpay.sdk.Config.*;
import static com.cardpay.sdk.data.TestCards.*;
import static com.cardpay.sdk.model.PaymentData.StatusEnum.*;
import static org.junit.Assert.assertEquals;

public class PaymentGatewayModeUAT extends AbstractPaymentTest {

    @Before
    public void setup() {
        payments = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, GATEWAY_PASSWORD)
                //.addLogging(HttpLoggingInterceptor.Level.BODY)
                .createService(PaymentsApi.class)
        ;
    }

    @Test
    public void createPaymentConfirmed3DS() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_3DS_CONFIRMED.getPan());

        log.info("{}", paymentResponse);

        assertEquals(IN_PROGRESS, paymentResponse.getPaymentData().getStatus());
    }

    @Test
    public void createPaymentDeclined3DS() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_3DS_DECLINED.getPan());

        log.info("{}", paymentResponse);

        assertEquals(IN_PROGRESS, paymentResponse.getPaymentData().getStatus());
    }

    @Test
    public void createPaymentPending3DS() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_3DS_PENDING.getPan());

        log.info("{}", paymentResponse);

        assertEquals(IN_PROGRESS, paymentResponse.getPaymentData().getStatus());
    }

    @Test
    public void createPaymentConfirmedNon3DS() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_NON3DS_CONFIRMED.getPan());

        log.info("{}", paymentResponse);

        assertEquals(COMPLETED, paymentResponse.getPaymentData().getStatus());
    }

    @Test
    public void createPaymentDeclinedNon3DS() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_NON3DS_DECLINED.getPan());

        log.info("{}", paymentResponse);

        assertEquals(DECLINED, paymentResponse.getPaymentData().getStatus());
    }

    @Test
    public void createPaymentPendingNon3DS() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_NON3DS_PENDING.getPan());

        log.info("{}", paymentResponse);

        assertEquals(AUTHORIZED, paymentResponse.getPaymentData().getStatus());
    }
}
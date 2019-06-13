package com.cardpay.sdk.uat.auth;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.PaymentRequest;
import org.junit.Test;

import java.io.IOException;

import static com.cardpay.sdk.Config.CARDPAY_API_URL;
import static com.cardpay.sdk.Config.GATEWAY_PASSWORD;
import static com.cardpay.sdk.Config.GATEWAY_TERMINAL_CODE;
import static org.junit.Assert.assertEquals;

public class AuthUAT {

    @Test
    public void invalidPassword() {
        PaymentsApi payments = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, "123")
                .createService(PaymentsApi.class);

        try {

            payments.createPayment(new PaymentRequest()).execute();

        } catch (IOException e) {
            assertEquals("Invalid terminal credentials", e.getMessage());
        }
    }

    @Test
    public void invalidTerminalCode() {
        PaymentsApi payments = new ApiClient(CARDPAY_API_URL, "123", GATEWAY_PASSWORD)
                .createService(PaymentsApi.class);

        try {

            payments.createPayment(new PaymentRequest()).execute();

        } catch (IOException e) {
            assertEquals("Invalid terminal credentials", e.getMessage());
        }
    }

}

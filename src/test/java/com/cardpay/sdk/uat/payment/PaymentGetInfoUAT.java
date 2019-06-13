package com.cardpay.sdk.uat.payment;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.PaymentData;
import com.cardpay.sdk.model.PaymentResponse;
import com.cardpay.sdk.model.PaymentsList;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static com.cardpay.sdk.Config.*;
import static com.cardpay.sdk.data.Currency.CURRENCY_USD;
import static com.cardpay.sdk.data.TestCards.CARD_NON3DS_CONFIRMED;
import static java.lang.System.currentTimeMillis;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PaymentGetInfoUAT extends AbstractPaymentTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Before
    public void setup() {
        payments = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, GATEWAY_PASSWORD)
                .addLogging(HttpLoggingInterceptor.Level.BASIC)
                .createService(PaymentsApi.class);
    }

    @Test
    public void getPaymentInformation() throws IOException {
        PaymentResponse paymentResponse = doPayment(CARD_NON3DS_CONFIRMED.getPan());

        Response<PaymentResponse> result = payments.getPayment(paymentResponse.getPaymentData().getId()).execute();

        assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());

        PaymentData data = result.body().getPaymentData();
        log.info("{} {}: {} {}", data.getCreated(), data.getId(),
                String.format("%-6.2f %s", data.getAmount(), data.getCurrency()),
                data.getStatus()
        );
    }

    @Test
    public void getPaymentsListInformation() throws IOException {
        Response<PaymentsList> result = payments.getPayments(
                String.valueOf(currentTimeMillis()),
                CURRENCY_USD,
                null,
                100,
                null,
                null,
                null,
                null
        ).execute();

        assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());

        List<PaymentResponse> payments = result.body().getData();

        log.info("Count: {}", payments.size());

        for (PaymentResponse payment : payments) {
            PaymentData data = payment.getPaymentData();
            log.info("{} {}: {} {}", data.getCreated(), data.getId(),
                    String.format("%-6.2f %s", data.getAmount(), data.getCurrency()),
                    data.getStatus()
            );
        }
    }
}
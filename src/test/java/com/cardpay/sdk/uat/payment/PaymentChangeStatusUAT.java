package com.cardpay.sdk.uat.payment;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.PaymentPatchRequest;
import com.cardpay.sdk.model.PaymentResponse;
import com.cardpay.sdk.model.PaymentUpdateResponse;
import com.cardpay.sdk.model.ResponseUpdatedTransactionData;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;

import java.io.IOException;

import static com.cardpay.sdk.Config.CARDPAY_API_URL;
import static com.cardpay.sdk.Config.GATEWAY_PASSWORD;
import static com.cardpay.sdk.Config.GATEWAY_TERMINAL_CODE;
import static com.cardpay.sdk.data.TestCards.CARD_NON3DS_PENDING;
import static com.cardpay.sdk.model.PaymentUpdateTransactionData.StatusToEnum.COMPLETE;
import static com.cardpay.sdk.utils.DataUtils.createPaymentUpdateRequest;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PaymentChangeStatusUAT extends AbstractPaymentTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Before
    public void setup() {
        payments = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, GATEWAY_PASSWORD)
                .addLogging(HttpLoggingInterceptor.Level.BASIC)
                .createService(PaymentsApi.class);
    }

    @Test
    public void changePaymentStatus() throws IOException {
        final PaymentPatchRequest paymentUpdateRequest = createPaymentUpdateRequest(COMPLETE);
        log.info("{}", paymentUpdateRequest);

        PaymentResponse paymentResponse = doPayment(CARD_NON3DS_PENDING.getPan());

        Response<PaymentUpdateResponse> result = payments
                .updatePayment(paymentResponse.getPaymentData().getId(), paymentUpdateRequest)
                .execute();

        assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());

        ResponseUpdatedTransactionData data = result.body().getPaymentData();
        log.info("{} {} {}", data.getUpdated(), data.getId(), data.getStatus() );
    }
}
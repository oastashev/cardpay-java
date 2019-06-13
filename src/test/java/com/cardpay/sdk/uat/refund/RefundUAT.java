package com.cardpay.sdk.uat.refund;

import com.cardpay.sdk.api.PaymentsApi;
import com.cardpay.sdk.api.RefundsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.*;
import com.cardpay.sdk.uat.payment.AbstractPaymentTest;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static com.cardpay.sdk.Config.*;
import static com.cardpay.sdk.data.Currency.CURRENCY_USD;
import static com.cardpay.sdk.data.TestCards.CARD_NON3DS_CONFIRMED;
import static com.cardpay.sdk.data.TestCards.CARD_NON3DS_PENDING;
import static com.cardpay.sdk.model.ResponseRefundData.StatusEnum.COMPLETED;
import static com.cardpay.sdk.model.UpdatedTransactionData.StatusToEnum.REVERSE;
import static com.cardpay.sdk.utils.DataUtils.createRefundRequest;
import static com.cardpay.sdk.utils.DataUtils.createRefundUpdateRequest;
import static java.lang.System.currentTimeMillis;
import static org.junit.Assert.*;

public class RefundUAT extends AbstractPaymentTest {

    private final BigDecimal REFUND_AMOUNT = BigDecimal.valueOf(5);
    private final Logger log = LoggerFactory.getLogger(getClass());
    private RefundsApi refunds;
    private PaymentResponse paymentResponse;


    @Before
    public void setup() {
        refunds = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, GATEWAY_PASSWORD)
                .addLogging(HttpLoggingInterceptor.Level.BASIC)
                .createService(RefundsApi.class);

        payments = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, GATEWAY_PASSWORD)
                .createService(PaymentsApi.class);
    }

    @Test
    public void createRefundPartial() throws IOException {
        paymentResponse = doPayment(CARD_NON3DS_CONFIRMED.getPan());
        RefundResponse refundResponse = createRefund(paymentResponse.getPaymentData().getId(), REFUND_AMOUNT);

        assertNotNull(refundResponse);
        assertEquals(COMPLETED, refundResponse.getRefundData().getStatus());

        ResponseRefundData data = refundResponse.getRefundData();
        log.info("{} {} {}", data.getCreated(), data.getId(), data.getStatus());
    }

    @Test
    public void getRefundInformation() throws IOException {
        paymentResponse = doPayment(CARD_NON3DS_CONFIRMED.getPan());
        RefundResponse refundResponse = createRefund(paymentResponse.getPaymentData().getId(), REFUND_AMOUNT);

        Response<RefundResponse> result = refunds.getRefund(refundResponse.getRefundData().getId()).execute();

        assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());

        ResponseRefundData data = result.body().getRefundData();
        log.info("{} {} {}", data.getCreated(), data.getId(), data.getStatus());
    }

    @Test
    public void getRefundsListInformation() throws IOException {
        Response<RefundsList> result = refunds.getRefunds(
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

        List<RefundResponse> refunds = result.body().getData();

        log.info("Count: {}", refunds.size());

        for (RefundResponse refund : refunds) {
            ResponseRefundData data = refund.getRefundData();
            log.info("{} {}: {} {}", data.getCreated(), data.getId(),
                    String.format("%-6.2f %s", data.getAmount(), data.getCurrency()),
                    data.getStatus()
            );
        }
    }

    @Test
    public void changeRefundStatus() throws IOException {
        paymentResponse = doPayment(CARD_NON3DS_PENDING.getPan()); // TODO need wallet with disabled Refund - Process immediately:

        RefundResponse refundResponse = createRefund(paymentResponse.getPaymentData().getId(), REFUND_AMOUNT);
        assertEquals(COMPLETED, refundResponse.getRefundData().getStatus());

        final RefundUpdateRequest refundRequest = createRefundUpdateRequest(REVERSE);
        log.info("{}", refundRequest);

        Response<RefundUpdateResponse> result = refunds
                .updateRefund(refundResponse.getRefundData().getId(), refundRequest)
                .execute();

        assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());
        assertEquals(ResponseUpdatedTransactionData.StatusToEnum.REVERSE, result.body().getRefundData().getStatusTo());
        assertEquals(ResponseUpdatedTransactionData.StatusEnum.AUTHORIZED, result.body().getRefundData().getStatus());

        ResponseUpdatedTransactionData data = result.body().getRefundData();
        log.info("{} {} {}", data.getUpdated(), data.getId(), data.getStatus());
    }

    private RefundResponse createRefund(String paymentId, BigDecimal amount) throws IOException {
        RefundRequest refundRequest = createRefundRequest(paymentId, amount);
        log.info("{}", refundRequest);

        RefundResponse creationResponse;

        try {
            Response<RefundResponse> response = refunds.createRefund(refundRequest).execute();
            log.info("{}", response);

            creationResponse = response.body();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw e;
        }

        assertNotNull(creationResponse);

        return creationResponse;
    }
}
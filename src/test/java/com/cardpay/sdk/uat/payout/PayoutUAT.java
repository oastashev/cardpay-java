package com.cardpay.sdk.uat.payout;

import com.cardpay.sdk.api.PayoutsApi;
import com.cardpay.sdk.client.ApiClient;
import com.cardpay.sdk.model.*;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Assert;
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
import static com.cardpay.sdk.data.TestCards.CARD_NON3DS_PENDING;
import static com.cardpay.sdk.model.PayoutData.StatusEnum.AUTHORIZED;
import static com.cardpay.sdk.model.PayoutData.StatusEnum.COMPLETED;
import static com.cardpay.sdk.model.UpdatedTransactionData.StatusToEnum.REVERSE;
import static com.cardpay.sdk.utils.DataUtils.*;
import static java.lang.System.currentTimeMillis;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PayoutUAT {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private PayoutsApi payouts;

    @Before
    public void setup() {
        payouts = new ApiClient(CARDPAY_API_URL, GATEWAY_TERMINAL_CODE, GATEWAY_PASSWORD)
                .addLogging(HttpLoggingInterceptor.Level.BASIC)
                .createService(PayoutsApi.class);
    }

    @Test
    public void createPayoutConfirmed() throws IOException {
        PayoutResponse payoutResponse = createPayout(CARD_NON3DS_CONFIRMED.getPan());

        assertNotNull(payoutResponse);
        assertEquals(COMPLETED, payoutResponse.getPayoutData().getStatus());

        PayoutData data = payoutResponse.getPayoutData();
        log.info("{} {} {}", data.getCreated(), data.getId(), data.getStatus());
    }

    @Test
    public void getPayoutInformation() throws IOException {
        PayoutResponse payoutResponse = createPayout(CARD_NON3DS_CONFIRMED.getPan());

        Response<PayoutResponse> result = payouts.getPayout(payoutResponse.getPayoutData().getId()).execute();

        Assert.assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());

        PayoutData data = result.body().getPayoutData();
        log.info("{} {}: {} {}", data.getCreated(), data.getId(),
                String.format("%-6.2f %s", data.getAmount(), data.getCurrency()),
                data.getStatus()
        );
    }

    @Test
    public void getPayoutsListInformation() throws IOException {
        Response<PayoutsList> result = payouts.getPayouts(
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

        List<PayoutResponse> payouts = result.body().getData();

        log.info("Count: {}", payouts.size());

        for (PayoutResponse payout : payouts) {
            PayoutData data = payout.getPayoutData();
            log.info("{} {}: {} {}", data.getCreated(), data.getId(),
                    String.format("%-6.2f %s", data.getAmount(), data.getCurrency()),
                    data.getStatus()
            );
        }
    }

    @Test
    public void changePayoutStatus() throws IOException {
        PayoutResponse payoutResponse = createPayout(CARD_NON3DS_PENDING.getPan());  // TODO need wallet with disabled Payout - Process immediately:
        assertEquals(AUTHORIZED, payoutResponse.getPayoutData().getStatus());

        final PayoutUpdateRequest payoutRequest = createPayoutUpdateRequest(REVERSE);
        log.info("{}", payoutRequest);

        Response<PayoutUpdateResponse> result = payouts
                .updatePayout(payoutResponse.getPayoutData().getId(), payoutRequest)
                .execute();

        assertTrue(result.message(), result.isSuccessful());
        assertNotNull(result.body());
        assertEquals(ResponseUpdatedTransactionData.StatusToEnum.REVERSE, result.body().getPayoutData().getStatusTo());
        assertEquals(ResponseUpdatedTransactionData.StatusEnum.AUTHORIZED, result.body().getPayoutData().getStatus());

        ResponseUpdatedTransactionData data = result.body().getPayoutData();
        log.info("{} {} {}", data.getUpdated(), data.getId(), data.getStatus());
    }

    private PayoutResponse createPayout(String pan) throws IOException {
        PayoutRequest payoutRequest = createPayoutRequest();
        payoutRequest.cardAccount(payoutCardAccount(pan));

        log.info("{}", payoutRequest);

        PayoutResponse creationResponse;

        try {
            Response<PayoutResponse> response = payouts.createPayout(payoutRequest).execute();

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
package com.cardpay.sdk.utils;

import com.cardpay.sdk.model.*;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.BaseProducer;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.text.TextProducer;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Date;

import static com.cardpay.sdk.Config.CANCEL_URL;
import static com.cardpay.sdk.Config.DECLINE_URL;
import static com.cardpay.sdk.Config.INPROCESS_URL;
import static com.cardpay.sdk.Config.SUCCESS_URL;
import static com.cardpay.sdk.data.Currency.CURRENCY_USD;
import static com.cardpay.sdk.data.PaymentMethod.PAYMENT_METHOD_BANKCARD;
import static com.cardpay.sdk.model.PaymentPatchRequest.OperationEnum.CHANGE_STATUS;
import static java.lang.String.valueOf;
import static java.lang.System.currentTimeMillis;
import static java.time.OffsetDateTime.now;

public class DataUtils {

    private static Request createRequestObject() {
        return new Request()
                .id(valueOf(currentTimeMillis()))
                .time(now().atZoneSameInstant(ZoneOffset.UTC).toOffsetDateTime());
    }

    public static PaymentRequest createPaymentRequest() {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();
        BaseProducer producer = fairy.baseProducer();
        TextProducer textProducer = fairy.textProducer();

        PaymentRequest result = new PaymentRequest()
                .request(createRequestObject())
                .merchantOrder(new PaymentMerchantOrder()
                        .id(textProducer.randomString(15))
                        .description(textProducer.sentence())
                )
                .paymentMethod(PAYMENT_METHOD_BANKCARD)
                .paymentData(new PaymentData()
                        .currency(CURRENCY_USD)
                        .amount(BigDecimal.valueOf(producer.randomBetween(10, 300)))
                        .note(textProducer.sentence())
                )
                .customer(new Customer()
                        .fullName(person.getFullName())
                        .birthDate(new SimpleDateFormat("yyyy-MM-dd").format(person.getDateOfBirth().toDate()))
                        .email(person.getEmail())
                        .locale("en")
                        .phone(producer.numerify("+###########"))
                        .id(textProducer.randomString(15))
                )
                .returnUrls(new ReturnUrls()
                        .successUrl(SUCCESS_URL)
                        .declineUrl(DECLINE_URL)
                        .cancelUrl(CANCEL_URL)
                        .inprocessUrl(INPROCESS_URL)
                );

        return result;
    }

    public static PaymentPatchRequest createPaymentUpdateRequest(PaymentUpdateTransactionData.StatusToEnum status) {
        PaymentUpdateTransactionData paymentUpdateTransactionData = new PaymentUpdateTransactionData();
        paymentUpdateTransactionData.setStatusTo(status);

        PaymentPatchRequest result = new PaymentPatchRequest()
                .request(createRequestObject())
                .operation(CHANGE_STATUS)
                .paymentData(paymentUpdateTransactionData);

        return result;
    }

    public static CardAccount cardAccount(String pan) {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();
        BaseProducer producer = fairy.baseProducer();

        Date cardExpiration = new Date(now().plusYears(1).plusMonths(producer.randomBetween(1, 10)).toInstant().toEpochMilli());
        return new CardAccount().card(new Card()
                .pan(pan)
                .holder(person.getFullName().toUpperCase())
                .securityCode("100")
                .expiration(new SimpleDateFormat("MM/yyyy").format(cardExpiration))
        );
    }

    public static PayoutCardAccount payoutCardAccount(String pan) {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();
        BaseProducer producer = fairy.baseProducer();

        Date cardExpiration = new Date(now().plusYears(1).plusMonths(producer.randomBetween(1, 10)).toInstant().toEpochMilli());
        return new PayoutCardAccount().card(new PayoutCard()
                .pan(pan)
                .expiration(new SimpleDateFormat("MM/yyyy").format(cardExpiration))
        ).recipientInfo(person.getFullName().toUpperCase());
    }


    public static PayoutRequest createPayoutRequest() {
        Fairy fairy = Fairy.create();
        BaseProducer producer = fairy.baseProducer();
        TextProducer textProducer = fairy.textProducer();

        PayoutRequest result = new PayoutRequest()
                .request(createRequestObject())
                .merchantOrder(new PayoutMerchantOrder()
                        .id(textProducer.randomString(15))
                        .description(textProducer.sentence()))
                .paymentMethod(PAYMENT_METHOD_BANKCARD)
                .payoutData(new PayoutData()
                        .currency(CURRENCY_USD)
                        .amount(BigDecimal.valueOf(producer.randomBetween(10, 300)))
                        .note(textProducer.sentence())

                );

        return result;
    }

    public static PayoutUpdateRequest createPayoutUpdateRequest(UpdatedTransactionData.StatusToEnum status) {
        UpdatedTransactionData updatedTransactionData = new UpdatedTransactionData();
        updatedTransactionData.setStatusTo(status);

        PayoutUpdateRequest result = new PayoutUpdateRequest()
                .request(createRequestObject())
                .payoutData(updatedTransactionData);

        return result;
    }

    public static RefundRequest createRefundRequest(String paymnetId, BigDecimal amount) {
        Fairy fairy = Fairy.create();
        TextProducer textProducer = fairy.textProducer();

        RefundRequest result = new RefundRequest()
                .request(createRequestObject())
                .merchantOrder(new RefundMerchantOrder()
                        .id(textProducer.randomString(15))
                        .description(textProducer.sentence()))
                .paymentData(new RefundPaymentData()
                        .id(paymnetId))
                .refundData(new RefundData()
                .amount(amount)
                .currency(CURRENCY_USD)
                );

        return result;
    }

    public static RefundUpdateRequest createRefundUpdateRequest(UpdatedTransactionData.StatusToEnum status) {
        UpdatedTransactionData updatedTransactionData = new UpdatedTransactionData();
        updatedTransactionData.setStatusTo(status);

        RefundUpdateRequest result = new RefundUpdateRequest()
                .request(createRequestObject())
                .refundData(updatedTransactionData);

        return result;
    }
}

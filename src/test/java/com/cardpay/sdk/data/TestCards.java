package com.cardpay.sdk.data;

public class TestCards {

    public static final Card CARD_3DS_CONFIRMED = new Card("4000000000000002", "Card holder", "100", "01/2021", CardType.VISA);
    public static final Card CARD_3DS_DECLINED = new Card("5555555555554444", "Card holder", "100", "01/2021", CardType.MASTERCARD);
    public static final Card CARD_3DS_PENDING = new Card("4000000000000044", "Card holder", "100", "01/2021", CardType.VISA);

    public static final Card CARD_NON3DS_CONFIRMED = new Card("4000000000000077", "Card holder", "100", "01/2021", CardType.VISA);
    public static final Card CARD_NON3DS_DECLINED = new Card("5555555555554477", "Card holder", "100", "01/2021", CardType.MASTERCARD);
    public static final Card CARD_NON3DS_PENDING = new Card("4000000000000051", "Card holder", "100", "01/2021", CardType.VISA);
}
package com.cardpay.sdk.data;

public class Card {
    private String pan;

    private String cardHolder;

    private String cvv;

    private String expires;

    private CardType type;

    public Card(String pan, String cardHolder, String cvv, String expires, CardType type) {
        this.pan = pan;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expires = expires;
        this.type = type;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }
}
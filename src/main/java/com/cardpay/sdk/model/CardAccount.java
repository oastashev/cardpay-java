/*
 * CardPay REST API
 * The CardPay API uses HTTP verbs and a RESTful endpoint structure. Request and response payloads are formatted as JSON.
 *
 * OpenAPI spec version: 3.0
 * Contact: support@cardpay.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cardpay.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.cardpay.sdk.model.BillingAddress;
import com.cardpay.sdk.model.Card;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Mandatory for payment and first recurring payment (all modes, except Payment Page mode). For BANKCARD payment method only. Relates to PaymentRequest and RecurringRequest
 */
@ApiModel(description = "Mandatory for payment and first recurring payment (all modes, except Payment Page mode). For BANKCARD payment method only. Relates to PaymentRequest and RecurringRequest")

public class CardAccount {
  @SerializedName("billing_address")
  private BillingAddress billingAddress = null;

  @SerializedName("card")
  private Card card = null;

  @SerializedName("expiration")
  private String expiration = null;

  @SerializedName("holder")
  private String holder = null;

  @SerializedName("issuing_country_code")
  private String issuingCountryCode = null;

  @SerializedName("masked_pan")
  private String maskedPan = null;

  @SerializedName("token")
  private String token = null;

  public CardAccount billingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Billing Address
   * @return billingAddress
  **/
  @ApiModelProperty(value = "Billing Address")
  public BillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public CardAccount card(Card card) {
    this.card = card;
    return this;
  }

   /**
   * Represents a payment card, shouldn&#39;t be used in Payment Page mode
   * @return card
  **/
  @ApiModelProperty(value = "Represents a payment card, shouldn't be used in Payment Page mode")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public CardAccount expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Customer’s card expiration date. Returned only if setting &#39;Callback: card expiry&#39; in a wallet in PM system is ON
   * @return expiration
  **/
  @ApiModelProperty(value = "Customer’s card expiration date. Returned only if setting 'Callback: card expiry' in a wallet in PM system is ON")
  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public CardAccount holder(String holder) {
    this.holder = holder;
    return this;
  }

   /**
   * Customer&#39;s cardholder name. Any valid cardholder name, Not present by default, ask CardPay manager to enable it if needed
   * @return holder
  **/
  @ApiModelProperty(value = "Customer's cardholder name. Any valid cardholder name, Not present by default, ask CardPay manager to enable it if needed")
  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public CardAccount issuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
    return this;
  }

   /**
   * Country code of issuing card country
   * @return issuingCountryCode
  **/
  @ApiModelProperty(value = "Country code of issuing card country")
  public String getIssuingCountryCode() {
    return issuingCountryCode;
  }

  public void setIssuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
  }

  public CardAccount maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

   /**
   * Masked PAN (shows first 6 digits and 4 last digits)
   * @return maskedPan
  **/
  @ApiModelProperty(value = "Masked PAN (shows first 6 digits and 4 last digits)")
  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  public CardAccount token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Card token value used instead of card information. For payment: see PaymentData for token generation. For recurrings: this attribute is valid only for first recurring payment. It isn&#39;t valid for continue recurring payments (with filing id), see RecurringData for token generation.
   * @return token
  **/
  @ApiModelProperty(value = "Card token value used instead of card information. For payment: see PaymentData for token generation. For recurrings: this attribute is valid only for first recurring payment. It isn't valid for continue recurring payments (with filing id), see RecurringData for token generation.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAccount cardAccount = (CardAccount) o;
    return Objects.equals(this.billingAddress, cardAccount.billingAddress) &&
        Objects.equals(this.card, cardAccount.card) &&
        Objects.equals(this.expiration, cardAccount.expiration) &&
        Objects.equals(this.holder, cardAccount.holder) &&
        Objects.equals(this.issuingCountryCode, cardAccount.issuingCountryCode) &&
        Objects.equals(this.maskedPan, cardAccount.maskedPan) &&
        Objects.equals(this.token, cardAccount.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, card, expiration, holder, issuingCountryCode, maskedPan, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccount {\n");
    
    if (billingAddress != null) sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    if (card != null) sb.append("    card: ").append(toIndentedString(card)).append("\n");
    if (expiration != null) sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    if (holder != null) sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    if (issuingCountryCode != null) sb.append("    issuingCountryCode: ").append(toIndentedString(issuingCountryCode)).append("\n");
    if (maskedPan != null) sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    if (token != null) sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


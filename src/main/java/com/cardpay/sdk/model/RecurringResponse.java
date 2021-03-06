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
import com.cardpay.sdk.model.CardAccount;
import com.cardpay.sdk.model.MerchantOrder;
import com.cardpay.sdk.model.RecurringCustomer;
import com.cardpay.sdk.model.ResponseRecurringData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RecurringResponse
 */

public class RecurringResponse {
  @SerializedName("payment_method")
  private String paymentMethod = null;

  @SerializedName("merchant_order")
  private MerchantOrder merchantOrder = null;

  @SerializedName("recurring_data")
  private ResponseRecurringData recurringData = null;

  @SerializedName("card_account")
  private CardAccount cardAccount = null;

  @SerializedName("customer")
  private RecurringCustomer customer = null;

  public RecurringResponse paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Used payment method type name from payment methods list
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "BANKCARD", value = "Used payment method type name from payment methods list")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public RecurringResponse merchantOrder(MerchantOrder merchantOrder) {
    this.merchantOrder = merchantOrder;
    return this;
  }

   /**
   * Merchant order data
   * @return merchantOrder
  **/
  @ApiModelProperty(value = "Merchant order data")
  public MerchantOrder getMerchantOrder() {
    return merchantOrder;
  }

  public void setMerchantOrder(MerchantOrder merchantOrder) {
    this.merchantOrder = merchantOrder;
  }

  public RecurringResponse recurringData(ResponseRecurringData recurringData) {
    this.recurringData = recurringData;
    return this;
  }

   /**
   * Recurring data
   * @return recurringData
  **/
  @ApiModelProperty(value = "Recurring data")
  public ResponseRecurringData getRecurringData() {
    return recurringData;
  }

  public void setRecurringData(ResponseRecurringData recurringData) {
    this.recurringData = recurringData;
  }

  public RecurringResponse cardAccount(CardAccount cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

   /**
   * Card account
   * @return cardAccount
  **/
  @ApiModelProperty(value = "Card account")
  public CardAccount getCardAccount() {
    return cardAccount;
  }

  public void setCardAccount(CardAccount cardAccount) {
    this.cardAccount = cardAccount;
  }

  public RecurringResponse customer(RecurringCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer
   * @return customer
  **/
  @ApiModelProperty(value = "Customer")
  public RecurringCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(RecurringCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringResponse recurringResponse = (RecurringResponse) o;
    return Objects.equals(this.paymentMethod, recurringResponse.paymentMethod) &&
        Objects.equals(this.merchantOrder, recurringResponse.merchantOrder) &&
        Objects.equals(this.recurringData, recurringResponse.recurringData) &&
        Objects.equals(this.cardAccount, recurringResponse.cardAccount) &&
        Objects.equals(this.customer, recurringResponse.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, merchantOrder, recurringData, cardAccount, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringResponse {\n");
    
    if (paymentMethod != null) sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (merchantOrder != null) sb.append("    merchantOrder: ").append(toIndentedString(merchantOrder)).append("\n");
    if (recurringData != null) sb.append("    recurringData: ").append(toIndentedString(recurringData)).append("\n");
    if (cardAccount != null) sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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


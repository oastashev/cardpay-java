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
import com.cardpay.sdk.model.CryptocurrencyAccount;
import com.cardpay.sdk.model.Customer;
import com.cardpay.sdk.model.EWalletAccount;
import com.cardpay.sdk.model.PaymentData;
import com.cardpay.sdk.model.PaymentMerchantOrder;
import com.cardpay.sdk.model.Request;
import com.cardpay.sdk.model.ReturnUrls;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentRequest
 */

public class PaymentRequest {
  @SerializedName("request")
  private Request request = null;

  @SerializedName("card_account")
  private CardAccount cardAccount = null;

  @SerializedName("cryptocurrency_account")
  private CryptocurrencyAccount cryptocurrencyAccount = null;

  @SerializedName("customer")
  private Customer customer = null;

  @SerializedName("ewallet_account")
  private EWalletAccount ewalletAccount = null;

  @SerializedName("merchant_order")
  private PaymentMerchantOrder merchantOrder = null;

  @SerializedName("payment_data")
  private PaymentData paymentData = null;

  @SerializedName("payment_method")
  private String paymentMethod = null;

  @SerializedName("return_urls")
  private ReturnUrls returnUrls = null;

  public PaymentRequest request(Request request) {
    this.request = request;
    return this;
  }

   /**
   * Request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "Request")
  public Request getRequest() {
    return request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public PaymentRequest cardAccount(CardAccount cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

   /**
   * Information about card *(for BANKCARD payment method only)*
   * @return cardAccount
  **/
  @ApiModelProperty(required = true, value = "Information about card *(for BANKCARD payment method only)*")
  public CardAccount getCardAccount() {
    return cardAccount;
  }

  public void setCardAccount(CardAccount cardAccount) {
    this.cardAccount = cardAccount;
  }

  public PaymentRequest cryptocurrencyAccount(CryptocurrencyAccount cryptocurrencyAccount) {
    this.cryptocurrencyAccount = cryptocurrencyAccount;
    return this;
  }

   /**
   * Cryptocurrency data *(for BITCOIN payment method only)*
   * @return cryptocurrencyAccount
  **/
  @ApiModelProperty(value = "Cryptocurrency data *(for BITCOIN payment method only)*")
  public CryptocurrencyAccount getCryptocurrencyAccount() {
    return cryptocurrencyAccount;
  }

  public void setCryptocurrencyAccount(CryptocurrencyAccount cryptocurrencyAccount) {
    this.cryptocurrencyAccount = cryptocurrencyAccount;
  }

  public PaymentRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Information about customer.
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "Information about customer.")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public PaymentRequest ewalletAccount(EWalletAccount ewalletAccount) {
    this.ewalletAccount = ewalletAccount;
    return this;
  }

   /**
   * Wallet data *(for QIWI and NETELLER payment methods only)*
   * @return ewalletAccount
  **/
  @ApiModelProperty(value = "Wallet data *(for QIWI and NETELLER payment methods only)*")
  public EWalletAccount getEwalletAccount() {
    return ewalletAccount;
  }

  public void setEwalletAccount(EWalletAccount ewalletAccount) {
    this.ewalletAccount = ewalletAccount;
  }

  public PaymentRequest merchantOrder(PaymentMerchantOrder merchantOrder) {
    this.merchantOrder = merchantOrder;
    return this;
  }

   /**
   * merchant order data
   * @return merchantOrder
  **/
  @ApiModelProperty(required = true, value = "merchant order data")
  public PaymentMerchantOrder getMerchantOrder() {
    return merchantOrder;
  }

  public void setMerchantOrder(PaymentMerchantOrder merchantOrder) {
    this.merchantOrder = merchantOrder;
  }

  public PaymentRequest paymentData(PaymentData paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Information for payment.
   * @return paymentData
  **/
  @ApiModelProperty(required = true, value = "Information for payment.")
  public PaymentData getPaymentData() {
    return paymentData;
  }

  public void setPaymentData(PaymentData paymentData) {
    this.paymentData = paymentData;
  }

  public PaymentRequest paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Used payment method type name from payment methods list. Leave empty for redirect customer to Checkout Page
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "Used payment method type name from payment methods list. Leave empty for redirect customer to Checkout Page")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentRequest returnUrls(ReturnUrls returnUrls) {
    this.returnUrls = returnUrls;
    return this;
  }

   /**
   * Return URLs are the URLs where customer returns by pressing &#39;Back to the shop&#39; or &#39;Cancel&#39; button in Payment Page mode and redirected automatically in Gateway mode
   * @return returnUrls
  **/
  @ApiModelProperty(value = "Return URLs are the URLs where customer returns by pressing 'Back to the shop' or 'Cancel' button in Payment Page mode and redirected automatically in Gateway mode")
  public ReturnUrls getReturnUrls() {
    return returnUrls;
  }

  public void setReturnUrls(ReturnUrls returnUrls) {
    this.returnUrls = returnUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.request, paymentRequest.request) &&
        Objects.equals(this.cardAccount, paymentRequest.cardAccount) &&
        Objects.equals(this.cryptocurrencyAccount, paymentRequest.cryptocurrencyAccount) &&
        Objects.equals(this.customer, paymentRequest.customer) &&
        Objects.equals(this.ewalletAccount, paymentRequest.ewalletAccount) &&
        Objects.equals(this.merchantOrder, paymentRequest.merchantOrder) &&
        Objects.equals(this.paymentData, paymentRequest.paymentData) &&
        Objects.equals(this.paymentMethod, paymentRequest.paymentMethod) &&
        Objects.equals(this.returnUrls, paymentRequest.returnUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, cardAccount, cryptocurrencyAccount, customer, ewalletAccount, merchantOrder, paymentData, paymentMethod, returnUrls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (cardAccount != null) sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
    if (cryptocurrencyAccount != null) sb.append("    cryptocurrencyAccount: ").append(toIndentedString(cryptocurrencyAccount)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    if (ewalletAccount != null) sb.append("    ewalletAccount: ").append(toIndentedString(ewalletAccount)).append("\n");
    if (merchantOrder != null) sb.append("    merchantOrder: ").append(toIndentedString(merchantOrder)).append("\n");
    if (paymentData != null) sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    if (paymentMethod != null) sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (returnUrls != null) sb.append("    returnUrls: ").append(toIndentedString(returnUrls)).append("\n");
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


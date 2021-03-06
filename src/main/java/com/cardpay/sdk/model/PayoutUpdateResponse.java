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
import com.cardpay.sdk.model.MerchantOrder;
import com.cardpay.sdk.model.ResponseUpdatedTransactionData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayoutUpdateResponse
 */

public class PayoutUpdateResponse {
  @SerializedName("merchant_order")
  private MerchantOrder merchantOrder = null;

  @SerializedName("payout_data")
  private ResponseUpdatedTransactionData payoutData = null;

  public PayoutUpdateResponse merchantOrder(MerchantOrder merchantOrder) {
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

  public PayoutUpdateResponse payoutData(ResponseUpdatedTransactionData payoutData) {
    this.payoutData = payoutData;
    return this;
  }

   /**
   * Transaction data
   * @return payoutData
  **/
  @ApiModelProperty(value = "Transaction data")
  public ResponseUpdatedTransactionData getPayoutData() {
    return payoutData;
  }

  public void setPayoutData(ResponseUpdatedTransactionData payoutData) {
    this.payoutData = payoutData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutUpdateResponse payoutUpdateResponse = (PayoutUpdateResponse) o;
    return Objects.equals(this.merchantOrder, payoutUpdateResponse.merchantOrder) &&
        Objects.equals(this.payoutData, payoutUpdateResponse.payoutData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrder, payoutData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutUpdateResponse {\n");
    
    if (merchantOrder != null) sb.append("    merchantOrder: ").append(toIndentedString(merchantOrder)).append("\n");
    if (payoutData != null) sb.append("    payoutData: ").append(toIndentedString(payoutData)).append("\n");
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


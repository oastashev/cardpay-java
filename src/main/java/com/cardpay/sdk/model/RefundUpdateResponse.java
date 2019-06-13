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
 * RefundUpdateResponse
 */

public class RefundUpdateResponse {
  @SerializedName("merchant_order")
  private MerchantOrder merchantOrder = null;

  @SerializedName("refund_data")
  private ResponseUpdatedTransactionData refundData = null;

  public RefundUpdateResponse merchantOrder(MerchantOrder merchantOrder) {
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

  public RefundUpdateResponse refundData(ResponseUpdatedTransactionData refundData) {
    this.refundData = refundData;
    return this;
  }

   /**
   * Transaction data
   * @return refundData
  **/
  @ApiModelProperty(value = "Transaction data")
  public ResponseUpdatedTransactionData getRefundData() {
    return refundData;
  }

  public void setRefundData(ResponseUpdatedTransactionData refundData) {
    this.refundData = refundData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundUpdateResponse refundUpdateResponse = (RefundUpdateResponse) o;
    return Objects.equals(this.merchantOrder, refundUpdateResponse.merchantOrder) &&
        Objects.equals(this.refundData, refundUpdateResponse.refundData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrder, refundData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundUpdateResponse {\n");
    
    if (merchantOrder != null) sb.append("    merchantOrder: ").append(toIndentedString(merchantOrder)).append("\n");
    if (refundData != null) sb.append("    refundData: ").append(toIndentedString(refundData)).append("\n");
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

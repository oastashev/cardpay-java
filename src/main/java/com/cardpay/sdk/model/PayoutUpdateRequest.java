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
import com.cardpay.sdk.model.Request;
import com.cardpay.sdk.model.UpdatedTransactionData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayoutUpdateRequest
 */

public class PayoutUpdateRequest {
  @SerializedName("request")
  private Request request = null;

  @SerializedName("payout_data")
  private UpdatedTransactionData payoutData = null;

  public PayoutUpdateRequest request(Request request) {
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

  public PayoutUpdateRequest payoutData(UpdatedTransactionData payoutData) {
    this.payoutData = payoutData;
    return this;
  }

   /**
   * Get payoutData
   * @return payoutData
  **/
  @ApiModelProperty(value = "")
  public UpdatedTransactionData getPayoutData() {
    return payoutData;
  }

  public void setPayoutData(UpdatedTransactionData payoutData) {
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
    PayoutUpdateRequest payoutUpdateRequest = (PayoutUpdateRequest) o;
    return Objects.equals(this.request, payoutUpdateRequest.request) &&
        Objects.equals(this.payoutData, payoutUpdateRequest.payoutData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, payoutData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutUpdateRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

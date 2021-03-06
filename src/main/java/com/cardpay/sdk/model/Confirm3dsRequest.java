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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Confirm3dsRequest
 */

public class Confirm3dsRequest {
  @SerializedName("request")
  private Request request = null;

  @SerializedName("PaRes")
  private String paRes = null;

  public Confirm3dsRequest request(Request request) {
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

  public Confirm3dsRequest paRes(String paRes) {
    this.paRes = paRes;
    return this;
  }

   /**
   * Bank authentication result *(for BANKCARD payment method only)*
   * @return paRes
  **/
  @ApiModelProperty(required = true, value = "Bank authentication result *(for BANKCARD payment method only)*")
  public String getPaRes() {
    return paRes;
  }

  public void setPaRes(String paRes) {
    this.paRes = paRes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Confirm3dsRequest confirm3dsRequest = (Confirm3dsRequest) o;
    return Objects.equals(this.request, confirm3dsRequest.request) &&
        Objects.equals(this.paRes, confirm3dsRequest.paRes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, paRes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Confirm3dsRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (paRes != null) sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
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


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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReturnUrls
 */

public class ReturnUrls {
  @SerializedName("cancel_url")
  private String cancelUrl = null;

  @SerializedName("decline_url")
  private String declineUrl = null;

  @SerializedName("inprocess_url")
  private String inprocessUrl = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  @SerializedName("success_url")
  private String successUrl = null;

  public ReturnUrls cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * Overrides default cancel URL only
   * @return cancelUrl
  **/
  @ApiModelProperty(value = "Overrides default cancel URL only")
  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public ReturnUrls declineUrl(String declineUrl) {
    this.declineUrl = declineUrl;
    return this;
  }

   /**
   * Overrides default decline URL only
   * @return declineUrl
  **/
  @ApiModelProperty(value = "Overrides default decline URL only")
  public String getDeclineUrl() {
    return declineUrl;
  }

  public void setDeclineUrl(String declineUrl) {
    this.declineUrl = declineUrl;
  }

  public ReturnUrls inprocessUrl(String inprocessUrl) {
    this.inprocessUrl = inprocessUrl;
    return this;
  }

   /**
   * Special URL for In process status of transaction
   * @return inprocessUrl
  **/
  @ApiModelProperty(value = "Special URL for In process status of transaction")
  public String getInprocessUrl() {
    return inprocessUrl;
  }

  public void setInprocessUrl(String inprocessUrl) {
    this.inprocessUrl = inprocessUrl;
  }

  public ReturnUrls returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Overrides default success URL and cancel URL. return_url can be used separately or together with other URL parameters
   * @return returnUrl
  **/
  @ApiModelProperty(value = "Overrides default success URL and cancel URL. return_url can be used separately or together with other URL parameters")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public ReturnUrls successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Overrides default success URL only
   * @return successUrl
  **/
  @ApiModelProperty(value = "Overrides default success URL only")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnUrls returnUrls = (ReturnUrls) o;
    return Objects.equals(this.cancelUrl, returnUrls.cancelUrl) &&
        Objects.equals(this.declineUrl, returnUrls.declineUrl) &&
        Objects.equals(this.inprocessUrl, returnUrls.inprocessUrl) &&
        Objects.equals(this.returnUrl, returnUrls.returnUrl) &&
        Objects.equals(this.successUrl, returnUrls.successUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelUrl, declineUrl, inprocessUrl, returnUrl, successUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnUrls {\n");
    
    if (cancelUrl != null) sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    if (declineUrl != null) sb.append("    declineUrl: ").append(toIndentedString(declineUrl)).append("\n");
    if (inprocessUrl != null) sb.append("    inprocessUrl: ").append(toIndentedString(inprocessUrl)).append("\n");
    if (returnUrl != null) sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    if (successUrl != null) sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
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


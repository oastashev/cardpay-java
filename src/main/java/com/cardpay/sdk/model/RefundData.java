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
import java.math.BigDecimal;

/**
 * Using for RefundRequest
 */
@ApiModel(description = "Using for RefundRequest")

public class RefundData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("currency")
  private String currency = null;

  public RefundData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount to be refunded. If &#39;amount&#39; field is omitted then all remaining amount will be refunded
   * minimum: 0
   * @return amount
  **/
  @ApiModelProperty(example = "10.45", value = "Amount to be refunded. If 'amount' field is omitted then all remaining amount will be refunded")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RefundData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code. Not valid without &#39;amount&#39; field. Must be equal to initial payment currency
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "[ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code. Not valid without 'amount' field. Must be equal to initial payment currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundData refundData = (RefundData) o;
    return Objects.equals(this.amount, refundData.amount) &&
        Objects.equals(this.currency, refundData.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


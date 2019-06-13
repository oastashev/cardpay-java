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
import java.time.OffsetDateTime;

/**
 * NextSubscriptionPaymentforSubscriptionGetResponse
 */

public class NextSubscriptionPaymentforSubscriptionGetResponse {
  @SerializedName("date")
  private OffsetDateTime date = null;

  public NextSubscriptionPaymentforSubscriptionGetResponse date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The time in &#39;yyyy-MM-dd&#39; format when subscription actually becomes activated (grace period)
   * @return date
  **/
  @ApiModelProperty(value = "The time in 'yyyy-MM-dd' format when subscription actually becomes activated (grace period)")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextSubscriptionPaymentforSubscriptionGetResponse nextSubscriptionPaymentforSubscriptionGetResponse = (NextSubscriptionPaymentforSubscriptionGetResponse) o;
    return Objects.equals(this.date, nextSubscriptionPaymentforSubscriptionGetResponse.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextSubscriptionPaymentforSubscriptionGetResponse {\n");
    
    if (date != null) sb.append("    date: ").append(toIndentedString(date)).append("\n");
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


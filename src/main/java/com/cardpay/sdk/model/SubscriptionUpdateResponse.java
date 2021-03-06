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
import com.cardpay.sdk.model.UpdatedSubscriptionData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubscriptionUpdateResponse
 */

public class SubscriptionUpdateResponse {
  @SerializedName("subscription_data")
  private UpdatedSubscriptionData subscriptionData = null;

  public SubscriptionUpdateResponse subscriptionData(UpdatedSubscriptionData subscriptionData) {
    this.subscriptionData = subscriptionData;
    return this;
  }

   /**
   * Get subscriptionData
   * @return subscriptionData
  **/
  @ApiModelProperty(value = "")
  public UpdatedSubscriptionData getSubscriptionData() {
    return subscriptionData;
  }

  public void setSubscriptionData(UpdatedSubscriptionData subscriptionData) {
    this.subscriptionData = subscriptionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateResponse subscriptionUpdateResponse = (SubscriptionUpdateResponse) o;
    return Objects.equals(this.subscriptionData, subscriptionUpdateResponse.subscriptionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateResponse {\n");
    
    if (subscriptionData != null) sb.append("    subscriptionData: ").append(toIndentedString(subscriptionData)).append("\n");
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


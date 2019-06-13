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
import com.cardpay.sdk.model.SubscriptionData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubscriptionUpdateRequest
 */

public class SubscriptionUpdateRequest {
  @SerializedName("request")
  private Request request = null;

  /**
   * &#x60;CHANGE_STATUS&#x60; value to initiate operation for status changing.
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    CHANGE_STATUS("CHANGE_STATUS"),
    
    REPAYMENT("REPAYMENT"),
    
    CHANGE_FILING("CHANGE_FILING");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operation")
  private OperationEnum operation = null;

  @SerializedName("subscription_data")
  private SubscriptionData subscriptionData = null;

  public SubscriptionUpdateRequest request(Request request) {
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

  public SubscriptionUpdateRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * &#x60;CHANGE_STATUS&#x60; value to initiate operation for status changing.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "`CHANGE_STATUS` value to initiate operation for status changing.")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public SubscriptionUpdateRequest subscriptionData(SubscriptionData subscriptionData) {
    this.subscriptionData = subscriptionData;
    return this;
  }

   /**
   * Subscription data
   * @return subscriptionData
  **/
  @ApiModelProperty(required = true, value = "Subscription data")
  public SubscriptionData getSubscriptionData() {
    return subscriptionData;
  }

  public void setSubscriptionData(SubscriptionData subscriptionData) {
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
    SubscriptionUpdateRequest subscriptionUpdateRequest = (SubscriptionUpdateRequest) o;
    return Objects.equals(this.request, subscriptionUpdateRequest.request) &&
        Objects.equals(this.operation, subscriptionUpdateRequest.operation) &&
        Objects.equals(this.subscriptionData, subscriptionUpdateRequest.subscriptionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, operation, subscriptionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (operation != null) sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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


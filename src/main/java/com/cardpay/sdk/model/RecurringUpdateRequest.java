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
import com.cardpay.sdk.model.PaymentUpdateTransactionData;
import com.cardpay.sdk.model.RecurringPatchRequest;
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
 * For BANKCARD payment methods only
 */
@ApiModel(description = "For BANKCARD payment methods only")

public class RecurringUpdateRequest {
  @SerializedName("request")
  private Request request = null;

  /**
   * &#x60;CHANGE_STATUS&#x60; value
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    CHANGE_STATUS("CHANGE_STATUS"),
    
    CONFIRM_3DS("CONFIRM_3DS");

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

  @SerializedName("PaRes")
  private String paRes = null;

  @SerializedName("recurring_data")
  private PaymentUpdateTransactionData recurringData = null;

  public RecurringUpdateRequest request(Request request) {
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

  public RecurringUpdateRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * &#x60;CHANGE_STATUS&#x60; value
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "`CHANGE_STATUS` value")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public RecurringUpdateRequest paRes(String paRes) {
    this.paRes = paRes;
    return this;
  }

   /**
   * Bank authentication result for BANKCARD payments. Required if &#x60;operation&#x60; is CONFIRM_3DS.
   * @return paRes
  **/
  @ApiModelProperty(value = "Bank authentication result for BANKCARD payments. Required if `operation` is CONFIRM_3DS.")
  public String getPaRes() {
    return paRes;
  }

  public void setPaRes(String paRes) {
    this.paRes = paRes;
  }

  public RecurringUpdateRequest recurringData(PaymentUpdateTransactionData recurringData) {
    this.recurringData = recurringData;
    return this;
  }

   /**
   * Recurring data
   * @return recurringData
  **/
  @ApiModelProperty(value = "Recurring data")
  public PaymentUpdateTransactionData getRecurringData() {
    return recurringData;
  }

  public void setRecurringData(PaymentUpdateTransactionData recurringData) {
    this.recurringData = recurringData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringUpdateRequest recurringUpdateRequest = (RecurringUpdateRequest) o;
    return Objects.equals(this.request, recurringUpdateRequest.request) &&
        Objects.equals(this.operation, recurringUpdateRequest.operation) &&
        Objects.equals(this.paRes, recurringUpdateRequest.paRes) &&
        Objects.equals(this.recurringData, recurringUpdateRequest.recurringData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, operation, paRes, recurringData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringUpdateRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (operation != null) sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    if (paRes != null) sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
    if (recurringData != null) sb.append("    recurringData: ").append(toIndentedString(recurringData)).append("\n");
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


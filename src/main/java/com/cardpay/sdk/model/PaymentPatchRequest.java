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
 * PaymentPatchRequest
 */

public class PaymentPatchRequest {
  @SerializedName("request")
  private Request request = null;

  /**
   * if &#x60;operation&#x60; is CONFIRM_3DS then field &#x60;PaRes&#x60; is required if &#x60;operation&#x60; is CHANGE_STATUS then field &#x60;payment_data&#x60; is required
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    CONFIRM_3DS("CONFIRM_3DS"),
    
    CHANGE_STATUS("CHANGE_STATUS");

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

  @SerializedName("payment_data")
  private PaymentUpdateTransactionData paymentData = null;

  public PaymentPatchRequest request(Request request) {
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

  public PaymentPatchRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * if &#x60;operation&#x60; is CONFIRM_3DS then field &#x60;PaRes&#x60; is required if &#x60;operation&#x60; is CHANGE_STATUS then field &#x60;payment_data&#x60; is required
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "if `operation` is CONFIRM_3DS then field `PaRes` is required if `operation` is CHANGE_STATUS then field `payment_data` is required")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public PaymentPatchRequest paRes(String paRes) {
    this.paRes = paRes;
    return this;
  }

   /**
   * Bank authentication result for BANKCARD payments
   * @return paRes
  **/
  @ApiModelProperty(value = "Bank authentication result for BANKCARD payments")
  public String getPaRes() {
    return paRes;
  }

  public void setPaRes(String paRes) {
    this.paRes = paRes;
  }

  public PaymentPatchRequest paymentData(PaymentUpdateTransactionData paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Payment data
   * @return paymentData
  **/
  @ApiModelProperty(value = "Payment data")
  public PaymentUpdateTransactionData getPaymentData() {
    return paymentData;
  }

  public void setPaymentData(PaymentUpdateTransactionData paymentData) {
    this.paymentData = paymentData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPatchRequest paymentPatchRequest = (PaymentPatchRequest) o;
    return Objects.equals(this.request, paymentPatchRequest.request) &&
        Objects.equals(this.operation, paymentPatchRequest.operation) &&
        Objects.equals(this.paRes, paymentPatchRequest.paRes) &&
        Objects.equals(this.paymentData, paymentPatchRequest.paymentData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, operation, paRes, paymentData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPatchRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (operation != null) sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    if (paRes != null) sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
    if (paymentData != null) sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
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

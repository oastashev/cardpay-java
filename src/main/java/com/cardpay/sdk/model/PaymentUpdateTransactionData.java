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
 * Relates to PaymentRequest and RecurringRequest
 */
@ApiModel(description = "Relates to PaymentRequest and RecurringRequest")

public class PaymentUpdateTransactionData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  /**
   * Payment: &#x60;COMPLETE&#x60; or &#x60;REVERSE&#x60; status to be set.  Refund, payout: &#x60;REVERSE&#x60; status to be set.  *(for BANKCARD payment method only)*
   */
  @JsonAdapter(StatusToEnum.Adapter.class)
  public enum StatusToEnum {
    COMPLETE("COMPLETE"),
    
    REVERSE("REVERSE");

    private String value;

    StatusToEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusToEnum fromValue(String text) {
      for (StatusToEnum b : StatusToEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusToEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusToEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusToEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusToEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status_to")
  private StatusToEnum statusTo = null;

  public PaymentUpdateTransactionData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentUpdateTransactionData statusTo(StatusToEnum statusTo) {
    this.statusTo = statusTo;
    return this;
  }

   /**
   * Payment: &#x60;COMPLETE&#x60; or &#x60;REVERSE&#x60; status to be set.  Refund, payout: &#x60;REVERSE&#x60; status to be set.  *(for BANKCARD payment method only)*
   * @return statusTo
  **/
  @ApiModelProperty(value = "Payment: `COMPLETE` or `REVERSE` status to be set.  Refund, payout: `REVERSE` status to be set.  *(for BANKCARD payment method only)*")
  public StatusToEnum getStatusTo() {
    return statusTo;
  }

  public void setStatusTo(StatusToEnum statusTo) {
    this.statusTo = statusTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentUpdateTransactionData paymentUpdateTransactionData = (PaymentUpdateTransactionData) o;
    return Objects.equals(this.amount, paymentUpdateTransactionData.amount) &&
        Objects.equals(this.statusTo, paymentUpdateTransactionData.statusTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, statusTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentUpdateTransactionData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (statusTo != null) sb.append("    statusTo: ").append(toIndentedString(statusTo)).append("\n");
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


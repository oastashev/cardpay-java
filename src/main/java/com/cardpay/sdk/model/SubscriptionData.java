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
import com.cardpay.sdk.model.Filing;
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
 * SubscriptionData
 */

public class SubscriptionData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("filing")
  private Filing filing = null;

  /**
   * Sets &#x60;inactive&#x60; status of subscription.
   */
  @JsonAdapter(StatusToEnum.Adapter.class)
  public enum StatusToEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    CANCELLED("CANCELLED"),
    
    PAST_DUE("PAST_DUE"),
    
    PENDING("PENDING"),
    
    COMPLETED("COMPLETED"),
    
    CARD_EXPIRED("CARD_EXPIRED");

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

  public SubscriptionData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SubscriptionData filing(Filing filing) {
    this.filing = filing;
    return this;
  }

   /**
   * Get filing
   * @return filing
  **/
  @ApiModelProperty(value = "")
  public Filing getFiling() {
    return filing;
  }

  public void setFiling(Filing filing) {
    this.filing = filing;
  }

  public SubscriptionData statusTo(StatusToEnum statusTo) {
    this.statusTo = statusTo;
    return this;
  }

   /**
   * Sets &#x60;inactive&#x60; status of subscription.
   * @return statusTo
  **/
  @ApiModelProperty(example = "inactive", value = "Sets `inactive` status of subscription.")
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
    SubscriptionData subscriptionData = (SubscriptionData) o;
    return Objects.equals(this.amount, subscriptionData.amount) &&
        Objects.equals(this.filing, subscriptionData.filing) &&
        Objects.equals(this.statusTo, subscriptionData.statusTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, filing, statusTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (filing != null) sb.append("    filing: ").append(toIndentedString(filing)).append("\n");
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

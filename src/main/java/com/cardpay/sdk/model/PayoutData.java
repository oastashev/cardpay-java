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
 * PayoutData
 */

public class PayoutData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("decline_code")
  private String declineCode = null;

  @SerializedName("decline_reason")
  private String declineReason = null;

  @SerializedName("dynamic_descriptor")
  private String dynamicDescriptor = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("rrn")
  private String rrn = null;

  /**
   * Current payout **status**
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("NEW"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DECLINED("DECLINED"),
    
    AUTHORIZED("AUTHORIZED"),
    
    COMPLETED("COMPLETED"),
    
    CANCELLED("CANCELLED"),
    
    REFUNDED("REFUNDED"),
    
    PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
    
    VOIDED("VOIDED"),
    
    CHARGED_BACK("CHARGED_BACK"),
    
    CHARGEBACK_RESOLVED("CHARGEBACK_RESOLVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public PayoutData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Represents the amount to be transferred to the customer&#39;s card, must be less than 100 millions
   * @return amount
  **/
  @ApiModelProperty(example = "12.34", required = true, value = "Represents the amount to be transferred to the customer's card, must be less than 100 millions")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PayoutData created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Time when this payout started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
   * @return created
  **/
  @ApiModelProperty(example = "2018-08-27T09:10:51Z", required = true, value = "Time when this payout started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PayoutData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the payout transaction. Must match terminal currency
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "[ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the payout transaction. Must match terminal currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PayoutData declineCode(String declineCode) {
    this.declineCode = declineCode;
    return this;
  }

   /**
   * **Decline code** (only in decline case)
   * @return declineCode
  **/
  @ApiModelProperty(example = "02", value = "**Decline code** (only in decline case)")
  public String getDeclineCode() {
    return declineCode;
  }

  public void setDeclineCode(String declineCode) {
    this.declineCode = declineCode;
  }

  public PayoutData declineReason(String declineReason) {
    this.declineReason = declineReason;
    return this;
  }

   /**
   * Bank&#39;s message about payout decline reason (only in decline case)
   * @return declineReason
  **/
  @ApiModelProperty(example = "Cancelled by customer", value = "Bank's message about payout decline reason (only in decline case)")
  public String getDeclineReason() {
    return declineReason;
  }

  public void setDeclineReason(String declineReason) {
    this.declineReason = declineReason;
  }

  public PayoutData dynamicDescriptor(String dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
    return this;
  }

   /**
   * Short description of the service or product, must be enabled by CardPay manager to be used *(for BANKCARD, QIWI, WEBMONEY and BITCOIN payment methods only)*
   * @return dynamicDescriptor
  **/
  @ApiModelProperty(value = "Short description of the service or product, must be enabled by CardPay manager to be used *(for BANKCARD, QIWI, WEBMONEY and BITCOIN payment methods only)*")
  public String getDynamicDescriptor() {
    return dynamicDescriptor;
  }

  public void setDynamicDescriptor(String dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
  }

  public PayoutData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * CardPay&#39;s payout id
   * @return id
  **/
  @ApiModelProperty(example = "4237264", required = true, value = "CardPay's payout id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PayoutData note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Note about the payout, not shown to the customer
   * @return note
  **/
  @ApiModelProperty(value = "Note about the payout, not shown to the customer")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public PayoutData rrn(String rrn) {
    this.rrn = rrn;
    return this;
  }

   /**
   * RRN (Retrieval Reference Number), supplied by the acquiring financial institution
   * @return rrn
  **/
  @ApiModelProperty(value = "RRN (Retrieval Reference Number), supplied by the acquiring financial institution")
  public String getRrn() {
    return rrn;
  }

  public void setRrn(String rrn) {
    this.rrn = rrn;
  }

  public PayoutData status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current payout **status**
   * @return status
  **/
  @ApiModelProperty(example = "COMPLETED", required = true, value = "Current payout **status**")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutData payoutData = (PayoutData) o;
    return Objects.equals(this.amount, payoutData.amount) &&
        Objects.equals(this.created, payoutData.created) &&
        Objects.equals(this.currency, payoutData.currency) &&
        Objects.equals(this.declineCode, payoutData.declineCode) &&
        Objects.equals(this.declineReason, payoutData.declineReason) &&
        Objects.equals(this.dynamicDescriptor, payoutData.dynamicDescriptor) &&
        Objects.equals(this.id, payoutData.id) &&
        Objects.equals(this.note, payoutData.note) &&
        Objects.equals(this.rrn, payoutData.rrn) &&
        Objects.equals(this.status, payoutData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, created, currency, declineCode, declineReason, dynamicDescriptor, id, note, rrn, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (created != null) sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (declineCode != null) sb.append("    declineCode: ").append(toIndentedString(declineCode)).append("\n");
    if (declineReason != null) sb.append("    declineReason: ").append(toIndentedString(declineReason)).append("\n");
    if (dynamicDescriptor != null) sb.append("    dynamicDescriptor: ").append(toIndentedString(dynamicDescriptor)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (note != null) sb.append("    note: ").append(toIndentedString(note)).append("\n");
    if (rrn != null) sb.append("    rrn: ").append(toIndentedString(rrn)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

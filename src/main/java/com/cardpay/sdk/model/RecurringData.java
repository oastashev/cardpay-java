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
import com.cardpay.sdk.model.Plan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * Card Token feature (see &#x60;generate_token&#x60; field below) is almost the same as Recurring, but the difference is that in this case each payment is made with Cardholder presence and requires CVV2/CVC2/CAV2 (Secure code) and 3-D Secure if available. You can obtain Card Token by a sending usual transaction with the attribute &#x60;generate_token&#x60; having a value &#x60;true&#x60; in it. The generated Card Token is sent in a callback and response to GET request for early created transaction and only if created payment with &#x60;generate_token&#x60; attribute was successful. Each time when a token is requested, the new one is generated even for the same card. To use Card Token you can send it in &#x60;card_account.token&#x60; attribute, so a customer will not have to enter card details again, only CVV2/CVC2/CAV2 (Secure code) and pass 3-D Secure if needed. Generated Card Token can be used only for payment requests (not for recurrings). A Card Token cannot be used more than 1 year after the token was generated. For BANKCARD payment method only.
 */
@ApiModel(description = "Card Token feature (see `generate_token` field below) is almost the same as Recurring, but the difference is that in this case each payment is made with Cardholder presence and requires CVV2/CVC2/CAV2 (Secure code) and 3-D Secure if available. You can obtain Card Token by a sending usual transaction with the attribute `generate_token` having a value `true` in it. The generated Card Token is sent in a callback and response to GET request for early created transaction and only if created payment with `generate_token` attribute was successful. Each time when a token is requested, the new one is generated even for the same card. To use Card Token you can send it in `card_account.token` attribute, so a customer will not have to enter card details again, only CVV2/CVC2/CAV2 (Secure code) and pass 3-D Secure if needed. Generated Card Token can be used only for payment requests (not for recurrings). A Card Token cannot be used more than 1 year after the token was generated. For BANKCARD payment method only.")

public class RecurringData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("begin")
  private Boolean begin = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("dynamic_descriptor")
  private String dynamicDescriptor = null;

  @SerializedName("filing")
  private Filing filing = null;

  @SerializedName("generate_token")
  private Boolean generateToken = null;

  @SerializedName("initiator")
  private String initiator = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("payments")
  private Integer payments = null;

  /**
   * Initial period of recurring, can be &#x60;day&#x60;, &#x60;week&#x60;, &#x60;month&#x60;, &#x60;year&#x60;
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    MINUTE("minute"),
    
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("period")
  private PeriodEnum period = null;

  @SerializedName("plan")
  private Plan plan = null;

  @SerializedName("preauth")
  private Boolean preauth = null;

  @SerializedName("retries")
  private Integer retries = null;

  @SerializedName("subscription_start")
  private OffsetDateTime subscriptionStart = null;

  public RecurringData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions
   * @return amount
  **/
  @ApiModelProperty(value = "The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RecurringData begin(Boolean begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Get begin
   * @return begin
  **/
  @ApiModelProperty(value = "")
  public Boolean isBegin() {
    return begin;
  }

  public void setBegin(Boolean begin) {
    this.begin = begin;
  }

  public RecurringData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "[ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RecurringData dynamicDescriptor(String dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
    return this;
  }

   /**
   * Short description of the service or product, must be enabled by CardPay manager to be used
   * @return dynamicDescriptor
  **/
  @ApiModelProperty(value = "Short description of the service or product, must be enabled by CardPay manager to be used")
  public String getDynamicDescriptor() {
    return dynamicDescriptor;
  }

  public void setDynamicDescriptor(String dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
  }

  public RecurringData filing(Filing filing) {
    this.filing = filing;
    return this;
  }

   /**
   * Filing data, should be send in all recurring requests besides first recurring request First recurring request should be send without filing attribute
   * @return filing
  **/
  @ApiModelProperty(value = "Filing data, should be send in all recurring requests besides first recurring request First recurring request should be send without filing attribute")
  public Filing getFiling() {
    return filing;
  }

  public void setFiling(Filing filing) {
    this.filing = filing;
  }

  public RecurringData generateToken(Boolean generateToken) {
    this.generateToken = generateToken;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, token will be generated and returned in the response
   * @return generateToken
  **/
  @ApiModelProperty(value = "If set to `true`, token will be generated and returned in the response")
  public Boolean isGenerateToken() {
    return generateToken;
  }

  public void setGenerateToken(Boolean generateToken) {
    this.generateToken = generateToken;
  }

  public RecurringData initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Can be only 2 values: &#x60;mit&#x60; (merchant initiated transaction), &#x60;cit&#x60; (cardholder initiated transaction)
   * @return initiator
  **/
  @ApiModelProperty(value = "Can be only 2 values: `mit` (merchant initiated transaction), `cit` (cardholder initiated transaction)")
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  public RecurringData interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The frequency interval of period, can be 1-365 depending on selected period value. Maximum total value of period + interval can be 365 days / 52 weeks / 12 months / 1 year
   * minimum: 1
   * @return interval
  **/
  @ApiModelProperty(value = "The frequency interval of period, can be 1-365 depending on selected period value. Maximum total value of period + interval can be 365 days / 52 weeks / 12 months / 1 year")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public RecurringData note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Note about the transaction that will not be displayed to customer
   * @return note
  **/
  @ApiModelProperty(value = "Note about the transaction that will not be displayed to customer")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public RecurringData payments(Integer payments) {
    this.payments = payments;
    return this;
  }

   /**
   * Number of total payments to be charged per defined interval
   * minimum: 2
   * maximum: 200
   * @return payments
  **/
  @ApiModelProperty(value = "Number of total payments to be charged per defined interval")
  public Integer getPayments() {
    return payments;
  }

  public void setPayments(Integer payments) {
    this.payments = payments;
  }

  public RecurringData period(PeriodEnum period) {
    this.period = period;
    return this;
  }

   /**
   * Initial period of recurring, can be &#x60;day&#x60;, &#x60;week&#x60;, &#x60;month&#x60;, &#x60;year&#x60;
   * @return period
  **/
  @ApiModelProperty(value = "Initial period of recurring, can be `day`, `week`, `month`, `year`")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public RecurringData plan(Plan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Plan data
   * @return plan
  **/
  @ApiModelProperty(value = "Plan data")
  public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  public RecurringData preauth(Boolean preauth) {
    this.preauth = preauth;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, the amount will not be captured but only blocked *(for BANKCARD payment method only)*.
   * @return preauth
  **/
  @ApiModelProperty(value = "If set to `true`, the amount will not be captured but only blocked *(for BANKCARD payment method only)*.")
  public Boolean isPreauth() {
    return preauth;
  }

  public void setPreauth(Boolean preauth) {
    this.preauth = preauth;
  }

  public RecurringData retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Number of daily basis retry attempts in case of payment has not been captured
   * minimum: 1
   * maximum: 15
   * @return retries
  **/
  @ApiModelProperty(value = "Number of daily basis retry attempts in case of payment has not been captured")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public RecurringData subscriptionStart(OffsetDateTime subscriptionStart) {
    this.subscriptionStart = subscriptionStart;
    return this;
  }

   /**
   * The time in &#39;yyyy-MM-dd&#39; format when subscription will actually become activated (grace period).Leave it empty to activate subscription at once without any grace period applied.
   * @return subscriptionStart
  **/
  @ApiModelProperty(value = "The time in 'yyyy-MM-dd' format when subscription will actually become activated (grace period).Leave it empty to activate subscription at once without any grace period applied.")
  public OffsetDateTime getSubscriptionStart() {
    return subscriptionStart;
  }

  public void setSubscriptionStart(OffsetDateTime subscriptionStart) {
    this.subscriptionStart = subscriptionStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringData recurringData = (RecurringData) o;
    return Objects.equals(this.amount, recurringData.amount) &&
        Objects.equals(this.begin, recurringData.begin) &&
        Objects.equals(this.currency, recurringData.currency) &&
        Objects.equals(this.dynamicDescriptor, recurringData.dynamicDescriptor) &&
        Objects.equals(this.filing, recurringData.filing) &&
        Objects.equals(this.generateToken, recurringData.generateToken) &&
        Objects.equals(this.initiator, recurringData.initiator) &&
        Objects.equals(this.interval, recurringData.interval) &&
        Objects.equals(this.note, recurringData.note) &&
        Objects.equals(this.payments, recurringData.payments) &&
        Objects.equals(this.period, recurringData.period) &&
        Objects.equals(this.plan, recurringData.plan) &&
        Objects.equals(this.preauth, recurringData.preauth) &&
        Objects.equals(this.retries, recurringData.retries) &&
        Objects.equals(this.subscriptionStart, recurringData.subscriptionStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, begin, currency, dynamicDescriptor, filing, generateToken, initiator, interval, note, payments, period, plan, preauth, retries, subscriptionStart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (begin != null) sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (dynamicDescriptor != null) sb.append("    dynamicDescriptor: ").append(toIndentedString(dynamicDescriptor)).append("\n");
    if (filing != null) sb.append("    filing: ").append(toIndentedString(filing)).append("\n");
    if (generateToken != null) sb.append("    generateToken: ").append(toIndentedString(generateToken)).append("\n");
    if (initiator != null) sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    if (interval != null) sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    if (note != null) sb.append("    note: ").append(toIndentedString(note)).append("\n");
    if (payments != null) sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    if (period != null) sb.append("    period: ").append(toIndentedString(period)).append("\n");
    if (plan != null) sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    if (preauth != null) sb.append("    preauth: ").append(toIndentedString(preauth)).append("\n");
    if (retries != null) sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    if (subscriptionStart != null) sb.append("    subscriptionStart: ").append(toIndentedString(subscriptionStart)).append("\n");
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


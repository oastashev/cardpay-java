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

/**
 * Customer
 */

public class Customer {
  @SerializedName("birth_date")
  private String birthDate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("phone")
  private String phone = null;

  public Customer birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Customer&#39;s birth date in format YYYY-MM-DD
   * @return birthDate
  **/
  @ApiModelProperty(value = "Customer's birth date in format YYYY-MM-DD")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s e-mail address *(mandatory for BANKCARD and NETELLER (for all API access modes, except Payment page mode) payment methods only)*
   * @return email
  **/
  @ApiModelProperty(example = "customer@example.com", required = true, value = "Customer's e-mail address *(mandatory for BANKCARD and NETELLER (for all API access modes, except Payment page mode) payment methods only)*")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Customer&#39;s full name
   * @return fullName
  **/
  @ApiModelProperty(example = "John Smith", value = "Customer's full name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Customer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer&#39;s ID in the merchant&#39;s system
   * @return id
  **/
  @ApiModelProperty(value = "Customer's ID in the merchant's system")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Preferred locale for the payment page ([ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1) language code). The default locale will be applied if the selected locale is not supported. Supported locales are: &#x60;ru&#x60;, &#x60;en&#x60;, &#x60;zh&#x60;, &#x60;ja&#x60;
   * @return locale
  **/
  @ApiModelProperty(value = "Preferred locale for the payment page ([ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1) language code). The default locale will be applied if the selected locale is not supported. Supported locales are: `ru`, `en`, `zh`, `ja`")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Customer&#39;s phone number
   * @return phone
  **/
  @ApiModelProperty(example = "+15417543010", value = "Customer's phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.fullName, customer.fullName) &&
        Objects.equals(this.id, customer.id) &&
        Objects.equals(this.locale, customer.locale) &&
        Objects.equals(this.phone, customer.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, email, fullName, id, locale, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    if (birthDate != null) sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    if (email != null) sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (fullName != null) sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (locale != null) sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    if (phone != null) sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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


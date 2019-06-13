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
 * Using for RefundResponse
 */
@ApiModel(description = "Using for RefundResponse")

public class RefundCustomer {
  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  public RefundCustomer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s e-mail address
   * @return email
  **/
  @ApiModelProperty(example = "customer@merchant.com", value = "Customer's e-mail address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RefundCustomer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer&#39;s ID in the merchant&#39;s system
   * @return id
  **/
  @ApiModelProperty(example = "373278232", value = "Customer's ID in the merchant's system")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundCustomer refundCustomer = (RefundCustomer) o;
    return Objects.equals(this.email, refundCustomer.email) &&
        Objects.equals(this.id, refundCustomer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundCustomer {\n");
    
    if (email != null) sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


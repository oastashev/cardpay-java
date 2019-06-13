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
 * Using for RefundRequest
 */
@ApiModel(description = "Using for RefundRequest")

public class RefundMerchantOrder {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  public RefundMerchantOrder description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description (reason) for refund
   * @return description
  **/
  @ApiModelProperty(example = "Return order", required = true, value = "Description (reason) for refund")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RefundMerchantOrder id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Merchant&#39;s ID of the order
   * @return id
  **/
  @ApiModelProperty(value = "Merchant's ID of the order")
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
    RefundMerchantOrder refundMerchantOrder = (RefundMerchantOrder) o;
    return Objects.equals(this.description, refundMerchantOrder.description) &&
        Objects.equals(this.id, refundMerchantOrder.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundMerchantOrder {\n");
    
    if (description != null) sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

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
 * Item element represents individual order item or service. Relates to MerchantOrder, PaymentMerchantOrder
 */
@ApiModel(description = "Item element represents individual order item or service. Relates to MerchantOrder, PaymentMerchantOrder")

public class Item {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private BigDecimal price = null;

  public Item count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The count of product / service, provided to the customer. Any positive number
   * @return count
  **/
  @ApiModelProperty(example = "4", value = "The count of product / service, provided to the customer. Any positive number")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Item description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of product / service, provided to the customer
   * @return description
  **/
  @ApiModelProperty(example = "Premium Cotton T-Shirt", value = "The description of product / service, provided to the customer")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of product / service, provided to the customer
   * @return name
  **/
  @ApiModelProperty(example = "T-Shirt", required = true, value = "The name of product / service, provided to the customer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Price of product / service with dot as a decimal separator, must be less than 1 million
   * @return price
  **/
  @ApiModelProperty(example = "60.0", value = "Price of product / service with dot as a decimal separator, must be less than 1 million")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.count, item.count) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.name, item.name) &&
        Objects.equals(this.price, item.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, description, name, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    if (count != null) sb.append("    count: ").append(toIndentedString(count)).append("\n");
    if (description != null) sb.append("    description: ").append(toIndentedString(description)).append("\n");
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (price != null) sb.append("    price: ").append(toIndentedString(price)).append("\n");
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


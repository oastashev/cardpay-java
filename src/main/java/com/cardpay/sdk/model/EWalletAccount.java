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
 * For ALIPAY, QIWI, WEBMONEY and NETELLER payment methods only
 */
@ApiModel(description = "For ALIPAY, QIWI, WEBMONEY and NETELLER payment methods only")

public class EWalletAccount {
  @SerializedName("id")
  private String id = null;

  public EWalletAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * For ALIPAY: 16 digits number. For QIWI: customer&#39;s phone number (from 1 to 15 digits). For WEBMONEY: customer account number. For NETELLER: customer email.
   * @return id
  **/
  @ApiModelProperty(value = "For ALIPAY: 16 digits number. For QIWI: customer's phone number (from 1 to 15 digits). For WEBMONEY: customer account number. For NETELLER: customer email.")
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
    EWalletAccount ewalletAccount = (EWalletAccount) o;
    return Objects.equals(this.id, ewalletAccount.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EWalletAccount {\n");
    
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


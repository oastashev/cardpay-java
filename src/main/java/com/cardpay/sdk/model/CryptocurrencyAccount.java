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
 * For BITCOIN payment method only. Relates to PaymentResponse
 */
@ApiModel(description = "For BITCOIN payment method only. Relates to PaymentResponse")

public class CryptocurrencyAccount {
  @SerializedName("crypto_address")
  private String cryptoAddress = null;

  @SerializedName("crypto_transaction_id")
  private String cryptoTransactionId = null;

  @SerializedName("prc_amount")
  private BigDecimal prcAmount = null;

  @SerializedName("prc_currency")
  private String prcCurrency = null;

  public CryptocurrencyAccount cryptoAddress(String cryptoAddress) {
    this.cryptoAddress = cryptoAddress;
    return this;
  }

   /**
   * Bitcoin address for created transaction
   * @return cryptoAddress
  **/
  @ApiModelProperty(example = "1KKQopKKDYMtp7kavZH1YF882uMpoaxSLq", value = "Bitcoin address for created transaction")
  public String getCryptoAddress() {
    return cryptoAddress;
  }

  public void setCryptoAddress(String cryptoAddress) {
    this.cryptoAddress = cryptoAddress;
  }

  public CryptocurrencyAccount cryptoTransactionId(String cryptoTransactionId) {
    this.cryptoTransactionId = cryptoTransactionId;
    return this;
  }

   /**
   * Id of created transaction in the bitcoin system
   * @return cryptoTransactionId
  **/
  @ApiModelProperty(example = "f3c1ff551b0f776323a77d39ad64c7a90202e1efe79f19fb24487ea164f1a976", value = "Id of created transaction in the bitcoin system")
  public String getCryptoTransactionId() {
    return cryptoTransactionId;
  }

  public void setCryptoTransactionId(String cryptoTransactionId) {
    this.cryptoTransactionId = cryptoTransactionId;
  }

  public CryptocurrencyAccount prcAmount(BigDecimal prcAmount) {
    this.prcAmount = prcAmount;
    return this;
  }

   /**
   * Transaction amount in XBT
   * @return prcAmount
  **/
  @ApiModelProperty(example = "0.00423", value = "Transaction amount in XBT")
  public BigDecimal getPrcAmount() {
    return prcAmount;
  }

  public void setPrcAmount(BigDecimal prcAmount) {
    this.prcAmount = prcAmount;
  }

  public CryptocurrencyAccount prcCurrency(String prcCurrency) {
    this.prcCurrency = prcCurrency;
    return this;
  }

   /**
   * Currency of transaction (always equals &#x60;XBT&#x60;)
   * @return prcCurrency
  **/
  @ApiModelProperty(value = "Currency of transaction (always equals `XBT`)")
  public String getPrcCurrency() {
    return prcCurrency;
  }

  public void setPrcCurrency(String prcCurrency) {
    this.prcCurrency = prcCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptocurrencyAccount cryptocurrencyAccount = (CryptocurrencyAccount) o;
    return Objects.equals(this.cryptoAddress, cryptocurrencyAccount.cryptoAddress) &&
        Objects.equals(this.cryptoTransactionId, cryptocurrencyAccount.cryptoTransactionId) &&
        Objects.equals(this.prcAmount, cryptocurrencyAccount.prcAmount) &&
        Objects.equals(this.prcCurrency, cryptocurrencyAccount.prcCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptoAddress, cryptoTransactionId, prcAmount, prcCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptocurrencyAccount {\n");
    
    if (cryptoAddress != null) sb.append("    cryptoAddress: ").append(toIndentedString(cryptoAddress)).append("\n");
    if (cryptoTransactionId != null) sb.append("    cryptoTransactionId: ").append(toIndentedString(cryptoTransactionId)).append("\n");
    if (prcAmount != null) sb.append("    prcAmount: ").append(toIndentedString(prcAmount)).append("\n");
    if (prcCurrency != null) sb.append("    prcCurrency: ").append(toIndentedString(prcCurrency)).append("\n");
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

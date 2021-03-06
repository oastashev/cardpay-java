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
 * ApiTokens
 */

public class ApiTokens {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private Long expiresIn = null;

  @SerializedName("refresh_expires_in")
  private Long refreshExpiresIn = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("token_type")
  private String tokenType = null;

  public ApiTokens accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * API access token which grants the access to the list of authorized services.
   * @return accessToken
  **/
  @ApiModelProperty(example = "aGVhZGVyLmFjY2Vzc190b2tlbl9ib2R5LnNpZ25hdHVyZQ==", required = true, value = "API access token which grants the access to the list of authorized services.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ApiTokens expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Access token lifetime in seconds.
   * @return expiresIn
  **/
  @ApiModelProperty(example = "300", required = true, value = "Access token lifetime in seconds.")
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public ApiTokens refreshExpiresIn(Long refreshExpiresIn) {
    this.refreshExpiresIn = refreshExpiresIn;
    return this;
  }

   /**
   * Refresh token lifetime in seconds.
   * @return refreshExpiresIn
  **/
  @ApiModelProperty(example = "1800", required = true, value = "Refresh token lifetime in seconds.")
  public Long getRefreshExpiresIn() {
    return refreshExpiresIn;
  }

  public void setRefreshExpiresIn(Long refreshExpiresIn) {
    this.refreshExpiresIn = refreshExpiresIn;
  }

  public ApiTokens refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * API refresh token that is used to update expired access token.
   * @return refreshToken
  **/
  @ApiModelProperty(example = "aGVhZGVyLnJlZnJlc2hfdG9rZW5fYm9keS5zaWduYXR1cmU=", required = true, value = "API refresh token that is used to update expired access token.")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ApiTokens tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Access token type
   * @return tokenType
  **/
  @ApiModelProperty(example = "bearer", required = true, value = "Access token type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTokens apiTokens = (ApiTokens) o;
    return Objects.equals(this.accessToken, apiTokens.accessToken) &&
        Objects.equals(this.expiresIn, apiTokens.expiresIn) &&
        Objects.equals(this.refreshExpiresIn, apiTokens.refreshExpiresIn) &&
        Objects.equals(this.refreshToken, apiTokens.refreshToken) &&
        Objects.equals(this.tokenType, apiTokens.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshExpiresIn, refreshToken, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTokens {\n");
    
    if (accessToken != null) sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    if (expiresIn != null) sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    if (refreshExpiresIn != null) sb.append("    refreshExpiresIn: ").append(toIndentedString(refreshExpiresIn)).append("\n");
    if (refreshToken != null) sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    if (tokenType != null) sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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


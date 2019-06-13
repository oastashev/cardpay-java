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
 * For BANKCARD payment method only. Relates to Flights
 */
@ApiModel(description = "For BANKCARD payment method only. Relates to Flights")

public class Flight {
  @SerializedName("carrier_code")
  private String carrierCode = null;

  @SerializedName("destination_code")
  private String destinationCode = null;

  @SerializedName("fare_basis_code")
  private String fareBasisCode = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("service_class_code")
  private Integer serviceClassCode = null;

  @SerializedName("stop_over_code")
  private String stopOverCode = null;

  public Flight carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Carrier code
   * @return carrierCode
  **/
  @ApiModelProperty(value = "Carrier code")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public Flight destinationCode(String destinationCode) {
    this.destinationCode = destinationCode;
    return this;
  }

   /**
   * Code of airport of destination, IATA code
   * @return destinationCode
  **/
  @ApiModelProperty(value = "Code of airport of destination, IATA code")
  public String getDestinationCode() {
    return destinationCode;
  }

  public void setDestinationCode(String destinationCode) {
    this.destinationCode = destinationCode;
  }

  public Flight fareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
    return this;
  }

   /**
   * Information about fare basis code/ticket number
   * @return fareBasisCode
  **/
  @ApiModelProperty(value = "Information about fare basis code/ticket number")
  public String getFareBasisCode() {
    return fareBasisCode;
  }

  public void setFareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
  }

  public Flight index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Sequence number (index) of the flight
   * @return index
  **/
  @ApiModelProperty(value = "Sequence number (index) of the flight")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Flight number(String number) {
    this.number = number;
    return this;
  }

   /**
   * IATA or ICAO flight number
   * @return number
  **/
  @ApiModelProperty(value = "IATA or ICAO flight number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Flight serviceClassCode(Integer serviceClassCode) {
    this.serviceClassCode = serviceClassCode;
    return this;
  }

   /**
   * Code of service class
   * @return serviceClassCode
  **/
  @ApiModelProperty(value = "Code of service class")
  public Integer getServiceClassCode() {
    return serviceClassCode;
  }

  public void setServiceClassCode(Integer serviceClassCode) {
    this.serviceClassCode = serviceClassCode;
  }

  public Flight stopOverCode(String stopOverCode) {
    this.stopOverCode = stopOverCode;
    return this;
  }

   /**
   * Stop over code
   * @return stopOverCode
  **/
  @ApiModelProperty(value = "Stop over code")
  public String getStopOverCode() {
    return stopOverCode;
  }

  public void setStopOverCode(String stopOverCode) {
    this.stopOverCode = stopOverCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flight flight = (Flight) o;
    return Objects.equals(this.carrierCode, flight.carrierCode) &&
        Objects.equals(this.destinationCode, flight.destinationCode) &&
        Objects.equals(this.fareBasisCode, flight.fareBasisCode) &&
        Objects.equals(this.index, flight.index) &&
        Objects.equals(this.number, flight.number) &&
        Objects.equals(this.serviceClassCode, flight.serviceClassCode) &&
        Objects.equals(this.stopOverCode, flight.stopOverCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, destinationCode, fareBasisCode, index, number, serviceClassCode, stopOverCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flight {\n");
    
    if (carrierCode != null) sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    if (destinationCode != null) sb.append("    destinationCode: ").append(toIndentedString(destinationCode)).append("\n");
    if (fareBasisCode != null) sb.append("    fareBasisCode: ").append(toIndentedString(fareBasisCode)).append("\n");
    if (index != null) sb.append("    index: ").append(toIndentedString(index)).append("\n");
    if (number != null) sb.append("    number: ").append(toIndentedString(number)).append("\n");
    if (serviceClassCode != null) sb.append("    serviceClassCode: ").append(toIndentedString(serviceClassCode)).append("\n");
    if (stopOverCode != null) sb.append("    stopOverCode: ").append(toIndentedString(stopOverCode)).append("\n");
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

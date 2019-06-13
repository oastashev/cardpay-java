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
import com.cardpay.sdk.model.ResponsePlanData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PlanDataList
 */

public class PlanDataList {
  @SerializedName("data")
  private List<ResponsePlanData> data = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  public PlanDataList data(List<ResponsePlanData> data) {
    this.data = data;
    return this;
  }

  public PlanDataList addDataItem(ResponsePlanData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<ResponsePlanData> getData() {
    return data;
  }

  public void setData(List<ResponsePlanData> data) {
    this.data = data;
  }

  public PlanDataList hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanDataList planDataList = (PlanDataList) o;
    return Objects.equals(this.data, planDataList.data) &&
        Objects.equals(this.hasMore, planDataList.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, hasMore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanDataList {\n");
    
    if (data != null) sb.append("    data: ").append(toIndentedString(data)).append("\n");
    if (hasMore != null) sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

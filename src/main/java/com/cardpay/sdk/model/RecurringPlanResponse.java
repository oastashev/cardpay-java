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

/**
 * RecurringPlanResponse
 */

public class RecurringPlanResponse {
  @SerializedName("plan_data")
  private ResponsePlanData planData = null;

  public RecurringPlanResponse planData(ResponsePlanData planData) {
    this.planData = planData;
    return this;
  }

   /**
   * Recurring plan data
   * @return planData
  **/
  @ApiModelProperty(value = "Recurring plan data")
  public ResponsePlanData getPlanData() {
    return planData;
  }

  public void setPlanData(ResponsePlanData planData) {
    this.planData = planData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringPlanResponse recurringPlanResponse = (RecurringPlanResponse) o;
    return Objects.equals(this.planData, recurringPlanResponse.planData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringPlanResponse {\n");
    
    if (planData != null) sb.append("    planData: ").append(toIndentedString(planData)).append("\n");
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


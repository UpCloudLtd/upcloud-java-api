/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.upcloud.client.models.Plan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AvailablePlanListResponsePlans
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T14:18:27.065+03:00")
public class AvailablePlanListResponsePlans {
  @SerializedName("plan")
  private List<Plan> plan = null;

  public AvailablePlanListResponsePlans plan(List<Plan> plan) {
    this.plan = plan;
    return this;
  }

  public AvailablePlanListResponsePlans addPlanItem(Plan planItem) {
    if (this.plan == null) {
      this.plan = new ArrayList<Plan>();
    }
    this.plan.add(planItem);
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public List<Plan> getPlan() {
    return plan;
  }

  public void setPlan(List<Plan> plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePlanListResponsePlans availablePlanListResponsePlans = (AvailablePlanListResponsePlans) o;
    return Objects.equals(this.plan, availablePlanListResponsePlans.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePlanListResponsePlans {\n");
    
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

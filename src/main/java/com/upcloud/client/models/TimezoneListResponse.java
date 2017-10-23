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
import com.upcloud.client.models.TimezoneListResponseTimezones;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TimezoneListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-16T13:20:10.352+03:00")
public class TimezoneListResponse {
  @SerializedName("timezones")
  private TimezoneListResponseTimezones timezones = null;

  public TimezoneListResponse timezones(TimezoneListResponseTimezones timezones) {
    this.timezones = timezones;
    return this;
  }

   /**
   * Get timezones
   * @return timezones
  **/
  @ApiModelProperty(value = "")
  public TimezoneListResponseTimezones getTimezones() {
    return timezones;
  }

  public void setTimezones(TimezoneListResponseTimezones timezones) {
    this.timezones = timezones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneListResponse timezoneListResponse = (TimezoneListResponse) o;
    return Objects.equals(this.timezones, timezoneListResponse.timezones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneListResponse {\n");
    
    sb.append("    timezones: ").append(toIndentedString(timezones)).append("\n");
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


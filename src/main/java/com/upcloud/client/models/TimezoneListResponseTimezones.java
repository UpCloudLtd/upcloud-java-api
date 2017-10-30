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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimezoneListResponseTimezones
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class TimezoneListResponseTimezones {
  @SerializedName("timezone")
  private List<String> timezone = null;

  public TimezoneListResponseTimezones timezone(List<String> timezone) {
    this.timezone = timezone;
    return this;
  }

  public TimezoneListResponseTimezones addTimezoneItem(String timezoneItem) {
    if (this.timezone == null) {
      this.timezone = new ArrayList<String>();
    }
    this.timezone.add(timezoneItem);
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public List<String> getTimezone() {
    return timezone;
  }

  public void setTimezone(List<String> timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneListResponseTimezones timezoneListResponseTimezones = (TimezoneListResponseTimezones) o;
    return Objects.equals(this.timezone, timezoneListResponseTimezones.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneListResponseTimezones {\n");
    
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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


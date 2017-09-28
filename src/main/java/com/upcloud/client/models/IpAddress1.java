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

/**
 * IpAddress1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T16:40:29.151+03:00")
public class IpAddress1 {
  @SerializedName("ptr_record")
  private String ptrRecord = "";

  public IpAddress1 ptrRecord(String ptrRecord) {
    this.ptrRecord = ptrRecord;
    return this;
  }

   /**
   * A fully qualified domain name.
   * @return ptrRecord
  **/
  @ApiModelProperty(example = "hostname.example.com", value = "A fully qualified domain name.")
  public String getPtrRecord() {
    return ptrRecord;
  }

  public void setPtrRecord(String ptrRecord) {
    this.ptrRecord = ptrRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddress1 ipAddress1 = (IpAddress1) o;
    return Objects.equals(this.ptrRecord, ipAddress1.ptrRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ptrRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddress1 {\n");
    
    sb.append("    ptrRecord: ").append(toIndentedString(ptrRecord)).append("\n");
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


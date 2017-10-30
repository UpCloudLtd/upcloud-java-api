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
import java.math.BigDecimal;

/**
 * ServerSize
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class ServerSize {
  @SerializedName("core_number")
  private BigDecimal coreNumber = null;

  @SerializedName("memory_amount")
  private BigDecimal memoryAmount = null;

  public ServerSize coreNumber(BigDecimal coreNumber) {
    this.coreNumber = coreNumber;
    return this;
  }

   /**
   * Get coreNumber
   * @return coreNumber
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public BigDecimal getCoreNumber() {
    return coreNumber;
  }

  public void setCoreNumber(BigDecimal coreNumber) {
    this.coreNumber = coreNumber;
  }

  public ServerSize memoryAmount(BigDecimal memoryAmount) {
    this.memoryAmount = memoryAmount;
    return this;
  }

   /**
   * Get memoryAmount
   * @return memoryAmount
  **/
  @ApiModelProperty(example = "512.0", value = "")
  public BigDecimal getMemoryAmount() {
    return memoryAmount;
  }

  public void setMemoryAmount(BigDecimal memoryAmount) {
    this.memoryAmount = memoryAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerSize serverSize = (ServerSize) o;
    return Objects.equals(this.coreNumber, serverSize.coreNumber) &&
        Objects.equals(this.memoryAmount, serverSize.memoryAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreNumber, memoryAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerSize {\n");
    
    sb.append("    coreNumber: ").append(toIndentedString(coreNumber)).append("\n");
    sb.append("    memoryAmount: ").append(toIndentedString(memoryAmount)).append("\n");
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


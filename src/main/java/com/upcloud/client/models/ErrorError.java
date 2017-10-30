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
import com.upcloud.client.models.ErrorCode;
import com.upcloud.client.models.ErrorStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class ErrorError {
  @SerializedName("error_code")
  private ErrorCode errorCode = null;

  @SerializedName("error_status")
  private ErrorStatus errorStatus = null;

  public ErrorError errorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public ErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorError errorStatus(ErrorStatus errorStatus) {
    this.errorStatus = errorStatus;
    return this;
  }

   /**
   * Get errorStatus
   * @return errorStatus
  **/
  @ApiModelProperty(value = "")
  public ErrorStatus getErrorStatus() {
    return errorStatus;
  }

  public void setErrorStatus(ErrorStatus errorStatus) {
    this.errorStatus = errorStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(this.errorCode, errorError.errorCode) &&
        Objects.equals(this.errorStatus, errorError.errorStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorStatus: ").append(toIndentedString(errorStatus)).append("\n");
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


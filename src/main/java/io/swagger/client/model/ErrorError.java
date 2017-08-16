/*
 * Upcloud api
 * Upcloud api specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ErrorCode;
import io.swagger.client.model.ErrorStatus;
import java.io.IOException;

/**
 * ErrorError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-16T10:25:14.710+03:00")
public class ErrorError {
  @SerializedName("code")
  private ErrorCode code = null;

  @SerializedName("status")
  private ErrorStatus status = null;

  public ErrorError code(ErrorCode code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public ErrorCode getCode() {
    return code;
  }

  public void setCode(ErrorCode code) {
    this.code = code;
  }

  public ErrorError status(ErrorStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ErrorStatus getStatus() {
    return status;
  }

  public void setStatus(ErrorStatus status) {
    this.status = status;
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
    return Objects.equals(this.code, errorError.code) &&
        Objects.equals(this.status, errorError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


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
 * An API user account and password is required to access the UpCloud API. The API user is associated with an UpCloud account. A user account may have multiple API users to be used in different client software. In order to use resources from the cloud, the account must have enough credits.
 */
@ApiModel(description = "An API user account and password is required to access the UpCloud API. The API user is associated with an UpCloud account. A user account may have multiple API users to be used in different client software. In order to use resources from the cloud, the account must have enough credits.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class Account {
  @SerializedName("credits")
  private BigDecimal credits = null;

  @SerializedName("username")
  private String username = null;

  public Account credits(BigDecimal credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Credits are used to pay for cloud resources such as servers, storages, network traffic and IP addresses. Credits are automatically deducted for used resources on an hourly basis. Should the user run out of credits, active resources will be disabled and reactivated after the credit balance returns to positive. Credits can be purchased from the UpCloud website.
   * @return credits
  **/
  @ApiModelProperty(example = "10000.0", value = "Credits are used to pay for cloud resources such as servers, storages, network traffic and IP addresses. Credits are automatically deducted for used resources on an hourly basis. Should the user run out of credits, active resources will be disabled and reactivated after the credit balance returns to positive. Credits can be purchased from the UpCloud website.")
  public BigDecimal getCredits() {
    return credits;
  }

  public void setCredits(BigDecimal credits) {
    this.credits = credits;
  }

  public Account username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "username", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.credits, account.credits) &&
        Objects.equals(this.username, account.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credits, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


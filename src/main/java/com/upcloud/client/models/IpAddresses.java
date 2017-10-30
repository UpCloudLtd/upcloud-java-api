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
import com.upcloud.client.models.IpAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IpAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class IpAddresses {
  @SerializedName("ip_address")
  private List<IpAddress> ipAddress = null;

  public IpAddresses ipAddress(List<IpAddress> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public IpAddresses addIpAddressItem(IpAddress ipAddressItem) {
    if (this.ipAddress == null) {
      this.ipAddress = new ArrayList<IpAddress>();
    }
    this.ipAddress.add(ipAddressItem);
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public List<IpAddress> getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(List<IpAddress> ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddresses ipAddresses = (IpAddresses) o;
    return Objects.equals(this.ipAddress, ipAddresses.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddresses {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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


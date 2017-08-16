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
import io.swagger.client.model.IpAddress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ServerIpAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-16T10:34:53.006+03:00")
public class ServerIpAddresses {
  @SerializedName("ip_address")
  private List<IpAddress> ipAddress = null;

  public ServerIpAddresses ipAddress(List<IpAddress> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public ServerIpAddresses addIpAddressItem(IpAddress ipAddressItem) {
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
    ServerIpAddresses serverIpAddresses = (ServerIpAddresses) o;
    return Objects.equals(this.ipAddress, serverIpAddresses.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerIpAddresses {\n");
    
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


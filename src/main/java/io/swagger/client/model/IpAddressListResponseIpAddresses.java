/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
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
 * IpAddressListResponseIpAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T12:49:18.200+03:00")
public class IpAddressListResponseIpAddresses {
  @SerializedName("ip_address")
  private List<IpAddress> ipAddress = null;

  public IpAddressListResponseIpAddresses ipAddress(List<IpAddress> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public IpAddressListResponseIpAddresses addIpAddressItem(IpAddress ipAddressItem) {
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
    IpAddressListResponseIpAddresses ipAddressListResponseIpAddresses = (IpAddressListResponseIpAddresses) o;
    return Objects.equals(this.ipAddress, ipAddressListResponseIpAddresses.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressListResponseIpAddresses {\n");
    
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


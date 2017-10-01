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
 * ServerserverIdstoragedetachStorageDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T06:44:58.538+03:00")
public class ServerserverIdstoragedetachStorageDevice {
  @SerializedName("address")
  private String address = null;

  public ServerserverIdstoragedetachStorageDevice address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Detach the storage attached to this address.
   * @return address
  **/
  @ApiModelProperty(example = "scsi:0:0", value = "Detach the storage attached to this address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerserverIdstoragedetachStorageDevice serverserverIdstoragedetachStorageDevice = (ServerserverIdstoragedetachStorageDevice) o;
    return Objects.equals(this.address, serverserverIdstoragedetachStorageDevice.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerserverIdstoragedetachStorageDevice {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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


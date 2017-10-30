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
import java.util.UUID;

/**
 * StorageServers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class StorageServers {
  @SerializedName("server")
  private List<UUID> server = null;

  public StorageServers server(List<UUID> server) {
    this.server = server;
    return this;
  }

  public StorageServers addServerItem(UUID serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<UUID>();
    }
    this.server.add(serverItem);
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getServer() {
    return server;
  }

  public void setServer(List<UUID> server) {
    this.server = server;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageServers storageServers = (StorageServers) o;
    return Objects.equals(this.server, storageServers.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(server);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageServers {\n");
    
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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


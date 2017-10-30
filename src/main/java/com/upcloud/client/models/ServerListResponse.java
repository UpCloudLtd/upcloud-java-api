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
import com.upcloud.client.models.ServerListResponseServers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ServerListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class ServerListResponse {
  @SerializedName("servers")
  private ServerListResponseServers servers = null;

  public ServerListResponse servers(ServerListResponseServers servers) {
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @ApiModelProperty(value = "")
  public ServerListResponseServers getServers() {
    return servers;
  }

  public void setServers(ServerListResponseServers servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerListResponse serverListResponse = (ServerListResponse) o;
    return Objects.equals(this.servers, serverListResponse.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerListResponse {\n");
    
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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


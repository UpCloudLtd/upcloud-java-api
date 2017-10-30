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
import com.upcloud.client.models.TagServers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class Tag {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("servers")
  private TagServers servers = null;

  public Tag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The new tag
   * @return name
  **/
  @ApiModelProperty(example = "DEV", required = true, value = "The new tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the tag
   * @return description
  **/
  @ApiModelProperty(example = "Development servers", value = "Description of the tag")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tag servers(TagServers servers) {
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @ApiModelProperty(value = "")
  public TagServers getServers() {
    return servers;
  }

  public void setServers(TagServers servers) {
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
    Tag tag = (Tag) o;
    return Objects.equals(this.name, tag.name) &&
        Objects.equals(this.description, tag.description) &&
        Objects.equals(this.servers, tag.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, servers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


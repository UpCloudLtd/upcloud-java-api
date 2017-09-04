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
import io.swagger.client.model.StorageTier;
import java.io.IOException;

/**
 * Storage2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T12:49:18.200+03:00")
public class Storage2 {
  @SerializedName("zone")
  private String zone = null;

  @SerializedName("tier")
  private StorageTier tier = null;

  @SerializedName("title")
  private String title = null;

  public Storage2 zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * The zone in which the storage will be created, e.g. fi-hel1. See Zones.
   * @return zone
  **/
  @ApiModelProperty(example = "fi-hel1", value = "The zone in which the storage will be created, e.g. fi-hel1. See Zones.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public Storage2 tier(StorageTier tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @ApiModelProperty(value = "")
  public StorageTier getTier() {
    return tier;
  }

  public void setTier(StorageTier tier) {
    this.tier = tier;
  }

  public Storage2 title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short description.
   * @return title
  **/
  @ApiModelProperty(example = "Clone of operating system disk", value = "A short description.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storage2 storage2 = (Storage2) o;
    return Objects.equals(this.zone, storage2.zone) &&
        Objects.equals(this.tier, storage2.tier) &&
        Objects.equals(this.title, storage2.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zone, tier, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storage2 {\n");
    
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


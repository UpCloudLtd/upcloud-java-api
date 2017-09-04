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
import io.swagger.client.model.BackupRule;
import io.swagger.client.model.StorageTier;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Storage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T15:39:12.816+03:00")
public class Storage {
  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("tier")
  private StorageTier tier = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("zone")
  private String zone = "The zone in which the storage will be created, e.g. fi-hel1. See Zones.";

  @SerializedName("backup_rule")
  private BackupRule backupRule = null;

  public Storage size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the storage in gigabytes.
   * minimum: 10
   * maximum: 1024
   * @return size
  **/
  @ApiModelProperty(example = "10.0", value = "The size of the storage in gigabytes.")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Storage tier(StorageTier tier) {
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

  public Storage title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short description.
   * @return title
  **/
  @ApiModelProperty(example = "My data collection", value = "A short description.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Storage zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @ApiModelProperty(example = "fi-hel1", value = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public Storage backupRule(BackupRule backupRule) {
    this.backupRule = backupRule;
    return this;
  }

   /**
   * Get backupRule
   * @return backupRule
  **/
  @ApiModelProperty(value = "")
  public BackupRule getBackupRule() {
    return backupRule;
  }

  public void setBackupRule(BackupRule backupRule) {
    this.backupRule = backupRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storage storage = (Storage) o;
    return Objects.equals(this.size, storage.size) &&
        Objects.equals(this.tier, storage.tier) &&
        Objects.equals(this.title, storage.title) &&
        Objects.equals(this.zone, storage.zone) &&
        Objects.equals(this.backupRule, storage.backupRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, tier, title, zone, backupRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storage {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    backupRule: ").append(toIndentedString(backupRule)).append("\n");
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


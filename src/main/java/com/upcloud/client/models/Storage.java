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
import com.upcloud.client.models.BackupRule;
import com.upcloud.client.models.StorageAccessType;
import com.upcloud.client.models.StorageBackups;
import com.upcloud.client.models.StorageServers;
import com.upcloud.client.models.StorageState;
import com.upcloud.client.models.StorageTier;
import com.upcloud.client.models.StorageType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Storage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class Storage {
  @SerializedName("access")
  private StorageAccessType access = null;

  @SerializedName("backup_rule")
  private BackupRule backupRule = null;

  @SerializedName("backups")
  private StorageBackups backups = null;

  @SerializedName("license")
  private BigDecimal license = null;

  @SerializedName("servers")
  private StorageServers servers = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("state")
  private StorageState state = null;

  @SerializedName("tier")
  private StorageTier tier = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private StorageType type = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("origin")
  private UUID origin = null;

  @SerializedName("created")
  private String created = null;

  public Storage access(StorageAccessType access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(value = "")
  public StorageAccessType getAccess() {
    return access;
  }

  public void setAccess(StorageAccessType access) {
    this.access = access;
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

  public Storage backups(StorageBackups backups) {
    this.backups = backups;
    return this;
  }

   /**
   * Get backups
   * @return backups
  **/
  @ApiModelProperty(value = "")
  public StorageBackups getBackups() {
    return backups;
  }

  public void setBackups(StorageBackups backups) {
    this.backups = backups;
  }

  public Storage license(BigDecimal license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public BigDecimal getLicense() {
    return license;
  }

  public void setLicense(BigDecimal license) {
    this.license = license;
  }

  public Storage servers(StorageServers servers) {
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @ApiModelProperty(value = "")
  public StorageServers getServers() {
    return servers;
  }

  public void setServers(StorageServers servers) {
    this.servers = servers;
  }

  public Storage size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "10.0", value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Storage state(StorageState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StorageState getState() {
    return state;
  }

  public void setState(StorageState state) {
    this.state = state;
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
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Operating system disk", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Storage type(StorageType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public StorageType getType() {
    return type;
  }

  public void setType(StorageType type) {
    this.type = type;
  }

  public Storage uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "01d4fcd4-e446-433b-8a9c-551a1284952e", value = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
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

  public Storage origin(UUID origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(example = "012580a1-32a1-466e-a323-689ca16f2d43", value = "")
  public UUID getOrigin() {
    return origin;
  }

  public void setOrigin(UUID origin) {
    this.origin = origin;
  }

  public Storage created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
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
    return Objects.equals(this.access, storage.access) &&
        Objects.equals(this.backupRule, storage.backupRule) &&
        Objects.equals(this.backups, storage.backups) &&
        Objects.equals(this.license, storage.license) &&
        Objects.equals(this.servers, storage.servers) &&
        Objects.equals(this.size, storage.size) &&
        Objects.equals(this.state, storage.state) &&
        Objects.equals(this.tier, storage.tier) &&
        Objects.equals(this.title, storage.title) &&
        Objects.equals(this.type, storage.type) &&
        Objects.equals(this.uuid, storage.uuid) &&
        Objects.equals(this.zone, storage.zone) &&
        Objects.equals(this.origin, storage.origin) &&
        Objects.equals(this.created, storage.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, backupRule, backups, license, servers, size, state, tier, title, type, uuid, zone, origin, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storage {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    backupRule: ").append(toIndentedString(backupRule)).append("\n");
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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


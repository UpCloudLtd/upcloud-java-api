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
import java.math.BigDecimal;

/**
 * StorageDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class StorageDevice {
  @SerializedName("title")
  private String title = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("address")
  private String address = null;

  /**
   * Gets or Sets partOfPlan
   */
  @JsonAdapter(PartOfPlanEnum.Adapter.class)
  public enum PartOfPlanEnum {
    YES("yes"),
    
    NO("no");

    private String value;

    PartOfPlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PartOfPlanEnum fromValue(String text) {
      for (PartOfPlanEnum b : PartOfPlanEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PartOfPlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PartOfPlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PartOfPlanEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PartOfPlanEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("part_of_plan")
  private PartOfPlanEnum partOfPlan = null;

  @SerializedName("storage")
  private String storage = null;

  @SerializedName("storage_size")
  private BigDecimal storageSize = null;

  @SerializedName("storage_title")
  private String storageTitle = null;

  @SerializedName("type")
  private String type = null;

  public StorageDevice title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Debian from a template", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public StorageDevice size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "50.0", value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public StorageDevice tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @ApiModelProperty(example = "maxiops", value = "")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public StorageDevice action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(example = "clone", value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public StorageDevice address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "virtio:0", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public StorageDevice partOfPlan(PartOfPlanEnum partOfPlan) {
    this.partOfPlan = partOfPlan;
    return this;
  }

   /**
   * Get partOfPlan
   * @return partOfPlan
  **/
  @ApiModelProperty(example = "yes", value = "")
  public PartOfPlanEnum getPartOfPlan() {
    return partOfPlan;
  }

  public void setPartOfPlan(PartOfPlanEnum partOfPlan) {
    this.partOfPlan = partOfPlan;
  }

  public StorageDevice storage(String storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(example = "012580a1-32a1-466e-a323-689ca16f2d43", value = "")
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  public StorageDevice storageSize(BigDecimal storageSize) {
    this.storageSize = storageSize;
    return this;
  }

   /**
   * Get storageSize
   * @return storageSize
  **/
  @ApiModelProperty(example = "20.0", value = "")
  public BigDecimal getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(BigDecimal storageSize) {
    this.storageSize = storageSize;
  }

  public StorageDevice storageTitle(String storageTitle) {
    this.storageTitle = storageTitle;
    return this;
  }

   /**
   * Get storageTitle
   * @return storageTitle
  **/
  @ApiModelProperty(example = "Storage for server1.example.com", value = "")
  public String getStorageTitle() {
    return storageTitle;
  }

  public void setStorageTitle(String storageTitle) {
    this.storageTitle = storageTitle;
  }

  public StorageDevice type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "disk", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageDevice storageDevice = (StorageDevice) o;
    return Objects.equals(this.title, storageDevice.title) &&
        Objects.equals(this.size, storageDevice.size) &&
        Objects.equals(this.tier, storageDevice.tier) &&
        Objects.equals(this.action, storageDevice.action) &&
        Objects.equals(this.address, storageDevice.address) &&
        Objects.equals(this.partOfPlan, storageDevice.partOfPlan) &&
        Objects.equals(this.storage, storageDevice.storage) &&
        Objects.equals(this.storageSize, storageDevice.storageSize) &&
        Objects.equals(this.storageTitle, storageDevice.storageTitle) &&
        Objects.equals(this.type, storageDevice.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, size, tier, action, address, partOfPlan, storage, storageSize, storageTitle, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageDevice {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    partOfPlan: ").append(toIndentedString(partOfPlan)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    storageTitle: ").append(toIndentedString(storageTitle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
 * Server plans are preconfigured server configurations with fixed price. Each plan includes certain number of CPU cores, memory amount, storage and transfer quota in addition of one public IPv4 address (private IPv4 addresses and public IPv6 addresses are currently free of charge, so they are not included in plan).
 */
@ApiModel(description = "Server plans are preconfigured server configurations with fixed price. Each plan includes certain number of CPU cores, memory amount, storage and transfer quota in addition of one public IPv4 address (private IPv4 addresses and public IPv6 addresses are currently free of charge, so they are not included in plan).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class Plan {
  @SerializedName("core_number")
  private BigDecimal coreNumber = null;

  @SerializedName("memory_amount")
  private BigDecimal memoryAmount = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("public_traffic_out")
  private String publicTrafficOut = null;

  @SerializedName("storage_size")
  private String storageSize = null;

  @SerializedName("storage_tier")
  private String storageTier = null;

  public Plan coreNumber(BigDecimal coreNumber) {
    this.coreNumber = coreNumber;
    return this;
  }

   /**
   * Get coreNumber
   * @return coreNumber
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public BigDecimal getCoreNumber() {
    return coreNumber;
  }

  public void setCoreNumber(BigDecimal coreNumber) {
    this.coreNumber = coreNumber;
  }

  public Plan memoryAmount(BigDecimal memoryAmount) {
    this.memoryAmount = memoryAmount;
    return this;
  }

   /**
   * Get memoryAmount
   * @return memoryAmount
  **/
  @ApiModelProperty(example = "1024.0", value = "")
  public BigDecimal getMemoryAmount() {
    return memoryAmount;
  }

  public void setMemoryAmount(BigDecimal memoryAmount) {
    this.memoryAmount = memoryAmount;
  }

  public Plan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "1xCPU-1GB", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plan publicTrafficOut(String publicTrafficOut) {
    this.publicTrafficOut = publicTrafficOut;
    return this;
  }

   /**
   * Get publicTrafficOut
   * @return publicTrafficOut
  **/
  @ApiModelProperty(example = "2048", value = "")
  public String getPublicTrafficOut() {
    return publicTrafficOut;
  }

  public void setPublicTrafficOut(String publicTrafficOut) {
    this.publicTrafficOut = publicTrafficOut;
  }

  public Plan storageSize(String storageSize) {
    this.storageSize = storageSize;
    return this;
  }

   /**
   * Get storageSize
   * @return storageSize
  **/
  @ApiModelProperty(example = "30", value = "")
  public String getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(String storageSize) {
    this.storageSize = storageSize;
  }

  public Plan storageTier(String storageTier) {
    this.storageTier = storageTier;
    return this;
  }

   /**
   * Get storageTier
   * @return storageTier
  **/
  @ApiModelProperty(example = "maxiops", value = "")
  public String getStorageTier() {
    return storageTier;
  }

  public void setStorageTier(String storageTier) {
    this.storageTier = storageTier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.coreNumber, plan.coreNumber) &&
        Objects.equals(this.memoryAmount, plan.memoryAmount) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.publicTrafficOut, plan.publicTrafficOut) &&
        Objects.equals(this.storageSize, plan.storageSize) &&
        Objects.equals(this.storageTier, plan.storageTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreNumber, memoryAmount, name, publicTrafficOut, storageSize, storageTier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    coreNumber: ").append(toIndentedString(coreNumber)).append("\n");
    sb.append("    memoryAmount: ").append(toIndentedString(memoryAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicTrafficOut: ").append(toIndentedString(publicTrafficOut)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    storageTier: ").append(toIndentedString(storageTier)).append("\n");
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


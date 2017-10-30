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
import com.upcloud.client.models.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PriceZone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class PriceZone {
  @SerializedName("name")
  private String name = null;

  @SerializedName("firewall")
  private Price firewall = null;

  @SerializedName("io_request_backup")
  private Price ioRequestBackup = null;

  @SerializedName("io_request_hdd")
  private Price ioRequestHdd = null;

  @SerializedName("io_request_maxiops")
  private Price ioRequestMaxiops = null;

  @SerializedName("ipv4_address")
  private Price ipv4Address = null;

  @SerializedName("ipv6_address")
  private Price ipv6Address = null;

  @SerializedName("public_ipv4_bandwidth_in")
  private Price publicIpv4BandwidthIn = null;

  @SerializedName("public_ipv4_bandwidth_out")
  private Price publicIpv4BandwidthOut = null;

  @SerializedName("public_ipv6_bandwidth_in")
  private Price publicIpv6BandwidthIn = null;

  @SerializedName("public_ipv6_bandwidth_out")
  private Price publicIpv6BandwidthOut = null;

  @SerializedName("server_core")
  private Price serverCore = null;

  @SerializedName("server_memory")
  private Price serverMemory = null;

  @SerializedName("storage_backup")
  private Price storageBackup = null;

  @SerializedName("storage_hdd")
  private Price storageHdd = null;

  @SerializedName("storage_maxiops")
  private Price storageMaxiops = null;

  @SerializedName("server_plan_1xCPU-1GB")
  private Price serverPlan1xCPU1GB = null;

  @SerializedName("server_plan_2xCPU-2GB")
  private Price serverPlan2xCPU2GB = null;

  public PriceZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PriceZone firewall(Price firewall) {
    this.firewall = firewall;
    return this;
  }

   /**
   * Get firewall
   * @return firewall
  **/
  @ApiModelProperty(value = "")
  public Price getFirewall() {
    return firewall;
  }

  public void setFirewall(Price firewall) {
    this.firewall = firewall;
  }

  public PriceZone ioRequestBackup(Price ioRequestBackup) {
    this.ioRequestBackup = ioRequestBackup;
    return this;
  }

   /**
   * Get ioRequestBackup
   * @return ioRequestBackup
  **/
  @ApiModelProperty(value = "")
  public Price getIoRequestBackup() {
    return ioRequestBackup;
  }

  public void setIoRequestBackup(Price ioRequestBackup) {
    this.ioRequestBackup = ioRequestBackup;
  }

  public PriceZone ioRequestHdd(Price ioRequestHdd) {
    this.ioRequestHdd = ioRequestHdd;
    return this;
  }

   /**
   * Get ioRequestHdd
   * @return ioRequestHdd
  **/
  @ApiModelProperty(value = "")
  public Price getIoRequestHdd() {
    return ioRequestHdd;
  }

  public void setIoRequestHdd(Price ioRequestHdd) {
    this.ioRequestHdd = ioRequestHdd;
  }

  public PriceZone ioRequestMaxiops(Price ioRequestMaxiops) {
    this.ioRequestMaxiops = ioRequestMaxiops;
    return this;
  }

   /**
   * Get ioRequestMaxiops
   * @return ioRequestMaxiops
  **/
  @ApiModelProperty(value = "")
  public Price getIoRequestMaxiops() {
    return ioRequestMaxiops;
  }

  public void setIoRequestMaxiops(Price ioRequestMaxiops) {
    this.ioRequestMaxiops = ioRequestMaxiops;
  }

  public PriceZone ipv4Address(Price ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

   /**
   * Get ipv4Address
   * @return ipv4Address
  **/
  @ApiModelProperty(value = "")
  public Price getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(Price ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  public PriceZone ipv6Address(Price ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  @ApiModelProperty(value = "")
  public Price getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(Price ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public PriceZone publicIpv4BandwidthIn(Price publicIpv4BandwidthIn) {
    this.publicIpv4BandwidthIn = publicIpv4BandwidthIn;
    return this;
  }

   /**
   * Get publicIpv4BandwidthIn
   * @return publicIpv4BandwidthIn
  **/
  @ApiModelProperty(value = "")
  public Price getPublicIpv4BandwidthIn() {
    return publicIpv4BandwidthIn;
  }

  public void setPublicIpv4BandwidthIn(Price publicIpv4BandwidthIn) {
    this.publicIpv4BandwidthIn = publicIpv4BandwidthIn;
  }

  public PriceZone publicIpv4BandwidthOut(Price publicIpv4BandwidthOut) {
    this.publicIpv4BandwidthOut = publicIpv4BandwidthOut;
    return this;
  }

   /**
   * Get publicIpv4BandwidthOut
   * @return publicIpv4BandwidthOut
  **/
  @ApiModelProperty(value = "")
  public Price getPublicIpv4BandwidthOut() {
    return publicIpv4BandwidthOut;
  }

  public void setPublicIpv4BandwidthOut(Price publicIpv4BandwidthOut) {
    this.publicIpv4BandwidthOut = publicIpv4BandwidthOut;
  }

  public PriceZone publicIpv6BandwidthIn(Price publicIpv6BandwidthIn) {
    this.publicIpv6BandwidthIn = publicIpv6BandwidthIn;
    return this;
  }

   /**
   * Get publicIpv6BandwidthIn
   * @return publicIpv6BandwidthIn
  **/
  @ApiModelProperty(value = "")
  public Price getPublicIpv6BandwidthIn() {
    return publicIpv6BandwidthIn;
  }

  public void setPublicIpv6BandwidthIn(Price publicIpv6BandwidthIn) {
    this.publicIpv6BandwidthIn = publicIpv6BandwidthIn;
  }

  public PriceZone publicIpv6BandwidthOut(Price publicIpv6BandwidthOut) {
    this.publicIpv6BandwidthOut = publicIpv6BandwidthOut;
    return this;
  }

   /**
   * Get publicIpv6BandwidthOut
   * @return publicIpv6BandwidthOut
  **/
  @ApiModelProperty(value = "")
  public Price getPublicIpv6BandwidthOut() {
    return publicIpv6BandwidthOut;
  }

  public void setPublicIpv6BandwidthOut(Price publicIpv6BandwidthOut) {
    this.publicIpv6BandwidthOut = publicIpv6BandwidthOut;
  }

  public PriceZone serverCore(Price serverCore) {
    this.serverCore = serverCore;
    return this;
  }

   /**
   * Get serverCore
   * @return serverCore
  **/
  @ApiModelProperty(value = "")
  public Price getServerCore() {
    return serverCore;
  }

  public void setServerCore(Price serverCore) {
    this.serverCore = serverCore;
  }

  public PriceZone serverMemory(Price serverMemory) {
    this.serverMemory = serverMemory;
    return this;
  }

   /**
   * Get serverMemory
   * @return serverMemory
  **/
  @ApiModelProperty(value = "")
  public Price getServerMemory() {
    return serverMemory;
  }

  public void setServerMemory(Price serverMemory) {
    this.serverMemory = serverMemory;
  }

  public PriceZone storageBackup(Price storageBackup) {
    this.storageBackup = storageBackup;
    return this;
  }

   /**
   * Get storageBackup
   * @return storageBackup
  **/
  @ApiModelProperty(value = "")
  public Price getStorageBackup() {
    return storageBackup;
  }

  public void setStorageBackup(Price storageBackup) {
    this.storageBackup = storageBackup;
  }

  public PriceZone storageHdd(Price storageHdd) {
    this.storageHdd = storageHdd;
    return this;
  }

   /**
   * Get storageHdd
   * @return storageHdd
  **/
  @ApiModelProperty(value = "")
  public Price getStorageHdd() {
    return storageHdd;
  }

  public void setStorageHdd(Price storageHdd) {
    this.storageHdd = storageHdd;
  }

  public PriceZone storageMaxiops(Price storageMaxiops) {
    this.storageMaxiops = storageMaxiops;
    return this;
  }

   /**
   * Get storageMaxiops
   * @return storageMaxiops
  **/
  @ApiModelProperty(value = "")
  public Price getStorageMaxiops() {
    return storageMaxiops;
  }

  public void setStorageMaxiops(Price storageMaxiops) {
    this.storageMaxiops = storageMaxiops;
  }

  public PriceZone serverPlan1xCPU1GB(Price serverPlan1xCPU1GB) {
    this.serverPlan1xCPU1GB = serverPlan1xCPU1GB;
    return this;
  }

   /**
   * Get serverPlan1xCPU1GB
   * @return serverPlan1xCPU1GB
  **/
  @ApiModelProperty(value = "")
  public Price getServerPlan1xCPU1GB() {
    return serverPlan1xCPU1GB;
  }

  public void setServerPlan1xCPU1GB(Price serverPlan1xCPU1GB) {
    this.serverPlan1xCPU1GB = serverPlan1xCPU1GB;
  }

  public PriceZone serverPlan2xCPU2GB(Price serverPlan2xCPU2GB) {
    this.serverPlan2xCPU2GB = serverPlan2xCPU2GB;
    return this;
  }

   /**
   * Get serverPlan2xCPU2GB
   * @return serverPlan2xCPU2GB
  **/
  @ApiModelProperty(value = "")
  public Price getServerPlan2xCPU2GB() {
    return serverPlan2xCPU2GB;
  }

  public void setServerPlan2xCPU2GB(Price serverPlan2xCPU2GB) {
    this.serverPlan2xCPU2GB = serverPlan2xCPU2GB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceZone priceZone = (PriceZone) o;
    return Objects.equals(this.name, priceZone.name) &&
        Objects.equals(this.firewall, priceZone.firewall) &&
        Objects.equals(this.ioRequestBackup, priceZone.ioRequestBackup) &&
        Objects.equals(this.ioRequestHdd, priceZone.ioRequestHdd) &&
        Objects.equals(this.ioRequestMaxiops, priceZone.ioRequestMaxiops) &&
        Objects.equals(this.ipv4Address, priceZone.ipv4Address) &&
        Objects.equals(this.ipv6Address, priceZone.ipv6Address) &&
        Objects.equals(this.publicIpv4BandwidthIn, priceZone.publicIpv4BandwidthIn) &&
        Objects.equals(this.publicIpv4BandwidthOut, priceZone.publicIpv4BandwidthOut) &&
        Objects.equals(this.publicIpv6BandwidthIn, priceZone.publicIpv6BandwidthIn) &&
        Objects.equals(this.publicIpv6BandwidthOut, priceZone.publicIpv6BandwidthOut) &&
        Objects.equals(this.serverCore, priceZone.serverCore) &&
        Objects.equals(this.serverMemory, priceZone.serverMemory) &&
        Objects.equals(this.storageBackup, priceZone.storageBackup) &&
        Objects.equals(this.storageHdd, priceZone.storageHdd) &&
        Objects.equals(this.storageMaxiops, priceZone.storageMaxiops) &&
        Objects.equals(this.serverPlan1xCPU1GB, priceZone.serverPlan1xCPU1GB) &&
        Objects.equals(this.serverPlan2xCPU2GB, priceZone.serverPlan2xCPU2GB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firewall, ioRequestBackup, ioRequestHdd, ioRequestMaxiops, ipv4Address, ipv6Address, publicIpv4BandwidthIn, publicIpv4BandwidthOut, publicIpv6BandwidthIn, publicIpv6BandwidthOut, serverCore, serverMemory, storageBackup, storageHdd, storageMaxiops, serverPlan1xCPU1GB, serverPlan2xCPU2GB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceZone {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firewall: ").append(toIndentedString(firewall)).append("\n");
    sb.append("    ioRequestBackup: ").append(toIndentedString(ioRequestBackup)).append("\n");
    sb.append("    ioRequestHdd: ").append(toIndentedString(ioRequestHdd)).append("\n");
    sb.append("    ioRequestMaxiops: ").append(toIndentedString(ioRequestMaxiops)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    publicIpv4BandwidthIn: ").append(toIndentedString(publicIpv4BandwidthIn)).append("\n");
    sb.append("    publicIpv4BandwidthOut: ").append(toIndentedString(publicIpv4BandwidthOut)).append("\n");
    sb.append("    publicIpv6BandwidthIn: ").append(toIndentedString(publicIpv6BandwidthIn)).append("\n");
    sb.append("    publicIpv6BandwidthOut: ").append(toIndentedString(publicIpv6BandwidthOut)).append("\n");
    sb.append("    serverCore: ").append(toIndentedString(serverCore)).append("\n");
    sb.append("    serverMemory: ").append(toIndentedString(serverMemory)).append("\n");
    sb.append("    storageBackup: ").append(toIndentedString(storageBackup)).append("\n");
    sb.append("    storageHdd: ").append(toIndentedString(storageHdd)).append("\n");
    sb.append("    storageMaxiops: ").append(toIndentedString(storageMaxiops)).append("\n");
    sb.append("    serverPlan1xCPU1GB: ").append(toIndentedString(serverPlan1xCPU1GB)).append("\n");
    sb.append("    serverPlan2xCPU2GB: ").append(toIndentedString(serverPlan2xCPU2GB)).append("\n");
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


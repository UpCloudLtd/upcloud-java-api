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
import com.upcloud.client.models.IpAddresses;
import com.upcloud.client.models.ServerState;
import com.upcloud.client.models.ServerStorageDevices;
import com.upcloud.client.models.ServerTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * The server configuration defines which storage devices the server is attached to, which IP addresses can be used and how the server can be reached for remote management. A server must have at least one storage device attached in order to be started. Servers may have from zero to five public IPv4 and IPv6 addresses. All servers have a private IP address that cannot be removed.
 */
@ApiModel(description = "The server configuration defines which storage devices the server is attached to, which IP addresses can be used and how the server can be reached for remote management. A server must have at least one storage device attached in order to be started. Servers may have from zero to five public IPv4 and IPv6 addresses. All servers have a private IP address that cannot be removed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class Server {
  /**
   * The storage device boot order.
   */
  @JsonAdapter(BootOrderEnum.Adapter.class)
  public enum BootOrderEnum {
    DISK("disk"),
    
    CDROM("cdrom"),
    
    DISK_CDROM("disk,cdrom"),
    
    CDROM_DISK("cdrom,disk");

    private String value;

    BootOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BootOrderEnum fromValue(String text) {
      for (BootOrderEnum b : BootOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BootOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BootOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BootOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BootOrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("boot_order")
  private BootOrderEnum bootOrder = null;

  @SerializedName("core_number")
  private BigDecimal coreNumber = null;

  /**
   * The state of the server firewall rules.
   */
  @JsonAdapter(FirewallEnum.Adapter.class)
  public enum FirewallEnum {
    ON("on"),
    
    OFF("off");

    private String value;

    FirewallEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FirewallEnum fromValue(String text) {
      for (FirewallEnum b : FirewallEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FirewallEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FirewallEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FirewallEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FirewallEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("firewall")
  private FirewallEnum firewall = FirewallEnum.ON;

  @SerializedName("host")
  private BigDecimal host = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("ip_addresses")
  private IpAddresses ipAddresses = null;

  @SerializedName("license")
  private BigDecimal license = null;

  @SerializedName("memory_amount")
  private BigDecimal memoryAmount = null;

  @SerializedName("nic_model")
  private String nicModel = "e1000";

  @SerializedName("plan")
  private String plan = "custom";

  @SerializedName("plan_ipv4_bytes")
  private BigDecimal planIpv4Bytes = null;

  @SerializedName("plan_ipv6_bytes")
  private BigDecimal planIpv6Bytes = null;

  @SerializedName("state")
  private ServerState state = null;

  @SerializedName("storage_devices")
  private ServerStorageDevices storageDevices = null;

  @SerializedName("tags")
  private ServerTags tags = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  /**
   * The model of the server&#39;s video interface.
   */
  @JsonAdapter(VideoModelEnum.Adapter.class)
  public enum VideoModelEnum {
    VGA("vga"),
    
    CIRRUS("cirrus");

    private String value;

    VideoModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoModelEnum fromValue(String text) {
      for (VideoModelEnum b : VideoModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VideoModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoModelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VideoModelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("video_model")
  private VideoModelEnum videoModel = VideoModelEnum.VGA;

  /**
   * The state of the VNC remote access service.
   */
  @JsonAdapter(VncEnum.Adapter.class)
  public enum VncEnum {
    ON("on"),
    
    OFF("off");

    private String value;

    VncEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VncEnum fromValue(String text) {
      for (VncEnum b : VncEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VncEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VncEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VncEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VncEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("vnc")
  private VncEnum vnc = VncEnum.OFF;

  @SerializedName("vnc_host")
  private String vncHost = null;

  @SerializedName("vnc_password")
  private String vncPassword = null;

  @SerializedName("vnc_port")
  private String vncPort = null;

  @SerializedName("zone")
  private String zone = null;

  public Server bootOrder(BootOrderEnum bootOrder) {
    this.bootOrder = bootOrder;
    return this;
  }

   /**
   * The storage device boot order.
   * @return bootOrder
  **/
  @ApiModelProperty(example = "disk", value = "The storage device boot order.")
  public BootOrderEnum getBootOrder() {
    return bootOrder;
  }

  public void setBootOrder(BootOrderEnum bootOrder) {
    this.bootOrder = bootOrder;
  }

  public Server coreNumber(BigDecimal coreNumber) {
    this.coreNumber = coreNumber;
    return this;
  }

   /**
   * The number of CPU cores dedicated to the server. See List server configurations.
   * @return coreNumber
  **/
  @ApiModelProperty(example = "0.0", value = "The number of CPU cores dedicated to the server. See List server configurations.")
  public BigDecimal getCoreNumber() {
    return coreNumber;
  }

  public void setCoreNumber(BigDecimal coreNumber) {
    this.coreNumber = coreNumber;
  }

  public Server firewall(FirewallEnum firewall) {
    this.firewall = firewall;
    return this;
  }

   /**
   * The state of the server firewall rules.
   * @return firewall
  **/
  @ApiModelProperty(example = "on", value = "The state of the server firewall rules.")
  public FirewallEnum getFirewall() {
    return firewall;
  }

  public void setFirewall(FirewallEnum firewall) {
    this.firewall = firewall;
  }

  public Server host(BigDecimal host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @ApiModelProperty(example = "7.653311107E9", value = "")
  public BigDecimal getHost() {
    return host;
  }

  public void setHost(BigDecimal host) {
    this.host = host;
  }

  public Server hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * A valid hostname, e.g. host.example.com. The maximum length is 128 characters.
   * @return hostname
  **/
  @ApiModelProperty(example = "server1.example.com", value = "A valid hostname, e.g. host.example.com. The maximum length is 128 characters.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public Server ipAddresses(IpAddresses ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "")
  public IpAddresses getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(IpAddresses ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public Server license(BigDecimal license) {
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

  public Server memoryAmount(BigDecimal memoryAmount) {
    this.memoryAmount = memoryAmount;
    return this;
  }

   /**
   * The amount of main memory in megabytes. See List server configurations.
   * @return memoryAmount
  **/
  @ApiModelProperty(example = "1024.0", value = "The amount of main memory in megabytes. See List server configurations.")
  public BigDecimal getMemoryAmount() {
    return memoryAmount;
  }

  public void setMemoryAmount(BigDecimal memoryAmount) {
    this.memoryAmount = memoryAmount;
  }

  public Server nicModel(String nicModel) {
    this.nicModel = nicModel;
    return this;
  }

   /**
   * The model of the server&#39;s network interfaces.
   * @return nicModel
  **/
  @ApiModelProperty(example = "virtio", value = "The model of the server's network interfaces.")
  public String getNicModel() {
    return nicModel;
  }

  public void setNicModel(String nicModel) {
    this.nicModel = nicModel;
  }

  public Server plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * The pricing plan used. If a plan is selected, the core_number and  memory_amount must match the plan if they are present.
   * @return plan
  **/
  @ApiModelProperty(example = "1xCPU-1GB", value = "The pricing plan used. If a plan is selected, the core_number and  memory_amount must match the plan if they are present.")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public Server planIpv4Bytes(BigDecimal planIpv4Bytes) {
    this.planIpv4Bytes = planIpv4Bytes;
    return this;
  }

   /**
   * Get planIpv4Bytes
   * @return planIpv4Bytes
  **/
  @ApiModelProperty(example = "3.565675343E9", value = "")
  public BigDecimal getPlanIpv4Bytes() {
    return planIpv4Bytes;
  }

  public void setPlanIpv4Bytes(BigDecimal planIpv4Bytes) {
    this.planIpv4Bytes = planIpv4Bytes;
  }

  public Server planIpv6Bytes(BigDecimal planIpv6Bytes) {
    this.planIpv6Bytes = planIpv6Bytes;
    return this;
  }

   /**
   * Get planIpv6Bytes
   * @return planIpv6Bytes
  **/
  @ApiModelProperty(example = "4534432.0", value = "")
  public BigDecimal getPlanIpv6Bytes() {
    return planIpv6Bytes;
  }

  public void setPlanIpv6Bytes(BigDecimal planIpv6Bytes) {
    this.planIpv6Bytes = planIpv6Bytes;
  }

  public Server state(ServerState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ServerState getState() {
    return state;
  }

  public void setState(ServerState state) {
    this.state = state;
  }

  public Server storageDevices(ServerStorageDevices storageDevices) {
    this.storageDevices = storageDevices;
    return this;
  }

   /**
   * Get storageDevices
   * @return storageDevices
  **/
  @ApiModelProperty(value = "")
  public ServerStorageDevices getStorageDevices() {
    return storageDevices;
  }

  public void setStorageDevices(ServerStorageDevices storageDevices) {
    this.storageDevices = storageDevices;
  }

  public Server tags(ServerTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public ServerTags getTags() {
    return tags;
  }

  public void setTags(ServerTags tags) {
    this.tags = tags;
  }

  public Server timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * A timezone identifier, e.g. Europe/Helsinki. See Timezones.
   * @return timezone
  **/
  @ApiModelProperty(value = "A timezone identifier, e.g. Europe/Helsinki. See Timezones.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Server title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short description.
   * @return title
  **/
  @ApiModelProperty(example = "server1.example.com", value = "A short description.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Server uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "0077fa3d-32db-4b09-9f5f-30d9e9afb565", value = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public Server videoModel(VideoModelEnum videoModel) {
    this.videoModel = videoModel;
    return this;
  }

   /**
   * The model of the server&#39;s video interface.
   * @return videoModel
  **/
  @ApiModelProperty(example = "cirrus", value = "The model of the server's video interface.")
  public VideoModelEnum getVideoModel() {
    return videoModel;
  }

  public void setVideoModel(VideoModelEnum videoModel) {
    this.videoModel = videoModel;
  }

  public Server vnc(VncEnum vnc) {
    this.vnc = vnc;
    return this;
  }

   /**
   * The state of the VNC remote access service.
   * @return vnc
  **/
  @ApiModelProperty(example = "on", value = "The state of the VNC remote access service.")
  public VncEnum getVnc() {
    return vnc;
  }

  public void setVnc(VncEnum vnc) {
    this.vnc = vnc;
  }

  public Server vncHost(String vncHost) {
    this.vncHost = vncHost;
    return this;
  }

   /**
   * Get vncHost
   * @return vncHost
  **/
  @ApiModelProperty(example = "fi-he1l.vnc.upcloud.com", value = "")
  public String getVncHost() {
    return vncHost;
  }

  public void setVncHost(String vncHost) {
    this.vncHost = vncHost;
  }

  public Server vncPassword(String vncPassword) {
    this.vncPassword = vncPassword;
    return this;
  }

   /**
   * The VNC remote access password.
   * @return vncPassword
  **/
  @ApiModelProperty(example = "aabbccdd", value = "The VNC remote access password.")
  public String getVncPassword() {
    return vncPassword;
  }

  public void setVncPassword(String vncPassword) {
    this.vncPassword = vncPassword;
  }

  public Server vncPort(String vncPort) {
    this.vncPort = vncPort;
    return this;
  }

   /**
   * Get vncPort
   * @return vncPort
  **/
  @ApiModelProperty(example = "00000", value = "")
  public String getVncPort() {
    return vncPort;
  }

  public void setVncPort(String vncPort) {
    this.vncPort = vncPort;
  }

  public Server zone(String zone) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Server server = (Server) o;
    return Objects.equals(this.bootOrder, server.bootOrder) &&
        Objects.equals(this.coreNumber, server.coreNumber) &&
        Objects.equals(this.firewall, server.firewall) &&
        Objects.equals(this.host, server.host) &&
        Objects.equals(this.hostname, server.hostname) &&
        Objects.equals(this.ipAddresses, server.ipAddresses) &&
        Objects.equals(this.license, server.license) &&
        Objects.equals(this.memoryAmount, server.memoryAmount) &&
        Objects.equals(this.nicModel, server.nicModel) &&
        Objects.equals(this.plan, server.plan) &&
        Objects.equals(this.planIpv4Bytes, server.planIpv4Bytes) &&
        Objects.equals(this.planIpv6Bytes, server.planIpv6Bytes) &&
        Objects.equals(this.state, server.state) &&
        Objects.equals(this.storageDevices, server.storageDevices) &&
        Objects.equals(this.tags, server.tags) &&
        Objects.equals(this.timezone, server.timezone) &&
        Objects.equals(this.title, server.title) &&
        Objects.equals(this.uuid, server.uuid) &&
        Objects.equals(this.videoModel, server.videoModel) &&
        Objects.equals(this.vnc, server.vnc) &&
        Objects.equals(this.vncHost, server.vncHost) &&
        Objects.equals(this.vncPassword, server.vncPassword) &&
        Objects.equals(this.vncPort, server.vncPort) &&
        Objects.equals(this.zone, server.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootOrder, coreNumber, firewall, host, hostname, ipAddresses, license, memoryAmount, nicModel, plan, planIpv4Bytes, planIpv6Bytes, state, storageDevices, tags, timezone, title, uuid, videoModel, vnc, vncHost, vncPassword, vncPort, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Server {\n");
    
    sb.append("    bootOrder: ").append(toIndentedString(bootOrder)).append("\n");
    sb.append("    coreNumber: ").append(toIndentedString(coreNumber)).append("\n");
    sb.append("    firewall: ").append(toIndentedString(firewall)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    memoryAmount: ").append(toIndentedString(memoryAmount)).append("\n");
    sb.append("    nicModel: ").append(toIndentedString(nicModel)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    planIpv4Bytes: ").append(toIndentedString(planIpv4Bytes)).append("\n");
    sb.append("    planIpv6Bytes: ").append(toIndentedString(planIpv6Bytes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storageDevices: ").append(toIndentedString(storageDevices)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    videoModel: ").append(toIndentedString(videoModel)).append("\n");
    sb.append("    vnc: ").append(toIndentedString(vnc)).append("\n");
    sb.append("    vncHost: ").append(toIndentedString(vncHost)).append("\n");
    sb.append("    vncPassword: ").append(toIndentedString(vncPassword)).append("\n");
    sb.append("    vncPort: ").append(toIndentedString(vncPort)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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


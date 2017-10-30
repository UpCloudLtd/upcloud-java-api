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
import java.util.UUID;

/**
 * The UpCloud network has public and private IP addresses.
 */
@ApiModel(description = "The UpCloud network has public and private IP addresses.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class IpAddress {
  /**
   * Is address for private or public network.
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    PUBLIC("public"),
    
    PRIVATE("private");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String text) {
      for (AccessEnum b : AccessEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("access")
  private AccessEnum access = null;

  @SerializedName("address")
  private String address = null;

  /**
   * The address family of new IP address.
   */
  @JsonAdapter(FamilyEnum.Adapter.class)
  public enum FamilyEnum {
    IPV4("IPv4"),
    
    IPV6("IPv6");

    private String value;

    FamilyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FamilyEnum fromValue(String text) {
      for (FamilyEnum b : FamilyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FamilyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("family")
  private FamilyEnum family = null;

  @SerializedName("ptr_record")
  private String ptrRecord = null;

  @SerializedName("server")
  private UUID server = null;

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

  public IpAddress access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Is address for private or public network.
   * @return access
  **/
  @ApiModelProperty(example = "private", value = "Is address for private or public network.")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public IpAddress address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "10.0.0.00", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IpAddress family(FamilyEnum family) {
    this.family = family;
    return this;
  }

   /**
   * The address family of new IP address.
   * @return family
  **/
  @ApiModelProperty(example = "IPv4", value = "The address family of new IP address.")
  public FamilyEnum getFamily() {
    return family;
  }

  public void setFamily(FamilyEnum family) {
    this.family = family;
  }

  public IpAddress ptrRecord(String ptrRecord) {
    this.ptrRecord = ptrRecord;
    return this;
  }

   /**
   * Get ptrRecord
   * @return ptrRecord
  **/
  @ApiModelProperty(example = "x.x.x.x.zone.host.upcloud.com", value = "")
  public String getPtrRecord() {
    return ptrRecord;
  }

  public void setPtrRecord(String ptrRecord) {
    this.ptrRecord = ptrRecord;
  }

  public IpAddress server(UUID server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @ApiModelProperty(example = "0053cd80-5945-4105-9081-11192806a8f7", value = "")
  public UUID getServer() {
    return server;
  }

  public void setServer(UUID server) {
    this.server = server;
  }

  public IpAddress partOfPlan(PartOfPlanEnum partOfPlan) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddress ipAddress = (IpAddress) o;
    return Objects.equals(this.access, ipAddress.access) &&
        Objects.equals(this.address, ipAddress.address) &&
        Objects.equals(this.family, ipAddress.family) &&
        Objects.equals(this.ptrRecord, ipAddress.ptrRecord) &&
        Objects.equals(this.server, ipAddress.server) &&
        Objects.equals(this.partOfPlan, ipAddress.partOfPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, address, family, ptrRecord, server, partOfPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddress {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    ptrRecord: ").append(toIndentedString(ptrRecord)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    partOfPlan: ").append(toIndentedString(partOfPlan)).append("\n");
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


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
 * IpAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T14:18:27.065+03:00")
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

  @SerializedName("server")
  private UUID server = null;

  public IpAddress access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Is address for private or public network.
   * @return access
  **/
  @ApiModelProperty(example = "public", value = "Is address for private or public network.")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
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

  public IpAddress server(UUID server) {
    this.server = server;
    return this;
  }

   /**
   * Server id
   * @return server
  **/
  @ApiModelProperty(example = "009d64ef-31d1-4684-a26b-c86c955cbf46", value = "Server id")
  public UUID getServer() {
    return server;
  }

  public void setServer(UUID server) {
    this.server = server;
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
        Objects.equals(this.family, ipAddress.family) &&
        Objects.equals(this.server, ipAddress.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, family, server);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddress {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

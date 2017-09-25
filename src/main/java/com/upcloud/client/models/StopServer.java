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
 * StopServer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T14:18:27.065+03:00")
public class StopServer {
  /**
   * Type of stop operation performed on the server.
   */
  @JsonAdapter(StopTypeEnum.Adapter.class)
  public enum StopTypeEnum {
    SOFT("soft"),
    
    HARD("hard");

    private String value;

    StopTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StopTypeEnum fromValue(String text) {
      for (StopTypeEnum b : StopTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StopTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StopTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StopTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StopTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stop_type")
  private StopTypeEnum stopType = StopTypeEnum.SOFT;

  @SerializedName("timeout")
  private BigDecimal timeout = null;

  public StopServer stopType(StopTypeEnum stopType) {
    this.stopType = stopType;
    return this;
  }

   /**
   * Type of stop operation performed on the server.
   * @return stopType
  **/
  @ApiModelProperty(example = "soft", value = "Type of stop operation performed on the server.")
  public StopTypeEnum getStopType() {
    return stopType;
  }

  public void setStopType(StopTypeEnum stopType) {
    this.stopType = stopType;
  }

  public StopServer timeout(BigDecimal timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * The stop timeout in seconds.
   * minimum: 1
   * maximum: 600
   * @return timeout
  **/
  @ApiModelProperty(example = "60.0", value = "The stop timeout in seconds.")
  public BigDecimal getTimeout() {
    return timeout;
  }

  public void setTimeout(BigDecimal timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopServer stopServer = (StopServer) o;
    return Objects.equals(this.stopType, stopServer.stopType) &&
        Objects.equals(this.timeout, stopServer.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopType, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopServer {\n");
    
    sb.append("    stopType: ").append(toIndentedString(stopType)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

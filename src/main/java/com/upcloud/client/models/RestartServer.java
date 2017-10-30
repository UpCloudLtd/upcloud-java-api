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
 * RestartServer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class RestartServer {
  /**
   * Restart type
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

  /**
   * Action to take if timeout limit is exceeded.
   */
  @JsonAdapter(TimeoutActionEnum.Adapter.class)
  public enum TimeoutActionEnum {
    DESTROY("destroy"),
    
    IGNORE("ignore");

    private String value;

    TimeoutActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeoutActionEnum fromValue(String text) {
      for (TimeoutActionEnum b : TimeoutActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TimeoutActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeoutActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeoutActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeoutActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("timeout_action")
  private TimeoutActionEnum timeoutAction = null;

  public RestartServer stopType(StopTypeEnum stopType) {
    this.stopType = stopType;
    return this;
  }

   /**
   * Restart type
   * @return stopType
  **/
  @ApiModelProperty(example = "soft", value = "Restart type")
  public StopTypeEnum getStopType() {
    return stopType;
  }

  public void setStopType(StopTypeEnum stopType) {
    this.stopType = stopType;
  }

  public RestartServer timeout(BigDecimal timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Stop timeout in seconds
   * minimum: 1
   * maximum: 600
   * @return timeout
  **/
  @ApiModelProperty(example = "60.0", value = "Stop timeout in seconds")
  public BigDecimal getTimeout() {
    return timeout;
  }

  public void setTimeout(BigDecimal timeout) {
    this.timeout = timeout;
  }

  public RestartServer timeoutAction(TimeoutActionEnum timeoutAction) {
    this.timeoutAction = timeoutAction;
    return this;
  }

   /**
   * Action to take if timeout limit is exceeded.
   * @return timeoutAction
  **/
  @ApiModelProperty(example = "destroy", value = "Action to take if timeout limit is exceeded.")
  public TimeoutActionEnum getTimeoutAction() {
    return timeoutAction;
  }

  public void setTimeoutAction(TimeoutActionEnum timeoutAction) {
    this.timeoutAction = timeoutAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartServer restartServer = (RestartServer) o;
    return Objects.equals(this.stopType, restartServer.stopType) &&
        Objects.equals(this.timeout, restartServer.timeout) &&
        Objects.equals(this.timeoutAction, restartServer.timeoutAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopType, timeout, timeoutAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartServer {\n");
    
    sb.append("    stopType: ").append(toIndentedString(stopType)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    timeoutAction: ").append(toIndentedString(timeoutAction)).append("\n");
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


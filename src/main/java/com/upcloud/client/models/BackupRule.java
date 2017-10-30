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
 * The backup_rule block defines when the storage device is backed up automatically.
 */
@ApiModel(description = "The backup_rule block defines when the storage device is backed up automatically.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class BackupRule {
  /**
   * Gets or Sets interval
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    DAILY("daily"),
    
    MON("mon"),
    
    TUE("tue"),
    
    WED("wed"),
    
    THU("thu"),
    
    FRI("fri"),
    
    SAT("sat"),
    
    SUN("sun");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalEnum fromValue(String text) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("interval")
  private IntervalEnum interval = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("retention")
  private BigDecimal retention = null;

  public BackupRule interval(IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(example = "daily", value = "")
  public IntervalEnum getInterval() {
    return interval;
  }

  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }

  public BackupRule time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "0430", value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public BackupRule retention(BigDecimal retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @ApiModelProperty(example = "365.0", value = "")
  public BigDecimal getRetention() {
    return retention;
  }

  public void setRetention(BigDecimal retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRule backupRule = (BackupRule) o;
    return Objects.equals(this.interval, backupRule.interval) &&
        Objects.equals(this.time, backupRule.time) &&
        Objects.equals(this.retention, backupRule.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, time, retention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupRule {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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


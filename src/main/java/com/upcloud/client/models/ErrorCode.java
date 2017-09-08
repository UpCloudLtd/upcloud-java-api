/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ErrorCode
 */
@JsonAdapter(ErrorCode.Adapter.class)
public enum ErrorCode {
  
  ACTION_INVALID("ACTION_INVALID"),
  
  ACTION_MISSING("ACTION_MISSING"),
  
  BOOT_ORDER_INVALID("BOOT_ORDER_INVALID"),
  
  CORE_MEMORY_UNSUPPORTED("CORE_MEMORY_UNSUPPORTED"),
  
  FIREWALL_INVALID("FIREWALL_INVALID"),
  
  CORE_NUMBER_INVALID("CORE_NUMBER_INVALID"),
  
  HOSTNAME_INVALID("HOSTNAME_INVALID"),
  
  HOSTNAME_MISSING("HOSTNAME_MISSING"),
  
  MEMORY_AMOUNT_INVALID("MEMORY_AMOUNT_INVALID"),
  
  NIC_MODEL_INVALID("NIC_MODEL_INVALID"),
  
  PASSWORD_DELIVERY_INVALID("PASSWORD_DELIVERY_INVALID"),
  
  SERVER_TITLE_INVALID("SERVER_TITLE_INVALID"),
  
  SERVER_TITLE_MISSING("SERVER_TITLE_MISSING"),
  
  SIZE_INVALID("SIZE_INVALID"),
  
  SIZE_MISSING("SIZE_MISSING"),
  
  STORAGE_DEVICE_INVALID("STORAGE_DEVICE_INVALID"),
  
  STORAGE_DEVICE_MISSING("STORAGE_DEVICE_MISSING"),
  
  STORAGE_DEVICES_INVALID("STORAGE_DEVICES_INVALID"),
  
  STORAGE_DEVICES_MISSING("STORAGE_DEVICES_MISSING"),
  
  STORAGE_INVALID("STORAGE_INVALID"),
  
  STORAGE_MISSING("STORAGE_MISSING"),
  
  STORAGE_TITLE_INVALID("STORAGE_TITLE_INVALID"),
  
  STORAGE_TITLE_MISSING("STORAGE_TITLE_MISSING"),
  
  TIMEZONE_INVALID("TIMEZONE_INVALID"),
  
  TYPE_INVALID("TYPE_INVALID"),
  
  TIER_INVALID("TIER_INVALID"),
  
  VIDEO_MODEL_INVALID("VIDEO_MODEL_INVALID"),
  
  VNC_INVALID("VNC_INVALID"),
  
  VNC_PASSWORD_INVALID("VNC_PASSWORD_INVALID"),
  
  ZONE_INVALID("ZONE_INVALID"),
  
  ZONE_MISSING("ZONE_MISSING"),
  
  USER_DATA_INVALID("USER_DATA_INVALID"),
  
  INSUFFICIENT_CREDITS("INSUFFICIENT_CREDITS"),
  
  STORAGE_FORBIDDEN("STORAGE_FORBIDDEN"),
  
  PLAN_CORE_NUMBER_ILLEGAL("PLAN_CORE_NUMBER_ILLEGAL"),
  
  PLAN_MEMORY_AMOUNT_ILLEGAL("PLAN_MEMORY_AMOUNT_ILLEGAL"),
  
  TRIAL_PLAN("TRIAL_PLAN"),
  
  STORAGE_NOT_FOUND("STORAGE_NOT_FOUND"),
  
  ZONE_NOT_FOUND("ZONE_NOT_FOUND"),
  
  CDROM_DEVICE_IN_USE("CDROM_DEVICE_IN_USE"),
  
  DEVICE_ADDRESS_IN_USE("DEVICE_ADDRESS_IN_USE"),
  
  IP_ADDRESS_RESOURCES_UNAVAILABLE("IP_ADDRESS_RESOURCES_UNAVAILABLE"),
  
  MULTIPLE_TEMPLATES("MULTIPLE_TEMPLATES"),
  
  PUBLIC_STORAGE_ATTACH("PUBLIC_STORAGE_ATTACH"),
  
  SERVER_RESOURCES_UNAVAILABLE("SERVER_RESOURCES_UNAVAILABLE"),
  
  STORAGE_ATTACHED_AS_CDROM("STORAGE_ATTACHED_AS_CDROM"),
  
  STORAGE_ATTACHED_AS_DISK("STORAGE_ATTACHED_AS_DISK"),
  
  STORAGE_DEVICE_LIMIT_REACHED("STORAGE_DEVICE_LIMIT_REACHED"),
  
  STORAGE_IN_USE("STORAGE_IN_USE"),
  
  STORAGE_RESOURCES_UNAVAILABLE("STORAGE_RESOURCES_UNAVAILABLE"),
  
  STORAGE_STATE_ILLEGAL("STORAGE_STATE_ILLEGAL"),
  
  STORAGE_TYPE_ILLEGAL("STORAGE_TYPE_ILLEGAL"),
  
  ZONE_MISMATCH("ZONE_MISMATCH"),
  
  INVALID_USERNAME("INVALID_USERNAME");

  private String value;

  ErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorCode fromValue(String text) {
    for (ErrorCode b : ErrorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorCode.fromValue(String.valueOf(value));
    }
  }
}


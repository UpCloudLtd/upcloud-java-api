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
 * Gets or Sets ErrorStatus
 */
@JsonAdapter(ErrorStatus.Adapter.class)
public enum ErrorStatus {
  
  _400("400"),
  
  _402("402"),
  
  _403("403"),
  
  _404("404"),
  
  _409("409");

  private String value;

  ErrorStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorStatus fromValue(String text) {
    for (ErrorStatus b : ErrorStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ErrorStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorStatus enumeration) throws IOException {
      if (enumeration != null) {
        jsonWriter.value(enumeration.getValue());
      } else {
        jsonWriter.nullValue();
      }
    }

    @Override
    public ErrorStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorStatus.fromValue(String.valueOf(value));
    }
  }
}


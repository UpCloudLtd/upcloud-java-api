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
 * Gets or Sets AddressFamily
 */
@JsonAdapter(AddressFamily.Adapter.class)
public enum AddressFamily {
  
  IPV4("IPv4"),
  
  IPV6("IPv6");

  private String value;

  AddressFamily(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddressFamily fromValue(String text) {
    for (AddressFamily b : AddressFamily.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AddressFamily> {
    @Override
    public void write(final JsonWriter jsonWriter, final AddressFamily enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AddressFamily read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AddressFamily.fromValue(String.valueOf(value));
    }
  }
}


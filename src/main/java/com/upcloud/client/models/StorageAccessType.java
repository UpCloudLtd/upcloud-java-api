/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.models;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Storage access types. * &#x60;public&#x60; (*Public storages*) are visible to all users. Public storages include CD-ROM images and templates. CD-ROM images can be used to install operating systems and to rescue unbootable systems. Templates are used to create servers with a preconfigured operating system. * &#x60;private&#x60; (*Private storages*) - visible only to the specific user account and sub-accounts. Users can only create private storages.
 */
@JsonAdapter(StorageAccessType.Adapter.class)
public enum StorageAccessType {
  
  PUBLIC("public"),
  
  PRIVATE("private");

  private String value;

  StorageAccessType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StorageAccessType fromValue(String text) {
    for (StorageAccessType b : StorageAccessType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StorageAccessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StorageAccessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StorageAccessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StorageAccessType.fromValue(String.valueOf(value));
    }
  }
}


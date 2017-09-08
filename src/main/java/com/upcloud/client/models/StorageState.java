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
 * The storage state indicates the storage&#39;s current status. * &#x60;online&#x60; - The storage resource is ready for use. The storage can be attached or detached. * &#x60;maintenance&#x60; - Maintenance work is currently performed on the storage. The storage may have been newly created or it is being updated by some API operation. * &#x60;cloning&#x60; - The storage resource is currently the clone source for another storage. * &#x60;backuping&#x60; - The storage resource is currently being backed up to another storage. * &#x60;error&#x60; - The storage has encountered an error and is currently inaccessible.
 */
@JsonAdapter(StorageState.Adapter.class)
public enum StorageState {
  
  ONLINE("online"),
  
  MAINTENANCE("maintenance"),
  
  CLONING("cloning"),
  
  BACKUPING("backuping"),
  
  ERROR("error");

  private String value;

  StorageState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StorageState fromValue(String text) {
    for (StorageState b : StorageState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StorageState> {
    @Override
    public void write(final JsonWriter jsonWriter, final StorageState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StorageState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StorageState.fromValue(String.valueOf(value));
    }
  }
}


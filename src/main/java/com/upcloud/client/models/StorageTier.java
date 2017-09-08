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
 * Storage resources are divided into two tiers: * &#x60;hdd&#x60; (*HDD storages*) - Data is stored on hard disks resulting in lower costs than MaxIOPS. * &#x60;maxiops&#x60; (*MaxIOPS storages*) - Data is stored on MaxIOPS storage arrays resulting in highest throughput and lowest response times.  Storage tiers affect both the performance and price of the storage.
 */
@JsonAdapter(StorageTier.Adapter.class)
public enum StorageTier {
  
  HDD("hdd"),
  
  MAXIOPS("maxiops");

  private String value;

  StorageTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StorageTier fromValue(String text) {
    for (StorageTier b : StorageTier.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StorageTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final StorageTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StorageTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StorageTier.fromValue(String.valueOf(value));
    }
  }
}


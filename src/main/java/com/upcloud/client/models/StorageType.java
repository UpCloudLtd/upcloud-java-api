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
 * There are four different storage types: * &#x60;disk&#x60; (*Normal storages*) - Normal storage resources are used to store operating system and application data. This is the only user writeable storage type. * &#x60;cdrom&#x60; (*CD-ROMs*) - CD-ROM resources are used as a read-only media, typically for server installations or crash recovery. * &#x60;template&#x60; (*Templates*) - Templates are special storage resources which are used to create new servers with a preconfigured operating system. * &#x60;backup&#x60; (*Backups*) - Backups are storages containing a point-in-time backup of a normal storage. Data on a normal storage can be restored from one of its backups. Backups can also be cloned to create a new normal storage resource. Backups can be created manually or automatically using backup rules.
 */
@JsonAdapter(StorageType.Adapter.class)
public enum StorageType {
  
  DISK("disk"),
  
  CDROM("cdrom"),
  
  TEMPLATE("template"),
  
  BACKUP("backup"),
  
  NORMAL("normal");

  private String value;

  StorageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StorageType fromValue(String text) {
    for (StorageType b : StorageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StorageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StorageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StorageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StorageType.fromValue(String.valueOf(value));
    }
  }
}


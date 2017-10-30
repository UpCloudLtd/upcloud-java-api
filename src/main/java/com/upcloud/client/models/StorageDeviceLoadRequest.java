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
import java.util.UUID;

/**
 * StorageDeviceLoadRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class StorageDeviceLoadRequest {
  @SerializedName("storage")
  private UUID storage = null;

  public StorageDeviceLoadRequest storage(UUID storage) {
    this.storage = storage;
    return this;
  }

   /**
   * The UUID of the storage to be loaded in the CD-ROM device.
   * @return storage
  **/
  @ApiModelProperty(example = "01000000-0000-4000-8000-000060010101", value = "The UUID of the storage to be loaded in the CD-ROM device.")
  public UUID getStorage() {
    return storage;
  }

  public void setStorage(UUID storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageDeviceLoadRequest storageDeviceLoadRequest = (StorageDeviceLoadRequest) o;
    return Objects.equals(this.storage, storageDeviceLoadRequest.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageDeviceLoadRequest {\n");
    
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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


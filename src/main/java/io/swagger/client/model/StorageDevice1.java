/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package io.swagger.client.model;

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
 * StorageDevice1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T12:49:18.200+03:00")
public class StorageDevice1 {
  @SerializedName("storage")
  private UUID storage = null;

  public StorageDevice1 storage(UUID storage) {
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
    StorageDevice1 storageDevice1 = (StorageDevice1) o;
    return Objects.equals(this.storage, storageDevice1.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageDevice1 {\n");
    
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


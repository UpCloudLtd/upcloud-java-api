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
import io.swagger.client.model.PriceZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PriceListResponsePrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T15:39:12.816+03:00")
public class PriceListResponsePrice {
  @SerializedName("zone")
  private List<PriceZone> zone = null;

  public PriceListResponsePrice zone(List<PriceZone> zone) {
    this.zone = zone;
    return this;
  }

  public PriceListResponsePrice addZoneItem(PriceZone zoneItem) {
    if (this.zone == null) {
      this.zone = new ArrayList<PriceZone>();
    }
    this.zone.add(zoneItem);
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @ApiModelProperty(value = "")
  public List<PriceZone> getZone() {
    return zone;
  }

  public void setZone(List<PriceZone> zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceListResponsePrice priceListResponsePrice = (PriceListResponsePrice) o;
    return Objects.equals(this.zone, priceListResponsePrice.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceListResponsePrice {\n");
    
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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


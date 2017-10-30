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
import com.upcloud.client.models.PriceListResponsePrices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PriceListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class PriceListResponse {
  @SerializedName("prices")
  private PriceListResponsePrices prices = null;

  public PriceListResponse prices(PriceListResponsePrices prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @ApiModelProperty(value = "")
  public PriceListResponsePrices getPrices() {
    return prices;
  }

  public void setPrices(PriceListResponsePrices prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceListResponse priceListResponse = (PriceListResponse) o;
    return Objects.equals(this.prices, priceListResponse.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceListResponse {\n");
    
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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


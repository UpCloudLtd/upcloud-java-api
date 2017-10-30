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
import com.upcloud.client.models.FirewallRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FirewallRuleCreateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class FirewallRuleCreateResponse {
  @SerializedName("firewall_rule")
  private FirewallRule firewallRule = null;

  public FirewallRuleCreateResponse firewallRule(FirewallRule firewallRule) {
    this.firewallRule = firewallRule;
    return this;
  }

   /**
   * Get firewallRule
   * @return firewallRule
  **/
  @ApiModelProperty(value = "")
  public FirewallRule getFirewallRule() {
    return firewallRule;
  }

  public void setFirewallRule(FirewallRule firewallRule) {
    this.firewallRule = firewallRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallRuleCreateResponse firewallRuleCreateResponse = (FirewallRuleCreateResponse) o;
    return Objects.equals(this.firewallRule, firewallRuleCreateResponse.firewallRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firewallRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallRuleCreateResponse {\n");
    
    sb.append("    firewallRule: ").append(toIndentedString(firewallRule)).append("\n");
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


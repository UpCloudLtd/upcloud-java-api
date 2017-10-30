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
import com.upcloud.client.models.AddressFamily;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FirewallRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T16:52:05.756+03:00")
public class FirewallRule {
  /**
   * The direction of network traffic this rule will be applied to.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    IN("in"),
    
    OUT("out");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  /**
   * Action to take if the rule conditions are met.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    ACCEPT("accept"),
    
    REJECT("reject"),
    
    DROP("drop");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("position")
  private BigDecimal position = null;

  @SerializedName("family")
  private AddressFamily family = null;

  /**
   * The protocol this rule will be applied to.
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    TCP("tcp"),
    
    UDP("udp"),
    
    ICMP("icmp");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("protocol")
  private ProtocolEnum protocol = null;

  @SerializedName("icmp_type")
  private String icmpType = null;

  @SerializedName("destination_address_start")
  private String destinationAddressStart = null;

  @SerializedName("destination_address_end")
  private String destinationAddressEnd = null;

  @SerializedName("destination_port_start")
  private BigDecimal destinationPortStart = null;

  @SerializedName("destination_port_end")
  private BigDecimal destinationPortEnd = null;

  @SerializedName("source_address_start")
  private String sourceAddressStart = null;

  @SerializedName("source_address_end")
  private String sourceAddressEnd = null;

  @SerializedName("source_port_start")
  private BigDecimal sourcePortStart = null;

  @SerializedName("source_port_end")
  private BigDecimal sourcePortEnd = null;

  @SerializedName("comment")
  private String comment = null;

  public FirewallRule direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of network traffic this rule will be applied to.
   * @return direction
  **/
  @ApiModelProperty(example = "in", required = true, value = "The direction of network traffic this rule will be applied to.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public FirewallRule action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Action to take if the rule conditions are met.
   * @return action
  **/
  @ApiModelProperty(example = "accept", required = true, value = "Action to take if the rule conditions are met.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public FirewallRule position(BigDecimal position) {
    this.position = position;
    return this;
  }

   /**
   * Add the firewall rule to this position in the server&#39;s firewall list.
   * minimum: 1
   * maximum: 1000
   * @return position
  **/
  @ApiModelProperty(example = "1.0", value = "Add the firewall rule to this position in the server's firewall list.")
  public BigDecimal getPosition() {
    return position;
  }

  public void setPosition(BigDecimal position) {
    this.position = position;
  }

  public FirewallRule family(AddressFamily family) {
    this.family = family;
    return this;
  }

   /**
   * if protocol is set The address family of new firewall rule
   * @return family
  **/
  @ApiModelProperty(required = true, value = "if protocol is set The address family of new firewall rule")
  public AddressFamily getFamily() {
    return family;
  }

  public void setFamily(AddressFamily family) {
    this.family = family;
  }

  public FirewallRule protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol this rule will be applied to.
   * @return protocol
  **/
  @ApiModelProperty(example = "tcp", value = "The protocol this rule will be applied to.")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public FirewallRule icmpType(String icmpType) {
    this.icmpType = icmpType;
    return this;
  }

   /**
   * The ICMP type.
   * @return icmpType
  **/
  @ApiModelProperty(example = "0", value = "The ICMP type.")
  public String getIcmpType() {
    return icmpType;
  }

  public void setIcmpType(String icmpType) {
    this.icmpType = icmpType;
  }

  public FirewallRule destinationAddressStart(String destinationAddressStart) {
    this.destinationAddressStart = destinationAddressStart;
    return this;
  }

   /**
   * The destination address range starts from this address.
   * @return destinationAddressStart
  **/
  @ApiModelProperty(example = "192.168.0.1", value = "The destination address range starts from this address.")
  public String getDestinationAddressStart() {
    return destinationAddressStart;
  }

  public void setDestinationAddressStart(String destinationAddressStart) {
    this.destinationAddressStart = destinationAddressStart;
  }

  public FirewallRule destinationAddressEnd(String destinationAddressEnd) {
    this.destinationAddressEnd = destinationAddressEnd;
    return this;
  }

   /**
   * The destination address range ends to this address.
   * @return destinationAddressEnd
  **/
  @ApiModelProperty(example = "192.168.255.255", value = "The destination address range ends to this address.")
  public String getDestinationAddressEnd() {
    return destinationAddressEnd;
  }

  public void setDestinationAddressEnd(String destinationAddressEnd) {
    this.destinationAddressEnd = destinationAddressEnd;
  }

  public FirewallRule destinationPortStart(BigDecimal destinationPortStart) {
    this.destinationPortStart = destinationPortStart;
    return this;
  }

   /**
   * The destination port range starts from this port number.
   * minimum: 1
   * maximum: 65535
   * @return destinationPortStart
  **/
  @ApiModelProperty(example = "80.0", value = "The destination port range starts from this port number.")
  public BigDecimal getDestinationPortStart() {
    return destinationPortStart;
  }

  public void setDestinationPortStart(BigDecimal destinationPortStart) {
    this.destinationPortStart = destinationPortStart;
  }

  public FirewallRule destinationPortEnd(BigDecimal destinationPortEnd) {
    this.destinationPortEnd = destinationPortEnd;
    return this;
  }

   /**
   * The destination port range ends to this port number.
   * minimum: 1
   * maximum: 65535
   * @return destinationPortEnd
  **/
  @ApiModelProperty(example = "80.0", value = "The destination port range ends to this port number.")
  public BigDecimal getDestinationPortEnd() {
    return destinationPortEnd;
  }

  public void setDestinationPortEnd(BigDecimal destinationPortEnd) {
    this.destinationPortEnd = destinationPortEnd;
  }

  public FirewallRule sourceAddressStart(String sourceAddressStart) {
    this.sourceAddressStart = sourceAddressStart;
    return this;
  }

   /**
   * The source address range starts from this address.
   * @return sourceAddressStart
  **/
  @ApiModelProperty(example = "192.168.1.1", value = "The source address range starts from this address.")
  public String getSourceAddressStart() {
    return sourceAddressStart;
  }

  public void setSourceAddressStart(String sourceAddressStart) {
    this.sourceAddressStart = sourceAddressStart;
  }

  public FirewallRule sourceAddressEnd(String sourceAddressEnd) {
    this.sourceAddressEnd = sourceAddressEnd;
    return this;
  }

   /**
   * The source address range ends to this address.
   * @return sourceAddressEnd
  **/
  @ApiModelProperty(example = "192.168.1.255", value = "The source address range ends to this address.")
  public String getSourceAddressEnd() {
    return sourceAddressEnd;
  }

  public void setSourceAddressEnd(String sourceAddressEnd) {
    this.sourceAddressEnd = sourceAddressEnd;
  }

  public FirewallRule sourcePortStart(BigDecimal sourcePortStart) {
    this.sourcePortStart = sourcePortStart;
    return this;
  }

   /**
   * The source port range starts from this port number.
   * minimum: 1
   * maximum: 65535
   * @return sourcePortStart
  **/
  @ApiModelProperty(example = "1.0", value = "The source port range starts from this port number.")
  public BigDecimal getSourcePortStart() {
    return sourcePortStart;
  }

  public void setSourcePortStart(BigDecimal sourcePortStart) {
    this.sourcePortStart = sourcePortStart;
  }

  public FirewallRule sourcePortEnd(BigDecimal sourcePortEnd) {
    this.sourcePortEnd = sourcePortEnd;
    return this;
  }

   /**
   * The source port range ends to this port number.
   * minimum: 1
   * maximum: 65535
   * @return sourcePortEnd
  **/
  @ApiModelProperty(example = "65535.0", value = "The source port range ends to this port number.")
  public BigDecimal getSourcePortEnd() {
    return sourcePortEnd;
  }

  public void setSourcePortEnd(BigDecimal sourcePortEnd) {
    this.sourcePortEnd = sourcePortEnd;
  }

  public FirewallRule comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Freeform comment string for the rule.
   * @return comment
  **/
  @ApiModelProperty(example = "Allow SSH from this network", value = "Freeform comment string for the rule.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallRule firewallRule = (FirewallRule) o;
    return Objects.equals(this.direction, firewallRule.direction) &&
        Objects.equals(this.action, firewallRule.action) &&
        Objects.equals(this.position, firewallRule.position) &&
        Objects.equals(this.family, firewallRule.family) &&
        Objects.equals(this.protocol, firewallRule.protocol) &&
        Objects.equals(this.icmpType, firewallRule.icmpType) &&
        Objects.equals(this.destinationAddressStart, firewallRule.destinationAddressStart) &&
        Objects.equals(this.destinationAddressEnd, firewallRule.destinationAddressEnd) &&
        Objects.equals(this.destinationPortStart, firewallRule.destinationPortStart) &&
        Objects.equals(this.destinationPortEnd, firewallRule.destinationPortEnd) &&
        Objects.equals(this.sourceAddressStart, firewallRule.sourceAddressStart) &&
        Objects.equals(this.sourceAddressEnd, firewallRule.sourceAddressEnd) &&
        Objects.equals(this.sourcePortStart, firewallRule.sourcePortStart) &&
        Objects.equals(this.sourcePortEnd, firewallRule.sourcePortEnd) &&
        Objects.equals(this.comment, firewallRule.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, action, position, family, protocol, icmpType, destinationAddressStart, destinationAddressEnd, destinationPortStart, destinationPortEnd, sourceAddressStart, sourceAddressEnd, sourcePortStart, sourcePortEnd, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallRule {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    icmpType: ").append(toIndentedString(icmpType)).append("\n");
    sb.append("    destinationAddressStart: ").append(toIndentedString(destinationAddressStart)).append("\n");
    sb.append("    destinationAddressEnd: ").append(toIndentedString(destinationAddressEnd)).append("\n");
    sb.append("    destinationPortStart: ").append(toIndentedString(destinationPortStart)).append("\n");
    sb.append("    destinationPortEnd: ").append(toIndentedString(destinationPortEnd)).append("\n");
    sb.append("    sourceAddressStart: ").append(toIndentedString(sourceAddressStart)).append("\n");
    sb.append("    sourceAddressEnd: ").append(toIndentedString(sourceAddressEnd)).append("\n");
    sb.append("    sourcePortStart: ").append(toIndentedString(sourcePortStart)).append("\n");
    sb.append("    sourcePortEnd: ").append(toIndentedString(sourcePortEnd)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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


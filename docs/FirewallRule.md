
# FirewallRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of network traffic this rule will be applied to. | 
**action** | [**ActionEnum**](#ActionEnum) | Action to take if the rule conditions are met. | 
**position** | [**BigDecimal**](BigDecimal.md) | Add the firewall rule to this position in the server&#39;s firewall list. |  [optional]
**family** | [**AddressFamily**](AddressFamily.md) | if protocol is set The address family of new firewall rule | 
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | The protocol this rule will be applied to. |  [optional]
**icmpType** | **String** | The ICMP type. |  [optional]
**destinationAddressStart** | **String** | The destination address range starts from this address. |  [optional]
**destinationAddressEnd** | **String** | The destination address range ends to this address. |  [optional]
**destinationPortStart** | [**BigDecimal**](BigDecimal.md) | The destination port range starts from this port number. |  [optional]
**destinationPortEnd** | [**BigDecimal**](BigDecimal.md) | The destination port range ends to this port number. |  [optional]
**sourceAddressStart** | **String** | The source address range starts from this address. |  [optional]
**sourceAddressEnd** | **String** | The source address range ends to this address. |  [optional]
**sourcePortStart** | [**BigDecimal**](BigDecimal.md) | The source port range starts from this port number. |  [optional]
**sourcePortEnd** | [**BigDecimal**](BigDecimal.md) | The source port range ends to this port number. |  [optional]
**comment** | **String** | Freeform comment string for the rule. |  [optional]


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
IN | &quot;in&quot;
OUT | &quot;out&quot;


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
ACCEPT | &quot;accept&quot;
REJECT | &quot;reject&quot;
DROP | &quot;drop&quot;


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
UDP | &quot;udp&quot;
ICMP | &quot;icmp&quot;




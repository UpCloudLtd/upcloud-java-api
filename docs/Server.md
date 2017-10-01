
# Server

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bootOrder** | [**BootOrderEnum**](#BootOrderEnum) | The storage device boot order. |  [optional]
**coreNumber** | [**BigDecimal**](BigDecimal.md) | The number of CPU cores dedicated to the server. See List server configurations. |  [optional]
**firewall** | [**FirewallEnum**](#FirewallEnum) | The state of the server firewall rules. |  [optional]
**host** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**hostname** | **String** | A valid hostname, e.g. host.example.com. The maximum length is 128 characters. |  [optional]
**ipAddresses** | [**IpAddresses**](IpAddresses.md) |  |  [optional]
**license** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**memoryAmount** | [**BigDecimal**](BigDecimal.md) | The amount of main memory in megabytes. See List server configurations. |  [optional]
**nicModel** | **String** | The model of the server&#39;s network interfaces. |  [optional]
**plan** | **String** | The pricing plan used. If a plan is selected, the core_number and  memory_amount must match the plan if they are present. |  [optional]
**planIpv4Bytes** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**planIpv6Bytes** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**state** | [**ServerState**](ServerState.md) |  |  [optional]
**storageDevices** | [**ServerStorageDevices**](ServerStorageDevices.md) |  |  [optional]
**tags** | [**ServerTags**](ServerTags.md) |  |  [optional]
**timezone** | **String** | A timezone identifier, e.g. Europe/Helsinki. See Timezones. |  [optional]
**title** | **String** | A short description. |  [optional]
**uuid** | [**UUID**](UUID.md) |  |  [optional]
**videoModel** | [**VideoModelEnum**](#VideoModelEnum) | The model of the server&#39;s video interface. |  [optional]
**vnc** | [**VncEnum**](#VncEnum) | The state of the VNC remote access service. |  [optional]
**vncHost** | **String** |  |  [optional]
**vncPassword** | **String** | The VNC remote access password. |  [optional]
**vncPort** | **String** |  |  [optional]
**zone** | **String** |  |  [optional]


<a name="BootOrderEnum"></a>
## Enum: BootOrderEnum
Name | Value
---- | -----
DISK | &quot;disk&quot;
CDROM | &quot;cdrom&quot;
DISK_CDROM | &quot;disk,cdrom&quot;
CDROM_DISK | &quot;cdrom,disk&quot;


<a name="FirewallEnum"></a>
## Enum: FirewallEnum
Name | Value
---- | -----
ON | &quot;on&quot;
OFF | &quot;off&quot;


<a name="VideoModelEnum"></a>
## Enum: VideoModelEnum
Name | Value
---- | -----
VGA | &quot;vga&quot;
CIRRUS | &quot;cirrus&quot;


<a name="VncEnum"></a>
## Enum: VncEnum
Name | Value
---- | -----
ON | &quot;on&quot;
OFF | &quot;off&quot;




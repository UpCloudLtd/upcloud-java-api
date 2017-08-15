
# Server

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bootOrder** | [**BootOrderEnum**](#BootOrderEnum) |  |  [optional]
**coreNumber** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**firewall** | [**FirewallEnum**](#FirewallEnum) |  |  [optional]
**host** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**hostname** | **String** |  |  [optional]
**ipAddresses** | [**ServerIpAddresses**](ServerIpAddresses.md) |  |  [optional]
**license** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**memoryAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**nicModel** | **String** |  |  [optional]
**plan** | **String** |  |  [optional]
**planIpv4Bytes** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**planIpv6Bytes** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**storageDevices** | [**ServerStorageDevices**](ServerStorageDevices.md) |  |  [optional]
**tags** | [**ServerTags**](ServerTags.md) |  |  [optional]
**timezone** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**uuid** | [**UUID**](UUID.md) |  |  [optional]
**videoModel** | [**VideoModelEnum**](#VideoModelEnum) |  |  [optional]
**vnc** | [**VncEnum**](#VncEnum) |  |  [optional]
**vncHost** | **String** |  |  [optional]
**vncPassword** | **String** |  |  [optional]
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


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
STARTED | &quot;started&quot;
STOPPED | &quot;stopped&quot;
MAINTENANCE | &quot;maintenance&quot;
ERROR | &quot;error&quot;


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




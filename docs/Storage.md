
# Storage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**AccessEnum**](#AccessEnum) |  |  [optional]
**backupRule** | [**BackupRule**](BackupRule.md) |  |  [optional]
**backups** | [**StorageBackups**](StorageBackups.md) |  |  [optional]
**license** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**servers** | [**StorageServers**](StorageServers.md) |  |  [optional]
**size** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**tier** | [**TierEnum**](#TierEnum) |  |  [optional]
**title** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**uuid** | [**UUID**](UUID.md) |  |  [optional]
**zone** | **String** |  |  [optional]


<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
PUBLIC | &quot;public&quot;
PRIVATE | &quot;private&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ONLINE | &quot;online&quot;
MAINTENANCE | &quot;maintenance&quot;
CLONING | &quot;cloning&quot;
BACKUPING | &quot;backuping&quot;
ERROR | &quot;error&quot;


<a name="TierEnum"></a>
## Enum: TierEnum
Name | Value
---- | -----
HDD | &quot;hdd&quot;
MAXIOPS | &quot;maxiops&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NORMAL | &quot;normal&quot;
DISK | &quot;disk&quot;
CDROM | &quot;cdrom&quot;
TEMPLATE | &quot;template&quot;
BACKUP | &quot;backup&quot;




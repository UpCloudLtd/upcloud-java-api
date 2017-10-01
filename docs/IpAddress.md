
# IpAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**AccessEnum**](#AccessEnum) | Is address for private or public network. |  [optional]
**address** | **String** |  |  [optional]
**family** | [**FamilyEnum**](#FamilyEnum) | The address family of new IP address. |  [optional]
**ptrRecord** | **String** |  |  [optional]
**server** | [**UUID**](UUID.md) |  |  [optional]
**partOfPlan** | [**PartOfPlanEnum**](#PartOfPlanEnum) |  |  [optional]


<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
PUBLIC | &quot;public&quot;
PRIVATE | &quot;private&quot;


<a name="FamilyEnum"></a>
## Enum: FamilyEnum
Name | Value
---- | -----
IPV4 | &quot;IPv4&quot;
IPV6 | &quot;IPv6&quot;


<a name="PartOfPlanEnum"></a>
## Enum: PartOfPlanEnum
Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;




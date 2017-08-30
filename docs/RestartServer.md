
# RestartServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopType** | [**StopTypeEnum**](#StopTypeEnum) | Restart type |  [optional]
**timeout** | [**BigDecimal**](BigDecimal.md) | Stop timeout in seconds |  [optional]
**timeoutAction** | [**TimeoutActionEnum**](#TimeoutActionEnum) | Action to take if timeout limit is exceeded. |  [optional]


<a name="StopTypeEnum"></a>
## Enum: StopTypeEnum
Name | Value
---- | -----
SOFT | &quot;soft&quot;
HARD | &quot;hard&quot;


<a name="TimeoutActionEnum"></a>
## Enum: TimeoutActionEnum
Name | Value
---- | -----
DESTROY | &quot;destroy&quot;
IGNORE | &quot;ignore&quot;




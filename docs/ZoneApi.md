# ZoneApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listZones**](ZoneApi.md#listZones) | **GET** /zone | List available zones


<a name="listZones"></a>
# **listZones**
> InlineResponse2001 listZones()

List available zones

Returns a list of available zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZoneApi;


ZoneApi apiInstance = new ZoneApi();
try {
    InlineResponse2001 result = apiInstance.listZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#listZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ZoneApi

All URIs are relative to *http://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listZones**](ZoneApi.md#listZones) | **GET** /zone | List available zones


<a name="listZones"></a>
# **listZones**
> ZoneListResponse listZones()

List available zones

Returns a list of available zones.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.ZoneApi;


ZoneApi apiInstance = new ZoneApi();
try {
    ZoneListResponse result = apiInstance.listZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#listZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ZoneListResponse**](ZoneListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ZoneApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneGet**](ZoneApi.md#zoneGet) | **GET** /zone | List available zones


<a name="zoneGet"></a>
# **zoneGet**
> InlineResponse2001 zoneGet()

List available zones

Returns a list of available zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZoneApi;


ZoneApi apiInstance = new ZoneApi();
try {
    InlineResponse2001 result = apiInstance.zoneGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneGet");
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


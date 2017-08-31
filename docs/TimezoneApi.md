# TimezoneApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listTimezones**](TimezoneApi.md#listTimezones) | **GET** /timezone | List timezones


<a name="listTimezones"></a>
# **listTimezones**
> InlineResponse2002 listTimezones()

List timezones

Returns a list of available timezones. Timezones are used to set the hardware clock for servers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimezoneApi;


TimezoneApi apiInstance = new TimezoneApi();
try {
    InlineResponse2002 result = apiInstance.listTimezones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimezoneApi#listTimezones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


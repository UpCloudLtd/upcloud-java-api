# TimezoneApi

All URIs are relative to *https://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listTimezones**](TimezoneApi.md#listTimezones) | **GET** /timezone | List timezones


<a name="listTimezones"></a>
# **listTimezones**
> TimezoneListResponse listTimezones()

List timezones

Returns a list of available timezones. Timezones are used to set the hardware clock for servers.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.TimezoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

TimezoneApi apiInstance = new TimezoneApi();
try {
    TimezoneListResponse result = apiInstance.listTimezones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimezoneApi#listTimezones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TimezoneListResponse**](TimezoneListResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


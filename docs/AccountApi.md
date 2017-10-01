# AccountApi

All URIs are relative to *https://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountApi.md#getAccount) | **GET** /account | Account information


<a name="getAccount"></a>
# **getAccount**
> AccountResponse getAccount()

Account information

Returns information on the user&#39;s account.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
try {
    AccountResponse result = apiInstance.getAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


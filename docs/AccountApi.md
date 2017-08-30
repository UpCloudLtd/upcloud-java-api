# AccountApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountGet**](AccountApi.md#accountGet) | **GET** /account | Account information


<a name="accountGet"></a>
# **accountGet**
> Account accountGet()

Account information

Returns information on the user&#39;s account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
try {
    Account result = apiInstance.accountGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


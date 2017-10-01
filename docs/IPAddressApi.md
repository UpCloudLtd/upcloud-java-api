# IPAddressApi

All URIs are relative to *https://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addIp**](IPAddressApi.md#addIp) | **POST** /ip_address | Assign IP address
[**deleteIp**](IPAddressApi.md#deleteIp) | **DELETE** /ip_address/{ip} | Release IP address
[**getDetails**](IPAddressApi.md#getDetails) | **GET** /ip_address/{ip} | Get IP address details
[**listIps**](IPAddressApi.md#listIps) | **GET** /ip_address | List IP addresses
[**modifyIp**](IPAddressApi.md#modifyIp) | **PUT** /ip_address/{ip} | Modify IP address


<a name="addIp"></a>
# **addIp**
> AssignIpResponse addIp(ipAddress)

Assign IP address

Assigns a new IP address to a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.IPAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

IPAddressApi apiInstance = new IPAddressApi();
AddIpRequest ipAddress = new AddIpRequest(); // AddIpRequest | 
try {
    AssignIpResponse result = apiInstance.addIp(ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#addIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | [**AddIpRequest**](AddIpRequest.md)|  | [optional]

### Return type

[**AssignIpResponse**](AssignIpResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIp"></a>
# **deleteIp**
> deleteIp(ip)

Release IP address

Removes an IP address from a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.IPAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

IPAddressApi apiInstance = new IPAddressApi();
String ip = "ip_example"; // String | Ip address
try {
    apiInstance.deleteIp(ip);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#deleteIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| Ip address |

### Return type

null (empty response body)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDetails"></a>
# **getDetails**
> AssignIpResponse getDetails(ip)

Get IP address details

Returns detailed information about a specific IP address.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.IPAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

IPAddressApi apiInstance = new IPAddressApi();
String ip = "ip_example"; // String | Ip address
try {
    AssignIpResponse result = apiInstance.getDetails(ip);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#getDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| Ip address |

### Return type

[**AssignIpResponse**](AssignIpResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIps"></a>
# **listIps**
> IpAddressListResponse listIps()

List IP addresses

Returns a list of all IP addresses assigned to servers on the current user account.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.IPAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

IPAddressApi apiInstance = new IPAddressApi();
try {
    IpAddressListResponse result = apiInstance.listIps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#listIps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IpAddressListResponse**](IpAddressListResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyIp"></a>
# **modifyIp**
> AssignIpResponse modifyIp(ip, ipAddress)

Modify IP address

Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.IPAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

IPAddressApi apiInstance = new IPAddressApi();
String ip = "ip_example"; // String | Ip address
ModifyIpRequest ipAddress = new ModifyIpRequest(); // ModifyIpRequest | 
try {
    AssignIpResponse result = apiInstance.modifyIp(ip, ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#modifyIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| Ip address |
 **ipAddress** | [**ModifyIpRequest**](ModifyIpRequest.md)|  | [optional]

### Return type

[**AssignIpResponse**](AssignIpResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


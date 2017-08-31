# IPAddressApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addIp**](IPAddressApi.md#addIp) | **POST** /ip_address | Assign IP address
[**deleteIp**](IPAddressApi.md#deleteIp) | **DELETE** /ip_address/{ip} | Release IP address
[**getDetails**](IPAddressApi.md#getDetails) | **GET** /ip_address/{ip} | Get IP address details
[**listIps**](IPAddressApi.md#listIps) | **GET** /ip_address | List IP addresses
[**modifyIp**](IPAddressApi.md#modifyIp) | **PUT** /ip_address/{ip} | Modify IP address


<a name="addIp"></a>
# **addIp**
> InlineResponse2011 addIp(ipAddress)

Assign IP address

Assigns a new IP address to a server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IPAddressApi;


IPAddressApi apiInstance = new IPAddressApi();
IpAddress ipAddress = new IpAddress(); // IpAddress | 
try {
    InlineResponse2011 result = apiInstance.addIp(ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#addIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | [**IpAddress**](IpAddress.md)|  | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteIp"></a>
# **deleteIp**
> deleteIp(ip)

Release IP address

Removes an IP address from a server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IPAddressApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDetails"></a>
# **getDetails**
> InlineResponse2011 getDetails(ip)

Get IP address details

Returns detailed information about a specific IP address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IPAddressApi;


IPAddressApi apiInstance = new IPAddressApi();
String ip = "ip_example"; // String | Ip address
try {
    InlineResponse2011 result = apiInstance.getDetails(ip);
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

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listIps"></a>
# **listIps**
> InlineResponse2006 listIps()

List IP addresses

Returns a list of all IP addresses assigned to servers on the current user account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IPAddressApi;


IPAddressApi apiInstance = new IPAddressApi();
try {
    InlineResponse2006 result = apiInstance.listIps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPAddressApi#listIps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="modifyIp"></a>
# **modifyIp**
> InlineResponse2011 modifyIp(ip, ipAddress)

Modify IP address

Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IPAddressApi;


IPAddressApi apiInstance = new IPAddressApi();
String ip = "ip_example"; // String | Ip address
IpAddress1 ipAddress = new IpAddress1(); // IpAddress1 | 
try {
    InlineResponse2011 result = apiInstance.modifyIp(ip, ipAddress);
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
 **ipAddress** | [**IpAddress1**](IpAddress1.md)|  | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


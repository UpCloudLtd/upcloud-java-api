# ServerApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serverGet**](ServerApi.md#serverGet) | **GET** /server | List of servers
[**serverPost**](ServerApi.md#serverPost) | **POST** /server | Create server
[**serverServerIdDelete**](ServerApi.md#serverServerIdDelete) | **DELETE** /server/{serverId} | Delete server
[**serverServerIdGet**](ServerApi.md#serverServerIdGet) | **GET** /server/{serverId} | Server details
[**serverServerIdPut**](ServerApi.md#serverServerIdPut) | **PUT** /server/{serverId} | Modify server


<a name="serverGet"></a>
# **serverGet**
> InlineResponse200 serverGet()

List of servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
try {
    InlineResponse200 result = apiInstance.serverGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serverPost"></a>
# **serverPost**
> InlineResponse2001 serverPost(server)

Create server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
Server server = new Server(); // Server | 
try {
    InlineResponse2001 result = apiInstance.serverPost(server);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **server** | [**Server**](Server.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="serverServerIdDelete"></a>
# **serverServerIdDelete**
> serverServerIdDelete(serverId)

Delete server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to delete
try {
    apiInstance.serverServerIdDelete(serverId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverServerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdGet"></a>
# **serverServerIdGet**
> InlineResponse2001 serverServerIdGet(serverId)

Server details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to return
try {
    InlineResponse2001 result = apiInstance.serverServerIdGet(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverServerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to return |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdPut"></a>
# **serverServerIdPut**
> InlineResponse2001 serverServerIdPut(serverId, server)

Modify server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to modify
Server server = new Server(); // Server | 
try {
    InlineResponse2001 result = apiInstance.serverServerIdPut(serverId, server);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverServerIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to modify |
 **server** | [**Server**](Server.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


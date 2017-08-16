# ServerApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServer**](ServerApi.md#createServer) | **POST** /server | Create server
[**deleteServer**](ServerApi.md#deleteServer) | **DELETE** /server/{serverId} | Delete server
[**listServers**](ServerApi.md#listServers) | **GET** /server | List of servers
[**serverDetails**](ServerApi.md#serverDetails) | **GET** /server/{serverId} | Server details
[**updateServer**](ServerApi.md#updateServer) | **PUT** /server/{serverId} | Modify server


<a name="createServer"></a>
# **createServer**
> InlineResponse2001 createServer(server)

Create server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
Server server = new Server(); // Server | 
try {
    InlineResponse2001 result = apiInstance.createServer(server);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#createServer");
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

<a name="deleteServer"></a>
# **deleteServer**
> deleteServer(serverId)

Delete server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to delete
try {
    apiInstance.deleteServer(serverId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#deleteServer");
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

<a name="listServers"></a>
# **listServers**
> InlineResponse200 listServers()

List of servers

List servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
try {
    InlineResponse200 result = apiInstance.listServers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#listServers");
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

<a name="serverDetails"></a>
# **serverDetails**
> InlineResponse2001 serverDetails(serverId)

Server details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to return
try {
    InlineResponse2001 result = apiInstance.serverDetails(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverDetails");
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

<a name="updateServer"></a>
# **updateServer**
> InlineResponse2001 updateServer(serverId, server)

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
    InlineResponse2001 result = apiInstance.updateServer(serverId, server);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#updateServer");
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


# ServerApi

All URIs are relative to *https://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignTag**](ServerApi.md#assignTag) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
[**attachStorage**](ServerApi.md#attachStorage) | **POST** /server/{serverId}/storage/attach | Attach storage
[**createFirewallRule**](ServerApi.md#createFirewallRule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
[**createServer**](ServerApi.md#createServer) | **POST** /server | Create server
[**deleteFirewallRule**](ServerApi.md#deleteFirewallRule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
[**deleteServer**](ServerApi.md#deleteServer) | **DELETE** /server/{serverId} | Delete server
[**detachStorage**](ServerApi.md#detachStorage) | **POST** /server/{serverId}/storage/detach | Detach storage
[**ejectCdrom**](ServerApi.md#ejectCdrom) | **POST** /server/{serverId}/cdrom/eject | Eject CD-ROM
[**getFirewallRule**](ServerApi.md#getFirewallRule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
[**listServerConfigurations**](ServerApi.md#listServerConfigurations) | **GET** /server_size | List server configurations
[**listServers**](ServerApi.md#listServers) | **GET** /server | List of servers
[**loadCdrom**](ServerApi.md#loadCdrom) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
[**modifyServer**](ServerApi.md#modifyServer) | **PUT** /server/{serverId} | Modify server
[**restartServer**](ServerApi.md#restartServer) | **POST** /server/{serverId}/restart | Restart server
[**serverDetails**](ServerApi.md#serverDetails) | **GET** /server/{serverId} | Get server details
[**serverServerIdFirewallRuleGet**](ServerApi.md#serverServerIdFirewallRuleGet) | **GET** /server/{serverId}/firewall_rule | List firewall rules
[**startServer**](ServerApi.md#startServer) | **POST** /server/{serverId}/start | Start server
[**stopServer**](ServerApi.md#stopServer) | **POST** /server/{serverId}/stop | Stop server
[**untag**](ServerApi.md#untag) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server


<a name="assignTag"></a>
# **assignTag**
> CreateServerResponse assignTag(serverId, tagList)

Assign tag to a server

Servers can be tagged with one or more tags. The tags used must exist

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
String tagList = "tagList_example"; // String | List of tags
try {
    CreateServerResponse result = apiInstance.assignTag(serverId, tagList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#assignTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **tagList** | **String**| List of tags |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachStorage"></a>
# **attachStorage**
> CreateServerResponse attachStorage(serverId, storageDevice)

Attach storage

Attaches a storage as a device to a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
AttachStorageDeviceRequest storageDevice = new AttachStorageDeviceRequest(); // AttachStorageDeviceRequest | 
try {
    CreateServerResponse result = apiInstance.attachStorage(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#attachStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **storageDevice** | [**AttachStorageDeviceRequest**](AttachStorageDeviceRequest.md)|  |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFirewallRule"></a>
# **createFirewallRule**
> FirewallRuleCreateResponse createFirewallRule(serverId, firewallRule)

Create firewall rule

Creates a new firewall rule

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
FirewallRuleRequest firewallRule = new FirewallRuleRequest(); // FirewallRuleRequest | 
try {
    FirewallRuleCreateResponse result = apiInstance.createFirewallRule(serverId, firewallRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#createFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **firewallRule** | [**FirewallRuleRequest**](FirewallRuleRequest.md)|  |

### Return type

[**FirewallRuleCreateResponse**](FirewallRuleCreateResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createServer"></a>
# **createServer**
> CreateServerResponse createServer(server)

Create server

Creates a new server instance.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
CreateServerRequest server = new CreateServerRequest(); // CreateServerRequest | 
try {
    CreateServerResponse result = apiInstance.createServer(server);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#createServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **server** | [**CreateServerRequest**](CreateServerRequest.md)|  | [optional]

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFirewallRule"></a>
# **deleteFirewallRule**
> deleteFirewallRule(serverId, firewallRuleNumber)

Remove firewall rule

Removes a firewall rule from a server. Firewall rules must be removed individually. The positions of remaining firewall rules will be adjusted after a rule is removed.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
BigDecimal firewallRuleNumber = new BigDecimal(); // BigDecimal | Denotes the index of the firewall rule in the server's firewall rule list
try {
    apiInstance.deleteFirewallRule(serverId, firewallRuleNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#deleteFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **firewallRuleNumber** | **BigDecimal**| Denotes the index of the firewall rule in the server&#39;s firewall rule list |

### Return type

null (empty response body)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detachStorage"></a>
# **detachStorage**
> CreateServerResponse detachStorage(serverId, storageDevice)

Detach storage

Detaches a storage resource from a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDeviceDetachRequest storageDevice = new StorageDeviceDetachRequest(); // StorageDeviceDetachRequest | 
try {
    CreateServerResponse result = apiInstance.detachStorage(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#detachStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **storageDevice** | [**StorageDeviceDetachRequest**](StorageDeviceDetachRequest.md)|  |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ejectCdrom"></a>
# **ejectCdrom**
> ejectCdrom(serverId)

Eject CD-ROM

Ejects the storage from the CD-ROM device of a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
try {
    apiInstance.ejectCdrom(serverId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#ejectCdrom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |

### Return type

null (empty response body)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFirewallRule"></a>
# **getFirewallRule**
> FirewallRuleCreateResponse getFirewallRule(serverId, firewallRuleNumber)

Get firewall rule details

Returns detailed information about a specific firewall rule

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
BigDecimal firewallRuleNumber = new BigDecimal(); // BigDecimal | Denotes the index of the firewall rule in the server's firewall rule list
try {
    FirewallRuleCreateResponse result = apiInstance.getFirewallRule(serverId, firewallRuleNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **firewallRuleNumber** | **BigDecimal**| Denotes the index of the firewall rule in the server&#39;s firewall rule list |

### Return type

[**FirewallRuleCreateResponse**](FirewallRuleCreateResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listServerConfigurations"></a>
# **listServerConfigurations**
> ConfigurationListResponse listServerConfigurations()

List server configurations

Returns a list of available server configurations. A server configuration consists of a combination of CPU core count and main memory amount. All servers are created using these configurations.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
try {
    ConfigurationListResponse result = apiInstance.listServerConfigurations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#listServerConfigurations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigurationListResponse**](ConfigurationListResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listServers"></a>
# **listServers**
> ServerListResponse listServers()

List of servers

Returns a list of all servers associated with the current account.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
try {
    ServerListResponse result = apiInstance.listServers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#listServers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadCdrom"></a>
# **loadCdrom**
> CreateServerResponse loadCdrom(serverId, storageDevice)

Load CD-ROM

Loads a storage as a CD-ROM in the CD-ROM device of a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDeviceLoadRequest storageDevice = new StorageDeviceLoadRequest(); // StorageDeviceLoadRequest | 
try {
    CreateServerResponse result = apiInstance.loadCdrom(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#loadCdrom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **storageDevice** | [**StorageDeviceLoadRequest**](StorageDeviceLoadRequest.md)|  | [optional]

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyServer"></a>
# **modifyServer**
> CreateServerResponse modifyServer(serverId, server)

Modify server

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to modify
Server server = new Server(); // Server | 
try {
    CreateServerResponse result = apiInstance.modifyServer(serverId, server);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#modifyServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to modify |
 **server** | [**Server**](Server.md)|  | [optional]

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restartServer"></a>
# **restartServer**
> CreateServerResponse restartServer(serverId, restartServer)

Restart server

Stops and starts a server. The server state must be &#x60;started&#x60;.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.ServerApi;


ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to restart
RestartServer restartServer = new RestartServer(); // RestartServer | 
try {
    CreateServerResponse result = apiInstance.restartServer(serverId, restartServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#restartServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to restart |
 **restartServer** | [**RestartServer**](RestartServer.md)|  |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="serverDetails"></a>
# **serverDetails**
> CreateServerResponse serverDetails(serverId)

Get server details

Returns detailed information about a specific server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to return
try {
    CreateServerResponse result = apiInstance.serverDetails(serverId);
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

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="serverServerIdFirewallRuleGet"></a>
# **serverServerIdFirewallRuleGet**
> FirewallRuleListResponse serverServerIdFirewallRuleGet(serverId)

List firewall rules

Returns a list of firewall rules for a specific server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
try {
    FirewallRuleListResponse result = apiInstance.serverServerIdFirewallRuleGet(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#serverServerIdFirewallRuleGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |

### Return type

[**FirewallRuleListResponse**](FirewallRuleListResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startServer"></a>
# **startServer**
> CreateServerResponse startServer(serverId)

Start server

Starts a stopped server. The server state must be &#x60;stopped&#x60;.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to start
try {
    CreateServerResponse result = apiInstance.startServer(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#startServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to start |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopServer"></a>
# **stopServer**
> CreateServerResponse stopServer(serverId, stopServerRequest)

Stop server

Stops a started server. The server state must be &#x60;started&#x60;.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Id of server to stop
StopServer stopServerRequest = new StopServer(); // StopServer | 
try {
    CreateServerResponse result = apiInstance.stopServer(serverId, stopServerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#stopServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Id of server to stop |
 **stopServerRequest** | [**StopServer**](StopServer.md)|  |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="untag"></a>
# **untag**
> CreateServerResponse untag(serverId, tagName)

Remove tag from server

Untags tags from given server. The tag(s) must exist

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
UUID serverId = new UUID(); // UUID | Server id
String tagName = "tagName_example"; // String | Tag name
try {
    CreateServerResponse result = apiInstance.untag(serverId, tagName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#untag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **tagName** | **String**| Tag name |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


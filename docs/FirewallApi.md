# FirewallApi

All URIs are relative to *https://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFirewallRule**](FirewallApi.md#createFirewallRule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
[**deleteFirewallRule**](FirewallApi.md#deleteFirewallRule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
[**getFirewallRule**](FirewallApi.md#getFirewallRule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
[**serverServerIdFirewallRuleGet**](FirewallApi.md#serverServerIdFirewallRuleGet) | **GET** /server/{serverId}/firewall_rule | List firewall rules


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
//import com.upcloud.client.api.FirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
FirewallRuleRequest firewallRule = new FirewallRuleRequest(); // FirewallRuleRequest | 
try {
    FirewallRuleCreateResponse result = apiInstance.createFirewallRule(serverId, firewallRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#createFirewallRule");
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
//import com.upcloud.client.api.FirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
BigDecimal firewallRuleNumber = new BigDecimal(); // BigDecimal | Denotes the index of the firewall rule in the server's firewall rule list
try {
    apiInstance.deleteFirewallRule(serverId, firewallRuleNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#deleteFirewallRule");
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
//import com.upcloud.client.api.FirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
BigDecimal firewallRuleNumber = new BigDecimal(); // BigDecimal | Denotes the index of the firewall rule in the server's firewall rule list
try {
    FirewallRuleCreateResponse result = apiInstance.getFirewallRule(serverId, firewallRuleNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#getFirewallRule");
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
//import com.upcloud.client.api.FirewallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
try {
    FirewallRuleListResponse result = apiInstance.serverServerIdFirewallRuleGet(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#serverServerIdFirewallRuleGet");
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


# FirewallApi

All URIs are relative to *http://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFirewallRule**](FirewallApi.md#createFirewallRule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
[**deleteFirewallRule**](FirewallApi.md#deleteFirewallRule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
[**getFirewallRule**](FirewallApi.md#getFirewallRule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
[**serverServerIdFirewallRuleGet**](FirewallApi.md#serverServerIdFirewallRuleGet) | **GET** /server/{serverId}/firewall_rule | List firewall rules


<a name="createFirewallRule"></a>
# **createFirewallRule**
> createFirewallRule(serverId, firewallRule)

Create firewall rule

Creates a new firewall rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FirewallApi;


FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
FirewallRule firewallRule = new FirewallRule(); // FirewallRule | 
try {
    apiInstance.createFirewallRule(serverId, firewallRule);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#createFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **firewallRule** | [**FirewallRule**](FirewallRule.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FirewallApi;


FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
UUID firewallRuleNumber = new UUID(); // UUID | Denotes the index of the firewall rule in the server's firewall rule list
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
 **firewallRuleNumber** | **UUID**| Denotes the index of the firewall rule in the server&#39;s firewall rule list |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFirewallRule"></a>
# **getFirewallRule**
> FirewallRuleDetailsResponse getFirewallRule(serverId, firewallRuleNumber)

Get firewall rule details

Returns detailed information about a specific firewall rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FirewallApi;


FirewallApi apiInstance = new FirewallApi();
UUID serverId = new UUID(); // UUID | Server id
UUID firewallRuleNumber = new UUID(); // UUID | Denotes the index of the firewall rule in the server's firewall rule list
try {
    FirewallRuleDetailsResponse result = apiInstance.getFirewallRule(serverId, firewallRuleNumber);
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
 **firewallRuleNumber** | **UUID**| Denotes the index of the firewall rule in the server&#39;s firewall rule list |

### Return type

[**FirewallRuleDetailsResponse**](FirewallRuleDetailsResponse.md)

### Authorization

No authorization required

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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FirewallApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# FirewallApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serverServerIdFirewallRuleFirewallRuleNumberDelete**](FirewallApi.md#serverServerIdFirewallRuleFirewallRuleNumberDelete) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
[**serverServerIdFirewallRuleFirewallRuleNumberGet**](FirewallApi.md#serverServerIdFirewallRuleFirewallRuleNumberGet) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
[**serverServerIdFirewallRuleGet**](FirewallApi.md#serverServerIdFirewallRuleGet) | **GET** /server/{serverId}/firewall_rule | List firewall rules
[**serverServerIdFirewallRulePost**](FirewallApi.md#serverServerIdFirewallRulePost) | **POST** /server/{serverId}/firewall_rule | Create firewall rule


<a name="serverServerIdFirewallRuleFirewallRuleNumberDelete"></a>
# **serverServerIdFirewallRuleFirewallRuleNumberDelete**
> serverServerIdFirewallRuleFirewallRuleNumberDelete(serverId, firewallRuleNumber)

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
    apiInstance.serverServerIdFirewallRuleFirewallRuleNumberDelete(serverId, firewallRuleNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#serverServerIdFirewallRuleFirewallRuleNumberDelete");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdFirewallRuleFirewallRuleNumberGet"></a>
# **serverServerIdFirewallRuleFirewallRuleNumberGet**
> InlineResponse2008 serverServerIdFirewallRuleFirewallRuleNumberGet(serverId, firewallRuleNumber)

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
    InlineResponse2008 result = apiInstance.serverServerIdFirewallRuleFirewallRuleNumberGet(serverId, firewallRuleNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#serverServerIdFirewallRuleFirewallRuleNumberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **firewallRuleNumber** | **UUID**| Denotes the index of the firewall rule in the server&#39;s firewall rule list |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdFirewallRuleGet"></a>
# **serverServerIdFirewallRuleGet**
> InlineResponse2007 serverServerIdFirewallRuleGet(serverId)

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
    InlineResponse2007 result = apiInstance.serverServerIdFirewallRuleGet(serverId);
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdFirewallRulePost"></a>
# **serverServerIdFirewallRulePost**
> serverServerIdFirewallRulePost(serverId, firewallRule)

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
    apiInstance.serverServerIdFirewallRulePost(serverId, firewallRule);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallApi#serverServerIdFirewallRulePost");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined


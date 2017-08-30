# TagApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serverServerIdTagTagListPost**](TagApi.md#serverServerIdTagTagListPost) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
[**serverServerIdUntagTagNamePost**](TagApi.md#serverServerIdUntagTagNamePost) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server
[**tagGet**](TagApi.md#tagGet) | **GET** /tag | List existing tags
[**tagPost**](TagApi.md#tagPost) | **POST** /tag | Create a new tag
[**tagTagNameDelete**](TagApi.md#tagTagNameDelete) | **DELETE** /tag/{tagName} | Delete tag
[**tagTagNamePut**](TagApi.md#tagTagNamePut) | **PUT** /tag/{tagName} | Modify existing tag


<a name="serverServerIdTagTagListPost"></a>
# **serverServerIdTagTagListPost**
> ServerListResponse serverServerIdTagTagListPost(serverId, tagList)

Assign tag to a server

Servers can be tagged with one or more tags. The tags used must exist

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
UUID serverId = new UUID(); // UUID | Server id
String tagList = "tagList_example"; // String | List of tags
try {
    ServerListResponse result = apiInstance.serverServerIdTagTagListPost(serverId, tagList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#serverServerIdTagTagListPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **tagList** | **String**| List of tags |

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdUntagTagNamePost"></a>
# **serverServerIdUntagTagNamePost**
> ServerListResponse serverServerIdUntagTagNamePost(serverId, tagName)

Remove tag from server

Untags tags from given server. The tag(s) must exist

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
UUID serverId = new UUID(); // UUID | Server id
String tagName = "tagName_example"; // String | Tag name
try {
    ServerListResponse result = apiInstance.serverServerIdUntagTagNamePost(serverId, tagName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#serverServerIdUntagTagNamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **tagName** | **String**| Tag name |

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="tagGet"></a>
# **tagGet**
> InlineResponse2009 tagGet()

List existing tags

Returns all existing tags with their properties and servers tagged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
try {
    InlineResponse2009 result = apiInstance.tagGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="tagPost"></a>
# **tagPost**
> InlineResponse20010 tagPost(tag)

Create a new tag

Creates a new tag. Existing servers can be tagged in same request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
Tag tag = new Tag(); // Tag | 
try {
    InlineResponse20010 result = apiInstance.tagPost(tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | [**Tag**](Tag.md)|  |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="tagTagNameDelete"></a>
# **tagTagNameDelete**
> tagTagNameDelete(tagName)

Delete tag

Deleting existing tag untags all servers from specified tag and deletes tag definition

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String tagName = "tagName_example"; // String | Tag name
try {
    apiInstance.tagTagNameDelete(tagName);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| Tag name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="tagTagNamePut"></a>
# **tagTagNamePut**
> InlineResponse20010 tagTagNamePut(tagName, tag)

Modify existing tag

Changes attributes of an existing tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
String tagName = "tagName_example"; // String | Tag name
Tag1 tag = new Tag1(); // Tag1 | 
try {
    InlineResponse20010 result = apiInstance.tagTagNamePut(tagName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#tagTagNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| Tag name |
 **tag** | [**Tag1**](Tag1.md)|  |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


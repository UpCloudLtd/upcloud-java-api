# TagApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignTag**](TagApi.md#assignTag) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
[**createTag**](TagApi.md#createTag) | **POST** /tag | Create a new tag
[**deleteTag**](TagApi.md#deleteTag) | **DELETE** /tag/{tagName} | Delete tag
[**listTags**](TagApi.md#listTags) | **GET** /tag | List existing tags
[**modifyTag**](TagApi.md#modifyTag) | **PUT** /tag/{tagName} | Modify existing tag
[**untag**](TagApi.md#untag) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server


<a name="assignTag"></a>
# **assignTag**
> ServerListResponse assignTag(serverId, tagList)

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
    ServerListResponse result = apiInstance.assignTag(serverId, tagList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#assignTag");
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

<a name="createTag"></a>
# **createTag**
> CreateNewTagResponse createTag(tag)

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
    CreateNewTagResponse result = apiInstance.createTag(tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#createTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | [**Tag**](Tag.md)|  |

### Return type

[**CreateNewTagResponse**](CreateNewTagResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(tagName)

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
    apiInstance.deleteTag(tagName);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#deleteTag");
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

<a name="listTags"></a>
# **listTags**
> TagListResponse listTags()

List existing tags

Returns all existing tags with their properties and servers tagged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagApi;


TagApi apiInstance = new TagApi();
try {
    TagListResponse result = apiInstance.listTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#listTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TagListResponse**](TagListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="modifyTag"></a>
# **modifyTag**
> CreateNewTagResponse modifyTag(tagName, tag)

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
    CreateNewTagResponse result = apiInstance.modifyTag(tagName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#modifyTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| Tag name |
 **tag** | [**Tag1**](Tag1.md)|  |

### Return type

[**CreateNewTagResponse**](CreateNewTagResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="untag"></a>
# **untag**
> ServerListResponse untag(serverId, tagName)

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
    ServerListResponse result = apiInstance.untag(serverId, tagName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#untag");
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


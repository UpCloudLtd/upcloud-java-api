# TagApi

All URIs are relative to *https://api.upcloud.com/1.2*

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
//import com.upcloud.client.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

TagApi apiInstance = new TagApi();
UUID serverId = new UUID(); // UUID | Server id
String tagList = "tagList_example"; // String | List of tags
try {
    CreateServerResponse result = apiInstance.assignTag(serverId, tagList);
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

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTag"></a>
# **createTag**
> CreateNewTagResponse createTag(tag)

Create a new tag

Creates a new tag. Existing servers can be tagged in same request

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

TagApi apiInstance = new TagApi();
TagCreateRequest tag = new TagCreateRequest(); // TagCreateRequest | 
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
 **tag** | [**TagCreateRequest**](TagCreateRequest.md)|  |

### Return type

[**CreateNewTagResponse**](CreateNewTagResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(tagName)

Delete tag

Deleting existing tag untags all servers from specified tag and deletes tag definition

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTags"></a>
# **listTags**
> TagListResponse listTags()

List existing tags

Returns all existing tags with their properties and servers tagged

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyTag"></a>
# **modifyTag**
> CreateNewTagResponse modifyTag(tagName, tag)

Modify existing tag

Changes attributes of an existing tag

### Example
```java
// Import classes:
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

TagApi apiInstance = new TagApi();
String tagName = "tagName_example"; // String | Tag name
ModifyTagRequest tag = new ModifyTagRequest(); // ModifyTagRequest | 
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
 **tag** | [**ModifyTagRequest**](ModifyTagRequest.md)|  |

### Return type

[**CreateNewTagResponse**](CreateNewTagResponse.md)

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
//import com.upcloud.client.api.TagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

TagApi apiInstance = new TagApi();
UUID serverId = new UUID(); // UUID | Server id
String tagName = "tagName_example"; // String | Tag name
try {
    CreateServerResponse result = apiInstance.untag(serverId, tagName);
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

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


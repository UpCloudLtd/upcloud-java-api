# StorageApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listStorages**](StorageApi.md#listStorages) | **GET** /storage | List of storages
[**listStorages_0**](StorageApi.md#listStorages_0) | **GET** /storage/{type} | List of storages by type
[**serverServerIdStorageAttachPost**](StorageApi.md#serverServerIdStorageAttachPost) | **POST** /server/{serverId}/storage/attach | Attach storage
[**serverServerIdStorageCdromEjectPost**](StorageApi.md#serverServerIdStorageCdromEjectPost) | **POST** /server/{serverId}/storage/cdrom/eject | Eject CD-ROM
[**serverServerIdStorageCdromLoadPost**](StorageApi.md#serverServerIdStorageCdromLoadPost) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
[**serverServerIdStorageDetachPost**](StorageApi.md#serverServerIdStorageDetachPost) | **POST** /server/{serverId}/storage/detach | Detach storage
[**storagePost**](StorageApi.md#storagePost) | **POST** /storage | Create storage
[**storageStorageIdBackupPost**](StorageApi.md#storageStorageIdBackupPost) | **POST** /storage/{storageId}/backup | Create backup
[**storageStorageIdCancelPost**](StorageApi.md#storageStorageIdCancelPost) | **POST** /storage/{storageId}/cancel | Cancel storage operation
[**storageStorageIdClonePost**](StorageApi.md#storageStorageIdClonePost) | **POST** /storage/{storageId}/clone | Clone storage
[**storageStorageIdDelete**](StorageApi.md#storageStorageIdDelete) | **DELETE** /storage/{storageId} | Delete storage
[**storageStorageIdFavoriteDelete**](StorageApi.md#storageStorageIdFavoriteDelete) | **DELETE** /storage/{storageId}/favorite | Remove storage from favorites
[**storageStorageIdFavoritePost**](StorageApi.md#storageStorageIdFavoritePost) | **POST** /storage/{storageId}/favorite | Add storage to favorites
[**storageStorageIdGet**](StorageApi.md#storageStorageIdGet) | **GET** /storage/{storageId} | Get storage details
[**storageStorageIdPut**](StorageApi.md#storageStorageIdPut) | **PUT** /storage/{storageId} | Modify storage
[**storageStorageIdRestorePost**](StorageApi.md#storageStorageIdRestorePost) | **POST** /storage/{storageId}/restore | Restore backup
[**storageStorageIdTemplatizePost**](StorageApi.md#storageStorageIdTemplatizePost) | **POST** /storage/{storageId}/templatize | Templatize storage


<a name="listStorages"></a>
# **listStorages**
> SuccessStoragesResponse listStorages()

List of storages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
try {
    SuccessStoragesResponse result = apiInstance.listStorages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listStorages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SuccessStoragesResponse**](SuccessStoragesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorages_0"></a>
# **listStorages_0**
> SuccessStoragesResponse listStorages_0(type)

List of storages by type

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
String type = "type_example"; // String | Storage's access type (`public` or `private`) or storage type (`normal`, `backup`, `cdrom` or `template`) or `favorite` status
try {
    SuccessStoragesResponse result = apiInstance.listStorages_0(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listStorages_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Storage&#39;s access type (&#x60;public&#x60; or &#x60;private&#x60;) or storage type (&#x60;normal&#x60;, &#x60;backup&#x60;, &#x60;cdrom&#x60; or &#x60;template&#x60;) or &#x60;favorite&#x60; status | [enum: public, private, normal, backup, cdrom, template, favorite]

### Return type

[**SuccessStoragesResponse**](SuccessStoragesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serverServerIdStorageAttachPost"></a>
# **serverServerIdStorageAttachPost**
> ServerListResponse serverServerIdStorageAttachPost(serverId, storageDevice)

Attach storage

Attaches a storage as a device to a server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDevice storageDevice = new StorageDevice(); // StorageDevice | 
try {
    ServerListResponse result = apiInstance.serverServerIdStorageAttachPost(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#serverServerIdStorageAttachPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **storageDevice** | [**StorageDevice**](StorageDevice.md)|  |

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdStorageCdromEjectPost"></a>
# **serverServerIdStorageCdromEjectPost**
> ServerListResponse serverServerIdStorageCdromEjectPost(serverId)

Eject CD-ROM

Ejects the storage from the CD-ROM device of a server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
try {
    ServerListResponse result = apiInstance.serverServerIdStorageCdromEjectPost(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#serverServerIdStorageCdromEjectPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdStorageCdromLoadPost"></a>
# **serverServerIdStorageCdromLoadPost**
> ServerListResponse serverServerIdStorageCdromLoadPost(serverId, storageDevice)

Load CD-ROM

Loads a storage as a CD-ROM in the CD-ROM device of a server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDevice1 storageDevice = new StorageDevice1(); // StorageDevice1 | 
try {
    ServerListResponse result = apiInstance.serverServerIdStorageCdromLoadPost(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#serverServerIdStorageCdromLoadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **storageDevice** | [**StorageDevice1**](StorageDevice1.md)|  | [optional]

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="serverServerIdStorageDetachPost"></a>
# **serverServerIdStorageDetachPost**
> ServerListResponse serverServerIdStorageDetachPost(serverId, storageDevice)

Detach storage

Detaches a storage resource from a server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDevice storageDevice = new StorageDevice(); // StorageDevice | 
try {
    ServerListResponse result = apiInstance.serverServerIdStorageDetachPost(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#serverServerIdStorageDetachPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **UUID**| Server id |
 **storageDevice** | [**StorageDevice**](StorageDevice.md)|  |

### Return type

[**ServerListResponse**](ServerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storagePost"></a>
# **storagePost**
> InlineResponse201 storagePost(storage)

Create storage

Creates a new storage resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
Storage storage = new Storage(); // Storage | 
try {
    InlineResponse201 result = apiInstance.storagePost(storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storagePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storage** | [**Storage**](Storage.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdBackupPost"></a>
# **storageStorageIdBackupPost**
> InlineResponse201 storageStorageIdBackupPost(storageId, storage)

Create backup

Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
Storage4 storage = new Storage4(); // Storage4 | 
try {
    InlineResponse201 result = apiInstance.storageStorageIdBackupPost(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdBackupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |
 **storage** | [**Storage4**](Storage4.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdCancelPost"></a>
# **storageStorageIdCancelPost**
> storageStorageIdCancelPost(storageId)

Cancel storage operation

Cancels a running cloning operation and deletes the incomplete copy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Strage id
try {
    apiInstance.storageStorageIdCancelPost(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Strage id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdClonePost"></a>
# **storageStorageIdClonePost**
> InlineResponse201 storageStorageIdClonePost(storageId, storage)

Clone storage

Creates an exact copy of an existing storage resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
Storage2 storage = new Storage2(); // Storage2 | 
try {
    InlineResponse201 result = apiInstance.storageStorageIdClonePost(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdClonePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |
 **storage** | [**Storage2**](Storage2.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdDelete"></a>
# **storageStorageIdDelete**
> storageStorageIdDelete(storageId)

Delete storage

Deleted an existing storage resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
try {
    apiInstance.storageStorageIdDelete(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdFavoriteDelete"></a>
# **storageStorageIdFavoriteDelete**
> storageStorageIdFavoriteDelete(storageId)

Remove storage from favorites

Delete a storage from the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
try {
    apiInstance.storageStorageIdFavoriteDelete(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdFavoriteDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdFavoritePost"></a>
# **storageStorageIdFavoritePost**
> storageStorageIdFavoritePost(storageId)

Add storage to favorites

Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
try {
    apiInstance.storageStorageIdFavoritePost(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdFavoritePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdGet"></a>
# **storageStorageIdGet**
> InlineResponse201 storageStorageIdGet(storageId)

Get storage details

Returns detailed information about a specific storage resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
try {
    InlineResponse201 result = apiInstance.storageStorageIdGet(storageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdPut"></a>
# **storageStorageIdPut**
> InlineResponse201 storageStorageIdPut(storageId, storage)

Modify storage

Modifies an existing storage resource. This operation is used to rename or resize the storage.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
Storage1 storage = new Storage1(); // Storage1 | 
try {
    InlineResponse201 result = apiInstance.storageStorageIdPut(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**|  |
 **storage** | [**Storage1**](Storage1.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageStorageIdRestorePost"></a>
# **storageStorageIdRestorePost**
> storageStorageIdRestorePost(storageId)

Restore backup

Restores the origin storage with data from the specified backup storage.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
try {
    apiInstance.storageStorageIdRestorePost(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdRestorePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageStorageIdTemplatizePost"></a>
# **storageStorageIdTemplatizePost**
> InlineResponse201 storageStorageIdTemplatizePost(storageId, storage)

Templatize storage

Creates an exact copy of an existing storage resource which can be used as a template for creating new servers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
Storage3 storage = new Storage3(); // Storage3 | 
try {
    InlineResponse201 result = apiInstance.storageStorageIdTemplatizePost(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageStorageIdTemplatizePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |
 **storage** | [**Storage3**](Storage3.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


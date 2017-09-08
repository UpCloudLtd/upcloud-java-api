# StorageApi

All URIs are relative to *http://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachStorage**](StorageApi.md#attachStorage) | **POST** /server/{serverId}/storage/attach | Attach storage
[**backupStorage**](StorageApi.md#backupStorage) | **POST** /storage/{storageId}/backup | Create backup
[**cancelOperation**](StorageApi.md#cancelOperation) | **POST** /storage/{storageId}/cancel | Cancel storage operation
[**cloneStorage**](StorageApi.md#cloneStorage) | **POST** /storage/{storageId}/clone | Clone storage
[**createStorage**](StorageApi.md#createStorage) | **POST** /storage | Create storage
[**deleteStorage**](StorageApi.md#deleteStorage) | **DELETE** /storage/{storageId} | Delete storage
[**detachStorage**](StorageApi.md#detachStorage) | **POST** /server/{serverId}/storage/detach | Detach storage
[**ejectCdrom**](StorageApi.md#ejectCdrom) | **POST** /server/{serverId}/storage/cdrom/eject | Eject CD-ROM
[**favoriteStorage**](StorageApi.md#favoriteStorage) | **POST** /storage/{storageId}/favorite | Add storage to favorites
[**getStorageDetails**](StorageApi.md#getStorageDetails) | **GET** /storage/{storageId} | Get storage details
[**listStorageTypes**](StorageApi.md#listStorageTypes) | **GET** /storage/{type}/ | List of storages by type
[**listStorages**](StorageApi.md#listStorages) | **GET** /storage | List of storages
[**loadCdrom**](StorageApi.md#loadCdrom) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
[**modifyStorage**](StorageApi.md#modifyStorage) | **PUT** /storage/{storageId} | Modify storage
[**restoreStorage**](StorageApi.md#restoreStorage) | **POST** /storage/{storageId}/restore | Restore backup
[**templatizeStorage**](StorageApi.md#templatizeStorage) | **POST** /storage/{storageId}/templatize | Templatize storage
[**unfavoriteStorage**](StorageApi.md#unfavoriteStorage) | **DELETE** /storage/{storageId}/favorite | Remove storage from favorites


<a name="attachStorage"></a>
# **attachStorage**
> ServerListResponse attachStorage(serverId, storageDevice)

Attach storage

Attaches a storage as a device to a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDevice storageDevice = new StorageDevice(); // StorageDevice | 
try {
    ServerListResponse result = apiInstance.attachStorage(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#attachStorage");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupStorage"></a>
# **backupStorage**
> CreateStorageResponse backupStorage(storageId, storage)

Create backup

Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
Storage4 storage = new Storage4(); // Storage4 | 
try {
    CreateStorageResponse result = apiInstance.backupStorage(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#backupStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |
 **storage** | [**Storage4**](Storage4.md)|  | [optional]

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelOperation"></a>
# **cancelOperation**
> cancelOperation(storageId)

Cancel storage operation

Cancels a running cloning operation and deletes the incomplete copy.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Strage id
try {
    apiInstance.cancelOperation(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#cancelOperation");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneStorage"></a>
# **cloneStorage**
> CreateStorageResponse cloneStorage(storageId, storage)

Clone storage

Creates an exact copy of an existing storage resource.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
Storage2 storage = new Storage2(); // Storage2 | 
try {
    CreateStorageResponse result = apiInstance.cloneStorage(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#cloneStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |
 **storage** | [**Storage2**](Storage2.md)|  | [optional]

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStorage"></a>
# **createStorage**
> CreateStorageResponse createStorage(storage)

Create storage

Creates a new storage resource.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
Storage storage = new Storage(); // Storage | 
try {
    CreateStorageResponse result = apiInstance.createStorage(storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storage** | [**Storage**](Storage.md)|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStorage"></a>
# **deleteStorage**
> deleteStorage(storageId)

Delete storage

Deleted an existing storage resource.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
try {
    apiInstance.deleteStorage(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteStorage");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detachStorage"></a>
# **detachStorage**
> ServerListResponse detachStorage(serverId, storageDevice)

Detach storage

Detaches a storage resource from a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDevice storageDevice = new StorageDevice(); // StorageDevice | 
try {
    ServerListResponse result = apiInstance.detachStorage(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#detachStorage");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ejectCdrom"></a>
# **ejectCdrom**
> ServerListResponse ejectCdrom(serverId)

Eject CD-ROM

Ejects the storage from the CD-ROM device of a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
try {
    ServerListResponse result = apiInstance.ejectCdrom(serverId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#ejectCdrom");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="favoriteStorage"></a>
# **favoriteStorage**
> favoriteStorage(storageId)

Add storage to favorites

Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
try {
    apiInstance.favoriteStorage(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#favoriteStorage");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStorageDetails"></a>
# **getStorageDetails**
> CreateStorageResponse getStorageDetails(storageId)

Get storage details

Returns detailed information about a specific storage resource.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
try {
    CreateStorageResponse result = apiInstance.getStorageDetails(storageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getStorageDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStorageTypes"></a>
# **listStorageTypes**
> SuccessStoragesResponse listStorageTypes(type)

List of storages by type

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
String type = "type_example"; // String | Storage's access type (`public` or `private`) or storage type (`normal`, `backup`, `cdrom` or `template`) or `favorite` status
try {
    SuccessStoragesResponse result = apiInstance.listStorageTypes(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listStorageTypes");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStorages"></a>
# **listStorages**
> SuccessStoragesResponse listStorages()

List of storages

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadCdrom"></a>
# **loadCdrom**
> ServerListResponse loadCdrom(serverId, storageDevice)

Load CD-ROM

Loads a storage as a CD-ROM in the CD-ROM device of a server.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDevice1 storageDevice = new StorageDevice1(); // StorageDevice1 | 
try {
    ServerListResponse result = apiInstance.loadCdrom(serverId, storageDevice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#loadCdrom");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyStorage"></a>
# **modifyStorage**
> CreateStorageResponse modifyStorage(storageId, storage)

Modify storage

Modifies an existing storage resource. This operation is used to rename or resize the storage.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
Storage1 storage = new Storage1(); // Storage1 | 
try {
    CreateStorageResponse result = apiInstance.modifyStorage(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#modifyStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**|  |
 **storage** | [**Storage1**](Storage1.md)|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreStorage"></a>
# **restoreStorage**
> restoreStorage(storageId)

Restore backup

Restores the origin storage with data from the specified backup storage.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
try {
    apiInstance.restoreStorage(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#restoreStorage");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatizeStorage"></a>
# **templatizeStorage**
> CreateStorageResponse templatizeStorage(storageId, storage)

Templatize storage

Creates an exact copy of an existing storage resource which can be used as a template for creating new servers.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
Storage3 storage = new Storage3(); // Storage3 | 
try {
    CreateStorageResponse result = apiInstance.templatizeStorage(storageId, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#templatizeStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **UUID**| Storage id |
 **storage** | [**Storage3**](Storage3.md)|  | [optional]

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unfavoriteStorage"></a>
# **unfavoriteStorage**
> unfavoriteStorage(storageId)

Remove storage from favorites

Delete a storage from the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
try {
    apiInstance.unfavoriteStorage(storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#unfavoriteStorage");
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

 - **Content-Type**: application/json
 - **Accept**: application/json


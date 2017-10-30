# StorageApi

All URIs are relative to *https://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachStorage**](StorageApi.md#attachStorage) | **POST** /server/{serverId}/storage/attach | Attach storage
[**backupStorage**](StorageApi.md#backupStorage) | **POST** /storage/{storageId}/backup | Create backup
[**cancelOperation**](StorageApi.md#cancelOperation) | **POST** /storage/{storageId}/cancel | Cancel storage operation
[**cloneStorage**](StorageApi.md#cloneStorage) | **POST** /storage/{storageId}/clone | Clone storage
[**createStorage**](StorageApi.md#createStorage) | **POST** /storage | Create storage
[**deleteStorage**](StorageApi.md#deleteStorage) | **DELETE** /storage/{storageId} | Delete storage
[**detachStorage**](StorageApi.md#detachStorage) | **POST** /server/{serverId}/storage/detach | Detach storage
[**ejectCdrom**](StorageApi.md#ejectCdrom) | **POST** /server/{serverId}/cdrom/eject | Eject CD-ROM
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
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
AttachStorageDeviceRequest storageDevice = new AttachStorageDeviceRequest(); // AttachStorageDeviceRequest | 
try {
    CreateServerResponse result = apiInstance.attachStorage(serverId, storageDevice);
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
 **storageDevice** | [**AttachStorageDeviceRequest**](AttachStorageDeviceRequest.md)|  |

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
CreateBackupStorageRequest storage = new CreateBackupStorageRequest(); // CreateBackupStorageRequest | 
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
 **storage** | [**CreateBackupStorageRequest**](CreateBackupStorageRequest.md)|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
CloneStorageRequest storage = new CloneStorageRequest(); // CloneStorageRequest | 
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
 **storage** | [**CloneStorageRequest**](CloneStorageRequest.md)|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
CreateStorageRequest storage = new CreateStorageRequest(); // CreateStorageRequest | 
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
 **storage** | [**CreateStorageRequest**](CreateStorageRequest.md)|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDeviceDetachRequest storageDevice = new StorageDeviceDetachRequest(); // StorageDeviceDetachRequest | 
try {
    CreateServerResponse result = apiInstance.detachStorage(serverId, storageDevice);
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
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
try {
    apiInstance.ejectCdrom(serverId);
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

null (empty response body)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID serverId = new UUID(); // UUID | Server id
StorageDeviceLoadRequest storageDevice = new StorageDeviceLoadRequest(); // StorageDeviceLoadRequest | 
try {
    CreateServerResponse result = apiInstance.loadCdrom(serverId, storageDevice);
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
 **storageDevice** | [**StorageDeviceLoadRequest**](StorageDeviceLoadRequest.md)|  | [optional]

### Return type

[**CreateServerResponse**](CreateServerResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | 
ModifyStorageRequest storage = new ModifyStorageRequest(); // ModifyStorageRequest | 
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
 **storage** | [**ModifyStorageRequest**](ModifyStorageRequest.md)|  |

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

StorageApi apiInstance = new StorageApi();
UUID storageId = new UUID(); // UUID | Storage id
TemplitizeStorageRequest storage = new TemplitizeStorageRequest(); // TemplitizeStorageRequest | 
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
 **storage** | [**TemplitizeStorageRequest**](TemplitizeStorageRequest.md)|  | [optional]

### Return type

[**CreateStorageResponse**](CreateStorageResponse.md)

### Authorization

[baseAuth](../README.md#baseAuth)

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
//import com.upcloud.client.ApiClient;
//import com.upcloud.client.ApiException;
//import com.upcloud.client.Configuration;
//import com.upcloud.client.auth.*;
//import com.upcloud.client.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: baseAuth
HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
baseAuth.setUsername("YOUR USERNAME");
baseAuth.setPassword("YOUR PASSWORD");

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

[baseAuth](../README.md#baseAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


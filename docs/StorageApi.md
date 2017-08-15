# StorageApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storageGet**](StorageApi.md#storageGet) | **GET** /storage | List of storages


<a name="storageGet"></a>
# **storageGet**
> InlineResponse2002 storageGet()

List of storages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StorageApi;


StorageApi apiInstance = new StorageApi();
try {
    InlineResponse2002 result = apiInstance.storageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


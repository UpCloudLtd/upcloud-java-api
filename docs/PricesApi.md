# PricesApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPrices**](PricesApi.md#listPrices) | **GET** /price | List prices


<a name="listPrices"></a>
# **listPrices**
> InlineResponse200 listPrices()

List prices

Returns a list resource prices.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PricesApi;


PricesApi apiInstance = new PricesApi();
try {
    InlineResponse200 result = apiInstance.listPrices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#listPrices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


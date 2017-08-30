# PricesApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**priceGet**](PricesApi.md#priceGet) | **GET** /price | List prices


<a name="priceGet"></a>
# **priceGet**
> InlineResponse200 priceGet()

List prices

Returns a list resource prices.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PricesApi;


PricesApi apiInstance = new PricesApi();
try {
    InlineResponse200 result = apiInstance.priceGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#priceGet");
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


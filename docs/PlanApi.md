# PlanApi

All URIs are relative to *http://localhost/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlans**](PlanApi.md#listPlans) | **GET** /plan | List available plans


<a name="listPlans"></a>
# **listPlans**
> InlineResponse2003 listPlans()

List available plans

Returns a list of available plans.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlanApi;


PlanApi apiInstance = new PlanApi();
try {
    InlineResponse2003 result = apiInstance.listPlans();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanApi#listPlans");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


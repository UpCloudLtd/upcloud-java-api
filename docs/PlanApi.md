# PlanApi

All URIs are relative to *http://api.upcloud.com/1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlans**](PlanApi.md#listPlans) | **GET** /plan | List available plans


<a name="listPlans"></a>
# **listPlans**
> AvailablePlanListResponse listPlans()

List available plans

Returns a list of available plans.

### Example
```java
// Import classes:
//import com.upcloud.client.ApiException;
//import com.upcloud.client.api.PlanApi;


PlanApi apiInstance = new PlanApi();
try {
    AvailablePlanListResponse result = apiInstance.listPlans();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanApi#listPlans");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AvailablePlanListResponse**](AvailablePlanListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


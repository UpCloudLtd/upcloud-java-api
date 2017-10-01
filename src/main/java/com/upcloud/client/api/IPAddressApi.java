/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiCallback;
import com.upcloud.client.ApiClient;
import com.upcloud.client.ApiException;
import com.upcloud.client.ApiResponse;
import com.upcloud.client.Configuration;
import com.upcloud.client.Pair;
import com.upcloud.client.ProgressRequestBody;
import com.upcloud.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.upcloud.client.models.AddIpRequest;
import com.upcloud.client.models.AssignIpResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.IpAddressListResponse;
import com.upcloud.client.models.ModifyIpRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPAddressApi {
    private ApiClient apiClient;

    public IPAddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IPAddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addIp
     * @param ipAddress  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addIpCall(AddIpRequest ipAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ipAddress;
        
        // create path and map variables
        String localVarPath = "/ip_address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "baseAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addIpValidateBeforeCall(AddIpRequest ipAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = addIpCall(ipAddress, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Assign IP address
     * Assigns a new IP address to a server.
     * @param ipAddress  (optional)
     * @return AssignIpResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AssignIpResponse addIp(AddIpRequest ipAddress) throws ApiException {
        ApiResponse<AssignIpResponse> resp = addIpWithHttpInfo(ipAddress);
        return resp.getData();
    }

    /**
     * Assign IP address
     * Assigns a new IP address to a server.
     * @param ipAddress  (optional)
     * @return ApiResponse&lt;AssignIpResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AssignIpResponse> addIpWithHttpInfo(AddIpRequest ipAddress) throws ApiException {
        com.squareup.okhttp.Call call = addIpValidateBeforeCall(ipAddress, null, null);
        Type localVarReturnType = new TypeToken<AssignIpResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign IP address (asynchronously)
     * Assigns a new IP address to a server.
     * @param ipAddress  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addIpAsync(AddIpRequest ipAddress, final ApiCallback<AssignIpResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addIpValidateBeforeCall(ipAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AssignIpResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteIp
     * @param ip Ip address (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteIpCall(String ip, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ip_address/{ip}"
            .replaceAll("\\{" + "ip" + "\\}", apiClient.escapeString(ip.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "baseAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteIpValidateBeforeCall(String ip, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ip' is set
        if (ip == null) {
            throw new ApiException("Missing the required parameter 'ip' when calling deleteIp(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteIpCall(ip, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Release IP address
     * Removes an IP address from a server.
     * @param ip Ip address (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteIp(String ip) throws ApiException {
        deleteIpWithHttpInfo(ip);
    }

    /**
     * Release IP address
     * Removes an IP address from a server.
     * @param ip Ip address (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteIpWithHttpInfo(String ip) throws ApiException {
        com.squareup.okhttp.Call call = deleteIpValidateBeforeCall(ip, null, null);
        return apiClient.execute(call);
    }

    /**
     * Release IP address (asynchronously)
     * Removes an IP address from a server.
     * @param ip Ip address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteIpAsync(String ip, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteIpValidateBeforeCall(ip, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDetails
     * @param ip Ip address (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDetailsCall(String ip, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ip_address/{ip}"
            .replaceAll("\\{" + "ip" + "\\}", apiClient.escapeString(ip.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "baseAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDetailsValidateBeforeCall(String ip, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ip' is set
        if (ip == null) {
            throw new ApiException("Missing the required parameter 'ip' when calling getDetails(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getDetailsCall(ip, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get IP address details
     * Returns detailed information about a specific IP address.
     * @param ip Ip address (required)
     * @return AssignIpResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AssignIpResponse getDetails(String ip) throws ApiException {
        ApiResponse<AssignIpResponse> resp = getDetailsWithHttpInfo(ip);
        return resp.getData();
    }

    /**
     * Get IP address details
     * Returns detailed information about a specific IP address.
     * @param ip Ip address (required)
     * @return ApiResponse&lt;AssignIpResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AssignIpResponse> getDetailsWithHttpInfo(String ip) throws ApiException {
        com.squareup.okhttp.Call call = getDetailsValidateBeforeCall(ip, null, null);
        Type localVarReturnType = new TypeToken<AssignIpResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get IP address details (asynchronously)
     * Returns detailed information about a specific IP address.
     * @param ip Ip address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDetailsAsync(String ip, final ApiCallback<AssignIpResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDetailsValidateBeforeCall(ip, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AssignIpResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listIps
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listIpsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ip_address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "baseAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listIpsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = listIpsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List IP addresses
     * Returns a list of all IP addresses assigned to servers on the current user account.
     * @return IpAddressListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IpAddressListResponse listIps() throws ApiException {
        ApiResponse<IpAddressListResponse> resp = listIpsWithHttpInfo();
        return resp.getData();
    }

    /**
     * List IP addresses
     * Returns a list of all IP addresses assigned to servers on the current user account.
     * @return ApiResponse&lt;IpAddressListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IpAddressListResponse> listIpsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listIpsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<IpAddressListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List IP addresses (asynchronously)
     * Returns a list of all IP addresses assigned to servers on the current user account.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listIpsAsync(final ApiCallback<IpAddressListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listIpsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IpAddressListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyIp
     * @param ip Ip address (required)
     * @param ipAddress  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyIpCall(String ip, ModifyIpRequest ipAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ipAddress;
        
        // create path and map variables
        String localVarPath = "/ip_address/{ip}"
            .replaceAll("\\{" + "ip" + "\\}", apiClient.escapeString(ip.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "baseAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modifyIpValidateBeforeCall(String ip, ModifyIpRequest ipAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ip' is set
        if (ip == null) {
            throw new ApiException("Missing the required parameter 'ip' when calling modifyIp(Async)");
        }
        
        
        com.squareup.okhttp.Call call = modifyIpCall(ip, ipAddress, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Modify IP address
     * Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.
     * @param ip Ip address (required)
     * @param ipAddress  (optional)
     * @return AssignIpResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AssignIpResponse modifyIp(String ip, ModifyIpRequest ipAddress) throws ApiException {
        ApiResponse<AssignIpResponse> resp = modifyIpWithHttpInfo(ip, ipAddress);
        return resp.getData();
    }

    /**
     * Modify IP address
     * Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.
     * @param ip Ip address (required)
     * @param ipAddress  (optional)
     * @return ApiResponse&lt;AssignIpResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AssignIpResponse> modifyIpWithHttpInfo(String ip, ModifyIpRequest ipAddress) throws ApiException {
        com.squareup.okhttp.Call call = modifyIpValidateBeforeCall(ip, ipAddress, null, null);
        Type localVarReturnType = new TypeToken<AssignIpResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify IP address (asynchronously)
     * Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.
     * @param ip Ip address (required)
     * @param ipAddress  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyIpAsync(String ip, ModifyIpRequest ipAddress, final ApiCallback<AssignIpResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modifyIpValidateBeforeCall(ip, ipAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AssignIpResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

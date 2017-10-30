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


import com.upcloud.client.models.AttachStorageDeviceRequest;
import com.upcloud.client.models.CloneStorageRequest;
import com.upcloud.client.models.CreateBackupStorageRequest;
import com.upcloud.client.models.CreateServerResponse;
import com.upcloud.client.models.CreateStorageRequest;
import com.upcloud.client.models.CreateStorageResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.ModifyStorageRequest;
import com.upcloud.client.models.StorageDeviceDetachRequest;
import com.upcloud.client.models.StorageDeviceLoadRequest;
import com.upcloud.client.models.SuccessStoragesResponse;
import com.upcloud.client.models.TemplitizeStorageRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageApi {
    private ApiClient apiClient;

    public StorageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for attachStorage
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call attachStorageCall(UUID serverId, AttachStorageDeviceRequest storageDevice, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storageDevice;
        
        // create path and map variables
        String localVarPath = "/server/{serverId}/storage/attach"
            .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(serverId.toString()));

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
    private com.squareup.okhttp.Call attachStorageValidateBeforeCall(UUID serverId, AttachStorageDeviceRequest storageDevice, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling attachStorage(Async)");
        }
        
        // verify the required parameter 'storageDevice' is set
        if (storageDevice == null) {
            throw new ApiException("Missing the required parameter 'storageDevice' when calling attachStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = attachStorageCall(serverId, storageDevice, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Attach storage
     * Attaches a storage as a device to a server.
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @return CreateServerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateServerResponse attachStorage(UUID serverId, AttachStorageDeviceRequest storageDevice) throws ApiException {
        ApiResponse<CreateServerResponse> resp = attachStorageWithHttpInfo(serverId, storageDevice);
        return resp.getData();
    }

    /**
     * Attach storage
     * Attaches a storage as a device to a server.
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @return ApiResponse&lt;CreateServerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateServerResponse> attachStorageWithHttpInfo(UUID serverId, AttachStorageDeviceRequest storageDevice) throws ApiException {
        com.squareup.okhttp.Call call = attachStorageValidateBeforeCall(serverId, storageDevice, null, null);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Attach storage (asynchronously)
     * Attaches a storage as a device to a server.
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call attachStorageAsync(UUID serverId, AttachStorageDeviceRequest storageDevice, final ApiCallback<CreateServerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = attachStorageValidateBeforeCall(serverId, storageDevice, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for backupStorage
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call backupStorageCall(UUID storageId, CreateBackupStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storage;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/backup"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call backupStorageValidateBeforeCall(UUID storageId, CreateBackupStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling backupStorage(Async)");
        }
        
        // verify the required parameter 'storage' is set
        if (storage == null) {
            throw new ApiException("Missing the required parameter 'storage' when calling backupStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = backupStorageCall(storageId, storage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create backup
     * Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @return CreateStorageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateStorageResponse backupStorage(UUID storageId, CreateBackupStorageRequest storage) throws ApiException {
        ApiResponse<CreateStorageResponse> resp = backupStorageWithHttpInfo(storageId, storage);
        return resp.getData();
    }

    /**
     * Create backup
     * Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @return ApiResponse&lt;CreateStorageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateStorageResponse> backupStorageWithHttpInfo(UUID storageId, CreateBackupStorageRequest storage) throws ApiException {
        com.squareup.okhttp.Call call = backupStorageValidateBeforeCall(storageId, storage, null, null);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create backup (asynchronously)
     * Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call backupStorageAsync(UUID storageId, CreateBackupStorageRequest storage, final ApiCallback<CreateStorageResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = backupStorageValidateBeforeCall(storageId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cancelOperation
     * @param storageId Strage id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelOperationCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/cancel"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call cancelOperationValidateBeforeCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling cancelOperation(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cancelOperationCall(storageId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancel storage operation
     * Cancels a running cloning operation and deletes the incomplete copy.
     * @param storageId Strage id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cancelOperation(UUID storageId) throws ApiException {
        cancelOperationWithHttpInfo(storageId);
    }

    /**
     * Cancel storage operation
     * Cancels a running cloning operation and deletes the incomplete copy.
     * @param storageId Strage id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> cancelOperationWithHttpInfo(UUID storageId) throws ApiException {
        com.squareup.okhttp.Call call = cancelOperationValidateBeforeCall(storageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancel storage operation (asynchronously)
     * Cancels a running cloning operation and deletes the incomplete copy.
     * @param storageId Strage id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelOperationAsync(UUID storageId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelOperationValidateBeforeCall(storageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for cloneStorage
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloneStorageCall(UUID storageId, CloneStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storage;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/clone"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call cloneStorageValidateBeforeCall(UUID storageId, CloneStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling cloneStorage(Async)");
        }
        
        // verify the required parameter 'storage' is set
        if (storage == null) {
            throw new ApiException("Missing the required parameter 'storage' when calling cloneStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cloneStorageCall(storageId, storage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Clone storage
     * Creates an exact copy of an existing storage resource.
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @return CreateStorageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateStorageResponse cloneStorage(UUID storageId, CloneStorageRequest storage) throws ApiException {
        ApiResponse<CreateStorageResponse> resp = cloneStorageWithHttpInfo(storageId, storage);
        return resp.getData();
    }

    /**
     * Clone storage
     * Creates an exact copy of an existing storage resource.
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @return ApiResponse&lt;CreateStorageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateStorageResponse> cloneStorageWithHttpInfo(UUID storageId, CloneStorageRequest storage) throws ApiException {
        com.squareup.okhttp.Call call = cloneStorageValidateBeforeCall(storageId, storage, null, null);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clone storage (asynchronously)
     * Creates an exact copy of an existing storage resource.
     * @param storageId Storage id (required)
     * @param storage  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloneStorageAsync(UUID storageId, CloneStorageRequest storage, final ApiCallback<CreateStorageResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloneStorageValidateBeforeCall(storageId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createStorage
     * @param storage  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createStorageCall(CreateStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storage;
        
        // create path and map variables
        String localVarPath = "/storage";

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
    private com.squareup.okhttp.Call createStorageValidateBeforeCall(CreateStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storage' is set
        if (storage == null) {
            throw new ApiException("Missing the required parameter 'storage' when calling createStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createStorageCall(storage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create storage
     * Creates a new storage resource.
     * @param storage  (required)
     * @return CreateStorageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateStorageResponse createStorage(CreateStorageRequest storage) throws ApiException {
        ApiResponse<CreateStorageResponse> resp = createStorageWithHttpInfo(storage);
        return resp.getData();
    }

    /**
     * Create storage
     * Creates a new storage resource.
     * @param storage  (required)
     * @return ApiResponse&lt;CreateStorageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateStorageResponse> createStorageWithHttpInfo(CreateStorageRequest storage) throws ApiException {
        com.squareup.okhttp.Call call = createStorageValidateBeforeCall(storage, null, null);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create storage (asynchronously)
     * Creates a new storage resource.
     * @param storage  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createStorageAsync(CreateStorageRequest storage, final ApiCallback<CreateStorageResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createStorageValidateBeforeCall(storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteStorage
     * @param storageId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteStorageCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call deleteStorageValidateBeforeCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling deleteStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteStorageCall(storageId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete storage
     * Deleted an existing storage resource.
     * @param storageId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteStorage(UUID storageId) throws ApiException {
        deleteStorageWithHttpInfo(storageId);
    }

    /**
     * Delete storage
     * Deleted an existing storage resource.
     * @param storageId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteStorageWithHttpInfo(UUID storageId) throws ApiException {
        com.squareup.okhttp.Call call = deleteStorageValidateBeforeCall(storageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete storage (asynchronously)
     * Deleted an existing storage resource.
     * @param storageId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteStorageAsync(UUID storageId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteStorageValidateBeforeCall(storageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for detachStorage
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call detachStorageCall(UUID serverId, StorageDeviceDetachRequest storageDevice, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storageDevice;
        
        // create path and map variables
        String localVarPath = "/server/{serverId}/storage/detach"
            .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(serverId.toString()));

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
    private com.squareup.okhttp.Call detachStorageValidateBeforeCall(UUID serverId, StorageDeviceDetachRequest storageDevice, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling detachStorage(Async)");
        }
        
        // verify the required parameter 'storageDevice' is set
        if (storageDevice == null) {
            throw new ApiException("Missing the required parameter 'storageDevice' when calling detachStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = detachStorageCall(serverId, storageDevice, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Detach storage
     * Detaches a storage resource from a server.
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @return CreateServerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateServerResponse detachStorage(UUID serverId, StorageDeviceDetachRequest storageDevice) throws ApiException {
        ApiResponse<CreateServerResponse> resp = detachStorageWithHttpInfo(serverId, storageDevice);
        return resp.getData();
    }

    /**
     * Detach storage
     * Detaches a storage resource from a server.
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @return ApiResponse&lt;CreateServerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateServerResponse> detachStorageWithHttpInfo(UUID serverId, StorageDeviceDetachRequest storageDevice) throws ApiException {
        com.squareup.okhttp.Call call = detachStorageValidateBeforeCall(serverId, storageDevice, null, null);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detach storage (asynchronously)
     * Detaches a storage resource from a server.
     * @param serverId Server id (required)
     * @param storageDevice  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call detachStorageAsync(UUID serverId, StorageDeviceDetachRequest storageDevice, final ApiCallback<CreateServerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = detachStorageValidateBeforeCall(serverId, storageDevice, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ejectCdrom
     * @param serverId Server id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ejectCdromCall(UUID serverId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/server/{serverId}/cdrom/eject"
            .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(serverId.toString()));

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
    private com.squareup.okhttp.Call ejectCdromValidateBeforeCall(UUID serverId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling ejectCdrom(Async)");
        }
        
        
        com.squareup.okhttp.Call call = ejectCdromCall(serverId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Eject CD-ROM
     * Ejects the storage from the CD-ROM device of a server.
     * @param serverId Server id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void ejectCdrom(UUID serverId) throws ApiException {
        ejectCdromWithHttpInfo(serverId);
    }

    /**
     * Eject CD-ROM
     * Ejects the storage from the CD-ROM device of a server.
     * @param serverId Server id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> ejectCdromWithHttpInfo(UUID serverId) throws ApiException {
        com.squareup.okhttp.Call call = ejectCdromValidateBeforeCall(serverId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Eject CD-ROM (asynchronously)
     * Ejects the storage from the CD-ROM device of a server.
     * @param serverId Server id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ejectCdromAsync(UUID serverId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ejectCdromValidateBeforeCall(serverId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for favoriteStorage
     * @param storageId Storage id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call favoriteStorageCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/favorite"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call favoriteStorageValidateBeforeCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling favoriteStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = favoriteStorageCall(storageId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add storage to favorites
     * Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     * @param storageId Storage id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void favoriteStorage(UUID storageId) throws ApiException {
        favoriteStorageWithHttpInfo(storageId);
    }

    /**
     * Add storage to favorites
     * Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     * @param storageId Storage id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> favoriteStorageWithHttpInfo(UUID storageId) throws ApiException {
        com.squareup.okhttp.Call call = favoriteStorageValidateBeforeCall(storageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add storage to favorites (asynchronously)
     * Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     * @param storageId Storage id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call favoriteStorageAsync(UUID storageId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = favoriteStorageValidateBeforeCall(storageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getStorageDetails
     * @param storageId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStorageDetailsCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call getStorageDetailsValidateBeforeCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling getStorageDetails(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getStorageDetailsCall(storageId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get storage details
     * Returns detailed information about a specific storage resource.
     * @param storageId  (required)
     * @return CreateStorageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateStorageResponse getStorageDetails(UUID storageId) throws ApiException {
        ApiResponse<CreateStorageResponse> resp = getStorageDetailsWithHttpInfo(storageId);
        return resp.getData();
    }

    /**
     * Get storage details
     * Returns detailed information about a specific storage resource.
     * @param storageId  (required)
     * @return ApiResponse&lt;CreateStorageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateStorageResponse> getStorageDetailsWithHttpInfo(UUID storageId) throws ApiException {
        com.squareup.okhttp.Call call = getStorageDetailsValidateBeforeCall(storageId, null, null);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get storage details (asynchronously)
     * Returns detailed information about a specific storage resource.
     * @param storageId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStorageDetailsAsync(UUID storageId, final ApiCallback<CreateStorageResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStorageDetailsValidateBeforeCall(storageId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listStorageTypes
     * @param type Storage&#39;s access type (&#x60;public&#x60; or &#x60;private&#x60;) or storage type (&#x60;normal&#x60;, &#x60;backup&#x60;, &#x60;cdrom&#x60; or &#x60;template&#x60;) or &#x60;favorite&#x60; status (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listStorageTypesCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{type}/"
            .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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
    private com.squareup.okhttp.Call listStorageTypesValidateBeforeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling listStorageTypes(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listStorageTypesCall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List of storages by type
     * 
     * @param type Storage&#39;s access type (&#x60;public&#x60; or &#x60;private&#x60;) or storage type (&#x60;normal&#x60;, &#x60;backup&#x60;, &#x60;cdrom&#x60; or &#x60;template&#x60;) or &#x60;favorite&#x60; status (required)
     * @return SuccessStoragesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SuccessStoragesResponse listStorageTypes(String type) throws ApiException {
        ApiResponse<SuccessStoragesResponse> resp = listStorageTypesWithHttpInfo(type);
        return resp.getData();
    }

    /**
     * List of storages by type
     * 
     * @param type Storage&#39;s access type (&#x60;public&#x60; or &#x60;private&#x60;) or storage type (&#x60;normal&#x60;, &#x60;backup&#x60;, &#x60;cdrom&#x60; or &#x60;template&#x60;) or &#x60;favorite&#x60; status (required)
     * @return ApiResponse&lt;SuccessStoragesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SuccessStoragesResponse> listStorageTypesWithHttpInfo(String type) throws ApiException {
        com.squareup.okhttp.Call call = listStorageTypesValidateBeforeCall(type, null, null);
        Type localVarReturnType = new TypeToken<SuccessStoragesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List of storages by type (asynchronously)
     * 
     * @param type Storage&#39;s access type (&#x60;public&#x60; or &#x60;private&#x60;) or storage type (&#x60;normal&#x60;, &#x60;backup&#x60;, &#x60;cdrom&#x60; or &#x60;template&#x60;) or &#x60;favorite&#x60; status (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listStorageTypesAsync(String type, final ApiCallback<SuccessStoragesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listStorageTypesValidateBeforeCall(type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SuccessStoragesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listStorages
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listStoragesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage";

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
    private com.squareup.okhttp.Call listStoragesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = listStoragesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List of storages
     * 
     * @return SuccessStoragesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SuccessStoragesResponse listStorages() throws ApiException {
        ApiResponse<SuccessStoragesResponse> resp = listStoragesWithHttpInfo();
        return resp.getData();
    }

    /**
     * List of storages
     * 
     * @return ApiResponse&lt;SuccessStoragesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SuccessStoragesResponse> listStoragesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listStoragesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<SuccessStoragesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List of storages (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listStoragesAsync(final ApiCallback<SuccessStoragesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listStoragesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SuccessStoragesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loadCdrom
     * @param serverId Server id (required)
     * @param storageDevice  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loadCdromCall(UUID serverId, StorageDeviceLoadRequest storageDevice, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storageDevice;
        
        // create path and map variables
        String localVarPath = "/server/{serverId}/storage/cdrom/load"
            .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(serverId.toString()));

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
    private com.squareup.okhttp.Call loadCdromValidateBeforeCall(UUID serverId, StorageDeviceLoadRequest storageDevice, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling loadCdrom(Async)");
        }
        
        
        com.squareup.okhttp.Call call = loadCdromCall(serverId, storageDevice, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Load CD-ROM
     * Loads a storage as a CD-ROM in the CD-ROM device of a server.
     * @param serverId Server id (required)
     * @param storageDevice  (optional)
     * @return CreateServerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateServerResponse loadCdrom(UUID serverId, StorageDeviceLoadRequest storageDevice) throws ApiException {
        ApiResponse<CreateServerResponse> resp = loadCdromWithHttpInfo(serverId, storageDevice);
        return resp.getData();
    }

    /**
     * Load CD-ROM
     * Loads a storage as a CD-ROM in the CD-ROM device of a server.
     * @param serverId Server id (required)
     * @param storageDevice  (optional)
     * @return ApiResponse&lt;CreateServerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateServerResponse> loadCdromWithHttpInfo(UUID serverId, StorageDeviceLoadRequest storageDevice) throws ApiException {
        com.squareup.okhttp.Call call = loadCdromValidateBeforeCall(serverId, storageDevice, null, null);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Load CD-ROM (asynchronously)
     * Loads a storage as a CD-ROM in the CD-ROM device of a server.
     * @param serverId Server id (required)
     * @param storageDevice  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loadCdromAsync(UUID serverId, StorageDeviceLoadRequest storageDevice, final ApiCallback<CreateServerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loadCdromValidateBeforeCall(serverId, storageDevice, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyStorage
     * @param storageId  (required)
     * @param storage  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyStorageCall(UUID storageId, ModifyStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storage;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call modifyStorageValidateBeforeCall(UUID storageId, ModifyStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling modifyStorage(Async)");
        }
        
        // verify the required parameter 'storage' is set
        if (storage == null) {
            throw new ApiException("Missing the required parameter 'storage' when calling modifyStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = modifyStorageCall(storageId, storage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Modify storage
     * Modifies an existing storage resource. This operation is used to rename or resize the storage.
     * @param storageId  (required)
     * @param storage  (required)
     * @return CreateStorageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateStorageResponse modifyStorage(UUID storageId, ModifyStorageRequest storage) throws ApiException {
        ApiResponse<CreateStorageResponse> resp = modifyStorageWithHttpInfo(storageId, storage);
        return resp.getData();
    }

    /**
     * Modify storage
     * Modifies an existing storage resource. This operation is used to rename or resize the storage.
     * @param storageId  (required)
     * @param storage  (required)
     * @return ApiResponse&lt;CreateStorageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateStorageResponse> modifyStorageWithHttpInfo(UUID storageId, ModifyStorageRequest storage) throws ApiException {
        com.squareup.okhttp.Call call = modifyStorageValidateBeforeCall(storageId, storage, null, null);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify storage (asynchronously)
     * Modifies an existing storage resource. This operation is used to rename or resize the storage.
     * @param storageId  (required)
     * @param storage  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyStorageAsync(UUID storageId, ModifyStorageRequest storage, final ApiCallback<CreateStorageResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = modifyStorageValidateBeforeCall(storageId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for restoreStorage
     * @param storageId Storage id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call restoreStorageCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/restore"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call restoreStorageValidateBeforeCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling restoreStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = restoreStorageCall(storageId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Restore backup
     * Restores the origin storage with data from the specified backup storage.
     * @param storageId Storage id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void restoreStorage(UUID storageId) throws ApiException {
        restoreStorageWithHttpInfo(storageId);
    }

    /**
     * Restore backup
     * Restores the origin storage with data from the specified backup storage.
     * @param storageId Storage id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> restoreStorageWithHttpInfo(UUID storageId) throws ApiException {
        com.squareup.okhttp.Call call = restoreStorageValidateBeforeCall(storageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Restore backup (asynchronously)
     * Restores the origin storage with data from the specified backup storage.
     * @param storageId Storage id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call restoreStorageAsync(UUID storageId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = restoreStorageValidateBeforeCall(storageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for templatizeStorage
     * @param storageId Storage id (required)
     * @param storage  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call templatizeStorageCall(UUID storageId, TemplitizeStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = storage;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/templatize"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call templatizeStorageValidateBeforeCall(UUID storageId, TemplitizeStorageRequest storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling templatizeStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = templatizeStorageCall(storageId, storage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Templatize storage
     * Creates an exact copy of an existing storage resource which can be used as a template for creating new servers.
     * @param storageId Storage id (required)
     * @param storage  (optional)
     * @return CreateStorageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateStorageResponse templatizeStorage(UUID storageId, TemplitizeStorageRequest storage) throws ApiException {
        ApiResponse<CreateStorageResponse> resp = templatizeStorageWithHttpInfo(storageId, storage);
        return resp.getData();
    }

    /**
     * Templatize storage
     * Creates an exact copy of an existing storage resource which can be used as a template for creating new servers.
     * @param storageId Storage id (required)
     * @param storage  (optional)
     * @return ApiResponse&lt;CreateStorageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateStorageResponse> templatizeStorageWithHttpInfo(UUID storageId, TemplitizeStorageRequest storage) throws ApiException {
        com.squareup.okhttp.Call call = templatizeStorageValidateBeforeCall(storageId, storage, null, null);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Templatize storage (asynchronously)
     * Creates an exact copy of an existing storage resource which can be used as a template for creating new servers.
     * @param storageId Storage id (required)
     * @param storage  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call templatizeStorageAsync(UUID storageId, TemplitizeStorageRequest storage, final ApiCallback<CreateStorageResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = templatizeStorageValidateBeforeCall(storageId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateStorageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for unfavoriteStorage
     * @param storageId Storage id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call unfavoriteStorageCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/storage/{storageId}/favorite"
            .replaceAll("\\{" + "storageId" + "\\}", apiClient.escapeString(storageId.toString()));

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
    private com.squareup.okhttp.Call unfavoriteStorageValidateBeforeCall(UUID storageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new ApiException("Missing the required parameter 'storageId' when calling unfavoriteStorage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = unfavoriteStorageCall(storageId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Remove storage from favorites
     * Delete a storage from the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     * @param storageId Storage id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void unfavoriteStorage(UUID storageId) throws ApiException {
        unfavoriteStorageWithHttpInfo(storageId);
    }

    /**
     * Remove storage from favorites
     * Delete a storage from the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     * @param storageId Storage id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> unfavoriteStorageWithHttpInfo(UUID storageId) throws ApiException {
        com.squareup.okhttp.Call call = unfavoriteStorageValidateBeforeCall(storageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove storage from favorites (asynchronously)
     * Delete a storage from the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     * @param storageId Storage id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unfavoriteStorageAsync(UUID storageId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = unfavoriteStorageValidateBeforeCall(storageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

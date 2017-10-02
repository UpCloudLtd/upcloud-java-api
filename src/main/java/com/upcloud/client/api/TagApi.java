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


import com.upcloud.client.models.CreateNewTagResponse;
import com.upcloud.client.models.CreateServerResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.ModifyTagRequest;
import com.upcloud.client.models.TagCreateRequest;
import com.upcloud.client.models.TagListResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagApi {
    private ApiClient apiClient;

    public TagApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for assignTag
     * @param serverId Server id (required)
     * @param tagList List of tags (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assignTagCall(UUID serverId, String tagList, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/server/{serverId}/tag/{tagList}"
            .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(serverId.toString()))
            .replaceAll("\\{" + "tagList" + "\\}", apiClient.escapeString(tagList.toString()));

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
    private com.squareup.okhttp.Call assignTagValidateBeforeCall(UUID serverId, String tagList, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling assignTag(Async)");
        }
        
        // verify the required parameter 'tagList' is set
        if (tagList == null) {
            throw new ApiException("Missing the required parameter 'tagList' when calling assignTag(Async)");
        }
        
        
        com.squareup.okhttp.Call call = assignTagCall(serverId, tagList, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Assign tag to a server
     * Servers can be tagged with one or more tags. The tags used must exist
     * @param serverId Server id (required)
     * @param tagList List of tags (required)
     * @return CreateServerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateServerResponse assignTag(UUID serverId, String tagList) throws ApiException {
        ApiResponse<CreateServerResponse> resp = assignTagWithHttpInfo(serverId, tagList);
        return resp.getData();
    }

    /**
     * Assign tag to a server
     * Servers can be tagged with one or more tags. The tags used must exist
     * @param serverId Server id (required)
     * @param tagList List of tags (required)
     * @return ApiResponse&lt;CreateServerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateServerResponse> assignTagWithHttpInfo(UUID serverId, String tagList) throws ApiException {
        com.squareup.okhttp.Call call = assignTagValidateBeforeCall(serverId, tagList, null, null);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign tag to a server (asynchronously)
     * Servers can be tagged with one or more tags. The tags used must exist
     * @param serverId Server id (required)
     * @param tagList List of tags (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assignTagAsync(UUID serverId, String tagList, final ApiCallback<CreateServerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assignTagValidateBeforeCall(serverId, tagList, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createTag
     * @param tag  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTagCall(TagCreateRequest tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tag;
        
        // create path and map variables
        String localVarPath = "/tag";

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
    private com.squareup.okhttp.Call createTagValidateBeforeCall(TagCreateRequest tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling createTag(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createTagCall(tag, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a new tag
     * Creates a new tag. Existing servers can be tagged in same request
     * @param tag  (required)
     * @return CreateNewTagResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateNewTagResponse createTag(TagCreateRequest tag) throws ApiException {
        ApiResponse<CreateNewTagResponse> resp = createTagWithHttpInfo(tag);
        return resp.getData();
    }

    /**
     * Create a new tag
     * Creates a new tag. Existing servers can be tagged in same request
     * @param tag  (required)
     * @return ApiResponse&lt;CreateNewTagResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateNewTagResponse> createTagWithHttpInfo(TagCreateRequest tag) throws ApiException {
        com.squareup.okhttp.Call call = createTagValidateBeforeCall(tag, null, null);
        Type localVarReturnType = new TypeToken<CreateNewTagResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new tag (asynchronously)
     * Creates a new tag. Existing servers can be tagged in same request
     * @param tag  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTagAsync(TagCreateRequest tag, final ApiCallback<CreateNewTagResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTagValidateBeforeCall(tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateNewTagResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTag
     * @param tagName Tag name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTagCall(String tagName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tag/{tagName}"
            .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

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
    private com.squareup.okhttp.Call deleteTagValidateBeforeCall(String tagName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tagName' is set
        if (tagName == null) {
            throw new ApiException("Missing the required parameter 'tagName' when calling deleteTag(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteTagCall(tagName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete tag
     * Deleting existing tag untags all servers from specified tag and deletes tag definition
     * @param tagName Tag name (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTag(String tagName) throws ApiException {
        deleteTagWithHttpInfo(tagName);
    }

    /**
     * Delete tag
     * Deleting existing tag untags all servers from specified tag and deletes tag definition
     * @param tagName Tag name (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTagWithHttpInfo(String tagName) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagValidateBeforeCall(tagName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete tag (asynchronously)
     * Deleting existing tag untags all servers from specified tag and deletes tag definition
     * @param tagName Tag name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTagAsync(String tagName, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTagValidateBeforeCall(tagName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listTags
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listTagsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tag";

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
    private com.squareup.okhttp.Call listTagsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = listTagsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List existing tags
     * Returns all existing tags with their properties and servers tagged
     * @return TagListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TagListResponse listTags() throws ApiException {
        ApiResponse<TagListResponse> resp = listTagsWithHttpInfo();
        return resp.getData();
    }

    /**
     * List existing tags
     * Returns all existing tags with their properties and servers tagged
     * @return ApiResponse&lt;TagListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TagListResponse> listTagsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listTagsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<TagListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List existing tags (asynchronously)
     * Returns all existing tags with their properties and servers tagged
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTagsAsync(final ApiCallback<TagListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTagsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TagListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyTag
     * @param tagName Tag name (required)
     * @param tag  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyTagCall(String tagName, ModifyTagRequest tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tag;
        
        // create path and map variables
        String localVarPath = "/tag/{tagName}"
            .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

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
    private com.squareup.okhttp.Call modifyTagValidateBeforeCall(String tagName, ModifyTagRequest tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tagName' is set
        if (tagName == null) {
            throw new ApiException("Missing the required parameter 'tagName' when calling modifyTag(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling modifyTag(Async)");
        }
        
        
        com.squareup.okhttp.Call call = modifyTagCall(tagName, tag, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Modify existing tag
     * Changes attributes of an existing tag
     * @param tagName Tag name (required)
     * @param tag  (required)
     * @return CreateNewTagResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateNewTagResponse modifyTag(String tagName, ModifyTagRequest tag) throws ApiException {
        ApiResponse<CreateNewTagResponse> resp = modifyTagWithHttpInfo(tagName, tag);
        return resp.getData();
    }

    /**
     * Modify existing tag
     * Changes attributes of an existing tag
     * @param tagName Tag name (required)
     * @param tag  (required)
     * @return ApiResponse&lt;CreateNewTagResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateNewTagResponse> modifyTagWithHttpInfo(String tagName, ModifyTagRequest tag) throws ApiException {
        com.squareup.okhttp.Call call = modifyTagValidateBeforeCall(tagName, tag, null, null);
        Type localVarReturnType = new TypeToken<CreateNewTagResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify existing tag (asynchronously)
     * Changes attributes of an existing tag
     * @param tagName Tag name (required)
     * @param tag  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyTagAsync(String tagName, ModifyTagRequest tag, final ApiCallback<CreateNewTagResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = modifyTagValidateBeforeCall(tagName, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateNewTagResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for untag
     * @param serverId Server id (required)
     * @param tagName Tag name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call untagCall(UUID serverId, String tagName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/server/{serverId}/untag/{tagName}"
            .replaceAll("\\{" + "serverId" + "\\}", apiClient.escapeString(serverId.toString()))
            .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

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
    private com.squareup.okhttp.Call untagValidateBeforeCall(UUID serverId, String tagName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling untag(Async)");
        }
        
        // verify the required parameter 'tagName' is set
        if (tagName == null) {
            throw new ApiException("Missing the required parameter 'tagName' when calling untag(Async)");
        }
        
        
        com.squareup.okhttp.Call call = untagCall(serverId, tagName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Remove tag from server
     * Untags tags from given server. The tag(s) must exist
     * @param serverId Server id (required)
     * @param tagName Tag name (required)
     * @return CreateServerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateServerResponse untag(UUID serverId, String tagName) throws ApiException {
        ApiResponse<CreateServerResponse> resp = untagWithHttpInfo(serverId, tagName);
        return resp.getData();
    }

    /**
     * Remove tag from server
     * Untags tags from given server. The tag(s) must exist
     * @param serverId Server id (required)
     * @param tagName Tag name (required)
     * @return ApiResponse&lt;CreateServerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateServerResponse> untagWithHttpInfo(UUID serverId, String tagName) throws ApiException {
        com.squareup.okhttp.Call call = untagValidateBeforeCall(serverId, tagName, null, null);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove tag from server (asynchronously)
     * Untags tags from given server. The tag(s) must exist
     * @param serverId Server id (required)
     * @param tagName Tag name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call untagAsync(UUID serverId, String tagName, final ApiCallback<CreateServerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = untagValidateBeforeCall(serverId, tagName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateServerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

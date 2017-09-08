/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.CreateNewTagResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.ServerListResponse;
import com.upcloud.client.models.Tag;
import com.upcloud.client.models.Tag1;
import com.upcloud.client.models.TagListResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagApi
 */
@Ignore
public class TagApiTest {

    private final TagApi api = new TagApi();

    
    /**
     * Assign tag to a server
     *
     * Servers can be tagged with one or more tags. The tags used must exist
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignTagTest() throws ApiException {
        UUID serverId = null;
        String tagList = null;
        ServerListResponse response = api.assignTag(serverId, tagList);

        // TODO: test validations
    }
    
    /**
     * Create a new tag
     *
     * Creates a new tag. Existing servers can be tagged in same request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        Tag tag = null;
        CreateNewTagResponse response = api.createTag(tag);

        // TODO: test validations
    }
    
    /**
     * Delete tag
     *
     * Deleting existing tag untags all servers from specified tag and deletes tag definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tagName = null;
        api.deleteTag(tagName);

        // TODO: test validations
    }
    
    /**
     * List existing tags
     *
     * Returns all existing tags with their properties and servers tagged
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTagsTest() throws ApiException {
        TagListResponse response = api.listTags();

        // TODO: test validations
    }
    
    /**
     * Modify existing tag
     *
     * Changes attributes of an existing tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyTagTest() throws ApiException {
        String tagName = null;
        Tag1 tag = null;
        CreateNewTagResponse response = api.modifyTag(tagName, tag);

        // TODO: test validations
    }
    
    /**
     * Remove tag from server
     *
     * Untags tags from given server. The tag(s) must exist
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void untagTest() throws ApiException {
        UUID serverId = null;
        String tagName = null;
        ServerListResponse response = api.untag(serverId, tagName);

        // TODO: test validations
    }
    
}

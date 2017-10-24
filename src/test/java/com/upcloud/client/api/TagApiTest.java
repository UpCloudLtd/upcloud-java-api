/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */

package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.*;
import com.upcloud.client.models.Tag;
import org.junit.jupiter.api.*;
import utils.ServerHelpers;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for TagApi
 */
public class TagApiTest {

    private static final TagApi api = new TagApi();
    private static Server testServer;
    private static Tag tag1, tag2;

    @BeforeAll
    public static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);

        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        testServer = serverHelper.createReadyServer(null);
    }

    @AfterAll
    public static void setDown() throws ApiException {
        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        serverHelper.deleteAllServers();
    }

    @BeforeEach
    public void setUpEach() throws ApiException {
        try {
            tag1 = api.createTag(new TagCreateRequest().tag(new Tag().name("DEV").description("Test description")))
                    .getTag();
            tag2 = api.createTag(new TagCreateRequest().tag(new Tag().name("TAG2").description("Test description 2")))
                    .getTag();
        } catch (ApiException e) {
            Logger.getGlobal().warning(e.getMessage());
        }
    }

    @AfterEach
    public void setDownEach() throws ApiException {
        List<Tag> tagList = api.listTags().getTags().getTag();
        for (Tag tag : tagList) {
            api.deleteTag(tag.getName());
        }
    }

    /**
     * Assign tag to a server
     * <p>
     * Servers can be tagged with one or more tags. The tags used must exist
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignTagTest() throws ApiException {
        UUID serverId = testServer.getUuid();
        String tagList = "DEV";
        CreateServerResponse response = api.assignTag(serverId, tagList);
        Server server = response.getServer();
        assertEquals(1, server.getTags().getTag().size());
        tagList = "TAG2";
        response = api.assignTag(serverId, tagList);
        server = response.getServer();
        assertEquals(2, server.getTags().getTag().size());
        assertTrue(server.getTags().getTag().stream().allMatch(tag -> tag.equals("DEV") || tag.equals("TAG2")));
    }

    /**
     * Create a new tag
     * <p>
     * Creates a new tag. Existing servers can be tagged in same request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        Tag tag = api.createTag(new TagCreateRequest().tag(new Tag().name("TESTTAG").description("Test tag"))).getTag();
        assertEquals(tag.getName(), "TESTTAG");
        assertEquals(tag.getDescription(), "Test tag");
        assertNotNull(tag.getServers());
        api.deleteTag("TESTTAG");
    }

    /**
     * Delete tag
     * <p>
     * Deleting existing tag untags all servers from specified tag and deletes tag definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        List<Tag> tagList = api.listTags().getTags().getTag();
        assertEquals(2, tagList.size());
        api.deleteTag("DEV");
        tagList = api.listTags().getTags().getTag();
        assertEquals(1, tagList.size());
        assertTrue(tagList.stream().noneMatch(tag -> tag.equals("DEV")));
    }

    /**
     * List existing tags
     * <p>
     * Returns all existing tags with their properties and servers tagged
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTagsTest() throws ApiException {
        TagListResponse response = api.listTags();
        List<Tag> tagList = response.getTags().getTag();
        assertEquals(2, tagList.size());
        Logger.getGlobal().info("Tag list: " + tagList);
        assertTrue(tagList.stream().allMatch(tag -> tag.getName().equals("DEV") || tag.getName().equals("TAG2")));
    }

    /**
     * Modify existing tag
     * <p>
     * Changes attributes of an existing tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyTagTest() throws ApiException {
        CreateNewTagResponse response = api.modifyTag("DEV",
                new ModifyTagRequest().tag(new Tag().name("PROD").description("Production tag")));
        Tag modifiedTag = response.getTag();
        assertEquals("PROD", modifiedTag.getName());
        assertEquals("Production tag", modifiedTag.getDescription());
    }

    /**
     * Remove tag from server
     * <p>
     * Untags tags from given server. The tag(s) must exist
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void untagTest() throws ApiException {
        UUID serverId = testServer.getUuid();
        String tagName = "DEV";
        Server server = api.assignTag(serverId, tagName).getServer();

        assertTrue(server.getTags().getTag().stream().anyMatch(tag -> tag.equals("DEV")));

        server = api.untag(serverId, tagName).getServer();

        assertTrue(server.getTags().getTag().stream().noneMatch(tag -> tag.equals("DEV")));
    }

}

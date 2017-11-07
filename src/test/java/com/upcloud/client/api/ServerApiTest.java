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
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.ServerHelpers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for ServerApi
 */
public class ServerApiTest {

    private static final Logger logger = Logger.getGlobal();
    private static final ServerApi api = new ServerApi();
    private static final Server testServer = new Server();
    private static final StorageDevice testStorageDevice = new StorageDevice();
    private static ArrayList<Server> createdServers = new ArrayList<>();

    @BeforeAll
    public static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);

        testStorageDevice.action("clone").storage("01000000-0000-4000-8000-000020030100")
                .title("Debian from a template").size(BigDecimal.valueOf(50)).tier("maxiops");

        testServer.zone("fi-hel1").title("Test server").hostname("debian.example.com").plan("2xCPU-2GB")
                .storageDevices(new ServerStorageDevices().addStorageDeviceItem(testStorageDevice));
    }

    @AfterAll
    public static void setDown() {
        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        serverHelper.deleteAllServers();
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
        UUID serverId = null;
        String tagList = null;
    }

    /**
     * Create server
     * <p>
     * Creates a new server instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createServerTest() throws ApiException {
        try {
            CreateServerResponse response = api.createServer(new CreateServerRequest().server(testServer));
            Server createdServer = response.getServer();
            createdServers.add(createdServer);
            assertEquals(createdServer.getTitle(), testServer.getTitle());
            assertEquals(createdServer.getZone(), testServer.getZone());
            assertEquals(createdServer.getHostname(), testServer.getHostname());
            assertEquals(createdServer.getPlan(), testServer.getPlan());
        } catch (ApiException e) {
            Logger.getGlobal().warning(e.getResponseBody());
        }
    }

    /**
     * List server configurations
     * <p>
     * Returns a list of available server configurations. A server configuration consists of a combination of CPU core count and main memory amount. All servers are created using these configurations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listServerConfigurationsTest() throws ApiException {
        ConfigurationListResponse response = api.listServerConfigurations();
    }

    /**
     * List of servers
     * <p>
     * Returns a list of all servers associated with the current account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listServersTest() throws ApiException {
        List<Server> servers = api.listServers().getServers().getServer();
        int prevSize = servers.size();
        Server createdServer = api.createServer(new CreateServerRequest().server(testServer)).getServer();
        createdServers.add(createdServer);
        servers = api.listServers().getServers().getServer();
        assertEquals(prevSize + 1, servers.size());
    }

    /**
     * Load CD-ROM
     * <p>
     * Loads a storage as a CD-ROM in the CD-ROM device of a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadCdromTest() throws ApiException {

    }

}

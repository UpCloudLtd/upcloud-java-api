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
        api.getApiClient().setUsername("toughbyte");
        api.getApiClient().setPassword("Topsekret5");
        api.getApiClient().setDebugging(true);

//        api.getApiClient().setBasePath("http://localhost:8080/1.2");

        testStorageDevice
                .action("clone")
                .storage("01000000-0000-4000-8000-000020030100")
                .title("Debian from a template")
                .size(BigDecimal.valueOf(50))
                .tier("maxiops");

        testServer
                .zone("fi-hel1")
                .title("Test server")
                .hostname("debian.example.com")
                .plan("2xCPU-2GB")
                .storageDevices(new ServerStorageDevices().addStorageDeviceItem(testStorageDevice));
    }

    @AfterAll
    public static void setDown() {
        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        serverHelper.deleteAllServers();
    }

    public static void deleteServer(Server server, int tryings) {
        try {
            logger.info("Trying to delete server: " + server.getUuid());
            logger.info("Trying #" + tryings);
            if (server != null) {
                if (server.getState() != ServerState.STOPPED) {
                    logger.info("Stopping server...");
                    try {
                        server = api.stopServer(server.getUuid(), new StopServer()
                                .stopServer(new StopServerRequest()
                                        .stopType(StopServerRequest.StopTypeEnum.SOFT)
                                        .timeout(BigDecimal.valueOf(60))))
                                .getServer();
                    } catch (ApiException e) {
                        logger.info("Stopping error: " + e.getResponseBody());
                    }
                }
                api.deleteServer(server.getUuid());
            }
        } catch (ApiException e) {
            logger.warning("Delete error: " + e.getMessage());
            logger.warning("Response body: " + e.getResponseBody());
            if (e.getMessage().equals("Conflict") && tryings < 20) {
                logger.info("Try again in one minute...");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException ie) {
                    logger.warning(ie.getLocalizedMessage());
                }
                deleteServer(server, tryings + 1);
            } else {
                logger.warning("Can't delete all test servers");
            }
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
        UUID serverId = null;
        String tagList = null;
//        CreateServerResponse response = api.assignTag(serverId, tagList);

        // TODO: test validations
    }

    /**
     * Attach storage
     * <p>
     * Attaches a storage as a device to a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachStorageTest() throws ApiException {
        UUID serverId = null;
        StorageDevice storageDevice = null;
//        CreateServerResponse response = api.attachStorage(serverId, storageDevice);

        // TODO: test validations
    }

    /**
     * Create firewall rule
     * <p>
     * Creates a new firewall rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFirewallRuleTest() throws ApiException {
        UUID serverId = null;
        FirewallRuleRequest firewallRule = null;
//        FirewallRuleCreateResponse response = api.createFirewallRule(serverId, firewallRule);

        // TODO: test validations
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
     * Remove firewall rule
     * <p>
     * Removes a firewall rule from a server. Firewall rules must be removed individually. The positions of remaining firewall rules will be adjusted after a rule is removed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFirewallRuleTest() throws ApiException {
        UUID serverId = null;
        UUID firewallRuleNumber = null;
//        api.deleteFirewallRule(serverId, firewallRuleNumber);

        // TODO: test validations
    }

    /**
     * Delete server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteServerTest() throws ApiException {
        UUID serverId = null;
//        api.deleteServer(serverId);

        // TODO: test validations
    }

    /**
     * Detach storage
     * <p>
     * Detaches a storage resource from a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detachStorageTest() throws ApiException {
        UUID serverId = null;
        StorageDevice storageDevice = null;
//        CreateServerResponse response = api.detachStorage(serverId, storageDevice);

        // TODO: test validations
    }

    /**
     * Eject CD-ROM
     * <p>
     * Ejects the storage from the CD-ROM device of a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ejectCdromTest() throws ApiException {
        UUID serverId = null;
//        CreateServerResponse response = api.ejectCdrom(serverId);

        // TODO: test validations
    }

    /**
     * Get firewall rule details
     * <p>
     * Returns detailed information about a specific firewall rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFirewallRuleTest() throws ApiException {
        UUID serverId = null;
        UUID firewallRuleNumber = null;
//        FirewallRuleCreateResponse response = api.getFirewallRule(serverId, firewallRuleNumber);

        // TODO: test validations
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

        // TODO: test validations
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

    /**
     * Modify server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyServerTest() throws ApiException {
        UUID serverId = null;
        Server server = null;
//        CreateServerResponse response = api.modifyServer(serverId, server);

        // TODO: test validations
    }

    /**
     * Restart server
     * <p>
     * Stops and starts a server. The server state must be &#x60;started&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restartServerTest() throws ApiException {
        UUID serverId = null;
        RestartServer restartServer = null;
//        CreateServerResponse response = api.restartServer(serverId, restartServer);

        // TODO: test validations
    }

    /**
     * Get server details
     * <p>
     * Returns detailed information about a specific server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void serverDetailsTest() throws ApiException {
        UUID serverId = null;
//        CreateServerResponse response = api.serverDetails(serverId);

        // TODO: test validations
    }

    /**
     * List firewall rules
     * <p>
     * Returns a list of firewall rules for a specific server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void serverServerIdFirewallRuleGetTest() throws ApiException {
        UUID serverId = null;
//        FirewallRuleListResponse response = api.serverServerIdFirewallRuleGet(serverId);

        // TODO: test validations
    }

    /**
     * Start server
     * <p>
     * Starts a stopped server. The server state must be &#x60;stopped&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void startServerTest() throws ApiException {
        UUID serverId = null;
//        CreateServerResponse response = api.startServer(serverId);

        // TODO: test validations
    }

    /**
     * Stop server
     * <p>
     * Stops a started server. The server state must be &#x60;started&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stopServerTest() throws ApiException {
        UUID serverId = null;
        StopServer stopServer = null;
//        CreateServerResponse response = api.stopServer(serverId, stopServer);

        // TODO: test validations
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
        UUID serverId = null;
        String tagName = null;
//        CreateServerResponse response = api.untag(serverId, tagName);

        // TODO: test validations
    }

}

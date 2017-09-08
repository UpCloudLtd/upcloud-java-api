/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.ConfigurationListResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.FirewallRule;
import com.upcloud.client.models.FirewallRuleDetailsResponse;
import com.upcloud.client.models.FirewallRuleListResponse;
import com.upcloud.client.models.RestartServer;
import com.upcloud.client.models.Server;
import com.upcloud.client.models.ServerListResponse;
import com.upcloud.client.models.StopServer;
import com.upcloud.client.models.StorageDevice;
import com.upcloud.client.models.StorageDevice1;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServerApi
 */
@Ignore
public class ServerApiTest {

    private final ServerApi api = new ServerApi();

    
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
     * Attach storage
     *
     * Attaches a storage as a device to a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachStorageTest() throws ApiException {
        UUID serverId = null;
        StorageDevice storageDevice = null;
        ServerListResponse response = api.attachStorage(serverId, storageDevice);

        // TODO: test validations
    }
    
    /**
     * Create firewall rule
     *
     * Creates a new firewall rule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFirewallRuleTest() throws ApiException {
        UUID serverId = null;
        FirewallRule firewallRule = null;
        api.createFirewallRule(serverId, firewallRule);

        // TODO: test validations
    }
    
    /**
     * Create server
     *
     * Creates a new server instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createServerTest() throws ApiException {
        Server server = null;
        ServerListResponse response = api.createServer(server);

        // TODO: test validations
    }
    
    /**
     * Remove firewall rule
     *
     * Removes a firewall rule from a server. Firewall rules must be removed individually. The positions of remaining firewall rules will be adjusted after a rule is removed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFirewallRuleTest() throws ApiException {
        UUID serverId = null;
        UUID firewallRuleNumber = null;
        api.deleteFirewallRule(serverId, firewallRuleNumber);

        // TODO: test validations
    }
    
    /**
     * Delete server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServerTest() throws ApiException {
        UUID serverId = null;
        api.deleteServer(serverId);

        // TODO: test validations
    }
    
    /**
     * Detach storage
     *
     * Detaches a storage resource from a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachStorageTest() throws ApiException {
        UUID serverId = null;
        StorageDevice storageDevice = null;
        ServerListResponse response = api.detachStorage(serverId, storageDevice);

        // TODO: test validations
    }
    
    /**
     * Eject CD-ROM
     *
     * Ejects the storage from the CD-ROM device of a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ejectCdromTest() throws ApiException {
        UUID serverId = null;
        ServerListResponse response = api.ejectCdrom(serverId);

        // TODO: test validations
    }
    
    /**
     * Get firewall rule details
     *
     * Returns detailed information about a specific firewall rule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirewallRuleTest() throws ApiException {
        UUID serverId = null;
        UUID firewallRuleNumber = null;
        FirewallRuleDetailsResponse response = api.getFirewallRule(serverId, firewallRuleNumber);

        // TODO: test validations
    }
    
    /**
     * List server configurations
     *
     * Returns a list of available server configurations. A server configuration consists of a combination of CPU core count and main memory amount. All servers are created using these configurations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listServerConfigurationsTest() throws ApiException {
        ConfigurationListResponse response = api.listServerConfigurations();

        // TODO: test validations
    }
    
    /**
     * List of servers
     *
     * Returns a list of all servers associated with the current account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listServersTest() throws ApiException {
        ServerListResponse response = api.listServers();

        // TODO: test validations
    }
    
    /**
     * Load CD-ROM
     *
     * Loads a storage as a CD-ROM in the CD-ROM device of a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadCdromTest() throws ApiException {
        UUID serverId = null;
        StorageDevice1 storageDevice = null;
        ServerListResponse response = api.loadCdrom(serverId, storageDevice);

        // TODO: test validations
    }
    
    /**
     * Modify server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyServerTest() throws ApiException {
        UUID serverId = null;
        Server server = null;
        ServerListResponse response = api.modifyServer(serverId, server);

        // TODO: test validations
    }
    
    /**
     * Restart server
     *
     * Stops and starts a server. The server state must be &#x60;started&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restartServerTest() throws ApiException {
        UUID serverId = null;
        RestartServer restartServer = null;
        ServerListResponse response = api.restartServer(serverId, restartServer);

        // TODO: test validations
    }
    
    /**
     * Get server details
     *
     * Returns detailed information about a specific server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void serverDetailsTest() throws ApiException {
        UUID serverId = null;
        ServerListResponse response = api.serverDetails(serverId);

        // TODO: test validations
    }
    
    /**
     * List firewall rules
     *
     * Returns a list of firewall rules for a specific server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void serverServerIdFirewallRuleGetTest() throws ApiException {
        UUID serverId = null;
        FirewallRuleListResponse response = api.serverServerIdFirewallRuleGet(serverId);

        // TODO: test validations
    }
    
    /**
     * Start server
     *
     * Starts a stopped server. The server state must be &#x60;stopped&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startServerTest() throws ApiException {
        UUID serverId = null;
        ServerListResponse response = api.startServer(serverId);

        // TODO: test validations
    }
    
    /**
     * Stop server
     *
     * Stops a started server. The server state must be &#x60;started&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopServerTest() throws ApiException {
        UUID serverId = null;
        StopServer stopServer = null;
        ServerListResponse response = api.stopServer(serverId, stopServer);

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

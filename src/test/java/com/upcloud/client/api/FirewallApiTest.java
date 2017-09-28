/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.FirewallRuleCreateResponse;
import com.upcloud.client.models.FirewallRuleListResponse;
import com.upcloud.client.models.FirewallRuleRequest;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FirewallApi
 */
@Ignore
public class FirewallApiTest {

    private final FirewallApi api = new FirewallApi();

    
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
        FirewallRuleRequest firewallRule = null;
        FirewallRuleCreateResponse response = api.createFirewallRule(serverId, firewallRule);

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
        FirewallRuleCreateResponse response = api.getFirewallRule(serverId, firewallRuleNumber);

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
    
}

/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.AssignIpResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.IpAddress;
import com.upcloud.client.models.IpAddress1;
import com.upcloud.client.models.IpAddressListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IPAddressApi
 */
@Ignore
public class IPAddressApiTest {

    private final IPAddressApi api = new IPAddressApi();

    
    /**
     * Assign IP address
     *
     * Assigns a new IP address to a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addIpTest() throws ApiException {
        IpAddress ipAddress = null;
        AssignIpResponse response = api.addIp(ipAddress);

        // TODO: test validations
    }
    
    /**
     * Release IP address
     *
     * Removes an IP address from a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIpTest() throws ApiException {
        String ip = null;
        api.deleteIp(ip);

        // TODO: test validations
    }
    
    /**
     * Get IP address details
     *
     * Returns detailed information about a specific IP address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String ip = null;
        AssignIpResponse response = api.getDetails(ip);

        // TODO: test validations
    }
    
    /**
     * List IP addresses
     *
     * Returns a list of all IP addresses assigned to servers on the current user account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIpsTest() throws ApiException {
        IpAddressListResponse response = api.listIps();

        // TODO: test validations
    }
    
    /**
     * Modify IP address
     *
     * Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyIpTest() throws ApiException {
        String ip = null;
        IpAddress1 ipAddress = null;
        AssignIpResponse response = api.modifyIp(ip, ipAddress);

        // TODO: test validations
    }
    
}

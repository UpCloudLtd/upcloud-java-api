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
import org.junit.jupiter.api.*;
import utils.ServerHelpers;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for IPAddressApi
 */
public class IPAddressApiTest {

    private static final IPAddressApi api = new IPAddressApi();
    private static IpAddress testIpAddress = new IpAddress();
    private static Server testServer = new Server();

    @BeforeAll
    public static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);

        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        testServer = serverHelper.createReadyServer(null);
        serverHelper.stopAllServers();
    }

    @AfterAll
    public static void setDown() {
        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        serverHelper.deleteAllServers();
    }

    @BeforeEach
    public void setUpEach() throws ApiException {
        UUID serverId = testServer.getUuid();
        testIpAddress = new IpAddress().family(IpAddress.FamilyEnum.IPV4).server(serverId);
        AssignIpResponse response = api.addIp(new AddIpRequest().ipAddress(testIpAddress));
        testIpAddress = response.getIpAddress();
    }

    @AfterEach
    public void setDownEach() throws ApiException {
        if (testIpAddress != null) {
            api.deleteIp(testIpAddress.getAddress());
        }
    }

    /**
     * Assign IP address
     * <p>
     * Assigns a new IP address to a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addIpTest() throws ApiException {
        UUID serverId = testServer.getUuid();
        IpAddress ipAddress = new IpAddress().family(IpAddress.FamilyEnum.IPV4).server(serverId);
        AssignIpResponse response = api.addIp(new AddIpRequest().ipAddress(ipAddress));
        ipAddress = response.getIpAddress();
        assertEquals(IpAddress.AccessEnum.PUBLIC, ipAddress.getAccess());
        assertEquals(IpAddress.FamilyEnum.IPV4, ipAddress.getFamily());
        assertEquals(serverId, ipAddress.getServer());
    }

    /**
     * Release IP address
     * <p>
     * Removes an IP address from a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIpTest() throws ApiException {
        api.deleteIp(testIpAddress.getAddress());
        ApiException exception = assertThrows(ApiException.class, () -> api.getDetails(testIpAddress.getAddress()));
        assertEquals("Not Found", exception.getMessage());
        testIpAddress = null;
    }

    /**
     * Get IP address details
     * <p>
     * Returns detailed information about a specific IP address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String ip = testIpAddress.getAddress();
        AssignIpResponse response = api.getDetails(ip);
        IpAddress ipAddress = response.getIpAddress();

        assertEquals(testIpAddress.getAccess(), ipAddress.getAccess());
        assertEquals(testIpAddress.getAddress(), ipAddress.getAddress());
        assertEquals(testIpAddress.getFamily(), ipAddress.getFamily());
        assertNotNull(ipAddress.getPtrRecord());
        assertNotNull(ipAddress.getServer());
    }

    /**
     * List IP addresses
     * <p>
     * Returns a list of all IP addresses assigned to servers on the current user account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIpsTest() throws ApiException {
        IpAddressListResponse response = api.listIps();
        List<IpAddress> ipAddresses = response.getIpAddresses().getIpAddress();
        assertTrue(
                ipAddresses.stream().anyMatch(ipAddress -> ipAddress.getAddress().equals(testIpAddress.getAddress())));
    }

    /**
     * Modify IP address
     * <p>
     * Modifies the reverse DNS PTR record corresponding to an IP address. The PTR record can only be set to public IP address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyIpTest() throws ApiException {
        String ip = testIpAddress.getAddress();
        IpAddress ipAddress = new IpAddress().ptrRecord("hostname.example.com");
        AssignIpResponse response = api.modifyIp(ip, new ModifyIpRequest().ipAddress(ipAddress));
        ipAddress = response.getIpAddress();
        assertEquals("hostname.example.com", ipAddress.getPtrRecord());
        assertEquals(testIpAddress.getAccess(), ipAddress.getAccess());
        assertEquals(testIpAddress.getFamily(), ipAddress.getFamily());
        assertEquals(testIpAddress.getServer(), ipAddress.getServer());
    }

}

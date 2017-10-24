/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */

package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.ZoneListResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for ZoneApi
 */
public class ZoneApiTest {

    private static final ZoneApi api = new ZoneApi();

    @BeforeAll
    public static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);
    }

    /**
     * List available zones
     * <p>
     * Returns a list of available zones.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listZonesTest() throws ApiException {
        ZoneListResponse response = api.listZones();
        assertTrue(response.getZones().getZone().size() > 0);
    }

}

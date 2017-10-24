/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */

package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.TimezoneListResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for TimezoneApi
 */
public class TimezoneApiTest {

    private static final TimezoneApi api = new TimezoneApi();

    @BeforeAll
    public static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);
    }

    /**
     * List timezones
     * <p>
     * Returns a list of available timezones. Timezones are used to set the hardware clock for servers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTimezonesTest() throws ApiException {
        TimezoneListResponse response = api.listTimezones();
        List<String> continentals = Arrays.asList(new String[] { "Africa", "America", "Antarctica", "Arctic", "Asia",
                "Atlantic", "Australia", "Europe", "Indian", "Pacific" });

        List<String> timezones = response.getTimezones().getTimezone();
        assertTrue(timezones.stream()
                .allMatch(timezone -> continentals.contains(timezone.split("/")[0]) || timezone.equals("UTC")));
    }

}

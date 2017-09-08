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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimezoneApi
 */
@Ignore
public class TimezoneApiTest {

    private final TimezoneApi api = new TimezoneApi();

    
    /**
     * List timezones
     *
     * Returns a list of available timezones. Timezones are used to set the hardware clock for servers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTimezonesTest() throws ApiException {
        TimezoneListResponse response = api.listTimezones();

        // TODO: test validations
    }
    
}

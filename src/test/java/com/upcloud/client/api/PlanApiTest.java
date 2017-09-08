/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.AvailablePlanListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlanApi
 */
@Ignore
public class PlanApiTest {

    private final PlanApi api = new PlanApi();

    
    /**
     * List available plans
     *
     * Returns a list of available plans.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPlansTest() throws ApiException {
        AvailablePlanListResponse response = api.listPlans();

        // TODO: test validations
    }
    
}

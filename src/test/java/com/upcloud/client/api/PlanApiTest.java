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
import com.upcloud.client.models.Plan;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * API tests for PlanApi
 */
public class PlanApiTest {

    private static final PlanApi api = new PlanApi();

    @BeforeAll
    private static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
    }

    /**
     * List available plans
     * <p>
     * Returns a list of available plans.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPlansTest() throws ApiException {
        AvailablePlanListResponse response = api.listPlans();
        List<Plan> plans = response.getPlans().getPlan();

        assertNotEquals(0, plans.size());
        Plan plan = plans.get(0);
        assertNotNull(plan.getCoreNumber());
        assertNotNull(plan.getMemoryAmount());
        assertNotNull(plan.getName());
        assertNotNull(plan.getPublicTrafficOut());
        assertNotNull(plan.getStorageSize());
        assertNotNull(plan.getStorageTier());
    }

}

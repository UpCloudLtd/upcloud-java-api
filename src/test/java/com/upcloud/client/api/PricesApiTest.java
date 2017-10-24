/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */

package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.PriceListResponse;
import com.upcloud.client.models.PriceZone;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * API tests for PricesApi
 */
public class PricesApiTest {

    private static final PricesApi api = new PricesApi();

    @BeforeAll
    private static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);
    }

    /**
     * List prices
     * <p>
     * Returns a list resource prices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPricesTest() throws ApiException {
        PriceListResponse response = api.listPrices();
        List<PriceZone> priceZones = response.getPrices().getZone();
        PriceZone priceZone = priceZones.get(0);

        assertNotEquals(0, priceZones.size());
        assertNotNull(priceZone.getName());
        assertNotNull(priceZone.getFirewall());
        assertNotNull(priceZone.getIoRequestBackup());
        assertNotNull(priceZone.getIoRequestMaxiops());
        assertNotNull(priceZone.getIpv4Address());
        assertNotNull(priceZone.getIpv6Address());
        assertNotNull(priceZone.getPublicIpv4BandwidthIn());
        assertNotNull(priceZone.getPublicIpv4BandwidthOut());
        assertNotNull(priceZone.getPublicIpv6BandwidthIn());
        assertNotNull(priceZone.getPublicIpv6BandwidthOut());
        assertNotNull(priceZone.getServerCore());
        assertNotNull(priceZone.getServerMemory());
        assertNotNull(priceZone.getServerPlan1xCPU1GB());
        assertNotNull(priceZone.getServerPlan2xCPU2GB());
        assertNotNull(priceZone.getStorageBackup());
        assertNotNull(priceZone.getStorageMaxiops());
    }

}

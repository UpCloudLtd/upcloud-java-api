/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.Account;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * Account information
     *
     * Returns information on the user&#39;s account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        Account response = api.getAccount();

        // TODO: test validations
    }
    
}

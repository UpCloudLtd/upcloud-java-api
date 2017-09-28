/*
 * Upcloud api
 * The UpCloud API consists of operations used to control resources on UpCloud. The API is a web service interface. HTTPS is used to connect to the API. The API follows the principles of a RESTful web service wherever possible. The base URL for all API operations is  https://api.upcloud.com/. All API operations require authentication.
 *
 * OpenAPI spec version: 1.2.0
 * 
 */


package com.upcloud.client.api;

import com.upcloud.client.ApiException;
import com.upcloud.client.models.CreateServerResponse;
import com.upcloud.client.models.CreateStorageResponse;
import com.upcloud.client.models.Error;
import com.upcloud.client.models.Storage;
import com.upcloud.client.models.Storage1;
import com.upcloud.client.models.Storage2;
import com.upcloud.client.models.Storage3;
import com.upcloud.client.models.Storage4;
import com.upcloud.client.models.StorageDevice;
import com.upcloud.client.models.StorageDevice1;
import com.upcloud.client.models.SuccessStoragesResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageApi
 */
@Ignore
public class StorageApiTest {

    private final StorageApi api = new StorageApi();

    
    /**
     * Attach storage
     *
     * Attaches a storage as a device to a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachStorageTest() throws ApiException {
        UUID serverId = null;
        StorageDevice storageDevice = null;
        CreateServerResponse response = api.attachStorage(serverId, storageDevice);

        // TODO: test validations
    }
    
    /**
     * Create backup
     *
     * Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupStorageTest() throws ApiException {
        UUID storageId = null;
        Storage4 storage = null;
        CreateStorageResponse response = api.backupStorage(storageId, storage);

        // TODO: test validations
    }
    
    /**
     * Cancel storage operation
     *
     * Cancels a running cloning operation and deletes the incomplete copy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOperationTest() throws ApiException {
        UUID storageId = null;
        api.cancelOperation(storageId);

        // TODO: test validations
    }
    
    /**
     * Clone storage
     *
     * Creates an exact copy of an existing storage resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cloneStorageTest() throws ApiException {
        UUID storageId = null;
        Storage2 storage = null;
        CreateStorageResponse response = api.cloneStorage(storageId, storage);

        // TODO: test validations
    }
    
    /**
     * Create storage
     *
     * Creates a new storage resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStorageTest() throws ApiException {
        Storage storage = null;
        CreateStorageResponse response = api.createStorage(storage);

        // TODO: test validations
    }
    
    /**
     * Delete storage
     *
     * Deleted an existing storage resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStorageTest() throws ApiException {
        UUID storageId = null;
        api.deleteStorage(storageId);

        // TODO: test validations
    }
    
    /**
     * Detach storage
     *
     * Detaches a storage resource from a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachStorageTest() throws ApiException {
        UUID serverId = null;
        StorageDevice storageDevice = null;
        CreateServerResponse response = api.detachStorage(serverId, storageDevice);

        // TODO: test validations
    }
    
    /**
     * Eject CD-ROM
     *
     * Ejects the storage from the CD-ROM device of a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ejectCdromTest() throws ApiException {
        UUID serverId = null;
        CreateServerResponse response = api.ejectCdrom(serverId);

        // TODO: test validations
    }
    
    /**
     * Add storage to favorites
     *
     * Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void favoriteStorageTest() throws ApiException {
        UUID storageId = null;
        api.favoriteStorage(storageId);

        // TODO: test validations
    }
    
    /**
     * Get storage details
     *
     * Returns detailed information about a specific storage resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageDetailsTest() throws ApiException {
        UUID storageId = null;
        CreateStorageResponse response = api.getStorageDetails(storageId);

        // TODO: test validations
    }
    
    /**
     * List of storages by type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStorageTypesTest() throws ApiException {
        String type = null;
        SuccessStoragesResponse response = api.listStorageTypes(type);

        // TODO: test validations
    }
    
    /**
     * List of storages
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStoragesTest() throws ApiException {
        SuccessStoragesResponse response = api.listStorages();

        // TODO: test validations
    }
    
    /**
     * Load CD-ROM
     *
     * Loads a storage as a CD-ROM in the CD-ROM device of a server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadCdromTest() throws ApiException {
        UUID serverId = null;
        StorageDevice1 storageDevice = null;
        CreateServerResponse response = api.loadCdrom(serverId, storageDevice);

        // TODO: test validations
    }
    
    /**
     * Modify storage
     *
     * Modifies an existing storage resource. This operation is used to rename or resize the storage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyStorageTest() throws ApiException {
        UUID storageId = null;
        Storage1 storage = null;
        CreateStorageResponse response = api.modifyStorage(storageId, storage);

        // TODO: test validations
    }
    
    /**
     * Restore backup
     *
     * Restores the origin storage with data from the specified backup storage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreStorageTest() throws ApiException {
        UUID storageId = null;
        api.restoreStorage(storageId);

        // TODO: test validations
    }
    
    /**
     * Templatize storage
     *
     * Creates an exact copy of an existing storage resource which can be used as a template for creating new servers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatizeStorageTest() throws ApiException {
        UUID storageId = null;
        Storage3 storage = null;
        CreateStorageResponse response = api.templatizeStorage(storageId, storage);

        // TODO: test validations
    }
    
    /**
     * Remove storage from favorites
     *
     * Delete a storage from the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unfavoriteStorageTest() throws ApiException {
        UUID storageId = null;
        api.unfavoriteStorage(storageId);

        // TODO: test validations
    }
    
}

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
import utils.StorageHelpers;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for StorageApi
 */
public class StorageApiTest {

    private static final StorageApi api = new StorageApi();
    private static Server testServer;
    private static Storage testStorage;

    @BeforeAll
    private static void setUp() {
        api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
        api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
        api.getApiClient().setDebugging(true);

        StorageHelpers.apiClient = api.getApiClient();

        ServerHelpers serverHelpers = new ServerHelpers(api.getApiClient());
        testServer = serverHelpers.createReadyServer(null);
        serverHelpers.stopAllServers();
    }

    @AfterAll
    private static void setDown() throws ApiException {
        ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
        serverHelper.deleteAllServers();
        StorageHelpers.deleteAllStorages();
    }

    @BeforeEach
    private void setUpEach() throws ApiException {
        testStorage = new Storage().size(BigDecimal.valueOf(10)).tier(StorageTier.MAXIOPS)
                .title("Test create storage storage").zone("fi-hel1").backupRule(new BackupRule()
                        .interval(BackupRule.IntervalEnum.DAILY).time("0430").retention(BigDecimal.valueOf(365)));
        testStorage = api.createStorage(new CreateStorageRequest().storage(testStorage)).getStorage();
    }

    @AfterEach
    private void setDownEach() throws ApiException {
        if (testStorage != null) {
            StorageHelpers.deleteStorage(testStorage);
        }
    }

    /**
     * Attach storage
     * <p>
     * Attaches a storage as a device to a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachStorageTest() throws ApiException {
        UUID serverId = testServer.getUuid();
        StorageDevice storageDevice = new StorageDevice().storage(testStorage.getUuid().toString()).address("scsi:0:0")
                .type("disk");
        CreateServerResponse response = api.attachStorage(serverId,
                new AttachStorageDeviceRequest().storageDevice(storageDevice));
        Server server = response.getServer();
        assertTrue(server.getStorageDevices().getStorageDevice().stream()
                .anyMatch(item -> item.getStorageTitle().equals("Test create storage storage")));
        server = api
                .detachStorage(serverId,
                        new StorageDeviceDetachRequest().storageDevice(new StorageDevice().address("scsi:0:0")))
                .getServer();
        assertTrue(server.getStorageDevices().getStorageDevice().stream()
                .noneMatch(item -> item.getAddress().equals("scsi:0:0")));
    }

    /**
     * Create backup
     * <p>
     * Creates a point-in-time backup of a storage resource. For automatic, scheduled backups, see  &#x60;backup_rule&#x60; in Create storage or Modify storage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backupStorageTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        CreateStorageResponse response = api.backupStorage(storageId,
                new CreateBackupStorageRequest().storage(new Storage().title("Test backup")));
        Storage storage = response.getStorage();

        assertEquals(testStorage.getAccess(), storage.getAccess());
        assertEquals(testStorage.getLicense(), storage.getLicense());
        assertEquals(testStorage.getUuid(), storage.getOrigin());
        assertEquals("Test backup", storage.getTitle());
    }

    /**
     * Cancel storage operation
     * <p>
     * Cancels a running cloning operation and deletes the incomplete copy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelOperationTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        Storage clonedStorage = new Storage().title("Cloned storage").zone("fi-hel1").tier(StorageTier.MAXIOPS);
        CreateStorageResponse response = api.cloneStorage(storageId, new CloneStorageRequest().storage(clonedStorage));
        clonedStorage = response.getStorage();
        api.cancelOperation(clonedStorage.getUuid());
        final UUID clonedStorageId = clonedStorage.getUuid();

        assertEquals(api.getStorageDetails(clonedStorageId).getStorage().getState(), StorageState.MAINTENANCE);
    }

    /**
     * Clone storage
     * <p>
     * Creates an exact copy of an existing storage resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloneStorageTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        Storage clonedStorage = new Storage().title("Cloned storage").zone("fi-hel1").tier(StorageTier.MAXIOPS);
        CreateStorageResponse response = api.cloneStorage(storageId, new CloneStorageRequest().storage(clonedStorage));
        clonedStorage = response.getStorage();

        assertNull(clonedStorage.getOrigin());
        assertEquals("Cloned storage", clonedStorage.getTitle());
        StorageHelpers.deleteStorage(clonedStorage);
    }

    /**
     * Create storage
     * <p>
     * Creates a new storage resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createStorageTest() throws ApiException {
        Storage storage = new Storage().size(BigDecimal.valueOf(10)).tier(StorageTier.MAXIOPS)
                .title("Test create storage storage").zone("fi-hel1").backupRule(new BackupRule()
                        .interval(BackupRule.IntervalEnum.DAILY).time("0430").retention(BigDecimal.valueOf(365)));
        CreateStorageResponse response = api.createStorage(new CreateStorageRequest().storage(storage));
        storage = response.getStorage();

        assertEquals(StorageAccessType.PRIVATE, storage.getAccess());
        assertNotNull(storage.getBackupRule());
        assertNotNull(storage.getBackups());
        assertEquals(BigDecimal.ZERO, storage.getLicense());
        assertNotNull(storage.getServers());
        assertEquals(BigDecimal.valueOf(10), storage.getSize());
        assertEquals(StorageState.ONLINE, storage.getState());
        assertEquals(StorageTier.MAXIOPS, storage.getTier());
        assertEquals("Test create storage storage", storage.getTitle());
        assertEquals(StorageType.NORMAL, storage.getType());
        assertNotNull(storage.getUuid());
        assertNotNull(storage.getZone());

        api.deleteStorage(storage.getUuid());
    }

    /**
     * Delete storage
     * <p>
     * Deleted an existing storage resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteStorageTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        api.deleteStorage(storageId);

        ApiException exception = assertThrows(ApiException.class, () -> api.getStorageDetails(storageId));
        assertEquals("Not Found", exception.getMessage());
        assertEquals(404, exception.getCode());
        testStorage = null;
    }

    /**
     * Eject CD-ROM
     * <p>
     * Ejects the storage from the CD-ROM device of a server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ejectCdromTest() throws ApiException {
        UUID serverId = testServer.getUuid();
        StorageDevice storageDevice = new StorageDevice().storage(testStorage.getUuid().toString()).address("scsi:0:0")
                .type("cdrom");
        api.attachStorage(serverId, new AttachStorageDeviceRequest().storageDevice(storageDevice));
        api.ejectCdrom(serverId);
        ServerApi serverApi = new ServerApi();
        serverApi.setApiClient(api.getApiClient());
        Server server = serverApi.serverDetails(serverId).getServer();
        api.detachStorage(serverId,
                new StorageDeviceDetachRequest().storageDevice(new StorageDevice().address("scsi:0:0")));

        assertTrue(server.getStorageDevices().getStorageDevice().stream()
                .anyMatch(storage -> storage.getType().equals("cdrom") && storage.getStorage().equals("")));
    }

    /**
     * Add storage to favorites
     * <p>
     * Adds a storage to the list of favorite storages. To list favorite storages, see List storages. This operations succeeds even if the storage is already on the list of favorites.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void favoriteStorageTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        List<Storage> favoritedStorages = api.listStorageTypes("favorite").getStorages().getStorage();
        int favoritesCount = favoritedStorages.size();
        api.favoriteStorage(storageId);
        favoritedStorages = api.listStorageTypes("favorite").getStorages().getStorage();
        assertEquals(favoritesCount + 1, favoritedStorages.size());
    }

    /**
     * Get storage details
     * <p>
     * Returns detailed information about a specific storage resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStorageDetailsTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        CreateStorageResponse response = api.getStorageDetails(storageId);
        Storage storage = response.getStorage();

        assertEquals("Test create storage storage", storage.getTitle());
    }

    /**
     * List of storages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listStoragesTest() throws ApiException {
        SuccessStoragesResponse response = api.listStorages();
        List<Storage> storageList = response.getStorages().getStorage();

        assertTrue(storageList.size() > 0);
        assertTrue(storageList.stream().anyMatch(storage -> storage.getTitle().equals("Test create storage storage")));
    }

    /**
     * Modify storage
     * <p>
     * Modifies an existing storage resource. This operation is used to rename or resize the storage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyStorageTest() throws ApiException {
        UUID storageId = testStorage.getUuid();
        CreateStorageResponse response = api.modifyStorage(storageId,
                new ModifyStorageRequest().storage(new Storage().title("Modified title")));
        Storage modifiedStorage = response.getStorage();

        assertEquals("Modified title", modifiedStorage.getTitle());
    }

}

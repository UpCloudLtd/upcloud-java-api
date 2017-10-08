package utils;

import com.upcloud.client.ApiClient;
import com.upcloud.client.ApiException;
import com.upcloud.client.api.StorageApi;
import com.upcloud.client.models.Storage;
import com.upcloud.client.models.StorageState;

import java.util.List;
import java.util.logging.Logger;

public class StorageHelpers {
    public static ApiClient apiClient;

    public static void deleteStorage(Storage storage) {
        Logger.getGlobal().info("Trying to remove storage: " + storage.getUuid());
        Logger.getGlobal().info("Storage state: " + storage.getState());
        StorageApi api = new StorageApi();
        api.setApiClient(apiClient);
        try {
            storage = api.getStorageDetails(storage.getUuid()).getStorage();
            if (storage.getState() != StorageState.BACKUPING && storage.getState() != StorageState.CLONING && storage.getState() != StorageState.MAINTENANCE) {
                api.deleteStorage(storage.getUuid());
            } else {
                try {
                    Logger.getGlobal().info("Next try in 5 seconds...");
                    Thread.sleep(5000);
                    deleteStorage(storage);
                } catch (InterruptedException e) {
                    Logger.getGlobal().warning(e.getMessage());
                }
            }
        } catch (ApiException e) {
            Logger.getGlobal().warning("Error deleting storage: " + e.getResponseBody());
        }
    }

    public static void deleteAllStorages() throws ApiException {
        StorageApi api = new StorageApi();
        api.setApiClient(apiClient);
        List<Storage> storageList = api.listStorages().getStorages().getStorage();
        storageList.stream().forEach(storage -> deleteStorage(storage));
    }
}

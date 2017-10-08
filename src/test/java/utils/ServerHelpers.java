package utils;

import com.upcloud.client.ApiClient;
import com.upcloud.client.ApiException;
import com.upcloud.client.api.ServerApi;
import com.upcloud.client.models.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;

public class ServerHelpers {
    private final StorageDevice defaultStorageDevice = new StorageDevice()
            .action("clone")
            .title("Debian from a template")
            .storage("01000000-0000-4000-8000-000020030100")
            .size(BigDecimal.valueOf(50))
            .tier("maxiops");
    private final Server defaultServer = new Server()
            .zone("fi-hel1")
            .title("Test server")
            .hostname("debian.example.com")
            .plan("2xCPU-2GB")
            .storageDevices(new ServerStorageDevices().addStorageDeviceItem(defaultStorageDevice));
    private ServerApi api = new ServerApi();
    private Logger logger = Logger.getGlobal();

    public ServerHelpers(ApiClient apiClient) {
        api.setApiClient(apiClient);
    }

    public Server createReadyServer(Server server) {
        try {
            Logger.getGlobal().info("1");
            if (server == null) {
                server = defaultServer;
            }
            if (server == null || server.getUuid() == null) {
                Server createdServer = api.createServer(new CreateServerRequest().server(server)).getServer();
                return createReadyServer(createdServer);
            } else {
                Logger.getGlobal().info("2");
                server = api.serverDetails(server.getUuid()).getServer();
                if (server.getState() == ServerState.MAINTENANCE) {
                    Logger.getGlobal().info("Waiting for server...");
                    Thread.sleep(5000);
                    return createReadyServer(server);
                } else {
                    return server;
                }
            }
        } catch (ApiException e) {
            Logger.getGlobal().warning("Can't create server: " + e.getResponseBody());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void stopServer(Server server, int tryings) {
        logger.info("Trying #" + tryings);
        if (server != null) {
            if (server.getState() != ServerState.STOPPED) {
                logger.info("Stopping server...");
                try {
                    server = api.stopServer(server.getUuid(), new StopServer()
                            .stopServer(new StopServerRequest()
                                    .stopType(StopServerRequest.StopTypeEnum.SOFT)
                                    .timeout(BigDecimal.valueOf(60))))
                            .getServer();
                    try {
                        Thread.sleep(15000);
                    } catch (InterruptedException ie) {
                        logger.warning(ie.getLocalizedMessage());
                    }
                    stopServer(server, tryings + 1);
                } catch (ApiException e) {
                    logger.info("Stopping error: " + e.getResponseBody());
                }
            }
        }
    }

    public void stopAllServers() {
        try {
            List<Server> serverList = api.listServers().getServers().getServer();
            for (Server server : serverList) {
                stopServer(server, 0);
            }
        } catch (ApiException e) {
            Logger.getGlobal().warning("Message: " + e.getMessage());
            Logger.getGlobal().warning("Response body: " + e.getResponseBody());
        }
    }


    public void deleteServer(Server server, int tryings) {
        try {
            logger.info("Trying to delete server: " + server.getUuid());
            logger.info("Trying #" + tryings);
            if (server != null) {
                if (server.getState() != ServerState.STOPPED) {
                    logger.info("Stopping server...");
                    try {
                        server = api.stopServer(server.getUuid(), new StopServer()
                                .stopServer(new StopServerRequest()
                                        .stopType(StopServerRequest.StopTypeEnum.SOFT)
                                        .timeout(BigDecimal.valueOf(60))))
                                .getServer();
                    } catch (ApiException e) {
                        logger.info("Stopping error: " + e.getResponseBody());
                    }
                }
                api.deleteServer(server.getUuid());
            }
        } catch (ApiException e) {
            logger.warning("Delete error: " + e.getMessage());
            logger.warning("Response body: " + e.getResponseBody());
            if (e.getMessage().equals("Conflict") && tryings < 20) {
                logger.info("Try again in one minute...");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException ie) {
                    logger.warning(ie.getLocalizedMessage());
                }
                deleteServer(server, tryings + 1);
            } else {
                logger.warning("Can't delete all test servers");
            }
        }
    }

    public void deleteAllServers() {
        try {
            List<Server> serverList = api.listServers().getServers().getServer();
            for (Server server : serverList) {
                deleteServer(server, 0);
            }
        } catch (ApiException e) {
            Logger.getGlobal().warning("Message: " + e.getMessage());
            Logger.getGlobal().warning("Response body: " + e.getResponseBody());
        }
    }
}

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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for FirewallApi
 */
public class FirewallApiTest {

        private static final FirewallApi api = new FirewallApi();
        private static final FirewallRule testFirewallRule = new FirewallRule();
        private static final ArrayList<FirewallRule> testFirewallRules = new ArrayList<>();
        private static Server testServer;

        @BeforeAll
        public static void setUp() {
                api.getApiClient().setUsername(System.getenv("UPCLOUD_API_TEST_USER"));
                api.getApiClient().setPassword(System.getenv("UPCLOUD_API_TEST_PASSWORD"));
                api.getApiClient().setDebugging(true);

                ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
                serverHelper.deleteAllServers();

                StorageDevice testStorageDevice = new StorageDevice().action("clone").title("Debian from a template")
                                .size(BigDecimal.valueOf(50)).storage("01000000-0000-4000-8000-000020030100")
                                .tier("maxiops");

                Server newServer = new Server().zone("fi-hel1").title("Firewall test server")
                                .hostname("debian.example.com").plan("2xCPU-2GB")
                                .storageDevices(new ServerStorageDevices().addStorageDeviceItem(testStorageDevice));

                Logger.getGlobal().info("Creting server...");
                testServer = serverHelper.createReadyServer(newServer);

                testFirewallRule.position(BigDecimal.valueOf(500)).direction(FirewallRule.DirectionEnum.IN)
                                .family(AddressFamily.IPV4).protocol(FirewallRule.ProtocolEnum.TCP)
                                .sourceAddressStart("192.168.1.1").sourceAddressEnd("192.168.1.255")
                                .sourcePortStart(BigDecimal.valueOf(1)).sourcePortEnd(BigDecimal.valueOf(32000))
                                .destinationPortStart(BigDecimal.valueOf(22)).destinationPortEnd(BigDecimal.valueOf(22))
                                .action(FirewallRule.ActionEnum.ACCEPT).comment("Allow SSH from this network");
        }

        @AfterAll
        public static void setDown() throws ApiException {
                ServerHelpers serverHelper = new ServerHelpers(api.getApiClient());
                serverHelper.deleteAllServers();
        }

        @BeforeEach
        public void setUpEach() throws ApiException {
                UUID serverId = testServer.getUuid();

                FirewallRule firewallRule = api.createFirewallRule(serverId,
                                new FirewallRuleRequest().firewallRule(new FirewallRule()
                                                .direction(FirewallRule.DirectionEnum.IN).family(AddressFamily.IPV4)
                                                .protocol(FirewallRule.ProtocolEnum.TCP)
                                                .sourceAddressStart("193.168.1.1").sourceAddressEnd("193.168.1.255")
                                                .sourcePortStart(BigDecimal.valueOf(1))
                                                .sourcePortEnd(BigDecimal.valueOf(32000))
                                                .destinationPortStart(BigDecimal.valueOf(22))
                                                .destinationPortEnd(BigDecimal.valueOf(22))
                                                .action(FirewallRule.ActionEnum.ACCEPT)
                                                .comment("Common firewall rule")))
                                .getFirewallRule();

                testFirewallRules.add(firewallRule);
        }

        @AfterEach
        public void setDownEach() throws ApiException {
                UUID serverId = testServer.getUuid();
                for (FirewallRule firewallRule : testFirewallRules) {
                        api.deleteFirewallRule(serverId, firewallRule.getPosition());
                }
                testFirewallRules.clear();
        }

        /**
         * Create firewall rule
         * <p>
         * Creates a new firewall rule
         *
         * @throws ApiException if the Api call fails
         */
        @Test
        public void createFirewallRuleTest() throws ApiException {
                UUID serverId = testServer.getUuid();

                FirewallRule createdRule = api
                                .createFirewallRule(serverId, new FirewallRuleRequest().firewallRule(testFirewallRule))
                                .getFirewallRule();

                assertEquals(createdRule.getDirection(), FirewallRule.DirectionEnum.IN);
                assertEquals(createdRule.getAction(), FirewallRule.ActionEnum.ACCEPT);
                assertEquals(createdRule.getFamily(), AddressFamily.IPV4);
                assertEquals(createdRule.getIcmpType(), "");
                assertEquals(createdRule.getDestinationAddressStart(), "");
                assertEquals(createdRule.getDestinationAddressEnd(), "");
                assertEquals(createdRule.getDestinationPortStart().toString(), "22");
                assertEquals(createdRule.getDestinationPortEnd().toString(), "22");
                assertEquals(createdRule.getSourceAddressStart(), "192.168.1.1");
                assertEquals(createdRule.getSourceAddressEnd(), "192.168.1.255");
                assertEquals(createdRule.getSourcePortStart(), BigDecimal.valueOf(1));
                assertEquals(createdRule.getSourcePortEnd(), BigDecimal.valueOf(32000));

                api.deleteFirewallRule(serverId, createdRule.getPosition());
        }

        /**
         * Remove firewall rule
         * <p>
         * Removes a firewall rule from a server. Firewall rules must be removed individually. The positions of remaining firewall rules will be adjusted after a rule is removed.
         *
         * @throws ApiException if the Api call fails
         */
        @Test
        public void deleteFirewallRuleTest() throws ApiException {
                final UUID serverId = testServer.getUuid();
                Logger.getGlobal().info("Creating rule");
                FirewallRule createdRule = api
                                .createFirewallRule(serverId, new FirewallRuleRequest().firewallRule(testFirewallRule))
                                .getFirewallRule();
                final FirewallRule ruleForDelete = api.getFirewallRule(serverId, createdRule.getPosition())
                                .getFirewallRule();
                assertEquals(createdRule.getPosition(), ruleForDelete.getPosition());
                api.deleteFirewallRule(serverId, ruleForDelete.getPosition());
                ApiException exception = assertThrows(ApiException.class,
                                () -> api.getFirewallRule(serverId, ruleForDelete.getPosition()).getFirewallRule());
                assertEquals(exception.getMessage(), "Not Found");
        }

        /**
         * List firewall rules
         * <p>
         * Returns a list of firewall rules for a specific server.
         *
         * @throws ApiException if the Api call fails
         */
        @Test
        public void serverServerIdFirewallRuleGetTest() throws ApiException {
                UUID serverId = testServer.getUuid();
                List<FirewallRule> firewallRules = api.serverServerIdFirewallRuleGet(serverId).getFirewallRules()
                                .getFirewallRule();

                assertTrue(firewallRules.stream().anyMatch(item -> item.getComment().equals("Common firewall rule")));
        }

}

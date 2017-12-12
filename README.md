# UpCloud Java API client library

[![Build Status](https://travis-ci.org/UpCloudLtd/upcloud-java-api.svg?branch=master)](https://travis-ci.org/UpCloudLtd/upcloud-java-api)

This is a Java API client library that provides integration with the UpCloud API. It allows cloud resource management on UpCloud's IaaS with easy to use objects and functions for the Java programming language.

The base URL for all API operations is  https://api.upcloud.com/ and require basic authentication using UpCloud username and password. We recommend [creating a subaccount](https://www.upcloud.com/support/server-tags-and-group-accounts/) dedicated for the API communication for security purposes. This allows you to restrict API access by servers, storages, and tags ensuring you will never accidentally affect critical systems.

## Table of content
* [Requirements](#requirements)
* [Installation](#installation)
* [Usage](#usage)
* [Documentation](#documentation)
* [Issues](#issues)
* [License](#license)

## Requirements

Using the client library requires by minimum Java SE 7 while the tests need version 8.

Building the API client requires the software project management tool [Maven](https://maven.apache.org/) to be installed. Follow the install instructions at their documentation.

## Installation

To install the API client library onto your local Maven repository, simply execute the following command:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and run the command below:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM file:

```xml
<dependency>
    <groupId>com.upcloud</groupId>
    <artifactId>UpcloudApi</artifactId>
    <version>1.2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.upcloud:UpcloudApi:1.2.0"
```

### Others

First, generate the JAR by executing the command underneath:

    mvn package

Then manually install the following JARs:

* target/UpcloudApi-1.2.0.jar
* target/lib/*.jar

## Usage

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.upcloud.client.*;
import com.upcloud.client.auth.*;
import com.upcloud.client.models.*;
import com.upcloud.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: baseAuth
        HttpBasicAuth baseAuth = (HttpBasicAuth) defaultClient.getAuthentication("baseAuth");
        baseAuth.setUsername(System.getenv("UPCLOUD_API_USERNAME"));
        baseAuth.setPassword(System.getenv("UPCLOUD_API_PASSWORD"));

        AccountApi apiInstance = new AccountApi();
        try {
            AccountResponse result = apiInstance.getAccount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation

All URIs are relative to *https://api.upcloud.com/1.2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /account | Account information
*FirewallApi* | [**createFirewallRule**](docs/FirewallApi.md#createFirewallRule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
*FirewallApi* | [**deleteFirewallRule**](docs/FirewallApi.md#deleteFirewallRule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
*FirewallApi* | [**getFirewallRule**](docs/FirewallApi.md#getFirewallRule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
*FirewallApi* | [**serverServerIdFirewallRuleGet**](docs/FirewallApi.md#serverServerIdFirewallRuleGet) | **GET** /server/{serverId}/firewall_rule | List firewall rules
*IPAddressApi* | [**addIp**](docs/IPAddressApi.md#addIp) | **POST** /ip_address | Assign IP address
*IPAddressApi* | [**deleteIp**](docs/IPAddressApi.md#deleteIp) | **DELETE** /ip_address/{ip} | Release IP address
*IPAddressApi* | [**getDetails**](docs/IPAddressApi.md#getDetails) | **GET** /ip_address/{ip} | Get IP address details
*IPAddressApi* | [**listIps**](docs/IPAddressApi.md#listIps) | **GET** /ip_address | List IP addresses
*IPAddressApi* | [**modifyIp**](docs/IPAddressApi.md#modifyIp) | **PUT** /ip_address/{ip} | Modify IP address
*PlanApi* | [**listPlans**](docs/PlanApi.md#listPlans) | **GET** /plan | List available plans
*PricesApi* | [**listPrices**](docs/PricesApi.md#listPrices) | **GET** /price | List prices
*ServerApi* | [**assignTag**](docs/ServerApi.md#assignTag) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
*ServerApi* | [**attachStorage**](docs/ServerApi.md#attachStorage) | **POST** /server/{serverId}/storage/attach | Attach storage
*ServerApi* | [**createFirewallRule**](docs/ServerApi.md#createFirewallRule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
*ServerApi* | [**createServer**](docs/ServerApi.md#createServer) | **POST** /server | Create server
*ServerApi* | [**deleteFirewallRule**](docs/ServerApi.md#deleteFirewallRule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
*ServerApi* | [**deleteServer**](docs/ServerApi.md#deleteServer) | **DELETE** /server/{serverId} | Delete server
*ServerApi* | [**detachStorage**](docs/ServerApi.md#detachStorage) | **POST** /server/{serverId}/storage/detach | Detach storage
*ServerApi* | [**ejectCdrom**](docs/ServerApi.md#ejectCdrom) | **POST** /server/{serverId}/cdrom/eject | Eject CD-ROM
*ServerApi* | [**getFirewallRule**](docs/ServerApi.md#getFirewallRule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
*ServerApi* | [**listServerConfigurations**](docs/ServerApi.md#listServerConfigurations) | **GET** /server_size | List server configurations
*ServerApi* | [**listServers**](docs/ServerApi.md#listServers) | **GET** /server | List of servers
*ServerApi* | [**loadCdrom**](docs/ServerApi.md#loadCdrom) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
*ServerApi* | [**modifyServer**](docs/ServerApi.md#modifyServer) | **PUT** /server/{serverId} | Modify server
*ServerApi* | [**restartServer**](docs/ServerApi.md#restartServer) | **POST** /server/{serverId}/restart | Restart server
*ServerApi* | [**serverDetails**](docs/ServerApi.md#serverDetails) | **GET** /server/{serverId} | Get server details
*ServerApi* | [**serverServerIdFirewallRuleGet**](docs/ServerApi.md#serverServerIdFirewallRuleGet) | **GET** /server/{serverId}/firewall_rule | List firewall rules
*ServerApi* | [**startServer**](docs/ServerApi.md#startServer) | **POST** /server/{serverId}/start | Start server
*ServerApi* | [**stopServer**](docs/ServerApi.md#stopServer) | **POST** /server/{serverId}/stop | Stop server
*ServerApi* | [**untag**](docs/ServerApi.md#untag) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server
*StorageApi* | [**attachStorage**](docs/StorageApi.md#attachStorage) | **POST** /server/{serverId}/storage/attach | Attach storage
*StorageApi* | [**backupStorage**](docs/StorageApi.md#backupStorage) | **POST** /storage/{storageId}/backup | Create backup
*StorageApi* | [**cancelOperation**](docs/StorageApi.md#cancelOperation) | **POST** /storage/{storageId}/cancel | Cancel storage operation
*StorageApi* | [**cloneStorage**](docs/StorageApi.md#cloneStorage) | **POST** /storage/{storageId}/clone | Clone storage
*StorageApi* | [**createStorage**](docs/StorageApi.md#createStorage) | **POST** /storage | Create storage
*StorageApi* | [**deleteStorage**](docs/StorageApi.md#deleteStorage) | **DELETE** /storage/{storageId} | Delete storage
*StorageApi* | [**detachStorage**](docs/StorageApi.md#detachStorage) | **POST** /server/{serverId}/storage/detach | Detach storage
*StorageApi* | [**ejectCdrom**](docs/StorageApi.md#ejectCdrom) | **POST** /server/{serverId}/cdrom/eject | Eject CD-ROM
*StorageApi* | [**favoriteStorage**](docs/StorageApi.md#favoriteStorage) | **POST** /storage/{storageId}/favorite | Add storage to favorites
*StorageApi* | [**getStorageDetails**](docs/StorageApi.md#getStorageDetails) | **GET** /storage/{storageId} | Get storage details
*StorageApi* | [**listStorageTypes**](docs/StorageApi.md#listStorageTypes) | **GET** /storage/{type}/ | List of storages by type
*StorageApi* | [**listStorages**](docs/StorageApi.md#listStorages) | **GET** /storage | List of storages
*StorageApi* | [**loadCdrom**](docs/StorageApi.md#loadCdrom) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
*StorageApi* | [**modifyStorage**](docs/StorageApi.md#modifyStorage) | **PUT** /storage/{storageId} | Modify storage
*StorageApi* | [**restoreStorage**](docs/StorageApi.md#restoreStorage) | **POST** /storage/{storageId}/restore | Restore backup
*StorageApi* | [**templatizeStorage**](docs/StorageApi.md#templatizeStorage) | **POST** /storage/{storageId}/templatize | Templatize storage
*StorageApi* | [**unfavoriteStorage**](docs/StorageApi.md#unfavoriteStorage) | **DELETE** /storage/{storageId}/favorite | Remove storage from favorites
*TagApi* | [**assignTag**](docs/TagApi.md#assignTag) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
*TagApi* | [**createTag**](docs/TagApi.md#createTag) | **POST** /tag | Create a new tag
*TagApi* | [**deleteTag**](docs/TagApi.md#deleteTag) | **DELETE** /tag/{tagName} | Delete tag
*TagApi* | [**listTags**](docs/TagApi.md#listTags) | **GET** /tag | List existing tags
*TagApi* | [**modifyTag**](docs/TagApi.md#modifyTag) | **PUT** /tag/{tagName} | Modify existing tag
*TagApi* | [**untag**](docs/TagApi.md#untag) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server
*TimezoneApi* | [**listTimezones**](docs/TimezoneApi.md#listTimezones) | **GET** /timezone | List timezones
*ZoneApi* | [**listZones**](docs/ZoneApi.md#listZones) | **GET** /zone | List available zones


## Documentation of the models

 - [Account](docs/Account.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AddIpRequest](docs/AddIpRequest.md)
 - [AddressFamily](docs/AddressFamily.md)
 - [AssignIpResponse](docs/AssignIpResponse.md)
 - [AttachStorageDeviceRequest](docs/AttachStorageDeviceRequest.md)
 - [AvailablePlanListResponse](docs/AvailablePlanListResponse.md)
 - [AvailablePlanListResponsePlans](docs/AvailablePlanListResponsePlans.md)
 - [BackupRule](docs/BackupRule.md)
 - [CloneStorageRequest](docs/CloneStorageRequest.md)
 - [ConfigurationListResponse](docs/ConfigurationListResponse.md)
 - [ConfigurationListResponseServerSizes](docs/ConfigurationListResponseServerSizes.md)
 - [CreateBackupStorageRequest](docs/CreateBackupStorageRequest.md)
 - [CreateNewTagResponse](docs/CreateNewTagResponse.md)
 - [CreateServerRequest](docs/CreateServerRequest.md)
 - [CreateServerResponse](docs/CreateServerResponse.md)
 - [CreateStorageRequest](docs/CreateStorageRequest.md)
 - [CreateStorageResponse](docs/CreateStorageResponse.md)
 - [Error](docs/Error.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [ErrorError](docs/ErrorError.md)
 - [ErrorStatus](docs/ErrorStatus.md)
 - [FirewallRule](docs/FirewallRule.md)
 - [FirewallRuleCreateResponse](docs/FirewallRuleCreateResponse.md)
 - [FirewallRuleListResponse](docs/FirewallRuleListResponse.md)
 - [FirewallRuleListResponseFirewallRules](docs/FirewallRuleListResponseFirewallRules.md)
 - [FirewallRuleRequest](docs/FirewallRuleRequest.md)
 - [IpAddress](docs/IpAddress.md)
 - [IpAddressListResponse](docs/IpAddressListResponse.md)
 - [IpAddresses](docs/IpAddresses.md)
 - [ModifyIpRequest](docs/ModifyIpRequest.md)
 - [ModifyStorageRequest](docs/ModifyStorageRequest.md)
 - [ModifyTagRequest](docs/ModifyTagRequest.md)
 - [Plan](docs/Plan.md)
 - [Price](docs/Price.md)
 - [PriceListResponse](docs/PriceListResponse.md)
 - [PriceListResponsePrices](docs/PriceListResponsePrices.md)
 - [PriceZone](docs/PriceZone.md)
 - [RestartServer](docs/RestartServer.md)
 - [Server](docs/Server.md)
 - [ServerListResponse](docs/ServerListResponse.md)
 - [ServerListResponseServers](docs/ServerListResponseServers.md)
 - [ServerSize](docs/ServerSize.md)
 - [ServerState](docs/ServerState.md)
 - [ServerStorageDevices](docs/ServerStorageDevices.md)
 - [ServerTags](docs/ServerTags.md)
 - [StopServer](docs/StopServer.md)
 - [StopServerRequest](docs/StopServerRequest.md)
 - [Storage](docs/Storage.md)
 - [StorageAccessType](docs/StorageAccessType.md)
 - [StorageBackups](docs/StorageBackups.md)
 - [StorageDevice](docs/StorageDevice.md)
 - [StorageDeviceDetachRequest](docs/StorageDeviceDetachRequest.md)
 - [StorageDeviceLoadRequest](docs/StorageDeviceLoadRequest.md)
 - [StorageServers](docs/StorageServers.md)
 - [StorageState](docs/StorageState.md)
 - [StorageTier](docs/StorageTier.md)
 - [StorageType](docs/StorageType.md)
 - [SuccessStoragesResponse](docs/SuccessStoragesResponse.md)
 - [SuccessStoragesResponseStorages](docs/SuccessStoragesResponseStorages.md)
 - [Tag](docs/Tag.md)
 - [TagCreateRequest](docs/TagCreateRequest.md)
 - [TagListResponse](docs/TagListResponse.md)
 - [TagListResponseTags](docs/TagListResponseTags.md)
 - [TagServers](docs/TagServers.md)
 - [TemplitizeStorageRequest](docs/TemplitizeStorageRequest.md)
 - [TimezoneListResponse](docs/TimezoneListResponse.md)
 - [TimezoneListResponseTimezones](docs/TimezoneListResponseTimezones.md)
 - [Zone](docs/Zone.md)
 - [ZoneListResponse](docs/ZoneListResponse.md)
 - [ZoneListResponseZones](docs/ZoneListResponseZones.md)


## Documentation for authorization

The username and password should be saved as environmental variables while developing API applications to avoid accidentally publishing your account details.

Authentication schemes defined for the API:
### baseAuth

- **Type**: HTTP basic authentication
# UpCloud PHP API client library

[![Build Status](https://travis-ci.org/UpCloudLtd/upcloud-php-api.svg?branch=master)](https://travis-ci.org/UpCloudLtd/upcloud-php-api)

This PHP API client library provides integration with the UpCloud API allowing operations used to manage resources on UpCloud. The client is a web service interface that uses HTTPS to connect to the API. The API follows the principles of a RESTful web service wherever possible. 

The base URL for all API operations is  https://api.upcloud.com/ and require basic authentication using UpCloud username and password. We recommend [creating a subaccount](https://www.upcloud.com/support/server-tags-and-group-accounts/) dedicated for the API communication for security purposes. This allows you to restrict API access by servers, storages, and tags ensuring you will never accidentally affect critical systems.

## Table of content
* [Installation](#installation)
* [Usage](#usage)
* [Documentation](#documentation)
* [Issues](#issues)
* [License](#license)

## Requirements

Using this library requires the PHP version 5.5 and later.

## Installation
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to//vendor/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Usage

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: baseAuth
Upcloud\ApiClient\Configuration::getDefaultConfiguration()->setUsername('YOUR_USERNAME');
Upcloud\ApiClient\Configuration::getDefaultConfiguration()->setPassword('YOUR_PASSWORD');

$api_instance = new Upcloud\ApiClient\Api\AccountApi();

try {
    $result = $api_instance->getAccount();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccount: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation

All URIs are relative to *https://api.upcloud.com/1.2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getAccount**](docs/Api/AccountApi.md#getaccount) | **GET** /account | Account information
*FirewallApi* | [**createFirewallRule**](docs/Api/FirewallApi.md#createfirewallrule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
*FirewallApi* | [**deleteFirewallRule**](docs/Api/FirewallApi.md#deletefirewallrule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
*FirewallApi* | [**getFirewallRule**](docs/Api/FirewallApi.md#getfirewallrule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
*FirewallApi* | [**serverServerIdFirewallRuleGet**](docs/Api/FirewallApi.md#serverserveridfirewallruleget) | **GET** /server/{serverId}/firewall_rule | List firewall rules
*IPAddressApi* | [**addIp**](docs/Api/IPAddressApi.md#addip) | **POST** /ip_address | Assign IP address
*IPAddressApi* | [**deleteIp**](docs/Api/IPAddressApi.md#deleteip) | **DELETE** /ip_address/{ip} | Release IP address
*IPAddressApi* | [**getDetails**](docs/Api/IPAddressApi.md#getdetails) | **GET** /ip_address/{ip} | Get IP address details
*IPAddressApi* | [**listIps**](docs/Api/IPAddressApi.md#listips) | **GET** /ip_address | List IP addresses
*IPAddressApi* | [**modifyIp**](docs/Api/IPAddressApi.md#modifyip) | **PUT** /ip_address/{ip} | Modify IP address
*PlanApi* | [**listPlans**](docs/Api/PlanApi.md#listplans) | **GET** /plan | List available plans
*PricesApi* | [**listPrices**](docs/Api/PricesApi.md#listprices) | **GET** /price | List prices
*ServerApi* | [**assignTag**](docs/Api/ServerApi.md#assigntag) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
*ServerApi* | [**attachStorage**](docs/Api/ServerApi.md#attachstorage) | **POST** /server/{serverId}/storage/attach | Attach storage
*ServerApi* | [**createFirewallRule**](docs/Api/ServerApi.md#createfirewallrule) | **POST** /server/{serverId}/firewall_rule | Create firewall rule
*ServerApi* | [**createServer**](docs/Api/ServerApi.md#createserver) | **POST** /server | Create server
*ServerApi* | [**deleteFirewallRule**](docs/Api/ServerApi.md#deletefirewallrule) | **DELETE** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Remove firewall rule
*ServerApi* | [**deleteServer**](docs/Api/ServerApi.md#deleteserver) | **DELETE** /server/{serverId} | Delete server
*ServerApi* | [**detachStorage**](docs/Api/ServerApi.md#detachstorage) | **POST** /server/{serverId}/storage/detach | Detach storage
*ServerApi* | [**ejectCdrom**](docs/Api/ServerApi.md#ejectcdrom) | **POST** /server/{serverId}/cdrom/eject | Eject CD-ROM
*ServerApi* | [**getFirewallRule**](docs/Api/ServerApi.md#getfirewallrule) | **GET** /server/{serverId}/firewall_rule/{firewallRuleNumber} | Get firewall rule details
*ServerApi* | [**listServerConfigurations**](docs/Api/ServerApi.md#listserverconfigurations) | **GET** /server_size | List server configurations
*ServerApi* | [**listServers**](docs/Api/ServerApi.md#listservers) | **GET** /server | List of servers
*ServerApi* | [**loadCdrom**](docs/Api/ServerApi.md#loadcdrom) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
*ServerApi* | [**modifyServer**](docs/Api/ServerApi.md#modifyserver) | **PUT** /server/{serverId} | Modify server
*ServerApi* | [**restartServer**](docs/Api/ServerApi.md#restartserver) | **POST** /server/{serverId}/restart | Restart server
*ServerApi* | [**serverDetails**](docs/Api/ServerApi.md#serverdetails) | **GET** /server/{serverId} | Get server details
*ServerApi* | [**serverServerIdFirewallRuleGet**](docs/Api/ServerApi.md#serverserveridfirewallruleget) | **GET** /server/{serverId}/firewall_rule | List firewall rules
*ServerApi* | [**startServer**](docs/Api/ServerApi.md#startserver) | **POST** /server/{serverId}/start | Start server
*ServerApi* | [**stopServer**](docs/Api/ServerApi.md#stopserver) | **POST** /server/{serverId}/stop | Stop server
*ServerApi* | [**untag**](docs/Api/ServerApi.md#untag) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server
*StorageApi* | [**attachStorage**](docs/Api/StorageApi.md#attachstorage) | **POST** /server/{serverId}/storage/attach | Attach storage
*StorageApi* | [**backupStorage**](docs/Api/StorageApi.md#backupstorage) | **POST** /storage/{storageId}/backup | Create backup
*StorageApi* | [**cancelOperation**](docs/Api/StorageApi.md#canceloperation) | **POST** /storage/{storageId}/cancel | Cancel storage operation
*StorageApi* | [**cloneStorage**](docs/Api/StorageApi.md#clonestorage) | **POST** /storage/{storageId}/clone | Clone storage
*StorageApi* | [**createStorage**](docs/Api/StorageApi.md#createstorage) | **POST** /storage | Create storage
*StorageApi* | [**deleteStorage**](docs/Api/StorageApi.md#deletestorage) | **DELETE** /storage/{storageId} | Delete storage
*StorageApi* | [**detachStorage**](docs/Api/StorageApi.md#detachstorage) | **POST** /server/{serverId}/storage/detach | Detach storage
*StorageApi* | [**ejectCdrom**](docs/Api/StorageApi.md#ejectcdrom) | **POST** /server/{serverId}/cdrom/eject | Eject CD-ROM
*StorageApi* | [**favoriteStorage**](docs/Api/StorageApi.md#favoritestorage) | **POST** /storage/{storageId}/favorite | Add storage to favorites
*StorageApi* | [**getStorageDetails**](docs/Api/StorageApi.md#getstoragedetails) | **GET** /storage/{storageId} | Get storage details
*StorageApi* | [**listStorageTypes**](docs/Api/StorageApi.md#liststoragetypes) | **GET** /storage/{type}/ | List of storages by type
*StorageApi* | [**listStorages**](docs/Api/StorageApi.md#liststorages) | **GET** /storage | List of storages
*StorageApi* | [**loadCdrom**](docs/Api/StorageApi.md#loadcdrom) | **POST** /server/{serverId}/storage/cdrom/load | Load CD-ROM
*StorageApi* | [**modifyStorage**](docs/Api/StorageApi.md#modifystorage) | **PUT** /storage/{storageId} | Modify storage
*StorageApi* | [**restoreStorage**](docs/Api/StorageApi.md#restorestorage) | **POST** /storage/{storageId}/restore | Restore backup
*StorageApi* | [**templatizeStorage**](docs/Api/StorageApi.md#templatizestorage) | **POST** /storage/{storageId}/templatize | Templatize storage
*StorageApi* | [**unfavoriteStorage**](docs/Api/StorageApi.md#unfavoritestorage) | **DELETE** /storage/{storageId}/favorite | Remove storage from favorites
*TagApi* | [**assignTag**](docs/Api/TagApi.md#assigntag) | **POST** /server/{serverId}/tag/{tagList} | Assign tag to a server
*TagApi* | [**createTag**](docs/Api/TagApi.md#createtag) | **POST** /tag | Create a new tag
*TagApi* | [**deleteTag**](docs/Api/TagApi.md#deletetag) | **DELETE** /tag/{tagName} | Delete tag
*TagApi* | [**listTags**](docs/Api/TagApi.md#listtags) | **GET** /tag | List existing tags
*TagApi* | [**modifyTag**](docs/Api/TagApi.md#modifytag) | **PUT** /tag/{tagName} | Modify existing tag
*TagApi* | [**untag**](docs/Api/TagApi.md#untag) | **POST** /server/{serverId}/untag/{tagName} | Remove tag from server
*TimezoneApi* | [**listTimezones**](docs/Api/TimezoneApi.md#listtimezones) | **GET** /timezone | List timezones
*ZoneApi* | [**listZones**](docs/Api/ZoneApi.md#listzones) | **GET** /zone | List available zones


## Documentation For Models

 - [Account](docs/Model/Account.md)
 - [AccountResponse](docs/Model/AccountResponse.md)
 - [AddIpRequest](docs/Model/AddIpRequest.md)
 - [AddressFamily](docs/Model/AddressFamily.md)
 - [AssignIpResponse](docs/Model/AssignIpResponse.md)
 - [AttachStorageDeviceRequest](docs/Model/AttachStorageDeviceRequest.md)
 - [AvailablePlanListResponse](docs/Model/AvailablePlanListResponse.md)
 - [AvailablePlanListResponsePlans](docs/Model/AvailablePlanListResponsePlans.md)
 - [BackupRule](docs/Model/BackupRule.md)
 - [CloneStorageRequest](docs/Model/CloneStorageRequest.md)
 - [ConfigurationListResponse](docs/Model/ConfigurationListResponse.md)
 - [ConfigurationListResponseServerSizes](docs/Model/ConfigurationListResponseServerSizes.md)
 - [CreateBackupStorageRequest](docs/Model/CreateBackupStorageRequest.md)
 - [CreateNewTagResponse](docs/Model/CreateNewTagResponse.md)
 - [CreateServerRequest](docs/Model/CreateServerRequest.md)
 - [CreateServerResponse](docs/Model/CreateServerResponse.md)
 - [CreateStorageRequest](docs/Model/CreateStorageRequest.md)
 - [CreateStorageResponse](docs/Model/CreateStorageResponse.md)
 - [Error](docs/Model/Error.md)
 - [ErrorCode](docs/Model/ErrorCode.md)
 - [ErrorError](docs/Model/ErrorError.md)
 - [ErrorStatus](docs/Model/ErrorStatus.md)
 - [FirewallRule](docs/Model/FirewallRule.md)
 - [FirewallRuleCreateResponse](docs/Model/FirewallRuleCreateResponse.md)
 - [FirewallRuleListResponse](docs/Model/FirewallRuleListResponse.md)
 - [FirewallRuleListResponseFirewallRules](docs/Model/FirewallRuleListResponseFirewallRules.md)
 - [FirewallRuleRequest](docs/Model/FirewallRuleRequest.md)
 - [IpAddress](docs/Model/IpAddress.md)
 - [IpAddressListResponse](docs/Model/IpAddressListResponse.md)
 - [IpAddresses](docs/Model/IpAddresses.md)
 - [ModifyIpRequest](docs/Model/ModifyIpRequest.md)
 - [ModifyStorageRequest](docs/Model/ModifyStorageRequest.md)
 - [ModifyTagRequest](docs/Model/ModifyTagRequest.md)
 - [Plan](docs/Model/Plan.md)
 - [Price](docs/Model/Price.md)
 - [PriceListResponse](docs/Model/PriceListResponse.md)
 - [PriceListResponsePrices](docs/Model/PriceListResponsePrices.md)
 - [PriceZone](docs/Model/PriceZone.md)
 - [RestartServer](docs/Model/RestartServer.md)
 - [Server](docs/Model/Server.md)
 - [ServerListResponse](docs/Model/ServerListResponse.md)
 - [ServerListResponseServers](docs/Model/ServerListResponseServers.md)
 - [ServerSize](docs/Model/ServerSize.md)
 - [ServerState](docs/Model/ServerState.md)
 - [ServerStorageDevices](docs/Model/ServerStorageDevices.md)
 - [ServerTags](docs/Model/ServerTags.md)
 - [StopServer](docs/Model/StopServer.md)
 - [StopServerRequest](docs/Model/StopServerRequest.md)
 - [Storage](docs/Model/Storage.md)
 - [StorageAccessType](docs/Model/StorageAccessType.md)
 - [StorageBackups](docs/Model/StorageBackups.md)
 - [StorageDevice](docs/Model/StorageDevice.md)
 - [StorageDeviceDetachRequest](docs/Model/StorageDeviceDetachRequest.md)
 - [StorageDeviceLoadRequest](docs/Model/StorageDeviceLoadRequest.md)
 - [StorageServers](docs/Model/StorageServers.md)
 - [StorageState](docs/Model/StorageState.md)
 - [StorageTier](docs/Model/StorageTier.md)
 - [StorageType](docs/Model/StorageType.md)
 - [SuccessStoragesResponse](docs/Model/SuccessStoragesResponse.md)
 - [SuccessStoragesResponseStorages](docs/Model/SuccessStoragesResponseStorages.md)
 - [Tag](docs/Model/Tag.md)
 - [TagCreateRequest](docs/Model/TagCreateRequest.md)
 - [TagListResponse](docs/Model/TagListResponse.md)
 - [TagListResponseTags](docs/Model/TagListResponseTags.md)
 - [TagServers](docs/Model/TagServers.md)
 - [TemplitizeStorageRequest](docs/Model/TemplitizeStorageRequest.md)
 - [Timezone](docs/Model/Timezone.md)
 - [TimezoneListResponse](docs/Model/TimezoneListResponse.md)
 - [TimezoneListResponseTimezones](docs/Model/TimezoneListResponseTimezones.md)
 - [Zone](docs/Model/Zone.md)
 - [ZoneListResponse](docs/Model/ZoneListResponse.md)
 - [ZoneListResponseZones](docs/Model/ZoneListResponseZones.md)


## Documentation for authentication

It's recommended to save the username and password as environmental variables while developing API applications to avoid accidentally publishing your account details.

The API client tests use test credentials fetched from environmental variables named UPCLOUD_API_TEST_USER and UPCLOUD_API_TEST_PASSWORD.

### baseAuth

- **Type**: HTTP basic authentication
- **Username**: Your UpCloud API username
- **Password**: Your UpCloud API user's password

## Issues

Found a bug, have a problem using the client, or anything else about the library you would want to mention? [Open a new issue here](https://github.com/UpCloudLtd/upcloud-php-api/issues/new) to get in contact.


## License

This project is distributed under the [MIT License](https://opensource.org/licenses/MIT), see LICENSE.txt for more information.


## Recommendations

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Issues

Found a bug, have a problem using the client, or anything else about the library you would want to mention? [Open a new issue here](https://github.com/UpCloudLtd/upcloud-java-api/issues/new) to get in contact.

## License

This project is distributed under the [MIT License](https://opensource.org/licenses/MIT), see LICENSE.txt for more information.

# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ServerApi;

import java.io.File;
import java.util.*;

public class ServerApiExample {

    public static void main(String[] args) {
        
        ServerApi apiInstance = new ServerApi();
        try {
            InlineResponse200 result = apiInstance.serverGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerApi#serverGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/1.2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ServerApi* | [**serverGet**](docs/ServerApi.md#serverGet) | **GET** /server | List of servers
*ServerApi* | [**serverPost**](docs/ServerApi.md#serverPost) | **POST** /server | Create server
*ServerApi* | [**serverServerIdDelete**](docs/ServerApi.md#serverServerIdDelete) | **DELETE** /server/{serverId} | Delete server
*ServerApi* | [**serverServerIdGet**](docs/ServerApi.md#serverServerIdGet) | **GET** /server/{serverId} | Server details
*ServerApi* | [**serverServerIdPut**](docs/ServerApi.md#serverServerIdPut) | **PUT** /server/{serverId} | Modify server
*StorageApi* | [**storageGet**](docs/StorageApi.md#storageGet) | **GET** /storage | List of storages


## Documentation for Models

 - [BackupRule](docs/BackupRule.md)
 - [Error](docs/Error.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [ErrorError](docs/ErrorError.md)
 - [ErrorStatus](docs/ErrorStatus.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Storages](docs/InlineResponse2002Storages.md)
 - [InlineResponse200Servers](docs/InlineResponse200Servers.md)
 - [IpAddress](docs/IpAddress.md)
 - [Server](docs/Server.md)
 - [ServerIpAddresses](docs/ServerIpAddresses.md)
 - [ServerStorageDevices](docs/ServerStorageDevices.md)
 - [ServerTags](docs/ServerTags.md)
 - [Storage](docs/Storage.md)
 - [StorageBackups](docs/StorageBackups.md)
 - [StorageDevice](docs/StorageDevice.md)
 - [StorageServers](docs/StorageServers.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




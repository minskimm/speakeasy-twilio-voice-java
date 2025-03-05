# openapi

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/mr/project). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

Twilio - Voice: This is the public Twilio REST API.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'org.openapis:openapi:0.1.0'
```

Maven:
```xml
<dependency>
    <groupId>org.openapis</groupId>
    <artifactId>openapi</artifactId>
    <version>0.1.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteArchivedCallResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteArchivedCallResponse res = sdk.voiceV1ArchivedCall().deleteArchivedCall()
                .date(LocalDate.parse("2024-07-27"))
                .sid("<id>")
                .call();

        // handle response
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                      | Type | Scheme     |
| ------------------------- | ---- | ---------- |
| `username`<br/>`password` | http | HTTP Basic |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteArchivedCallResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteArchivedCallResponse res = sdk.voiceV1ArchivedCall().deleteArchivedCall()
                .date(LocalDate.parse("2024-07-27"))
                .sid("<id>")
                .call();

        // handle response
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>


### [voiceV1ArchivedCall()](docs/sdks/voicev1archivedcall/README.md)

* [deleteArchivedCall](docs/sdks/voicev1archivedcall/README.md#deletearchivedcall) - Delete an archived call record from Bulk Export. Note: this does not also delete the record from the Voice API.

### [voiceV1BulkCountryUpdate()](docs/sdks/voicev1bulkcountryupdate/README.md)

* [createDialingPermissionsCountryBulkUpdate](docs/sdks/voicev1bulkcountryupdate/README.md#createdialingpermissionscountrybulkupdate) - Create a bulk update request to change voice dialing country permissions of one or more countries identified by the corresponding [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

### [voiceV1ByocTrunk()](docs/sdks/voicev1byoctrunk/README.md)

* [createByocTrunk](docs/sdks/voicev1byoctrunk/README.md#createbyoctrunk)
* [listByocTrunk](docs/sdks/voicev1byoctrunk/README.md#listbyoctrunk)
* [fetchByocTrunk](docs/sdks/voicev1byoctrunk/README.md#fetchbyoctrunk)
* [updateByocTrunk](docs/sdks/voicev1byoctrunk/README.md#updatebyoctrunk)
* [deleteByocTrunk](docs/sdks/voicev1byoctrunk/README.md#deletebyoctrunk)

### [voiceV1ConnectionPolicy()](docs/sdks/voicev1connectionpolicy/README.md)

* [createConnectionPolicy](docs/sdks/voicev1connectionpolicy/README.md#createconnectionpolicy)
* [listConnectionPolicy](docs/sdks/voicev1connectionpolicy/README.md#listconnectionpolicy)
* [fetchConnectionPolicy](docs/sdks/voicev1connectionpolicy/README.md#fetchconnectionpolicy)
* [updateConnectionPolicy](docs/sdks/voicev1connectionpolicy/README.md#updateconnectionpolicy)
* [deleteConnectionPolicy](docs/sdks/voicev1connectionpolicy/README.md#deleteconnectionpolicy)

### [voiceV1ConnectionPolicyTarget()](docs/sdks/voicev1connectionpolicytarget/README.md)

* [createConnectionPolicyTarget](docs/sdks/voicev1connectionpolicytarget/README.md#createconnectionpolicytarget)
* [listConnectionPolicyTarget](docs/sdks/voicev1connectionpolicytarget/README.md#listconnectionpolicytarget)
* [fetchConnectionPolicyTarget](docs/sdks/voicev1connectionpolicytarget/README.md#fetchconnectionpolicytarget)
* [updateConnectionPolicyTarget](docs/sdks/voicev1connectionpolicytarget/README.md#updateconnectionpolicytarget)
* [deleteConnectionPolicyTarget](docs/sdks/voicev1connectionpolicytarget/README.md#deleteconnectionpolicytarget)

### [voiceV1Country()](docs/sdks/voicev1country/README.md)

* [fetchDialingPermissionsCountry](docs/sdks/voicev1country/README.md#fetchdialingpermissionscountry) - Retrieve voice dialing country permissions identified by the given ISO country code
* [listDialingPermissionsCountry](docs/sdks/voicev1country/README.md#listdialingpermissionscountry) - Retrieve all voice dialing country permissions for this account

### [voiceV1HighriskSpecialPrefix()](docs/sdks/voicev1highriskspecialprefix/README.md)

* [listDialingPermissionsHrsPrefixes](docs/sdks/voicev1highriskspecialprefix/README.md#listdialingpermissionshrsprefixes) - Fetch the high-risk special services prefixes from the country resource corresponding to the [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

### [voiceV1IpRecord()](docs/sdks/voicev1iprecord/README.md)

* [createIpRecord](docs/sdks/voicev1iprecord/README.md#createiprecord)
* [listIpRecord](docs/sdks/voicev1iprecord/README.md#listiprecord)
* [fetchIpRecord](docs/sdks/voicev1iprecord/README.md#fetchiprecord)
* [updateIpRecord](docs/sdks/voicev1iprecord/README.md#updateiprecord)
* [deleteIpRecord](docs/sdks/voicev1iprecord/README.md#deleteiprecord)

### [voiceV1Settings()](docs/sdks/voicev1settings/README.md)

* [fetchDialingPermissionsSettings](docs/sdks/voicev1settings/README.md#fetchdialingpermissionssettings) - Retrieve voice dialing permissions inheritance for the sub-account
* [updateDialingPermissionsSettings](docs/sdks/voicev1settings/README.md#updatedialingpermissionssettings) - Update voice dialing permissions inheritance for the sub-account

### [voiceV1SourceIpMapping()](docs/sdks/voicev1sourceipmapping/README.md)

* [createSourceIpMapping](docs/sdks/voicev1sourceipmapping/README.md#createsourceipmapping)
* [listSourceIpMapping](docs/sdks/voicev1sourceipmapping/README.md#listsourceipmapping)
* [fetchSourceIpMapping](docs/sdks/voicev1sourceipmapping/README.md#fetchsourceipmapping)
* [updateSourceIpMapping](docs/sdks/voicev1sourceipmapping/README.md#updatesourceipmapping)
* [deleteSourceIpMapping](docs/sdks/voicev1sourceipmapping/README.md#deletesourceipmapping)

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `deleteArchivedCall` method throws the following exceptions:

| Error Type                 | Status Code | Content Type |
| -------------------------- | ----------- | ------------ |
| models/errors/APIException | 4XX, 5XX    | \*/\*        |

### Example

```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteArchivedCallResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteArchivedCallResponse res = sdk.voiceV1ArchivedCall().deleteArchivedCall()
                .date(LocalDate.parse("2024-07-27"))
                .sid("<id>")
                .call();

        // handle response
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteArchivedCallResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .serverURL("https://voice.twilio.com")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteArchivedCallResponse res = sdk.voiceV1ArchivedCall().deleteArchivedCall()
                .date(LocalDate.parse("2024-07-27"))
                .sid("<id>")
                .call();

        // handle response
    }
}
```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteArchivedCallResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteArchivedCallResponse res = sdk.voiceV1ArchivedCall().deleteArchivedCall()
                .serverURL("https://voice.twilio.com")
                .date(LocalDate.parse("2024-07-27"))
                .sid("<id>")
                .call();

        // handle response
    }
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)

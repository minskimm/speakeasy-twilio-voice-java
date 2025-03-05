# VoiceV1Country
(*voiceV1Country()*)

## Overview

### Available Operations

* [fetchDialingPermissionsCountry](#fetchdialingpermissionscountry) - Retrieve voice dialing country permissions identified by the given ISO country code
* [listDialingPermissionsCountry](#listdialingpermissionscountry) - Retrieve all voice dialing country permissions for this account

## fetchDialingPermissionsCountry

Retrieve voice dialing country permissions identified by the given ISO country code

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchDialingPermissionsCountryResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchDialingPermissionsCountryResponse res = sdk.voiceV1Country().fetchDialingPermissionsCountry()
                .isoCode("<value>")
                .call();

        if (res.voiceV1DialingPermissionsDialingPermissionsCountryInstance().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `isoCode`                                                                                                                    | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the DialingPermissions Country resource to fetch |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |

### Response

**[FetchDialingPermissionsCountryResponse](../../models/operations/FetchDialingPermissionsCountryResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listDialingPermissionsCountry

Retrieve all voice dialing country permissions for this account

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListDialingPermissionsCountryRequest;
import org.openapis.openapi.models.operations.ListDialingPermissionsCountryResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListDialingPermissionsCountryRequest req = ListDialingPermissionsCountryRequest.builder()
                .isoCode("US")
                .build();

        ListDialingPermissionsCountryResponse res = sdk.voiceV1Country().listDialingPermissionsCountry()
                .request(req)
                .call();

        if (res.listDialingPermissionsCountryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListDialingPermissionsCountryRequest](../../models/operations/ListDialingPermissionsCountryRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |
| `serverURL`                                                                                             | *String*                                                                                                | :heavy_minus_sign:                                                                                      | An optional server URL to use.                                                                          |

### Response

**[ListDialingPermissionsCountryResponse](../../models/operations/ListDialingPermissionsCountryResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
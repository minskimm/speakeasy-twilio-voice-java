# VoiceV1Settings
(*voiceV1Settings()*)

## Overview

### Available Operations

* [fetchDialingPermissionsSettings](#fetchdialingpermissionssettings) - Retrieve voice dialing permissions inheritance for the sub-account
* [updateDialingPermissionsSettings](#updatedialingpermissionssettings) - Update voice dialing permissions inheritance for the sub-account

## fetchDialingPermissionsSettings

Retrieve voice dialing permissions inheritance for the sub-account

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchDialingPermissionsSettingsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchDialingPermissionsSettingsResponse res = sdk.voiceV1Settings().fetchDialingPermissionsSettings()
                .call();

        if (res.voiceV1DialingPermissionsDialingPermissionsSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[FetchDialingPermissionsSettingsResponse](../../models/operations/FetchDialingPermissionsSettingsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateDialingPermissionsSettings

Update voice dialing permissions inheritance for the sub-account

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.UpdateDialingPermissionsSettingsResponse;
import org.openapis.openapi.models.operations.UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest req = UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest.builder()
                .dialingPermissionsInheritance(true)
                .build();

        UpdateDialingPermissionsSettingsResponse res = sdk.voiceV1Settings().updateDialingPermissionsSettings()
                .request(req)
                .call();

        if (res.voiceV1DialingPermissionsDialingPermissionsSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                     | Type                                                                                                                                                                          | Required                                                                                                                                                                      | Description                                                                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                     | [UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest](../../models/operations/UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest.md) | :heavy_check_mark:                                                                                                                                                            | The request object to use for the request.                                                                                                                                    |
| `serverURL`                                                                                                                                                                   | *String*                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                            | An optional server URL to use.                                                                                                                                                |

### Response

**[UpdateDialingPermissionsSettingsResponse](../../models/operations/UpdateDialingPermissionsSettingsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
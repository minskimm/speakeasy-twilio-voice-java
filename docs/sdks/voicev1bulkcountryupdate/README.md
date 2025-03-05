# VoiceV1BulkCountryUpdate
(*voiceV1BulkCountryUpdate()*)

## Overview

### Available Operations

* [createDialingPermissionsCountryBulkUpdate](#createdialingpermissionscountrybulkupdate) - Create a bulk update request to change voice dialing country permissions of one or more countries identified by the corresponding [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

## createDialingPermissionsCountryBulkUpdate

Create a bulk update request to change voice dialing country permissions of one or more countries identified by the corresponding [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.CreateDialingPermissionsCountryBulkUpdateCreateDialingPermissionsCountryBulkUpdateRequest;
import org.openapis.openapi.models.operations.CreateDialingPermissionsCountryBulkUpdateResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateDialingPermissionsCountryBulkUpdateCreateDialingPermissionsCountryBulkUpdateRequest req = CreateDialingPermissionsCountryBulkUpdateCreateDialingPermissionsCountryBulkUpdateRequest.builder()
                .updateRequest("[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]")
                .build();

        CreateDialingPermissionsCountryBulkUpdateResponse res = sdk.voiceV1BulkCountryUpdate().createDialingPermissionsCountryBulkUpdate()
                .request(req)
                .call();

        if (res.voiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                         | Type                                                                                                                                                                                                              | Required                                                                                                                                                                                                          | Description                                                                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                                         | [CreateDialingPermissionsCountryBulkUpdateCreateDialingPermissionsCountryBulkUpdateRequest](../../models/operations/CreateDialingPermissionsCountryBulkUpdateCreateDialingPermissionsCountryBulkUpdateRequest.md) | :heavy_check_mark:                                                                                                                                                                                                | The request object to use for the request.                                                                                                                                                                        |
| `serverURL`                                                                                                                                                                                                       | *String*                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                | An optional server URL to use.                                                                                                                                                                                    |

### Response

**[CreateDialingPermissionsCountryBulkUpdateResponse](../../models/operations/CreateDialingPermissionsCountryBulkUpdateResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
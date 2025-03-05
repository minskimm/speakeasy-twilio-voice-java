# VoiceV1ArchivedCall
(*voiceV1ArchivedCall()*)

## Overview

### Available Operations

* [deleteArchivedCall](#deletearchivedcall) - Delete an archived call record from Bulk Export. Note: this does not also delete the record from the Voice API.

## deleteArchivedCall

Delete an archived call record from Bulk Export. Note: this does not also delete the record from the Voice API.

### Example Usage

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

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `date`                                                                            | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)   | :heavy_check_mark:                                                                | The date of the Call in UTC.                                                      |
| `sid`                                                                             | *String*                                                                          | :heavy_check_mark:                                                                | The Twilio-provided Call SID that uniquely identifies the Call resource to delete |
| `serverURL`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[DeleteArchivedCallResponse](../../models/operations/DeleteArchivedCallResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
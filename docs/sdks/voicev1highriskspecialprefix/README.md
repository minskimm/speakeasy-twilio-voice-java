# VoiceV1HighriskSpecialPrefix
(*voiceV1HighriskSpecialPrefix()*)

## Overview

### Available Operations

* [listDialingPermissionsHrsPrefixes](#listdialingpermissionshrsprefixes) - Fetch the high-risk special services prefixes from the country resource corresponding to the [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

## listDialingPermissionsHrsPrefixes

Fetch the high-risk special services prefixes from the country resource corresponding to the [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListDialingPermissionsHrsPrefixesResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListDialingPermissionsHrsPrefixesResponse res = sdk.voiceV1HighriskSpecialPrefix().listDialingPermissionsHrsPrefixes()
                .isoCode("<value>")
                .pageSize(639812L)
                .page(581501L)
                .pageToken("<value>")
                .call();

        if (res.listDialingPermissionsHrsPrefixesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `isoCode`                                                                                                                                                                            | *String*                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                   | The [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) to identify the country permissions from which high-risk special service number prefixes are fetched |
| `pageSize`                                                                                                                                                                           | *Optional\<Long>*                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                   | How many resources to return in each list page. The default is 50, and the maximum is 1000.                                                                                          |
| `page`                                                                                                                                                                               | *Optional\<Long>*                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                   | The page index. This value is simply for client state.                                                                                                                               |
| `pageToken`                                                                                                                                                                          | *Optional\<String>*                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                   | The page token. This is provided by the API.                                                                                                                                         |
| `serverURL`                                                                                                                                                                          | *String*                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                   | An optional server URL to use.                                                                                                                                                       |

### Response

**[ListDialingPermissionsHrsPrefixesResponse](../../models/operations/ListDialingPermissionsHrsPrefixesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
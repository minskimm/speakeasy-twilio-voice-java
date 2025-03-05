# VoiceV1IpRecord
(*voiceV1IpRecord()*)

## Overview

### Available Operations

* [createIpRecord](#createiprecord)
* [listIpRecord](#listiprecord)
* [fetchIpRecord](#fetchiprecord)
* [updateIpRecord](#updateiprecord)
* [deleteIpRecord](#deleteiprecord)

## createIpRecord

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.CreateIpRecordCreateIpRecordRequest;
import org.openapis.openapi.models.operations.CreateIpRecordResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateIpRecordCreateIpRecordRequest req = CreateIpRecordCreateIpRecordRequest.builder()
                .ipAddress("10.2.3.4")
                .friendlyName("friendly_name")
                .cidrPrefixLength(30L)
                .build();

        CreateIpRecordResponse res = sdk.voiceV1IpRecord().createIpRecord()
                .request(req)
                .call();

        if (res.voiceV1IpRecord().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CreateIpRecordCreateIpRecordRequest](../../models/operations/CreateIpRecordCreateIpRecordRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |
| `serverURL`                                                                                           | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[CreateIpRecordResponse](../../models/operations/CreateIpRecordResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listIpRecord

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListIpRecordResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListIpRecordResponse res = sdk.voiceV1IpRecord().listIpRecord()
                .pageSize(545956L)
                .page(545447L)
                .pageToken("<value>")
                .call();

        if (res.listIpRecordResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `pageSize`                                                                                  | *Optional\<Long>*                                                                           | :heavy_minus_sign:                                                                          | How many resources to return in each list page. The default is 50, and the maximum is 1000. |
| `page`                                                                                      | *Optional\<Long>*                                                                           | :heavy_minus_sign:                                                                          | The page index. This value is simply for client state.                                      |
| `pageToken`                                                                                 | *Optional\<String>*                                                                         | :heavy_minus_sign:                                                                          | The page token. This is provided by the API.                                                |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[ListIpRecordResponse](../../models/operations/ListIpRecordResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## fetchIpRecord

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchIpRecordResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchIpRecordResponse res = sdk.voiceV1IpRecord().fetchIpRecord()
                .sid("<id>")
                .call();

        if (res.voiceV1IpRecord().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `sid`                                                                                | *String*                                                                             | :heavy_check_mark:                                                                   | The Twilio-provided string that uniquely identifies the IP Record resource to fetch. |
| `serverURL`                                                                          | *String*                                                                             | :heavy_minus_sign:                                                                   | An optional server URL to use.                                                       |

### Response

**[FetchIpRecordResponse](../../models/operations/FetchIpRecordResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateIpRecord

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.UpdateIpRecordResponse;
import org.openapis.openapi.models.operations.UpdateIpRecordUpdateIpRecordRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateIpRecordResponse res = sdk.voiceV1IpRecord().updateIpRecord()
                .sid("<id>")
                .requestBody(UpdateIpRecordUpdateIpRecordRequest.builder()
                    .friendlyName("update_name")
                    .build())
                .call();

        if (res.voiceV1IpRecord().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `sid`                                                                                                            | *String*                                                                                                         | :heavy_check_mark:                                                                                               | The Twilio-provided string that uniquely identifies the IP Record resource to update.                            |
| `requestBody`                                                                                                    | [Optional\<UpdateIpRecordUpdateIpRecordRequest>](../../models/operations/UpdateIpRecordUpdateIpRecordRequest.md) | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `serverURL`                                                                                                      | *String*                                                                                                         | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |

### Response

**[UpdateIpRecordResponse](../../models/operations/UpdateIpRecordResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteIpRecord

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteIpRecordResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteIpRecordResponse res = sdk.voiceV1IpRecord().deleteIpRecord()
                .sid("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `sid`                                                                                 | *String*                                                                              | :heavy_check_mark:                                                                    | The Twilio-provided string that uniquely identifies the IP Record resource to delete. |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[DeleteIpRecordResponse](../../models/operations/DeleteIpRecordResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
# VoiceV1SourceIpMapping
(*voiceV1SourceIpMapping()*)

## Overview

### Available Operations

* [createSourceIpMapping](#createsourceipmapping)
* [listSourceIpMapping](#listsourceipmapping)
* [fetchSourceIpMapping](#fetchsourceipmapping)
* [updateSourceIpMapping](#updatesourceipmapping)
* [deleteSourceIpMapping](#deletesourceipmapping)

## createSourceIpMapping

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.CreateSourceIpMappingCreateSourceIpMappingRequest;
import org.openapis.openapi.models.operations.CreateSourceIpMappingResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateSourceIpMappingCreateSourceIpMappingRequest req = CreateSourceIpMappingCreateSourceIpMappingRequest.builder()
                .ipRecordSid("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build();

        CreateSourceIpMappingResponse res = sdk.voiceV1SourceIpMapping().createSourceIpMapping()
                .request(req)
                .call();

        if (res.voiceV1SourceIpMapping().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [CreateSourceIpMappingCreateSourceIpMappingRequest](../../models/operations/CreateSourceIpMappingCreateSourceIpMappingRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `serverURL`                                                                                                                       | *String*                                                                                                                          | :heavy_minus_sign:                                                                                                                | An optional server URL to use.                                                                                                    |

### Response

**[CreateSourceIpMappingResponse](../../models/operations/CreateSourceIpMappingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listSourceIpMapping

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListSourceIpMappingResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListSourceIpMappingResponse res = sdk.voiceV1SourceIpMapping().listSourceIpMapping()
                .pageSize(988530L)
                .page(627700L)
                .pageToken("<value>")
                .call();

        if (res.listSourceIpMappingResponse().isPresent()) {
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

**[ListSourceIpMappingResponse](../../models/operations/ListSourceIpMappingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## fetchSourceIpMapping

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchSourceIpMappingResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchSourceIpMappingResponse res = sdk.voiceV1SourceIpMapping().fetchSourceIpMapping()
                .sid("<id>")
                .call();

        if (res.voiceV1SourceIpMapping().isPresent()) {
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

**[FetchSourceIpMappingResponse](../../models/operations/FetchSourceIpMappingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateSourceIpMapping

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.UpdateSourceIpMappingResponse;
import org.openapis.openapi.models.operations.UpdateSourceIpMappingUpdateSourceIpMappingRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateSourceIpMappingResponse res = sdk.voiceV1SourceIpMapping().updateSourceIpMapping()
                .sid("<id>")
                .requestBody(UpdateSourceIpMappingUpdateSourceIpMappingRequest.builder()
                    .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                    .build())
                .call();

        if (res.voiceV1SourceIpMapping().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `sid`                                                                                                                                        | *String*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | The Twilio-provided string that uniquely identifies the IP Record resource to update.                                                        |
| `requestBody`                                                                                                                                | [Optional\<UpdateSourceIpMappingUpdateSourceIpMappingRequest>](../../models/operations/UpdateSourceIpMappingUpdateSourceIpMappingRequest.md) | :heavy_minus_sign:                                                                                                                           | N/A                                                                                                                                          |
| `serverURL`                                                                                                                                  | *String*                                                                                                                                     | :heavy_minus_sign:                                                                                                                           | An optional server URL to use.                                                                                                               |

### Response

**[UpdateSourceIpMappingResponse](../../models/operations/UpdateSourceIpMappingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteSourceIpMapping

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteSourceIpMappingResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteSourceIpMappingResponse res = sdk.voiceV1SourceIpMapping().deleteSourceIpMapping()
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

**[DeleteSourceIpMappingResponse](../../models/operations/DeleteSourceIpMappingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
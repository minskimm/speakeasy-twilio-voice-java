# VoiceV1ConnectionPolicy
(*voiceV1ConnectionPolicy()*)

## Overview

### Available Operations

* [createConnectionPolicy](#createconnectionpolicy)
* [listConnectionPolicy](#listconnectionpolicy)
* [fetchConnectionPolicy](#fetchconnectionpolicy)
* [updateConnectionPolicy](#updateconnectionpolicy)
* [deleteConnectionPolicy](#deleteconnectionpolicy)

## createConnectionPolicy

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.CreateConnectionPolicyCreateConnectionPolicyRequest;
import org.openapis.openapi.models.operations.CreateConnectionPolicyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateConnectionPolicyCreateConnectionPolicyRequest req = CreateConnectionPolicyCreateConnectionPolicyRequest.builder()
                .friendlyName("friendly_name")
                .build();

        CreateConnectionPolicyResponse res = sdk.voiceV1ConnectionPolicy().createConnectionPolicy()
                .request(req)
                .call();

        if (res.voiceV1ConnectionPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [CreateConnectionPolicyCreateConnectionPolicyRequest](../../models/operations/CreateConnectionPolicyCreateConnectionPolicyRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `serverURL`                                                                                                                           | *String*                                                                                                                              | :heavy_minus_sign:                                                                                                                    | An optional server URL to use.                                                                                                        |

### Response

**[CreateConnectionPolicyResponse](../../models/operations/CreateConnectionPolicyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listConnectionPolicy

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListConnectionPolicyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListConnectionPolicyResponse res = sdk.voiceV1ConnectionPolicy().listConnectionPolicy()
                .pageSize(468053L)
                .page(461642L)
                .pageToken("<value>")
                .call();

        if (res.listConnectionPolicyResponse().isPresent()) {
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

**[ListConnectionPolicyResponse](../../models/operations/ListConnectionPolicyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## fetchConnectionPolicy

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchConnectionPolicyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchConnectionPolicyResponse res = sdk.voiceV1ConnectionPolicy().fetchConnectionPolicy()
                .sid("<id>")
                .call();

        if (res.voiceV1ConnectionPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `sid`                                                                                  | *String*                                                                               | :heavy_check_mark:                                                                     | The unique string that we created to identify the Connection Policy resource to fetch. |
| `serverURL`                                                                            | *String*                                                                               | :heavy_minus_sign:                                                                     | An optional server URL to use.                                                         |

### Response

**[FetchConnectionPolicyResponse](../../models/operations/FetchConnectionPolicyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateConnectionPolicy

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyResponse;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyUpdateConnectionPolicyRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateConnectionPolicyResponse res = sdk.voiceV1ConnectionPolicy().updateConnectionPolicy()
                .sid("<id>")
                .requestBody(UpdateConnectionPolicyUpdateConnectionPolicyRequest.builder()
                    .friendlyName("updated_name")
                    .build())
                .call();

        if (res.voiceV1ConnectionPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `sid`                                                                                                                                            | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | The unique string that we created to identify the Connection Policy resource to update.                                                          |
| `requestBody`                                                                                                                                    | [Optional\<UpdateConnectionPolicyUpdateConnectionPolicyRequest>](../../models/operations/UpdateConnectionPolicyUpdateConnectionPolicyRequest.md) | :heavy_minus_sign:                                                                                                                               | N/A                                                                                                                                              |
| `serverURL`                                                                                                                                      | *String*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |

### Response

**[UpdateConnectionPolicyResponse](../../models/operations/UpdateConnectionPolicyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteConnectionPolicy

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteConnectionPolicyResponse res = sdk.voiceV1ConnectionPolicy().deleteConnectionPolicy()
                .sid("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `sid`                                                                                   | *String*                                                                                | :heavy_check_mark:                                                                      | The unique string that we created to identify the Connection Policy resource to delete. |
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[DeleteConnectionPolicyResponse](../../models/operations/DeleteConnectionPolicyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
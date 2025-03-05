# VoiceV1ConnectionPolicyTarget
(*voiceV1ConnectionPolicyTarget()*)

## Overview

### Available Operations

* [createConnectionPolicyTarget](#createconnectionpolicytarget)
* [listConnectionPolicyTarget](#listconnectionpolicytarget)
* [fetchConnectionPolicyTarget](#fetchconnectionpolicytarget)
* [updateConnectionPolicyTarget](#updateconnectionpolicytarget)
* [deleteConnectionPolicyTarget](#deleteconnectionpolicytarget)

## createConnectionPolicyTarget

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.CreateConnectionPolicyTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateConnectionPolicyTargetResponse res = sdk.voiceV1ConnectionPolicyTarget().createConnectionPolicyTarget()
                .connectionPolicySid("<id>")
                .requestBody(CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest.builder()
                    .target("sip:sip-box.com:1234")
                    .friendlyName("friendly_name")
                    .priority(1L)
                    .weight(20L)
                    .enabled(true)
                    .build())
                .call();

        if (res.voiceV1ConnectionPolicyConnectionPolicyTarget().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `connectionPolicySid`                                                                                                                                                    | *String*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                       | The SID of the Connection Policy that owns the Target.                                                                                                                   |
| `requestBody`                                                                                                                                                            | [Optional\<CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest>](../../models/operations/CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest.md) | :heavy_minus_sign:                                                                                                                                                       | N/A                                                                                                                                                                      |
| `serverURL`                                                                                                                                                              | *String*                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                       | An optional server URL to use.                                                                                                                                           |

### Response

**[CreateConnectionPolicyTargetResponse](../../models/operations/CreateConnectionPolicyTargetResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listConnectionPolicyTarget

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListConnectionPolicyTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListConnectionPolicyTargetResponse res = sdk.voiceV1ConnectionPolicyTarget().listConnectionPolicyTarget()
                .connectionPolicySid("<id>")
                .pageSize(748922L)
                .page(703521L)
                .pageToken("<value>")
                .call();

        if (res.listConnectionPolicyTargetResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `connectionPolicySid`                                                                       | *String*                                                                                    | :heavy_check_mark:                                                                          | The SID of the Connection Policy from which to read the Targets.                            |
| `pageSize`                                                                                  | *Optional\<Long>*                                                                           | :heavy_minus_sign:                                                                          | How many resources to return in each list page. The default is 50, and the maximum is 1000. |
| `page`                                                                                      | *Optional\<Long>*                                                                           | :heavy_minus_sign:                                                                          | The page index. This value is simply for client state.                                      |
| `pageToken`                                                                                 | *Optional\<String>*                                                                         | :heavy_minus_sign:                                                                          | The page token. This is provided by the API.                                                |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[ListConnectionPolicyTargetResponse](../../models/operations/ListConnectionPolicyTargetResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## fetchConnectionPolicyTarget

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchConnectionPolicyTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchConnectionPolicyTargetResponse res = sdk.voiceV1ConnectionPolicyTarget().fetchConnectionPolicyTarget()
                .connectionPolicySid("<id>")
                .sid("<id>")
                .call();

        if (res.voiceV1ConnectionPolicyConnectionPolicyTarget().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `connectionPolicySid`                                                       | *String*                                                                    | :heavy_check_mark:                                                          | The SID of the Connection Policy that owns the Target.                      |
| `sid`                                                                       | *String*                                                                    | :heavy_check_mark:                                                          | The unique string that we created to identify the Target resource to fetch. |
| `serverURL`                                                                 | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[FetchConnectionPolicyTargetResponse](../../models/operations/FetchConnectionPolicyTargetResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateConnectionPolicyTarget

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateConnectionPolicyTargetResponse res = sdk.voiceV1ConnectionPolicyTarget().updateConnectionPolicyTarget()
                .connectionPolicySid("<id>")
                .sid("<id>")
                .requestBody(UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest.builder()
                    .friendlyName("updated_name")
                    .target("sip:sip-updated.com:4321")
                    .priority(2L)
                    .weight(10L)
                    .enabled(false)
                    .build())
                .call();

        if (res.voiceV1ConnectionPolicyConnectionPolicyTarget().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `connectionPolicySid`                                                                                                                                                    | *String*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                       | The SID of the Connection Policy that owns the Target.                                                                                                                   |
| `sid`                                                                                                                                                                    | *String*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                       | The unique string that we created to identify the Target resource to update.                                                                                             |
| `requestBody`                                                                                                                                                            | [Optional\<UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest>](../../models/operations/UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest.md) | :heavy_minus_sign:                                                                                                                                                       | N/A                                                                                                                                                                      |
| `serverURL`                                                                                                                                                              | *String*                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                       | An optional server URL to use.                                                                                                                                           |

### Response

**[UpdateConnectionPolicyTargetResponse](../../models/operations/UpdateConnectionPolicyTargetResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteConnectionPolicyTarget

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteConnectionPolicyTargetResponse res = sdk.voiceV1ConnectionPolicyTarget().deleteConnectionPolicyTarget()
                .connectionPolicySid("<id>")
                .sid("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `connectionPolicySid`                                                        | *String*                                                                     | :heavy_check_mark:                                                           | The SID of the Connection Policy that owns the Target.                       |
| `sid`                                                                        | *String*                                                                     | :heavy_check_mark:                                                           | The unique string that we created to identify the Target resource to delete. |
| `serverURL`                                                                  | *String*                                                                     | :heavy_minus_sign:                                                           | An optional server URL to use.                                               |

### Response

**[DeleteConnectionPolicyTargetResponse](../../models/operations/DeleteConnectionPolicyTargetResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
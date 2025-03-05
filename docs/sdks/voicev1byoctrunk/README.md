# VoiceV1ByocTrunk
(*voiceV1ByocTrunk()*)

## Overview

### Available Operations

* [createByocTrunk](#createbyoctrunk)
* [listByocTrunk](#listbyoctrunk)
* [fetchByocTrunk](#fetchbyoctrunk)
* [updateByocTrunk](#updatebyoctrunk)
* [deleteByocTrunk](#deletebyoctrunk)

## createByocTrunk

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.CreateByocTrunkCreateByocTrunkRequest;
import org.openapis.openapi.models.operations.CreateByocTrunkResponse;
import org.openapis.openapi.models.operations.StatusCallbackMethod;
import org.openapis.openapi.models.operations.VoiceFallbackMethod;
import org.openapis.openapi.models.operations.VoiceMethod;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateByocTrunkCreateByocTrunkRequest req = CreateByocTrunkCreateByocTrunkRequest.builder()
                .friendlyName("friendly_name")
                .voiceUrl("https://byoc.example.com/twilio/app")
                .voiceMethod(VoiceMethod.POST)
                .voiceFallbackUrl("https://byoc.example.com/twilio/fallback")
                .voiceFallbackMethod(VoiceFallbackMethod.POST)
                .statusCallbackUrl("https://byoc.example.com/twilio/status_callback")
                .statusCallbackMethod(StatusCallbackMethod.POST)
                .cnamLookupEnabled(false)
                .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build();

        CreateByocTrunkResponse res = sdk.voiceV1ByocTrunk().createByocTrunk()
                .request(req)
                .call();

        if (res.voiceV1ByocTrunk().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [CreateByocTrunkCreateByocTrunkRequest](../../models/operations/CreateByocTrunkCreateByocTrunkRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `serverURL`                                                                                               | *String*                                                                                                  | :heavy_minus_sign:                                                                                        | An optional server URL to use.                                                                            |

### Response

**[CreateByocTrunkResponse](../../models/operations/CreateByocTrunkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listByocTrunk

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.ListByocTrunkResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListByocTrunkResponse res = sdk.voiceV1ByocTrunk().listByocTrunk()
                .pageSize(926789L)
                .page(560521L)
                .pageToken("<value>")
                .call();

        if (res.listByocTrunkResponse().isPresent()) {
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

**[ListByocTrunkResponse](../../models/operations/ListByocTrunkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## fetchByocTrunk

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.FetchByocTrunkResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        FetchByocTrunkResponse res = sdk.voiceV1ByocTrunk().fetchByocTrunk()
                .sid("<id>")
                .call();

        if (res.voiceV1ByocTrunk().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `sid`                                                                                 | *String*                                                                              | :heavy_check_mark:                                                                    | The Twilio-provided string that uniquely identifies the BYOC Trunk resource to fetch. |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[FetchByocTrunkResponse](../../models/operations/FetchByocTrunkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateByocTrunk

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.UpdateByocTrunkResponse;
import org.openapis.openapi.models.operations.UpdateByocTrunkStatusCallbackMethod;
import org.openapis.openapi.models.operations.UpdateByocTrunkUpdateByocTrunkRequest;
import org.openapis.openapi.models.operations.UpdateByocTrunkVoiceFallbackMethod;
import org.openapis.openapi.models.operations.UpdateByocTrunkVoiceMethod;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateByocTrunkResponse res = sdk.voiceV1ByocTrunk().updateByocTrunk()
                .sid("<id>")
                .requestBody(UpdateByocTrunkUpdateByocTrunkRequest.builder()
                    .friendlyName("update_name")
                    .voiceUrl("https://byoc.example.com/twilio_updated/app")
                    .voiceMethod(UpdateByocTrunkVoiceMethod.GET)
                    .voiceFallbackUrl("https://byoc.example.com/twilio_updated/fallback")
                    .voiceFallbackMethod(UpdateByocTrunkVoiceFallbackMethod.GET)
                    .statusCallbackUrl("https://byoc.example.com/twilio_updated/status_callback")
                    .statusCallbackMethod(UpdateByocTrunkStatusCallbackMethod.GET)
                    .cnamLookupEnabled(true)
                    .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                    .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                    .build())
                .call();

        if (res.voiceV1ByocTrunk().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `sid`                                                                                                                | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | The Twilio-provided string that uniquely identifies the BYOC Trunk resource to update.                               |
| `requestBody`                                                                                                        | [Optional\<UpdateByocTrunkUpdateByocTrunkRequest>](../../models/operations/UpdateByocTrunkUpdateByocTrunkRequest.md) | :heavy_minus_sign:                                                                                                   | N/A                                                                                                                  |
| `serverURL`                                                                                                          | *String*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |

### Response

**[UpdateByocTrunkResponse](../../models/operations/UpdateByocTrunkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteByocTrunk

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.DeleteByocTrunkResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteByocTrunkResponse res = sdk.voiceV1ByocTrunk().deleteByocTrunk()
                .sid("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `sid`                                                                                  | *String*                                                                               | :heavy_check_mark:                                                                     | The Twilio-provided string that uniquely identifies the BYOC Trunk resource to delete. |
| `serverURL`                                                                            | *String*                                                                               | :heavy_minus_sign:                                                                     | An optional server URL to use.                                                         |

### Response

**[DeleteByocTrunkResponse](../../models/operations/DeleteByocTrunkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |
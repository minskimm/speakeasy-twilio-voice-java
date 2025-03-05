<!-- Start SDK Example Usage [usage] -->
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
<!-- End SDK Example Usage [usage] -->
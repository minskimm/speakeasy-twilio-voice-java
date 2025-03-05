/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * UpdateByocTrunkStatusCallbackMethod - The HTTP method we should use to call `status_callback_url`. Can be: `GET` or `POST`.
 */
public enum UpdateByocTrunkStatusCallbackMethod {
    GET("GET"),
    POST("POST");

    @JsonValue
    private final String value;

    private UpdateByocTrunkStatusCallbackMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<UpdateByocTrunkStatusCallbackMethod> fromValue(String value) {
        for (UpdateByocTrunkStatusCallbackMethod o: UpdateByocTrunkStatusCallbackMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

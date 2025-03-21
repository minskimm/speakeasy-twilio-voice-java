/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * UpdateByocTrunkVoiceFallbackMethod - The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or `POST`.
 */
public enum UpdateByocTrunkVoiceFallbackMethod {
    GET("GET"),
    POST("POST");

    @JsonValue
    private final String value;

    private UpdateByocTrunkVoiceFallbackMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<UpdateByocTrunkVoiceFallbackMethod> fromValue(String value) {
        for (UpdateByocTrunkVoiceFallbackMethod o: UpdateByocTrunkVoiceFallbackMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

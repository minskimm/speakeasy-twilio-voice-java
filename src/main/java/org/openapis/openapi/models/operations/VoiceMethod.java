/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * VoiceMethod - The HTTP method we should use to call `voice_url`. Can be: `GET` or `POST`.
 */
public enum VoiceMethod {
    GET("GET"),
    POST("POST");

    @JsonValue
    private final String value;

    private VoiceMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<VoiceMethod> fromValue(String value) {
        for (VoiceMethod o: VoiceMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

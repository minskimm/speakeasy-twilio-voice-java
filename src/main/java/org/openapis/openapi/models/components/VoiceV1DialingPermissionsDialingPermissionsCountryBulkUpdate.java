/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate {

    /**
     * The number of countries updated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update_count")
    private Optional<Long> updateCount;

    /**
     * A bulk update request to change voice dialing country permissions stored as a URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB", "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true", "high_risk_tollfraud_numbers_enabled": "false" } ]`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update_request")
    private JsonNullable<String> updateRequest;

    @JsonCreator
    public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate(
            @JsonProperty("update_count") Optional<Long> updateCount,
            @JsonProperty("update_request") JsonNullable<String> updateRequest) {
        Utils.checkNotNull(updateCount, "updateCount");
        Utils.checkNotNull(updateRequest, "updateRequest");
        this.updateCount = updateCount;
        this.updateRequest = updateRequest;
    }
    
    public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate() {
        this(Optional.empty(), JsonNullable.undefined());
    }

    /**
     * The number of countries updated
     */
    @JsonIgnore
    public Optional<Long> updateCount() {
        return updateCount;
    }

    /**
     * A bulk update request to change voice dialing country permissions stored as a URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB", "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true", "high_risk_tollfraud_numbers_enabled": "false" } ]`
     */
    @JsonIgnore
    public JsonNullable<String> updateRequest() {
        return updateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The number of countries updated
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate withUpdateCount(long updateCount) {
        Utils.checkNotNull(updateCount, "updateCount");
        this.updateCount = Optional.ofNullable(updateCount);
        return this;
    }

    /**
     * The number of countries updated
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate withUpdateCount(Optional<Long> updateCount) {
        Utils.checkNotNull(updateCount, "updateCount");
        this.updateCount = updateCount;
        return this;
    }

    /**
     * A bulk update request to change voice dialing country permissions stored as a URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB", "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true", "high_risk_tollfraud_numbers_enabled": "false" } ]`
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate withUpdateRequest(String updateRequest) {
        Utils.checkNotNull(updateRequest, "updateRequest");
        this.updateRequest = JsonNullable.of(updateRequest);
        return this;
    }

    /**
     * A bulk update request to change voice dialing country permissions stored as a URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB", "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true", "high_risk_tollfraud_numbers_enabled": "false" } ]`
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate withUpdateRequest(JsonNullable<String> updateRequest) {
        Utils.checkNotNull(updateRequest, "updateRequest");
        this.updateRequest = updateRequest;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate other = (VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate) o;
        return 
            Objects.deepEquals(this.updateCount, other.updateCount) &&
            Objects.deepEquals(this.updateRequest, other.updateRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            updateCount,
            updateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate.class,
                "updateCount", updateCount,
                "updateRequest", updateRequest);
    }
    
    public final static class Builder {
 
        private Optional<Long> updateCount;
 
        private JsonNullable<String> updateRequest = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The number of countries updated
         */
        public Builder updateCount(long updateCount) {
            Utils.checkNotNull(updateCount, "updateCount");
            this.updateCount = Optional.ofNullable(updateCount);
            return this;
        }

        /**
         * The number of countries updated
         */
        public Builder updateCount(Optional<Long> updateCount) {
            Utils.checkNotNull(updateCount, "updateCount");
            this.updateCount = updateCount;
            return this;
        }

        /**
         * A bulk update request to change voice dialing country permissions stored as a URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB", "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true", "high_risk_tollfraud_numbers_enabled": "false" } ]`
         */
        public Builder updateRequest(String updateRequest) {
            Utils.checkNotNull(updateRequest, "updateRequest");
            this.updateRequest = JsonNullable.of(updateRequest);
            return this;
        }

        /**
         * A bulk update request to change voice dialing country permissions stored as a URL-encoded, JSON array of update objects. For example : `[ { "iso_code": "GB", "low_risk_numbers_enabled": "true", "high_risk_special_numbers_enabled":"true", "high_risk_tollfraud_numbers_enabled": "false" } ]`
         */
        public Builder updateRequest(JsonNullable<String> updateRequest) {
            Utils.checkNotNull(updateRequest, "updateRequest");
            this.updateRequest = updateRequest;
            return this;
        }
        
        public VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate build() {
            if (updateCount == null) {
                updateCount = _SINGLETON_VALUE_UpdateCount.value();
            }            return new VoiceV1DialingPermissionsDialingPermissionsCountryBulkUpdate(
                updateCount,
                updateRequest);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_UpdateCount =
                new LazySingletonValue<>(
                        "update_count",
                        "0",
                        new TypeReference<Optional<Long>>() {});
    }
}


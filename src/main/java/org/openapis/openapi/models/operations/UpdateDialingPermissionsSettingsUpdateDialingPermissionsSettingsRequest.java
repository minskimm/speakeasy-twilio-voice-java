/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest {

    /**
     * `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`.
     */
    @SpeakeasyMetadata("form:name=DialingPermissionsInheritance")
    private Optional<Boolean> dialingPermissionsInheritance;

    @JsonCreator
    public UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest(
            Optional<Boolean> dialingPermissionsInheritance) {
        Utils.checkNotNull(dialingPermissionsInheritance, "dialingPermissionsInheritance");
        this.dialingPermissionsInheritance = dialingPermissionsInheritance;
    }
    
    public UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest() {
        this(Optional.empty());
    }

    /**
     * `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`.
     */
    @JsonIgnore
    public Optional<Boolean> dialingPermissionsInheritance() {
        return dialingPermissionsInheritance;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`.
     */
    public UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest withDialingPermissionsInheritance(boolean dialingPermissionsInheritance) {
        Utils.checkNotNull(dialingPermissionsInheritance, "dialingPermissionsInheritance");
        this.dialingPermissionsInheritance = Optional.ofNullable(dialingPermissionsInheritance);
        return this;
    }

    /**
     * `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`.
     */
    public UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest withDialingPermissionsInheritance(Optional<Boolean> dialingPermissionsInheritance) {
        Utils.checkNotNull(dialingPermissionsInheritance, "dialingPermissionsInheritance");
        this.dialingPermissionsInheritance = dialingPermissionsInheritance;
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
        UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest other = (UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest) o;
        return 
            Objects.deepEquals(this.dialingPermissionsInheritance, other.dialingPermissionsInheritance);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dialingPermissionsInheritance);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest.class,
                "dialingPermissionsInheritance", dialingPermissionsInheritance);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> dialingPermissionsInheritance = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`.
         */
        public Builder dialingPermissionsInheritance(boolean dialingPermissionsInheritance) {
            Utils.checkNotNull(dialingPermissionsInheritance, "dialingPermissionsInheritance");
            this.dialingPermissionsInheritance = Optional.ofNullable(dialingPermissionsInheritance);
            return this;
        }

        /**
         * `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`.
         */
        public Builder dialingPermissionsInheritance(Optional<Boolean> dialingPermissionsInheritance) {
            Utils.checkNotNull(dialingPermissionsInheritance, "dialingPermissionsInheritance");
            this.dialingPermissionsInheritance = dialingPermissionsInheritance;
            return this;
        }
        
        public UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest build() {
            return new UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest(
                dialingPermissionsInheritance);
        }
    }
}


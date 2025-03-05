/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class UpdateConnectionPolicyUpdateConnectionPolicyRequest {

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    @SpeakeasyMetadata("form:name=FriendlyName")
    private Optional<String> friendlyName;

    @JsonCreator
    public UpdateConnectionPolicyUpdateConnectionPolicyRequest(
            Optional<String> friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = friendlyName;
    }
    
    public UpdateConnectionPolicyUpdateConnectionPolicyRequest() {
        this(Optional.empty());
    }

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    @JsonIgnore
    public Optional<String> friendlyName() {
        return friendlyName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    public UpdateConnectionPolicyUpdateConnectionPolicyRequest withFriendlyName(String friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = Optional.ofNullable(friendlyName);
        return this;
    }

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    public UpdateConnectionPolicyUpdateConnectionPolicyRequest withFriendlyName(Optional<String> friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = friendlyName;
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
        UpdateConnectionPolicyUpdateConnectionPolicyRequest other = (UpdateConnectionPolicyUpdateConnectionPolicyRequest) o;
        return 
            Objects.deepEquals(this.friendlyName, other.friendlyName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            friendlyName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateConnectionPolicyUpdateConnectionPolicyRequest.class,
                "friendlyName", friendlyName);
    }
    
    public final static class Builder {
 
        private Optional<String> friendlyName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
         */
        public Builder friendlyName(String friendlyName) {
            Utils.checkNotNull(friendlyName, "friendlyName");
            this.friendlyName = Optional.ofNullable(friendlyName);
            return this;
        }

        /**
         * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
         */
        public Builder friendlyName(Optional<String> friendlyName) {
            Utils.checkNotNull(friendlyName, "friendlyName");
            this.friendlyName = friendlyName;
            return this;
        }
        
        public UpdateConnectionPolicyUpdateConnectionPolicyRequest build() {
            return new UpdateConnectionPolicyUpdateConnectionPolicyRequest(
                friendlyName);
        }
    }
}


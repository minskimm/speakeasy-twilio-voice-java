/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest {

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips` is NOT supported.
     */
    @SpeakeasyMetadata("form:name=Target")
    private String target;

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    @SpeakeasyMetadata("form:name=FriendlyName")
    private Optional<String> friendlyName;

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the default is 10. The lowest number represents the most important target.
     */
    @SpeakeasyMetadata("form:name=Priority")
    private Optional<Long> priority;

    /**
     * The value that determines the relative share of the load the Target should receive compared to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and the default is 10. Targets with higher values receive more load than those with lower ones with the same priority.
     */
    @SpeakeasyMetadata("form:name=Weight")
    private Optional<Long> weight;

    /**
     * Whether the Target is enabled. The default is `true`.
     */
    @SpeakeasyMetadata("form:name=Enabled")
    private Optional<Boolean> enabled;

    @JsonCreator
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest(
            String target,
            Optional<String> friendlyName,
            Optional<Long> priority,
            Optional<Long> weight,
            Optional<Boolean> enabled) {
        Utils.checkNotNull(target, "target");
        Utils.checkNotNull(friendlyName, "friendlyName");
        Utils.checkNotNull(priority, "priority");
        Utils.checkNotNull(weight, "weight");
        Utils.checkNotNull(enabled, "enabled");
        this.target = target;
        this.friendlyName = friendlyName;
        this.priority = priority;
        this.weight = weight;
        this.enabled = enabled;
    }
    
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest(
            String target) {
        this(target, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips` is NOT supported.
     */
    @JsonIgnore
    public String target() {
        return target;
    }

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    @JsonIgnore
    public Optional<String> friendlyName() {
        return friendlyName;
    }

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the default is 10. The lowest number represents the most important target.
     */
    @JsonIgnore
    public Optional<Long> priority() {
        return priority;
    }

    /**
     * The value that determines the relative share of the load the Target should receive compared to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and the default is 10. Targets with higher values receive more load than those with lower ones with the same priority.
     */
    @JsonIgnore
    public Optional<Long> weight() {
        return weight;
    }

    /**
     * Whether the Target is enabled. The default is `true`.
     */
    @JsonIgnore
    public Optional<Boolean> enabled() {
        return enabled;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips` is NOT supported.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withTarget(String target) {
        Utils.checkNotNull(target, "target");
        this.target = target;
        return this;
    }

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withFriendlyName(String friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = Optional.ofNullable(friendlyName);
        return this;
    }

    /**
     * A descriptive string that you create to describe the resource. It is not unique and can be up to 255 characters long.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withFriendlyName(Optional<String> friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the default is 10. The lowest number represents the most important target.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withPriority(long priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = Optional.ofNullable(priority);
        return this;
    }

    /**
     * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the default is 10. The lowest number represents the most important target.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withPriority(Optional<Long> priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = priority;
        return this;
    }

    /**
     * The value that determines the relative share of the load the Target should receive compared to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and the default is 10. Targets with higher values receive more load than those with lower ones with the same priority.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withWeight(long weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = Optional.ofNullable(weight);
        return this;
    }

    /**
     * The value that determines the relative share of the load the Target should receive compared to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and the default is 10. Targets with higher values receive more load than those with lower ones with the same priority.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withWeight(Optional<Long> weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = weight;
        return this;
    }

    /**
     * Whether the Target is enabled. The default is `true`.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    /**
     * Whether the Target is enabled. The default is `true`.
     */
    public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest withEnabled(Optional<Boolean> enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
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
        CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest other = (CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest) o;
        return 
            Objects.deepEquals(this.target, other.target) &&
            Objects.deepEquals(this.friendlyName, other.friendlyName) &&
            Objects.deepEquals(this.priority, other.priority) &&
            Objects.deepEquals(this.weight, other.weight) &&
            Objects.deepEquals(this.enabled, other.enabled);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            target,
            friendlyName,
            priority,
            weight,
            enabled);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest.class,
                "target", target,
                "friendlyName", friendlyName,
                "priority", priority,
                "weight", weight,
                "enabled", enabled);
    }
    
    public final static class Builder {
 
        private String target;
 
        private Optional<String> friendlyName = Optional.empty();
 
        private Optional<Long> priority = Optional.empty();
 
        private Optional<Long> weight = Optional.empty();
 
        private Optional<Boolean> enabled = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The SIP address you want Twilio to route your calls to. This must be a `sip:` schema. `sips` is NOT supported.
         */
        public Builder target(String target) {
            Utils.checkNotNull(target, "target");
            this.target = target;
            return this;
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

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the default is 10. The lowest number represents the most important target.
         */
        public Builder priority(long priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = Optional.ofNullable(priority);
            return this;
        }

        /**
         * The relative importance of the target. Can be an integer from 0 to 65535, inclusive, and the default is 10. The lowest number represents the most important target.
         */
        public Builder priority(Optional<Long> priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = priority;
            return this;
        }

        /**
         * The value that determines the relative share of the load the Target should receive compared to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and the default is 10. Targets with higher values receive more load than those with lower ones with the same priority.
         */
        public Builder weight(long weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = Optional.ofNullable(weight);
            return this;
        }

        /**
         * The value that determines the relative share of the load the Target should receive compared to other Targets with the same priority. Can be an integer from 1 to 65535, inclusive, and the default is 10. Targets with higher values receive more load than those with lower ones with the same priority.
         */
        public Builder weight(Optional<Long> weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = weight;
            return this;
        }

        /**
         * Whether the Target is enabled. The default is `true`.
         */
        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = Optional.ofNullable(enabled);
            return this;
        }

        /**
         * Whether the Target is enabled. The default is `true`.
         */
        public Builder enabled(Optional<Boolean> enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }
        
        public CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest build() {
            return new CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest(
                target,
                friendlyName,
                priority,
                weight,
                enabled);
        }
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class UpdateIpRecordRequest {

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to update.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=Sid")
    private String sid;

    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    private Optional<? extends UpdateIpRecordUpdateIpRecordRequest> requestBody;

    @JsonCreator
    public UpdateIpRecordRequest(
            String sid,
            Optional<? extends UpdateIpRecordUpdateIpRecordRequest> requestBody) {
        Utils.checkNotNull(sid, "sid");
        Utils.checkNotNull(requestBody, "requestBody");
        this.sid = sid;
        this.requestBody = requestBody;
    }
    
    public UpdateIpRecordRequest(
            String sid) {
        this(sid, Optional.empty());
    }

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to update.
     */
    @JsonIgnore
    public String sid() {
        return sid;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateIpRecordUpdateIpRecordRequest> requestBody() {
        return (Optional<UpdateIpRecordUpdateIpRecordRequest>) requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to update.
     */
    public UpdateIpRecordRequest withSid(String sid) {
        Utils.checkNotNull(sid, "sid");
        this.sid = sid;
        return this;
    }

    public UpdateIpRecordRequest withRequestBody(UpdateIpRecordUpdateIpRecordRequest requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public UpdateIpRecordRequest withRequestBody(Optional<? extends UpdateIpRecordUpdateIpRecordRequest> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        UpdateIpRecordRequest other = (UpdateIpRecordRequest) o;
        return 
            Objects.deepEquals(this.sid, other.sid) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateIpRecordRequest.class,
                "sid", sid,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String sid;
 
        private Optional<? extends UpdateIpRecordUpdateIpRecordRequest> requestBody = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to update.
         */
        public Builder sid(String sid) {
            Utils.checkNotNull(sid, "sid");
            this.sid = sid;
            return this;
        }

        public Builder requestBody(UpdateIpRecordUpdateIpRecordRequest requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends UpdateIpRecordUpdateIpRecordRequest> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateIpRecordRequest build() {
            return new UpdateIpRecordRequest(
                sid,
                requestBody);
        }
    }
}


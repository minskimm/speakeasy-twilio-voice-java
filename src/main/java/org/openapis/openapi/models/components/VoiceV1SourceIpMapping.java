/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class VoiceV1SourceIpMapping {

    /**
     * The unique string that we created to identify the IP Record resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sid")
    private JsonNullable<String> sid;

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ip_record_sid")
    private JsonNullable<String> ipRecordSid;

    /**
     * The SID of the SIP Domain that the IP Record is mapped to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sip_domain_sid")
    private JsonNullable<String> sipDomainSid;

    /**
     * The date and time in GMT that the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_created")
    private JsonNullable<OffsetDateTime> dateCreated;

    /**
     * The date and time in GMT that the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_updated")
    private JsonNullable<OffsetDateTime> dateUpdated;

    /**
     * The absolute URL of the resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    @JsonCreator
    public VoiceV1SourceIpMapping(
            @JsonProperty("sid") JsonNullable<String> sid,
            @JsonProperty("ip_record_sid") JsonNullable<String> ipRecordSid,
            @JsonProperty("sip_domain_sid") JsonNullable<String> sipDomainSid,
            @JsonProperty("date_created") JsonNullable<OffsetDateTime> dateCreated,
            @JsonProperty("date_updated") JsonNullable<OffsetDateTime> dateUpdated,
            @JsonProperty("url") JsonNullable<String> url) {
        Utils.checkNotNull(sid, "sid");
        Utils.checkNotNull(ipRecordSid, "ipRecordSid");
        Utils.checkNotNull(sipDomainSid, "sipDomainSid");
        Utils.checkNotNull(dateCreated, "dateCreated");
        Utils.checkNotNull(dateUpdated, "dateUpdated");
        Utils.checkNotNull(url, "url");
        this.sid = sid;
        this.ipRecordSid = ipRecordSid;
        this.sipDomainSid = sipDomainSid;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.url = url;
    }
    
    public VoiceV1SourceIpMapping() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The unique string that we created to identify the IP Record resource.
     */
    @JsonIgnore
    public JsonNullable<String> sid() {
        return sid;
    }

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
     */
    @JsonIgnore
    public JsonNullable<String> ipRecordSid() {
        return ipRecordSid;
    }

    /**
     * The SID of the SIP Domain that the IP Record is mapped to.
     */
    @JsonIgnore
    public JsonNullable<String> sipDomainSid() {
        return sipDomainSid;
    }

    /**
     * The date and time in GMT that the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> dateCreated() {
        return dateCreated;
    }

    /**
     * The date and time in GMT that the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> dateUpdated() {
        return dateUpdated;
    }

    /**
     * The absolute URL of the resource.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique string that we created to identify the IP Record resource.
     */
    public VoiceV1SourceIpMapping withSid(String sid) {
        Utils.checkNotNull(sid, "sid");
        this.sid = JsonNullable.of(sid);
        return this;
    }

    /**
     * The unique string that we created to identify the IP Record resource.
     */
    public VoiceV1SourceIpMapping withSid(JsonNullable<String> sid) {
        Utils.checkNotNull(sid, "sid");
        this.sid = sid;
        return this;
    }

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
     */
    public VoiceV1SourceIpMapping withIpRecordSid(String ipRecordSid) {
        Utils.checkNotNull(ipRecordSid, "ipRecordSid");
        this.ipRecordSid = JsonNullable.of(ipRecordSid);
        return this;
    }

    /**
     * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
     */
    public VoiceV1SourceIpMapping withIpRecordSid(JsonNullable<String> ipRecordSid) {
        Utils.checkNotNull(ipRecordSid, "ipRecordSid");
        this.ipRecordSid = ipRecordSid;
        return this;
    }

    /**
     * The SID of the SIP Domain that the IP Record is mapped to.
     */
    public VoiceV1SourceIpMapping withSipDomainSid(String sipDomainSid) {
        Utils.checkNotNull(sipDomainSid, "sipDomainSid");
        this.sipDomainSid = JsonNullable.of(sipDomainSid);
        return this;
    }

    /**
     * The SID of the SIP Domain that the IP Record is mapped to.
     */
    public VoiceV1SourceIpMapping withSipDomainSid(JsonNullable<String> sipDomainSid) {
        Utils.checkNotNull(sipDomainSid, "sipDomainSid");
        this.sipDomainSid = sipDomainSid;
        return this;
    }

    /**
     * The date and time in GMT that the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1SourceIpMapping withDateCreated(OffsetDateTime dateCreated) {
        Utils.checkNotNull(dateCreated, "dateCreated");
        this.dateCreated = JsonNullable.of(dateCreated);
        return this;
    }

    /**
     * The date and time in GMT that the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1SourceIpMapping withDateCreated(JsonNullable<OffsetDateTime> dateCreated) {
        Utils.checkNotNull(dateCreated, "dateCreated");
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date and time in GMT that the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1SourceIpMapping withDateUpdated(OffsetDateTime dateUpdated) {
        Utils.checkNotNull(dateUpdated, "dateUpdated");
        this.dateUpdated = JsonNullable.of(dateUpdated);
        return this;
    }

    /**
     * The date and time in GMT that the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1SourceIpMapping withDateUpdated(JsonNullable<OffsetDateTime> dateUpdated) {
        Utils.checkNotNull(dateUpdated, "dateUpdated");
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * The absolute URL of the resource.
     */
    public VoiceV1SourceIpMapping withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * The absolute URL of the resource.
     */
    public VoiceV1SourceIpMapping withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        VoiceV1SourceIpMapping other = (VoiceV1SourceIpMapping) o;
        return 
            Objects.deepEquals(this.sid, other.sid) &&
            Objects.deepEquals(this.ipRecordSid, other.ipRecordSid) &&
            Objects.deepEquals(this.sipDomainSid, other.sipDomainSid) &&
            Objects.deepEquals(this.dateCreated, other.dateCreated) &&
            Objects.deepEquals(this.dateUpdated, other.dateUpdated) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            ipRecordSid,
            sipDomainSid,
            dateCreated,
            dateUpdated,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VoiceV1SourceIpMapping.class,
                "sid", sid,
                "ipRecordSid", ipRecordSid,
                "sipDomainSid", sipDomainSid,
                "dateCreated", dateCreated,
                "dateUpdated", dateUpdated,
                "url", url);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> sid = JsonNullable.undefined();
 
        private JsonNullable<String> ipRecordSid = JsonNullable.undefined();
 
        private JsonNullable<String> sipDomainSid = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> dateUpdated = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique string that we created to identify the IP Record resource.
         */
        public Builder sid(String sid) {
            Utils.checkNotNull(sid, "sid");
            this.sid = JsonNullable.of(sid);
            return this;
        }

        /**
         * The unique string that we created to identify the IP Record resource.
         */
        public Builder sid(JsonNullable<String> sid) {
            Utils.checkNotNull(sid, "sid");
            this.sid = sid;
            return this;
        }

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        public Builder ipRecordSid(String ipRecordSid) {
            Utils.checkNotNull(ipRecordSid, "ipRecordSid");
            this.ipRecordSid = JsonNullable.of(ipRecordSid);
            return this;
        }

        /**
         * The Twilio-provided string that uniquely identifies the IP Record resource to map from.
         */
        public Builder ipRecordSid(JsonNullable<String> ipRecordSid) {
            Utils.checkNotNull(ipRecordSid, "ipRecordSid");
            this.ipRecordSid = ipRecordSid;
            return this;
        }

        /**
         * The SID of the SIP Domain that the IP Record is mapped to.
         */
        public Builder sipDomainSid(String sipDomainSid) {
            Utils.checkNotNull(sipDomainSid, "sipDomainSid");
            this.sipDomainSid = JsonNullable.of(sipDomainSid);
            return this;
        }

        /**
         * The SID of the SIP Domain that the IP Record is mapped to.
         */
        public Builder sipDomainSid(JsonNullable<String> sipDomainSid) {
            Utils.checkNotNull(sipDomainSid, "sipDomainSid");
            this.sipDomainSid = sipDomainSid;
            return this;
        }

        /**
         * The date and time in GMT that the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateCreated(OffsetDateTime dateCreated) {
            Utils.checkNotNull(dateCreated, "dateCreated");
            this.dateCreated = JsonNullable.of(dateCreated);
            return this;
        }

        /**
         * The date and time in GMT that the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateCreated(JsonNullable<OffsetDateTime> dateCreated) {
            Utils.checkNotNull(dateCreated, "dateCreated");
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * The date and time in GMT that the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateUpdated(OffsetDateTime dateUpdated) {
            Utils.checkNotNull(dateUpdated, "dateUpdated");
            this.dateUpdated = JsonNullable.of(dateUpdated);
            return this;
        }

        /**
         * The date and time in GMT that the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateUpdated(JsonNullable<OffsetDateTime> dateUpdated) {
            Utils.checkNotNull(dateUpdated, "dateUpdated");
            this.dateUpdated = dateUpdated;
            return this;
        }

        /**
         * The absolute URL of the resource.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * The absolute URL of the resource.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public VoiceV1SourceIpMapping build() {
            return new VoiceV1SourceIpMapping(
                sid,
                ipRecordSid,
                sipDomainSid,
                dateCreated,
                dateUpdated,
                url);
        }
    }
}


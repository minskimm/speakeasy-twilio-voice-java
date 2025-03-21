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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class VoiceV1ConnectionPolicy {

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Connection Policy resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_sid")
    private JsonNullable<String> accountSid;

    /**
     * The unique string that we created to identify the Connection Policy resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sid")
    private JsonNullable<String> sid;

    /**
     * The string that you assigned to describe the resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("friendly_name")
    private JsonNullable<String> friendlyName;

    /**
     * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_created")
    private JsonNullable<OffsetDateTime> dateCreated;

    /**
     * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
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

    /**
     * The URLs of related resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private JsonNullable<? extends Links> links;

    @JsonCreator
    public VoiceV1ConnectionPolicy(
            @JsonProperty("account_sid") JsonNullable<String> accountSid,
            @JsonProperty("sid") JsonNullable<String> sid,
            @JsonProperty("friendly_name") JsonNullable<String> friendlyName,
            @JsonProperty("date_created") JsonNullable<OffsetDateTime> dateCreated,
            @JsonProperty("date_updated") JsonNullable<OffsetDateTime> dateUpdated,
            @JsonProperty("url") JsonNullable<String> url,
            @JsonProperty("links") JsonNullable<? extends Links> links) {
        Utils.checkNotNull(accountSid, "accountSid");
        Utils.checkNotNull(sid, "sid");
        Utils.checkNotNull(friendlyName, "friendlyName");
        Utils.checkNotNull(dateCreated, "dateCreated");
        Utils.checkNotNull(dateUpdated, "dateUpdated");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(links, "links");
        this.accountSid = accountSid;
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.url = url;
        this.links = links;
    }
    
    public VoiceV1ConnectionPolicy() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Connection Policy resource.
     */
    @JsonIgnore
    public JsonNullable<String> accountSid() {
        return accountSid;
    }

    /**
     * The unique string that we created to identify the Connection Policy resource.
     */
    @JsonIgnore
    public JsonNullable<String> sid() {
        return sid;
    }

    /**
     * The string that you assigned to describe the resource.
     */
    @JsonIgnore
    public JsonNullable<String> friendlyName() {
        return friendlyName;
    }

    /**
     * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> dateCreated() {
        return dateCreated;
    }

    /**
     * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
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

    /**
     * The URLs of related resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Links> links() {
        return (JsonNullable<Links>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Connection Policy resource.
     */
    public VoiceV1ConnectionPolicy withAccountSid(String accountSid) {
        Utils.checkNotNull(accountSid, "accountSid");
        this.accountSid = JsonNullable.of(accountSid);
        return this;
    }

    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Connection Policy resource.
     */
    public VoiceV1ConnectionPolicy withAccountSid(JsonNullable<String> accountSid) {
        Utils.checkNotNull(accountSid, "accountSid");
        this.accountSid = accountSid;
        return this;
    }

    /**
     * The unique string that we created to identify the Connection Policy resource.
     */
    public VoiceV1ConnectionPolicy withSid(String sid) {
        Utils.checkNotNull(sid, "sid");
        this.sid = JsonNullable.of(sid);
        return this;
    }

    /**
     * The unique string that we created to identify the Connection Policy resource.
     */
    public VoiceV1ConnectionPolicy withSid(JsonNullable<String> sid) {
        Utils.checkNotNull(sid, "sid");
        this.sid = sid;
        return this;
    }

    /**
     * The string that you assigned to describe the resource.
     */
    public VoiceV1ConnectionPolicy withFriendlyName(String friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = JsonNullable.of(friendlyName);
        return this;
    }

    /**
     * The string that you assigned to describe the resource.
     */
    public VoiceV1ConnectionPolicy withFriendlyName(JsonNullable<String> friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1ConnectionPolicy withDateCreated(OffsetDateTime dateCreated) {
        Utils.checkNotNull(dateCreated, "dateCreated");
        this.dateCreated = JsonNullable.of(dateCreated);
        return this;
    }

    /**
     * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1ConnectionPolicy withDateCreated(JsonNullable<OffsetDateTime> dateCreated) {
        Utils.checkNotNull(dateCreated, "dateCreated");
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1ConnectionPolicy withDateUpdated(OffsetDateTime dateUpdated) {
        Utils.checkNotNull(dateUpdated, "dateUpdated");
        this.dateUpdated = JsonNullable.of(dateUpdated);
        return this;
    }

    /**
     * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
     */
    public VoiceV1ConnectionPolicy withDateUpdated(JsonNullable<OffsetDateTime> dateUpdated) {
        Utils.checkNotNull(dateUpdated, "dateUpdated");
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * The absolute URL of the resource.
     */
    public VoiceV1ConnectionPolicy withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * The absolute URL of the resource.
     */
    public VoiceV1ConnectionPolicy withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * The URLs of related resources.
     */
    public VoiceV1ConnectionPolicy withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = JsonNullable.of(links);
        return this;
    }

    /**
     * The URLs of related resources.
     */
    public VoiceV1ConnectionPolicy withLinks(JsonNullable<? extends Links> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        VoiceV1ConnectionPolicy other = (VoiceV1ConnectionPolicy) o;
        return 
            Objects.deepEquals(this.accountSid, other.accountSid) &&
            Objects.deepEquals(this.sid, other.sid) &&
            Objects.deepEquals(this.friendlyName, other.friendlyName) &&
            Objects.deepEquals(this.dateCreated, other.dateCreated) &&
            Objects.deepEquals(this.dateUpdated, other.dateUpdated) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            sid,
            friendlyName,
            dateCreated,
            dateUpdated,
            url,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VoiceV1ConnectionPolicy.class,
                "accountSid", accountSid,
                "sid", sid,
                "friendlyName", friendlyName,
                "dateCreated", dateCreated,
                "dateUpdated", dateUpdated,
                "url", url,
                "links", links);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> accountSid = JsonNullable.undefined();
 
        private JsonNullable<String> sid = JsonNullable.undefined();
 
        private JsonNullable<String> friendlyName = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> dateUpdated = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();
 
        private JsonNullable<? extends Links> links = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Connection Policy resource.
         */
        public Builder accountSid(String accountSid) {
            Utils.checkNotNull(accountSid, "accountSid");
            this.accountSid = JsonNullable.of(accountSid);
            return this;
        }

        /**
         * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Connection Policy resource.
         */
        public Builder accountSid(JsonNullable<String> accountSid) {
            Utils.checkNotNull(accountSid, "accountSid");
            this.accountSid = accountSid;
            return this;
        }

        /**
         * The unique string that we created to identify the Connection Policy resource.
         */
        public Builder sid(String sid) {
            Utils.checkNotNull(sid, "sid");
            this.sid = JsonNullable.of(sid);
            return this;
        }

        /**
         * The unique string that we created to identify the Connection Policy resource.
         */
        public Builder sid(JsonNullable<String> sid) {
            Utils.checkNotNull(sid, "sid");
            this.sid = sid;
            return this;
        }

        /**
         * The string that you assigned to describe the resource.
         */
        public Builder friendlyName(String friendlyName) {
            Utils.checkNotNull(friendlyName, "friendlyName");
            this.friendlyName = JsonNullable.of(friendlyName);
            return this;
        }

        /**
         * The string that you assigned to describe the resource.
         */
        public Builder friendlyName(JsonNullable<String> friendlyName) {
            Utils.checkNotNull(friendlyName, "friendlyName");
            this.friendlyName = friendlyName;
            return this;
        }

        /**
         * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateCreated(OffsetDateTime dateCreated) {
            Utils.checkNotNull(dateCreated, "dateCreated");
            this.dateCreated = JsonNullable.of(dateCreated);
            return this;
        }

        /**
         * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateCreated(JsonNullable<OffsetDateTime> dateCreated) {
            Utils.checkNotNull(dateCreated, "dateCreated");
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
         */
        public Builder dateUpdated(OffsetDateTime dateUpdated) {
            Utils.checkNotNull(dateUpdated, "dateUpdated");
            this.dateUpdated = JsonNullable.of(dateUpdated);
            return this;
        }

        /**
         * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
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

        /**
         * The URLs of related resources.
         */
        public Builder links(Links links) {
            Utils.checkNotNull(links, "links");
            this.links = JsonNullable.of(links);
            return this;
        }

        /**
         * The URLs of related resources.
         */
        public Builder links(JsonNullable<? extends Links> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public VoiceV1ConnectionPolicy build() {
            return new VoiceV1ConnectionPolicy(
                accountSid,
                sid,
                friendlyName,
                dateCreated,
                dateUpdated,
                url,
                links);
        }
    }
}


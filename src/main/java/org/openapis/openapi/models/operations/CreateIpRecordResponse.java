/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.VoiceV1IpRecord;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class CreateIpRecordResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Created
     */
    private Optional<? extends VoiceV1IpRecord> voiceV1IpRecord;

    private Map<String, List<String>> headers;

    @JsonCreator
    public CreateIpRecordResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends VoiceV1IpRecord> voiceV1IpRecord,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(voiceV1IpRecord, "voiceV1IpRecord");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.voiceV1IpRecord = voiceV1IpRecord;
        this.headers = headers;
    }
    
    public CreateIpRecordResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), headers);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VoiceV1IpRecord> voiceV1IpRecord() {
        return (Optional<VoiceV1IpRecord>) voiceV1IpRecord;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateIpRecordResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateIpRecordResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateIpRecordResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Created
     */
    public CreateIpRecordResponse withVoiceV1IpRecord(VoiceV1IpRecord voiceV1IpRecord) {
        Utils.checkNotNull(voiceV1IpRecord, "voiceV1IpRecord");
        this.voiceV1IpRecord = Optional.ofNullable(voiceV1IpRecord);
        return this;
    }

    /**
     * Created
     */
    public CreateIpRecordResponse withVoiceV1IpRecord(Optional<? extends VoiceV1IpRecord> voiceV1IpRecord) {
        Utils.checkNotNull(voiceV1IpRecord, "voiceV1IpRecord");
        this.voiceV1IpRecord = voiceV1IpRecord;
        return this;
    }

    public CreateIpRecordResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
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
        CreateIpRecordResponse other = (CreateIpRecordResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.voiceV1IpRecord, other.voiceV1IpRecord) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            voiceV1IpRecord,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateIpRecordResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "voiceV1IpRecord", voiceV1IpRecord,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends VoiceV1IpRecord> voiceV1IpRecord = Optional.empty();
 
        private Map<String, List<String>> headers;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Created
         */
        public Builder voiceV1IpRecord(VoiceV1IpRecord voiceV1IpRecord) {
            Utils.checkNotNull(voiceV1IpRecord, "voiceV1IpRecord");
            this.voiceV1IpRecord = Optional.ofNullable(voiceV1IpRecord);
            return this;
        }

        /**
         * Created
         */
        public Builder voiceV1IpRecord(Optional<? extends VoiceV1IpRecord> voiceV1IpRecord) {
            Utils.checkNotNull(voiceV1IpRecord, "voiceV1IpRecord");
            this.voiceV1IpRecord = voiceV1IpRecord;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public CreateIpRecordResponse build() {
            return new CreateIpRecordResponse(
                contentType,
                statusCode,
                rawResponse,
                voiceV1IpRecord,
                headers);
        }
    }
}


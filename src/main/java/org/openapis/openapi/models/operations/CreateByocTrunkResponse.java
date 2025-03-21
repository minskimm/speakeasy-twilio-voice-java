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
import org.openapis.openapi.models.components.VoiceV1ByocTrunk;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class CreateByocTrunkResponse implements Response {

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
    private Optional<? extends VoiceV1ByocTrunk> voiceV1ByocTrunk;

    private Map<String, List<String>> headers;

    @JsonCreator
    public CreateByocTrunkResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends VoiceV1ByocTrunk> voiceV1ByocTrunk,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(voiceV1ByocTrunk, "voiceV1ByocTrunk");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.voiceV1ByocTrunk = voiceV1ByocTrunk;
        this.headers = headers;
    }
    
    public CreateByocTrunkResponse(
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
    public Optional<VoiceV1ByocTrunk> voiceV1ByocTrunk() {
        return (Optional<VoiceV1ByocTrunk>) voiceV1ByocTrunk;
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
    public CreateByocTrunkResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateByocTrunkResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateByocTrunkResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Created
     */
    public CreateByocTrunkResponse withVoiceV1ByocTrunk(VoiceV1ByocTrunk voiceV1ByocTrunk) {
        Utils.checkNotNull(voiceV1ByocTrunk, "voiceV1ByocTrunk");
        this.voiceV1ByocTrunk = Optional.ofNullable(voiceV1ByocTrunk);
        return this;
    }

    /**
     * Created
     */
    public CreateByocTrunkResponse withVoiceV1ByocTrunk(Optional<? extends VoiceV1ByocTrunk> voiceV1ByocTrunk) {
        Utils.checkNotNull(voiceV1ByocTrunk, "voiceV1ByocTrunk");
        this.voiceV1ByocTrunk = voiceV1ByocTrunk;
        return this;
    }

    public CreateByocTrunkResponse withHeaders(Map<String, List<String>> headers) {
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
        CreateByocTrunkResponse other = (CreateByocTrunkResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.voiceV1ByocTrunk, other.voiceV1ByocTrunk) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            voiceV1ByocTrunk,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateByocTrunkResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "voiceV1ByocTrunk", voiceV1ByocTrunk,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends VoiceV1ByocTrunk> voiceV1ByocTrunk = Optional.empty();
 
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
        public Builder voiceV1ByocTrunk(VoiceV1ByocTrunk voiceV1ByocTrunk) {
            Utils.checkNotNull(voiceV1ByocTrunk, "voiceV1ByocTrunk");
            this.voiceV1ByocTrunk = Optional.ofNullable(voiceV1ByocTrunk);
            return this;
        }

        /**
         * Created
         */
        public Builder voiceV1ByocTrunk(Optional<? extends VoiceV1ByocTrunk> voiceV1ByocTrunk) {
            Utils.checkNotNull(voiceV1ByocTrunk, "voiceV1ByocTrunk");
            this.voiceV1ByocTrunk = voiceV1ByocTrunk;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public CreateByocTrunkResponse build() {
            return new CreateByocTrunkResponse(
                contentType,
                statusCode,
                rawResponse,
                voiceV1ByocTrunk,
                headers);
        }
    }
}


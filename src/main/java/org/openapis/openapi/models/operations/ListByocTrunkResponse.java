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
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class ListByocTrunkResponse implements Response {

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
     * OK
     */
    private Optional<? extends ListByocTrunkListByocTrunkResponse> listByocTrunkResponse;

    private Map<String, List<String>> headers;

    @JsonCreator
    public ListByocTrunkResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ListByocTrunkListByocTrunkResponse> listByocTrunkResponse,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(listByocTrunkResponse, "listByocTrunkResponse");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.listByocTrunkResponse = listByocTrunkResponse;
        this.headers = headers;
    }
    
    public ListByocTrunkResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ListByocTrunkListByocTrunkResponse> listByocTrunkResponse() {
        return (Optional<ListByocTrunkListByocTrunkResponse>) listByocTrunkResponse;
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
    public ListByocTrunkResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListByocTrunkResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListByocTrunkResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public ListByocTrunkResponse withListByocTrunkResponse(ListByocTrunkListByocTrunkResponse listByocTrunkResponse) {
        Utils.checkNotNull(listByocTrunkResponse, "listByocTrunkResponse");
        this.listByocTrunkResponse = Optional.ofNullable(listByocTrunkResponse);
        return this;
    }

    /**
     * OK
     */
    public ListByocTrunkResponse withListByocTrunkResponse(Optional<? extends ListByocTrunkListByocTrunkResponse> listByocTrunkResponse) {
        Utils.checkNotNull(listByocTrunkResponse, "listByocTrunkResponse");
        this.listByocTrunkResponse = listByocTrunkResponse;
        return this;
    }

    public ListByocTrunkResponse withHeaders(Map<String, List<String>> headers) {
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
        ListByocTrunkResponse other = (ListByocTrunkResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.listByocTrunkResponse, other.listByocTrunkResponse) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            listByocTrunkResponse,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListByocTrunkResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "listByocTrunkResponse", listByocTrunkResponse,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ListByocTrunkListByocTrunkResponse> listByocTrunkResponse = Optional.empty();
 
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
         * OK
         */
        public Builder listByocTrunkResponse(ListByocTrunkListByocTrunkResponse listByocTrunkResponse) {
            Utils.checkNotNull(listByocTrunkResponse, "listByocTrunkResponse");
            this.listByocTrunkResponse = Optional.ofNullable(listByocTrunkResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder listByocTrunkResponse(Optional<? extends ListByocTrunkListByocTrunkResponse> listByocTrunkResponse) {
            Utils.checkNotNull(listByocTrunkResponse, "listByocTrunkResponse");
            this.listByocTrunkResponse = listByocTrunkResponse;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public ListByocTrunkResponse build() {
            return new ListByocTrunkResponse(
                contentType,
                statusCode,
                rawResponse,
                listByocTrunkResponse,
                headers);
        }
    }
}


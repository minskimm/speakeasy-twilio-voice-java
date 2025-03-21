/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes;
import org.openapis.openapi.utils.Utils;

/**
 * ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse - OK
 */

public class ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private Optional<? extends List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>> content;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends ListDialingPermissionsHrsPrefixesMeta> meta;

    @JsonCreator
    public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse(
            @JsonProperty("content") Optional<? extends List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>> content,
            @JsonProperty("meta") Optional<? extends ListDialingPermissionsHrsPrefixesMeta> meta) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(meta, "meta");
        this.content = content;
        this.meta = meta;
    }
    
    public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>> content() {
        return (Optional<List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>>) content;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ListDialingPermissionsHrsPrefixesMeta> meta() {
        return (Optional<ListDialingPermissionsHrsPrefixesMeta>) meta;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse withContent(List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes> content) {
        Utils.checkNotNull(content, "content");
        this.content = Optional.ofNullable(content);
        return this;
    }

    public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse withContent(Optional<? extends List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse withMeta(ListDialingPermissionsHrsPrefixesMeta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse withMeta(Optional<? extends ListDialingPermissionsHrsPrefixesMeta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
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
        ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse other = (ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse) o;
        return 
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.meta, other.meta);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            content,
            meta);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse.class,
                "content", content,
                "meta", meta);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>> content = Optional.empty();
 
        private Optional<? extends ListDialingPermissionsHrsPrefixesMeta> meta = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder content(List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes> content) {
            Utils.checkNotNull(content, "content");
            this.content = Optional.ofNullable(content);
            return this;
        }

        public Builder content(Optional<? extends List<VoiceV1DialingPermissionsDialingPermissionsCountryDialingPermissionsHrsPrefixes>> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder meta(ListDialingPermissionsHrsPrefixesMeta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends ListDialingPermissionsHrsPrefixesMeta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }
        
        public ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse build() {
            return new ListDialingPermissionsHrsPrefixesListDialingPermissionsHrsPrefixesResponse(
                content,
                meta);
        }
    }
}


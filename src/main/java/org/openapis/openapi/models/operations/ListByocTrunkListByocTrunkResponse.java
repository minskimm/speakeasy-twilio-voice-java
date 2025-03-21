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
import org.openapis.openapi.models.components.VoiceV1ByocTrunk;
import org.openapis.openapi.utils.Utils;

/**
 * ListByocTrunkListByocTrunkResponse - OK
 */

public class ListByocTrunkListByocTrunkResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("byoc_trunks")
    private Optional<? extends List<VoiceV1ByocTrunk>> byocTrunks;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends Meta> meta;

    @JsonCreator
    public ListByocTrunkListByocTrunkResponse(
            @JsonProperty("byoc_trunks") Optional<? extends List<VoiceV1ByocTrunk>> byocTrunks,
            @JsonProperty("meta") Optional<? extends Meta> meta) {
        Utils.checkNotNull(byocTrunks, "byocTrunks");
        Utils.checkNotNull(meta, "meta");
        this.byocTrunks = byocTrunks;
        this.meta = meta;
    }
    
    public ListByocTrunkListByocTrunkResponse() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<VoiceV1ByocTrunk>> byocTrunks() {
        return (Optional<List<VoiceV1ByocTrunk>>) byocTrunks;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Meta> meta() {
        return (Optional<Meta>) meta;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListByocTrunkListByocTrunkResponse withByocTrunks(List<VoiceV1ByocTrunk> byocTrunks) {
        Utils.checkNotNull(byocTrunks, "byocTrunks");
        this.byocTrunks = Optional.ofNullable(byocTrunks);
        return this;
    }

    public ListByocTrunkListByocTrunkResponse withByocTrunks(Optional<? extends List<VoiceV1ByocTrunk>> byocTrunks) {
        Utils.checkNotNull(byocTrunks, "byocTrunks");
        this.byocTrunks = byocTrunks;
        return this;
    }

    public ListByocTrunkListByocTrunkResponse withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    public ListByocTrunkListByocTrunkResponse withMeta(Optional<? extends Meta> meta) {
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
        ListByocTrunkListByocTrunkResponse other = (ListByocTrunkListByocTrunkResponse) o;
        return 
            Objects.deepEquals(this.byocTrunks, other.byocTrunks) &&
            Objects.deepEquals(this.meta, other.meta);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            byocTrunks,
            meta);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListByocTrunkListByocTrunkResponse.class,
                "byocTrunks", byocTrunks,
                "meta", meta);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<VoiceV1ByocTrunk>> byocTrunks = Optional.empty();
 
        private Optional<? extends Meta> meta = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder byocTrunks(List<VoiceV1ByocTrunk> byocTrunks) {
            Utils.checkNotNull(byocTrunks, "byocTrunks");
            this.byocTrunks = Optional.ofNullable(byocTrunks);
            return this;
        }

        public Builder byocTrunks(Optional<? extends List<VoiceV1ByocTrunk>> byocTrunks) {
            Utils.checkNotNull(byocTrunks, "byocTrunks");
            this.byocTrunks = byocTrunks;
            return this;
        }

        public Builder meta(Meta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends Meta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }
        
        public ListByocTrunkListByocTrunkResponse build() {
            return new ListByocTrunkListByocTrunkResponse(
                byocTrunks,
                meta);
        }
    }
}


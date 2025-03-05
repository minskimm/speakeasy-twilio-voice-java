/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;

/**
 * VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks - A list of URLs related to this resource.
 */

public class VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks {

    @JsonCreator
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks build() {
            return new VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks(
                );
        }
    }
}


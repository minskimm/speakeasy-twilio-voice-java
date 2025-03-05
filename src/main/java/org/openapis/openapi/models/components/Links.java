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
 * Links - The URLs of related resources.
 */

public class Links {

    @JsonCreator
    public Links() {
        
        
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
        return Utils.toString(Links.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Links build() {
            return new Links(
                );
        }
    }
}


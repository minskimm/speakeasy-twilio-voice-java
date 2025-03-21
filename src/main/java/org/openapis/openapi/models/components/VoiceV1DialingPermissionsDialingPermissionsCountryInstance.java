/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class VoiceV1DialingPermissionsDialingPermissionsCountryInstance {

    /**
     * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("iso_code")
    private JsonNullable<String> isoCode;

    /**
     * The name of the country.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The name of the continent in which the country is located.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("continent")
    private JsonNullable<String> continent;

    /**
     * The E.164 assigned [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_codes")
    private JsonNullable<? extends List<String>> countryCodes;

    /**
     * Whether dialing to low-risk numbers is enabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("low_risk_numbers_enabled")
    private JsonNullable<Boolean> lowRiskNumbersEnabled;

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include number ranges allocated by the country and include premium numbers, special services, shared cost, and others
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("high_risk_special_numbers_enabled")
    private JsonNullable<Boolean> highRiskSpecialNumbersEnabled;

    /**
     * Whether dialing to high-risk [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html) numbers is enabled. These prefixes include narrow number ranges that have a high-risk of international revenue sharing fraud (IRSF) attacks, also known as [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html). These prefixes are collected from anti-fraud databases and verified by analyzing calls on our network. These prefixes are not available for download and are updated frequently
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("high_risk_tollfraud_numbers_enabled")
    private JsonNullable<Boolean> highRiskTollfraudNumbersEnabled;

    /**
     * The absolute URL of this resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    /**
     * A list of URLs related to this resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private JsonNullable<? extends VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks> links;

    @JsonCreator
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance(
            @JsonProperty("iso_code") JsonNullable<String> isoCode,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("continent") JsonNullable<String> continent,
            @JsonProperty("country_codes") JsonNullable<? extends List<String>> countryCodes,
            @JsonProperty("low_risk_numbers_enabled") JsonNullable<Boolean> lowRiskNumbersEnabled,
            @JsonProperty("high_risk_special_numbers_enabled") JsonNullable<Boolean> highRiskSpecialNumbersEnabled,
            @JsonProperty("high_risk_tollfraud_numbers_enabled") JsonNullable<Boolean> highRiskTollfraudNumbersEnabled,
            @JsonProperty("url") JsonNullable<String> url,
            @JsonProperty("links") JsonNullable<? extends VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks> links) {
        Utils.checkNotNull(isoCode, "isoCode");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(continent, "continent");
        Utils.checkNotNull(countryCodes, "countryCodes");
        Utils.checkNotNull(lowRiskNumbersEnabled, "lowRiskNumbersEnabled");
        Utils.checkNotNull(highRiskSpecialNumbersEnabled, "highRiskSpecialNumbersEnabled");
        Utils.checkNotNull(highRiskTollfraudNumbersEnabled, "highRiskTollfraudNumbersEnabled");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(links, "links");
        this.isoCode = isoCode;
        this.name = name;
        this.continent = continent;
        this.countryCodes = countryCodes;
        this.lowRiskNumbersEnabled = lowRiskNumbersEnabled;
        this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled;
        this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled;
        this.url = url;
        this.links = links;
    }
    
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     */
    @JsonIgnore
    public JsonNullable<String> isoCode() {
        return isoCode;
    }

    /**
     * The name of the country.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The name of the continent in which the country is located.
     */
    @JsonIgnore
    public JsonNullable<String> continent() {
        return continent;
    }

    /**
     * The E.164 assigned [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> countryCodes() {
        return (JsonNullable<List<String>>) countryCodes;
    }

    /**
     * Whether dialing to low-risk numbers is enabled.
     */
    @JsonIgnore
    public JsonNullable<Boolean> lowRiskNumbersEnabled() {
        return lowRiskNumbersEnabled;
    }

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include number ranges allocated by the country and include premium numbers, special services, shared cost, and others
     */
    @JsonIgnore
    public JsonNullable<Boolean> highRiskSpecialNumbersEnabled() {
        return highRiskSpecialNumbersEnabled;
    }

    /**
     * Whether dialing to high-risk [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html) numbers is enabled. These prefixes include narrow number ranges that have a high-risk of international revenue sharing fraud (IRSF) attacks, also known as [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html). These prefixes are collected from anti-fraud databases and verified by analyzing calls on our network. These prefixes are not available for download and are updated frequently
     */
    @JsonIgnore
    public JsonNullable<Boolean> highRiskTollfraudNumbersEnabled() {
        return highRiskTollfraudNumbersEnabled;
    }

    /**
     * The absolute URL of this resource.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    /**
     * A list of URLs related to this resource.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks> links() {
        return (JsonNullable<VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withIsoCode(String isoCode) {
        Utils.checkNotNull(isoCode, "isoCode");
        this.isoCode = JsonNullable.of(isoCode);
        return this;
    }

    /**
     * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withIsoCode(JsonNullable<String> isoCode) {
        Utils.checkNotNull(isoCode, "isoCode");
        this.isoCode = isoCode;
        return this;
    }

    /**
     * The name of the country.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the country.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The name of the continent in which the country is located.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withContinent(String continent) {
        Utils.checkNotNull(continent, "continent");
        this.continent = JsonNullable.of(continent);
        return this;
    }

    /**
     * The name of the continent in which the country is located.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withContinent(JsonNullable<String> continent) {
        Utils.checkNotNull(continent, "continent");
        this.continent = continent;
        return this;
    }

    /**
     * The E.164 assigned [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withCountryCodes(List<String> countryCodes) {
        Utils.checkNotNull(countryCodes, "countryCodes");
        this.countryCodes = JsonNullable.of(countryCodes);
        return this;
    }

    /**
     * The E.164 assigned [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withCountryCodes(JsonNullable<? extends List<String>> countryCodes) {
        Utils.checkNotNull(countryCodes, "countryCodes");
        this.countryCodes = countryCodes;
        return this;
    }

    /**
     * Whether dialing to low-risk numbers is enabled.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withLowRiskNumbersEnabled(boolean lowRiskNumbersEnabled) {
        Utils.checkNotNull(lowRiskNumbersEnabled, "lowRiskNumbersEnabled");
        this.lowRiskNumbersEnabled = JsonNullable.of(lowRiskNumbersEnabled);
        return this;
    }

    /**
     * Whether dialing to low-risk numbers is enabled.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withLowRiskNumbersEnabled(JsonNullable<Boolean> lowRiskNumbersEnabled) {
        Utils.checkNotNull(lowRiskNumbersEnabled, "lowRiskNumbersEnabled");
        this.lowRiskNumbersEnabled = lowRiskNumbersEnabled;
        return this;
    }

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include number ranges allocated by the country and include premium numbers, special services, shared cost, and others
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withHighRiskSpecialNumbersEnabled(boolean highRiskSpecialNumbersEnabled) {
        Utils.checkNotNull(highRiskSpecialNumbersEnabled, "highRiskSpecialNumbersEnabled");
        this.highRiskSpecialNumbersEnabled = JsonNullable.of(highRiskSpecialNumbersEnabled);
        return this;
    }

    /**
     * Whether dialing to high-risk special services numbers is enabled. These prefixes include number ranges allocated by the country and include premium numbers, special services, shared cost, and others
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withHighRiskSpecialNumbersEnabled(JsonNullable<Boolean> highRiskSpecialNumbersEnabled) {
        Utils.checkNotNull(highRiskSpecialNumbersEnabled, "highRiskSpecialNumbersEnabled");
        this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled;
        return this;
    }

    /**
     * Whether dialing to high-risk [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html) numbers is enabled. These prefixes include narrow number ranges that have a high-risk of international revenue sharing fraud (IRSF) attacks, also known as [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html). These prefixes are collected from anti-fraud databases and verified by analyzing calls on our network. These prefixes are not available for download and are updated frequently
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withHighRiskTollfraudNumbersEnabled(boolean highRiskTollfraudNumbersEnabled) {
        Utils.checkNotNull(highRiskTollfraudNumbersEnabled, "highRiskTollfraudNumbersEnabled");
        this.highRiskTollfraudNumbersEnabled = JsonNullable.of(highRiskTollfraudNumbersEnabled);
        return this;
    }

    /**
     * Whether dialing to high-risk [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html) numbers is enabled. These prefixes include narrow number ranges that have a high-risk of international revenue sharing fraud (IRSF) attacks, also known as [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html). These prefixes are collected from anti-fraud databases and verified by analyzing calls on our network. These prefixes are not available for download and are updated frequently
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withHighRiskTollfraudNumbersEnabled(JsonNullable<Boolean> highRiskTollfraudNumbersEnabled) {
        Utils.checkNotNull(highRiskTollfraudNumbersEnabled, "highRiskTollfraudNumbersEnabled");
        this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled;
        return this;
    }

    /**
     * The absolute URL of this resource.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * The absolute URL of this resource.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * A list of URLs related to this resource.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withLinks(VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = JsonNullable.of(links);
        return this;
    }

    /**
     * A list of URLs related to this resource.
     */
    public VoiceV1DialingPermissionsDialingPermissionsCountryInstance withLinks(JsonNullable<? extends VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks> links) {
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
        VoiceV1DialingPermissionsDialingPermissionsCountryInstance other = (VoiceV1DialingPermissionsDialingPermissionsCountryInstance) o;
        return 
            Objects.deepEquals(this.isoCode, other.isoCode) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.continent, other.continent) &&
            Objects.deepEquals(this.countryCodes, other.countryCodes) &&
            Objects.deepEquals(this.lowRiskNumbersEnabled, other.lowRiskNumbersEnabled) &&
            Objects.deepEquals(this.highRiskSpecialNumbersEnabled, other.highRiskSpecialNumbersEnabled) &&
            Objects.deepEquals(this.highRiskTollfraudNumbersEnabled, other.highRiskTollfraudNumbersEnabled) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            isoCode,
            name,
            continent,
            countryCodes,
            lowRiskNumbersEnabled,
            highRiskSpecialNumbersEnabled,
            highRiskTollfraudNumbersEnabled,
            url,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VoiceV1DialingPermissionsDialingPermissionsCountryInstance.class,
                "isoCode", isoCode,
                "name", name,
                "continent", continent,
                "countryCodes", countryCodes,
                "lowRiskNumbersEnabled", lowRiskNumbersEnabled,
                "highRiskSpecialNumbersEnabled", highRiskSpecialNumbersEnabled,
                "highRiskTollfraudNumbersEnabled", highRiskTollfraudNumbersEnabled,
                "url", url,
                "links", links);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> isoCode = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> continent = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> countryCodes = JsonNullable.undefined();
 
        private JsonNullable<Boolean> lowRiskNumbersEnabled = JsonNullable.undefined();
 
        private JsonNullable<Boolean> highRiskSpecialNumbersEnabled = JsonNullable.undefined();
 
        private JsonNullable<Boolean> highRiskTollfraudNumbersEnabled = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();
 
        private JsonNullable<? extends VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks> links = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         */
        public Builder isoCode(String isoCode) {
            Utils.checkNotNull(isoCode, "isoCode");
            this.isoCode = JsonNullable.of(isoCode);
            return this;
        }

        /**
         * The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         */
        public Builder isoCode(JsonNullable<String> isoCode) {
            Utils.checkNotNull(isoCode, "isoCode");
            this.isoCode = isoCode;
            return this;
        }

        /**
         * The name of the country.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the country.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The name of the continent in which the country is located.
         */
        public Builder continent(String continent) {
            Utils.checkNotNull(continent, "continent");
            this.continent = JsonNullable.of(continent);
            return this;
        }

        /**
         * The name of the continent in which the country is located.
         */
        public Builder continent(JsonNullable<String> continent) {
            Utils.checkNotNull(continent, "continent");
            this.continent = continent;
            return this;
        }

        /**
         * The E.164 assigned [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        public Builder countryCodes(List<String> countryCodes) {
            Utils.checkNotNull(countryCodes, "countryCodes");
            this.countryCodes = JsonNullable.of(countryCodes);
            return this;
        }

        /**
         * The E.164 assigned [country codes(s)](https://www.itu.int/itudoc/itu-t/ob-lists/icc/e164_763.html)
         */
        public Builder countryCodes(JsonNullable<? extends List<String>> countryCodes) {
            Utils.checkNotNull(countryCodes, "countryCodes");
            this.countryCodes = countryCodes;
            return this;
        }

        /**
         * Whether dialing to low-risk numbers is enabled.
         */
        public Builder lowRiskNumbersEnabled(boolean lowRiskNumbersEnabled) {
            Utils.checkNotNull(lowRiskNumbersEnabled, "lowRiskNumbersEnabled");
            this.lowRiskNumbersEnabled = JsonNullable.of(lowRiskNumbersEnabled);
            return this;
        }

        /**
         * Whether dialing to low-risk numbers is enabled.
         */
        public Builder lowRiskNumbersEnabled(JsonNullable<Boolean> lowRiskNumbersEnabled) {
            Utils.checkNotNull(lowRiskNumbersEnabled, "lowRiskNumbersEnabled");
            this.lowRiskNumbersEnabled = lowRiskNumbersEnabled;
            return this;
        }

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include number ranges allocated by the country and include premium numbers, special services, shared cost, and others
         */
        public Builder highRiskSpecialNumbersEnabled(boolean highRiskSpecialNumbersEnabled) {
            Utils.checkNotNull(highRiskSpecialNumbersEnabled, "highRiskSpecialNumbersEnabled");
            this.highRiskSpecialNumbersEnabled = JsonNullable.of(highRiskSpecialNumbersEnabled);
            return this;
        }

        /**
         * Whether dialing to high-risk special services numbers is enabled. These prefixes include number ranges allocated by the country and include premium numbers, special services, shared cost, and others
         */
        public Builder highRiskSpecialNumbersEnabled(JsonNullable<Boolean> highRiskSpecialNumbersEnabled) {
            Utils.checkNotNull(highRiskSpecialNumbersEnabled, "highRiskSpecialNumbersEnabled");
            this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled;
            return this;
        }

        /**
         * Whether dialing to high-risk [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html) numbers is enabled. These prefixes include narrow number ranges that have a high-risk of international revenue sharing fraud (IRSF) attacks, also known as [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html). These prefixes are collected from anti-fraud databases and verified by analyzing calls on our network. These prefixes are not available for download and are updated frequently
         */
        public Builder highRiskTollfraudNumbersEnabled(boolean highRiskTollfraudNumbersEnabled) {
            Utils.checkNotNull(highRiskTollfraudNumbersEnabled, "highRiskTollfraudNumbersEnabled");
            this.highRiskTollfraudNumbersEnabled = JsonNullable.of(highRiskTollfraudNumbersEnabled);
            return this;
        }

        /**
         * Whether dialing to high-risk [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html) numbers is enabled. These prefixes include narrow number ranges that have a high-risk of international revenue sharing fraud (IRSF) attacks, also known as [toll fraud](https://www.twilio.com/blog/how-to-protect-your-account-from-toll-fraud-with-voice-dialing-geo-permissions-html). These prefixes are collected from anti-fraud databases and verified by analyzing calls on our network. These prefixes are not available for download and are updated frequently
         */
        public Builder highRiskTollfraudNumbersEnabled(JsonNullable<Boolean> highRiskTollfraudNumbersEnabled) {
            Utils.checkNotNull(highRiskTollfraudNumbersEnabled, "highRiskTollfraudNumbersEnabled");
            this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled;
            return this;
        }

        /**
         * The absolute URL of this resource.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * The absolute URL of this resource.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * A list of URLs related to this resource.
         */
        public Builder links(VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = JsonNullable.of(links);
            return this;
        }

        /**
         * A list of URLs related to this resource.
         */
        public Builder links(JsonNullable<? extends VoiceV1DialingPermissionsDialingPermissionsCountryInstanceLinks> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public VoiceV1DialingPermissionsDialingPermissionsCountryInstance build() {
            return new VoiceV1DialingPermissionsDialingPermissionsCountryInstance(
                isoCode,
                name,
                continent,
                countryCodes,
                lowRiskNumbersEnabled,
                highRiskSpecialNumbersEnabled,
                highRiskTollfraudNumbersEnabled,
                url,
                links);
        }
    }
}


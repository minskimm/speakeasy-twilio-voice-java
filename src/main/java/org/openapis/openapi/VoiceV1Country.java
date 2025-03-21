/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.openapis.openapi.models.components.VoiceV1DialingPermissionsDialingPermissionsCountryInstance;
import org.openapis.openapi.models.errors.APIException;
import org.openapis.openapi.models.operations.FetchDialingPermissionsCountryRequest;
import org.openapis.openapi.models.operations.FetchDialingPermissionsCountryRequestBuilder;
import org.openapis.openapi.models.operations.FetchDialingPermissionsCountryResponse;
import org.openapis.openapi.models.operations.ListDialingPermissionsCountryListDialingPermissionsCountryResponse;
import org.openapis.openapi.models.operations.ListDialingPermissionsCountryRequest;
import org.openapis.openapi.models.operations.ListDialingPermissionsCountryRequestBuilder;
import org.openapis.openapi.models.operations.ListDialingPermissionsCountryResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.Utils; 

public class VoiceV1Country implements
            MethodCallFetchDialingPermissionsCountry,
            MethodCallListDialingPermissionsCountry {
    
    /**
     * FETCH_DIALING_PERMISSIONS_COUNTRY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] FETCH_DIALING_PERMISSIONS_COUNTRY_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * LIST_DIALING_PERMISSIONS_COUNTRY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] LIST_DIALING_PERMISSIONS_COUNTRY_SERVERS = {
        "https://voice.twilio.com",
    };

    private final SDKConfiguration sdkConfiguration;

    VoiceV1Country(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Retrieve voice dialing country permissions identified by the given ISO country code
     * @return The call builder
     */
    public FetchDialingPermissionsCountryRequestBuilder fetchDialingPermissionsCountry() {
        return new FetchDialingPermissionsCountryRequestBuilder(this);
    }

    /**
     * Retrieve voice dialing country permissions identified by the given ISO country code
     * @param isoCode The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the DialingPermissions Country resource to fetch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public FetchDialingPermissionsCountryResponse fetchDialingPermissionsCountry(
            String isoCode) throws Exception {
        return fetchDialingPermissionsCountry(isoCode, Optional.empty());
    }
    
    /**
     * Retrieve voice dialing country permissions identified by the given ISO country code
     * @param isoCode The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the DialingPermissions Country resource to fetch
     * @param serverURL Overrides the server URL.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public FetchDialingPermissionsCountryResponse fetchDialingPermissionsCountry(
            String isoCode,
            Optional<String> serverURL) throws Exception {
        FetchDialingPermissionsCountryRequest request =
            FetchDialingPermissionsCountryRequest
                .builder()
                .isoCode(isoCode)
                .build();
        
        String _baseUrl = Utils.templateUrl(FETCH_DIALING_PERMISSIONS_COUNTRY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                FetchDialingPermissionsCountryRequest.class,
                _baseUrl,
                "/v1/DialingPermissions/Countries/{IsoCode}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "FetchDialingPermissionsCountry", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "FetchDialingPermissionsCountry",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "FetchDialingPermissionsCountry",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "FetchDialingPermissionsCountry",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        FetchDialingPermissionsCountryResponse.Builder _resBuilder = 
            FetchDialingPermissionsCountryResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        FetchDialingPermissionsCountryResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                VoiceV1DialingPermissionsDialingPermissionsCountryInstance _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<VoiceV1DialingPermissionsDialingPermissionsCountryInstance>() {});
                _res.withVoiceV1DialingPermissionsDialingPermissionsCountryInstance(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Retrieve all voice dialing country permissions for this account
     * @return The call builder
     */
    public ListDialingPermissionsCountryRequestBuilder listDialingPermissionsCountry() {
        return new ListDialingPermissionsCountryRequestBuilder(this);
    }

    /**
     * Retrieve all voice dialing country permissions for this account
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListDialingPermissionsCountryResponse listDialingPermissionsCountry(
            ListDialingPermissionsCountryRequest request) throws Exception {
        return listDialingPermissionsCountry(request, Optional.empty());
    }
    
    /**
     * Retrieve all voice dialing country permissions for this account
     * @param request The request object containing all of the parameters for the API call.
     * @param serverURL Overrides the server URL.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListDialingPermissionsCountryResponse listDialingPermissionsCountry(
            ListDialingPermissionsCountryRequest request,
            Optional<String> serverURL) throws Exception {
        String _baseUrl = Utils.templateUrl(LIST_DIALING_PERMISSIONS_COUNTRY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/DialingPermissions/Countries");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListDialingPermissionsCountryRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "ListDialingPermissionsCountry", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListDialingPermissionsCountry",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListDialingPermissionsCountry",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListDialingPermissionsCountry",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListDialingPermissionsCountryResponse.Builder _resBuilder = 
            ListDialingPermissionsCountryResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListDialingPermissionsCountryResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ListDialingPermissionsCountryListDialingPermissionsCountryResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ListDialingPermissionsCountryListDialingPermissionsCountryResponse>() {});
                _res.withListDialingPermissionsCountryResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}

/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.openapis.openapi.models.errors.APIException;
import org.openapis.openapi.models.operations.CreateSourceIpMappingCreateSourceIpMappingRequest;
import org.openapis.openapi.models.operations.CreateSourceIpMappingRequestBuilder;
import org.openapis.openapi.models.operations.CreateSourceIpMappingResponse;
import org.openapis.openapi.models.operations.DeleteSourceIpMappingRequest;
import org.openapis.openapi.models.operations.DeleteSourceIpMappingRequestBuilder;
import org.openapis.openapi.models.operations.DeleteSourceIpMappingResponse;
import org.openapis.openapi.models.operations.FetchSourceIpMappingRequest;
import org.openapis.openapi.models.operations.FetchSourceIpMappingRequestBuilder;
import org.openapis.openapi.models.operations.FetchSourceIpMappingResponse;
import org.openapis.openapi.models.operations.ListSourceIpMappingListSourceIpMappingResponse;
import org.openapis.openapi.models.operations.ListSourceIpMappingRequest;
import org.openapis.openapi.models.operations.ListSourceIpMappingRequestBuilder;
import org.openapis.openapi.models.operations.ListSourceIpMappingResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.models.operations.UpdateSourceIpMappingRequest;
import org.openapis.openapi.models.operations.UpdateSourceIpMappingRequestBuilder;
import org.openapis.openapi.models.operations.UpdateSourceIpMappingResponse;
import org.openapis.openapi.models.operations.UpdateSourceIpMappingUpdateSourceIpMappingRequest;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class VoiceV1SourceIpMapping implements
            MethodCallCreateSourceIpMapping,
            MethodCallListSourceIpMapping,
            MethodCallFetchSourceIpMapping,
            MethodCallUpdateSourceIpMapping,
            MethodCallDeleteSourceIpMapping {
    
    /**
     * CREATE_SOURCE_IP_MAPPING_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] CREATE_SOURCE_IP_MAPPING_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * LIST_SOURCE_IP_MAPPING_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] LIST_SOURCE_IP_MAPPING_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * FETCH_SOURCE_IP_MAPPING_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] FETCH_SOURCE_IP_MAPPING_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * UPDATE_SOURCE_IP_MAPPING_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] UPDATE_SOURCE_IP_MAPPING_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * DELETE_SOURCE_IP_MAPPING_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] DELETE_SOURCE_IP_MAPPING_SERVERS = {
        "https://voice.twilio.com",
    };

    private final SDKConfiguration sdkConfiguration;

    VoiceV1SourceIpMapping(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    public CreateSourceIpMappingRequestBuilder createSourceIpMapping() {
        return new CreateSourceIpMappingRequestBuilder(this);
    }

    public CreateSourceIpMappingResponse createSourceIpMappingDirect() throws Exception {
        return createSourceIpMapping(Optional.empty(), Optional.empty());
    }
    
    public CreateSourceIpMappingResponse createSourceIpMapping(
            Optional<? extends CreateSourceIpMappingCreateSourceIpMappingRequest> request,
            Optional<String> serverURL) throws Exception {
        String _baseUrl = Utils.templateUrl(CREATE_SOURCE_IP_MAPPING_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/SourceIpMappings");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Optional<? extends CreateSourceIpMappingCreateSourceIpMappingRequest>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "request",
                "form",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
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
                      "CreateSourceIpMapping", 
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
                            "CreateSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateSourceIpMapping",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateSourceIpMappingResponse.Builder _resBuilder = 
            CreateSourceIpMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateSourceIpMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1SourceIpMapping _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1SourceIpMapping>() {});
                _res.withVoiceV1SourceIpMapping(Optional.ofNullable(_out));
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



    public ListSourceIpMappingRequestBuilder listSourceIpMapping() {
        return new ListSourceIpMappingRequestBuilder(this);
    }

    public ListSourceIpMappingResponse listSourceIpMappingDirect() throws Exception {
        return listSourceIpMapping(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    public ListSourceIpMappingResponse listSourceIpMapping(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception {
        ListSourceIpMappingRequest request =
            ListSourceIpMappingRequest
                .builder()
                .pageSize(pageSize)
                .page(page)
                .pageToken(pageToken)
                .build();
        
        String _baseUrl = Utils.templateUrl(LIST_SOURCE_IP_MAPPING_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/SourceIpMappings");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListSourceIpMappingRequest.class,
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
                      "ListSourceIpMapping", 
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
                            "ListSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListSourceIpMapping",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListSourceIpMappingResponse.Builder _resBuilder = 
            ListSourceIpMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListSourceIpMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ListSourceIpMappingListSourceIpMappingResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ListSourceIpMappingListSourceIpMappingResponse>() {});
                _res.withListSourceIpMappingResponse(Optional.ofNullable(_out));
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



    public FetchSourceIpMappingRequestBuilder fetchSourceIpMapping() {
        return new FetchSourceIpMappingRequestBuilder(this);
    }

    public FetchSourceIpMappingResponse fetchSourceIpMapping(
            String sid) throws Exception {
        return fetchSourceIpMapping(sid, Optional.empty());
    }
    
    public FetchSourceIpMappingResponse fetchSourceIpMapping(
            String sid,
            Optional<String> serverURL) throws Exception {
        FetchSourceIpMappingRequest request =
            FetchSourceIpMappingRequest
                .builder()
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(FETCH_SOURCE_IP_MAPPING_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                FetchSourceIpMappingRequest.class,
                _baseUrl,
                "/v1/SourceIpMappings/{Sid}",
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
                      "FetchSourceIpMapping", 
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
                            "FetchSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "FetchSourceIpMapping",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "FetchSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        FetchSourceIpMappingResponse.Builder _resBuilder = 
            FetchSourceIpMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        FetchSourceIpMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1SourceIpMapping _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1SourceIpMapping>() {});
                _res.withVoiceV1SourceIpMapping(Optional.ofNullable(_out));
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



    public UpdateSourceIpMappingRequestBuilder updateSourceIpMapping() {
        return new UpdateSourceIpMappingRequestBuilder(this);
    }

    public UpdateSourceIpMappingResponse updateSourceIpMapping(
            String sid) throws Exception {
        return updateSourceIpMapping(sid, Optional.empty(), Optional.empty());
    }
    
    public UpdateSourceIpMappingResponse updateSourceIpMapping(
            String sid,
            Optional<? extends UpdateSourceIpMappingUpdateSourceIpMappingRequest> requestBody,
            Optional<String> serverURL) throws Exception {
        UpdateSourceIpMappingRequest request =
            UpdateSourceIpMappingRequest
                .builder()
                .sid(sid)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = Utils.templateUrl(UPDATE_SOURCE_IP_MAPPING_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                UpdateSourceIpMappingRequest.class,
                _baseUrl,
                "/v1/SourceIpMappings/{Sid}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
                "form",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
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
                      "UpdateSourceIpMapping", 
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
                            "UpdateSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateSourceIpMapping",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateSourceIpMappingResponse.Builder _resBuilder = 
            UpdateSourceIpMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateSourceIpMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1SourceIpMapping _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1SourceIpMapping>() {});
                _res.withVoiceV1SourceIpMapping(Optional.ofNullable(_out));
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



    public DeleteSourceIpMappingRequestBuilder deleteSourceIpMapping() {
        return new DeleteSourceIpMappingRequestBuilder(this);
    }

    public DeleteSourceIpMappingResponse deleteSourceIpMapping(
            String sid) throws Exception {
        return deleteSourceIpMapping(sid, Optional.empty());
    }
    
    public DeleteSourceIpMappingResponse deleteSourceIpMapping(
            String sid,
            Optional<String> serverURL) throws Exception {
        DeleteSourceIpMappingRequest request =
            DeleteSourceIpMappingRequest
                .builder()
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(DELETE_SOURCE_IP_MAPPING_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                DeleteSourceIpMappingRequest.class,
                _baseUrl,
                "/v1/SourceIpMappings/{Sid}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
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
                      "DeleteSourceIpMapping", 
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
                            "DeleteSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteSourceIpMapping",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteSourceIpMapping",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteSourceIpMappingResponse.Builder _resBuilder = 
            DeleteSourceIpMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteSourceIpMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
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

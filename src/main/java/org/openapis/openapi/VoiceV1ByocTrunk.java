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
import org.openapis.openapi.models.operations.CreateByocTrunkCreateByocTrunkRequest;
import org.openapis.openapi.models.operations.CreateByocTrunkRequestBuilder;
import org.openapis.openapi.models.operations.CreateByocTrunkResponse;
import org.openapis.openapi.models.operations.DeleteByocTrunkRequest;
import org.openapis.openapi.models.operations.DeleteByocTrunkRequestBuilder;
import org.openapis.openapi.models.operations.DeleteByocTrunkResponse;
import org.openapis.openapi.models.operations.FetchByocTrunkRequest;
import org.openapis.openapi.models.operations.FetchByocTrunkRequestBuilder;
import org.openapis.openapi.models.operations.FetchByocTrunkResponse;
import org.openapis.openapi.models.operations.ListByocTrunkListByocTrunkResponse;
import org.openapis.openapi.models.operations.ListByocTrunkRequest;
import org.openapis.openapi.models.operations.ListByocTrunkRequestBuilder;
import org.openapis.openapi.models.operations.ListByocTrunkResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.models.operations.UpdateByocTrunkRequest;
import org.openapis.openapi.models.operations.UpdateByocTrunkRequestBuilder;
import org.openapis.openapi.models.operations.UpdateByocTrunkResponse;
import org.openapis.openapi.models.operations.UpdateByocTrunkUpdateByocTrunkRequest;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class VoiceV1ByocTrunk implements
            MethodCallCreateByocTrunk,
            MethodCallListByocTrunk,
            MethodCallFetchByocTrunk,
            MethodCallUpdateByocTrunk,
            MethodCallDeleteByocTrunk {
    
    /**
     * CREATE_BYOC_TRUNK_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] CREATE_BYOC_TRUNK_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * LIST_BYOC_TRUNK_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] LIST_BYOC_TRUNK_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * FETCH_BYOC_TRUNK_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] FETCH_BYOC_TRUNK_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * UPDATE_BYOC_TRUNK_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] UPDATE_BYOC_TRUNK_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * DELETE_BYOC_TRUNK_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] DELETE_BYOC_TRUNK_SERVERS = {
        "https://voice.twilio.com",
    };

    private final SDKConfiguration sdkConfiguration;

    VoiceV1ByocTrunk(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    public CreateByocTrunkRequestBuilder createByocTrunk() {
        return new CreateByocTrunkRequestBuilder(this);
    }

    public CreateByocTrunkResponse createByocTrunkDirect() throws Exception {
        return createByocTrunk(Optional.empty(), Optional.empty());
    }
    
    public CreateByocTrunkResponse createByocTrunk(
            Optional<? extends CreateByocTrunkCreateByocTrunkRequest> request,
            Optional<String> serverURL) throws Exception {
        String _baseUrl = Utils.templateUrl(CREATE_BYOC_TRUNK_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/ByocTrunks");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Optional<? extends CreateByocTrunkCreateByocTrunkRequest>>() {});
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
                      "CreateByocTrunk", 
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
                            "CreateByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateByocTrunk",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateByocTrunkResponse.Builder _resBuilder = 
            CreateByocTrunkResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateByocTrunkResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1ByocTrunk _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1ByocTrunk>() {});
                _res.withVoiceV1ByocTrunk(Optional.ofNullable(_out));
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



    public ListByocTrunkRequestBuilder listByocTrunk() {
        return new ListByocTrunkRequestBuilder(this);
    }

    public ListByocTrunkResponse listByocTrunkDirect() throws Exception {
        return listByocTrunk(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    public ListByocTrunkResponse listByocTrunk(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception {
        ListByocTrunkRequest request =
            ListByocTrunkRequest
                .builder()
                .pageSize(pageSize)
                .page(page)
                .pageToken(pageToken)
                .build();
        
        String _baseUrl = Utils.templateUrl(LIST_BYOC_TRUNK_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/ByocTrunks");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListByocTrunkRequest.class,
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
                      "ListByocTrunk", 
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
                            "ListByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListByocTrunk",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListByocTrunkResponse.Builder _resBuilder = 
            ListByocTrunkResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListByocTrunkResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ListByocTrunkListByocTrunkResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ListByocTrunkListByocTrunkResponse>() {});
                _res.withListByocTrunkResponse(Optional.ofNullable(_out));
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



    public FetchByocTrunkRequestBuilder fetchByocTrunk() {
        return new FetchByocTrunkRequestBuilder(this);
    }

    public FetchByocTrunkResponse fetchByocTrunk(
            String sid) throws Exception {
        return fetchByocTrunk(sid, Optional.empty());
    }
    
    public FetchByocTrunkResponse fetchByocTrunk(
            String sid,
            Optional<String> serverURL) throws Exception {
        FetchByocTrunkRequest request =
            FetchByocTrunkRequest
                .builder()
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(FETCH_BYOC_TRUNK_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                FetchByocTrunkRequest.class,
                _baseUrl,
                "/v1/ByocTrunks/{Sid}",
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
                      "FetchByocTrunk", 
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
                            "FetchByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "FetchByocTrunk",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "FetchByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        FetchByocTrunkResponse.Builder _resBuilder = 
            FetchByocTrunkResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        FetchByocTrunkResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1ByocTrunk _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1ByocTrunk>() {});
                _res.withVoiceV1ByocTrunk(Optional.ofNullable(_out));
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



    public UpdateByocTrunkRequestBuilder updateByocTrunk() {
        return new UpdateByocTrunkRequestBuilder(this);
    }

    public UpdateByocTrunkResponse updateByocTrunk(
            String sid) throws Exception {
        return updateByocTrunk(sid, Optional.empty(), Optional.empty());
    }
    
    public UpdateByocTrunkResponse updateByocTrunk(
            String sid,
            Optional<? extends UpdateByocTrunkUpdateByocTrunkRequest> requestBody,
            Optional<String> serverURL) throws Exception {
        UpdateByocTrunkRequest request =
            UpdateByocTrunkRequest
                .builder()
                .sid(sid)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = Utils.templateUrl(UPDATE_BYOC_TRUNK_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                UpdateByocTrunkRequest.class,
                _baseUrl,
                "/v1/ByocTrunks/{Sid}",
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
                      "UpdateByocTrunk", 
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
                            "UpdateByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateByocTrunk",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateByocTrunkResponse.Builder _resBuilder = 
            UpdateByocTrunkResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateByocTrunkResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1ByocTrunk _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1ByocTrunk>() {});
                _res.withVoiceV1ByocTrunk(Optional.ofNullable(_out));
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



    public DeleteByocTrunkRequestBuilder deleteByocTrunk() {
        return new DeleteByocTrunkRequestBuilder(this);
    }

    public DeleteByocTrunkResponse deleteByocTrunk(
            String sid) throws Exception {
        return deleteByocTrunk(sid, Optional.empty());
    }
    
    public DeleteByocTrunkResponse deleteByocTrunk(
            String sid,
            Optional<String> serverURL) throws Exception {
        DeleteByocTrunkRequest request =
            DeleteByocTrunkRequest
                .builder()
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(DELETE_BYOC_TRUNK_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                DeleteByocTrunkRequest.class,
                _baseUrl,
                "/v1/ByocTrunks/{Sid}",
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
                      "DeleteByocTrunk", 
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
                            "DeleteByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteByocTrunk",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteByocTrunk",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteByocTrunkResponse.Builder _resBuilder = 
            DeleteByocTrunkResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteByocTrunkResponse _res = _resBuilder.build();
        
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

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
import org.openapis.openapi.models.components.VoiceV1ConnectionPolicyConnectionPolicyTarget;
import org.openapis.openapi.models.errors.APIException;
import org.openapis.openapi.models.operations.CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.CreateConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.CreateConnectionPolicyTargetRequestBuilder;
import org.openapis.openapi.models.operations.CreateConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyTargetRequestBuilder;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.FetchConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.FetchConnectionPolicyTargetRequestBuilder;
import org.openapis.openapi.models.operations.FetchConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.ListConnectionPolicyTargetListConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.ListConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.ListConnectionPolicyTargetRequestBuilder;
import org.openapis.openapi.models.operations.ListConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyTargetRequest;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyTargetRequestBuilder;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyTargetResponse;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class VoiceV1ConnectionPolicyTarget implements
            MethodCallCreateConnectionPolicyTarget,
            MethodCallListConnectionPolicyTarget,
            MethodCallFetchConnectionPolicyTarget,
            MethodCallUpdateConnectionPolicyTarget,
            MethodCallDeleteConnectionPolicyTarget {
    
    /**
     * CREATE_CONNECTION_POLICY_TARGET_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] CREATE_CONNECTION_POLICY_TARGET_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * LIST_CONNECTION_POLICY_TARGET_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] LIST_CONNECTION_POLICY_TARGET_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * FETCH_CONNECTION_POLICY_TARGET_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] FETCH_CONNECTION_POLICY_TARGET_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * UPDATE_CONNECTION_POLICY_TARGET_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] UPDATE_CONNECTION_POLICY_TARGET_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * DELETE_CONNECTION_POLICY_TARGET_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] DELETE_CONNECTION_POLICY_TARGET_SERVERS = {
        "https://voice.twilio.com",
    };

    private final SDKConfiguration sdkConfiguration;

    VoiceV1ConnectionPolicyTarget(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    public CreateConnectionPolicyTargetRequestBuilder createConnectionPolicyTarget() {
        return new CreateConnectionPolicyTargetRequestBuilder(this);
    }

    public CreateConnectionPolicyTargetResponse createConnectionPolicyTarget(
            String connectionPolicySid) throws Exception {
        return createConnectionPolicyTarget(connectionPolicySid, Optional.empty(), Optional.empty());
    }
    
    public CreateConnectionPolicyTargetResponse createConnectionPolicyTarget(
            String connectionPolicySid,
            Optional<? extends CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest> requestBody,
            Optional<String> serverURL) throws Exception {
        CreateConnectionPolicyTargetRequest request =
            CreateConnectionPolicyTargetRequest
                .builder()
                .connectionPolicySid(connectionPolicySid)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = Utils.templateUrl(CREATE_CONNECTION_POLICY_TARGET_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                CreateConnectionPolicyTargetRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets",
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
                      "CreateConnectionPolicyTarget", 
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
                            "CreateConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateConnectionPolicyTarget",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateConnectionPolicyTargetResponse.Builder _resBuilder = 
            CreateConnectionPolicyTargetResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateConnectionPolicyTargetResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                VoiceV1ConnectionPolicyConnectionPolicyTarget _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<VoiceV1ConnectionPolicyConnectionPolicyTarget>() {});
                _res.withVoiceV1ConnectionPolicyConnectionPolicyTarget(Optional.ofNullable(_out));
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



    public ListConnectionPolicyTargetRequestBuilder listConnectionPolicyTarget() {
        return new ListConnectionPolicyTargetRequestBuilder(this);
    }

    public ListConnectionPolicyTargetResponse listConnectionPolicyTarget(
            String connectionPolicySid) throws Exception {
        return listConnectionPolicyTarget(connectionPolicySid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    public ListConnectionPolicyTargetResponse listConnectionPolicyTarget(
            String connectionPolicySid,
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception {
        ListConnectionPolicyTargetRequest request =
            ListConnectionPolicyTargetRequest
                .builder()
                .connectionPolicySid(connectionPolicySid)
                .pageSize(pageSize)
                .page(page)
                .pageToken(pageToken)
                .build();
        
        String _baseUrl = Utils.templateUrl(LIST_CONNECTION_POLICY_TARGET_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                ListConnectionPolicyTargetRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListConnectionPolicyTargetRequest.class,
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
                      "ListConnectionPolicyTarget", 
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
                            "ListConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListConnectionPolicyTarget",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListConnectionPolicyTargetResponse.Builder _resBuilder = 
            ListConnectionPolicyTargetResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListConnectionPolicyTargetResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ListConnectionPolicyTargetListConnectionPolicyTargetResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ListConnectionPolicyTargetListConnectionPolicyTargetResponse>() {});
                _res.withListConnectionPolicyTargetResponse(Optional.ofNullable(_out));
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



    public FetchConnectionPolicyTargetRequestBuilder fetchConnectionPolicyTarget() {
        return new FetchConnectionPolicyTargetRequestBuilder(this);
    }

    public FetchConnectionPolicyTargetResponse fetchConnectionPolicyTarget(
            String connectionPolicySid,
            String sid) throws Exception {
        return fetchConnectionPolicyTarget(connectionPolicySid, sid, Optional.empty());
    }
    
    public FetchConnectionPolicyTargetResponse fetchConnectionPolicyTarget(
            String connectionPolicySid,
            String sid,
            Optional<String> serverURL) throws Exception {
        FetchConnectionPolicyTargetRequest request =
            FetchConnectionPolicyTargetRequest
                .builder()
                .connectionPolicySid(connectionPolicySid)
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(FETCH_CONNECTION_POLICY_TARGET_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                FetchConnectionPolicyTargetRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}",
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
                      "FetchConnectionPolicyTarget", 
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
                            "FetchConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "FetchConnectionPolicyTarget",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "FetchConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        FetchConnectionPolicyTargetResponse.Builder _resBuilder = 
            FetchConnectionPolicyTargetResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        FetchConnectionPolicyTargetResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                VoiceV1ConnectionPolicyConnectionPolicyTarget _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<VoiceV1ConnectionPolicyConnectionPolicyTarget>() {});
                _res.withVoiceV1ConnectionPolicyConnectionPolicyTarget(Optional.ofNullable(_out));
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



    public UpdateConnectionPolicyTargetRequestBuilder updateConnectionPolicyTarget() {
        return new UpdateConnectionPolicyTargetRequestBuilder(this);
    }

    public UpdateConnectionPolicyTargetResponse updateConnectionPolicyTarget(
            String connectionPolicySid,
            String sid) throws Exception {
        return updateConnectionPolicyTarget(connectionPolicySid, sid, Optional.empty(), Optional.empty());
    }
    
    public UpdateConnectionPolicyTargetResponse updateConnectionPolicyTarget(
            String connectionPolicySid,
            String sid,
            Optional<? extends UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest> requestBody,
            Optional<String> serverURL) throws Exception {
        UpdateConnectionPolicyTargetRequest request =
            UpdateConnectionPolicyTargetRequest
                .builder()
                .connectionPolicySid(connectionPolicySid)
                .sid(sid)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = Utils.templateUrl(UPDATE_CONNECTION_POLICY_TARGET_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                UpdateConnectionPolicyTargetRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}",
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
                      "UpdateConnectionPolicyTarget", 
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
                            "UpdateConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateConnectionPolicyTarget",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateConnectionPolicyTargetResponse.Builder _resBuilder = 
            UpdateConnectionPolicyTargetResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateConnectionPolicyTargetResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                VoiceV1ConnectionPolicyConnectionPolicyTarget _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<VoiceV1ConnectionPolicyConnectionPolicyTarget>() {});
                _res.withVoiceV1ConnectionPolicyConnectionPolicyTarget(Optional.ofNullable(_out));
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



    public DeleteConnectionPolicyTargetRequestBuilder deleteConnectionPolicyTarget() {
        return new DeleteConnectionPolicyTargetRequestBuilder(this);
    }

    public DeleteConnectionPolicyTargetResponse deleteConnectionPolicyTarget(
            String connectionPolicySid,
            String sid) throws Exception {
        return deleteConnectionPolicyTarget(connectionPolicySid, sid, Optional.empty());
    }
    
    public DeleteConnectionPolicyTargetResponse deleteConnectionPolicyTarget(
            String connectionPolicySid,
            String sid,
            Optional<String> serverURL) throws Exception {
        DeleteConnectionPolicyTargetRequest request =
            DeleteConnectionPolicyTargetRequest
                .builder()
                .connectionPolicySid(connectionPolicySid)
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(DELETE_CONNECTION_POLICY_TARGET_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                DeleteConnectionPolicyTargetRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}",
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
                      "DeleteConnectionPolicyTarget", 
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
                            "DeleteConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteConnectionPolicyTarget",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteConnectionPolicyTarget",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteConnectionPolicyTargetResponse.Builder _resBuilder = 
            DeleteConnectionPolicyTargetResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteConnectionPolicyTargetResponse _res = _resBuilder.build();
        
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

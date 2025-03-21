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
import org.openapis.openapi.models.operations.CreateConnectionPolicyCreateConnectionPolicyRequest;
import org.openapis.openapi.models.operations.CreateConnectionPolicyRequestBuilder;
import org.openapis.openapi.models.operations.CreateConnectionPolicyResponse;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyRequest;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyRequestBuilder;
import org.openapis.openapi.models.operations.DeleteConnectionPolicyResponse;
import org.openapis.openapi.models.operations.FetchConnectionPolicyRequest;
import org.openapis.openapi.models.operations.FetchConnectionPolicyRequestBuilder;
import org.openapis.openapi.models.operations.FetchConnectionPolicyResponse;
import org.openapis.openapi.models.operations.ListConnectionPolicyListConnectionPolicyResponse;
import org.openapis.openapi.models.operations.ListConnectionPolicyRequest;
import org.openapis.openapi.models.operations.ListConnectionPolicyRequestBuilder;
import org.openapis.openapi.models.operations.ListConnectionPolicyResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyRequest;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyRequestBuilder;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyResponse;
import org.openapis.openapi.models.operations.UpdateConnectionPolicyUpdateConnectionPolicyRequest;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class VoiceV1ConnectionPolicy implements
            MethodCallCreateConnectionPolicy,
            MethodCallListConnectionPolicy,
            MethodCallFetchConnectionPolicy,
            MethodCallUpdateConnectionPolicy,
            MethodCallDeleteConnectionPolicy {
    
    /**
     * CREATE_CONNECTION_POLICY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] CREATE_CONNECTION_POLICY_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * LIST_CONNECTION_POLICY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] LIST_CONNECTION_POLICY_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * FETCH_CONNECTION_POLICY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] FETCH_CONNECTION_POLICY_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * UPDATE_CONNECTION_POLICY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] UPDATE_CONNECTION_POLICY_SERVERS = {
        "https://voice.twilio.com",
    };
    
    /**
     * DELETE_CONNECTION_POLICY_SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] DELETE_CONNECTION_POLICY_SERVERS = {
        "https://voice.twilio.com",
    };

    private final SDKConfiguration sdkConfiguration;

    VoiceV1ConnectionPolicy(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    public CreateConnectionPolicyRequestBuilder createConnectionPolicy() {
        return new CreateConnectionPolicyRequestBuilder(this);
    }

    public CreateConnectionPolicyResponse createConnectionPolicyDirect() throws Exception {
        return createConnectionPolicy(Optional.empty(), Optional.empty());
    }
    
    public CreateConnectionPolicyResponse createConnectionPolicy(
            Optional<? extends CreateConnectionPolicyCreateConnectionPolicyRequest> request,
            Optional<String> serverURL) throws Exception {
        String _baseUrl = Utils.templateUrl(CREATE_CONNECTION_POLICY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/ConnectionPolicies");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Optional<? extends CreateConnectionPolicyCreateConnectionPolicyRequest>>() {});
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
                      "CreateConnectionPolicy", 
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
                            "CreateConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateConnectionPolicy",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateConnectionPolicyResponse.Builder _resBuilder = 
            CreateConnectionPolicyResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateConnectionPolicyResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1ConnectionPolicy _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1ConnectionPolicy>() {});
                _res.withVoiceV1ConnectionPolicy(Optional.ofNullable(_out));
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



    public ListConnectionPolicyRequestBuilder listConnectionPolicy() {
        return new ListConnectionPolicyRequestBuilder(this);
    }

    public ListConnectionPolicyResponse listConnectionPolicyDirect() throws Exception {
        return listConnectionPolicy(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    public ListConnectionPolicyResponse listConnectionPolicy(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception {
        ListConnectionPolicyRequest request =
            ListConnectionPolicyRequest
                .builder()
                .pageSize(pageSize)
                .page(page)
                .pageToken(pageToken)
                .build();
        
        String _baseUrl = Utils.templateUrl(LIST_CONNECTION_POLICY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/ConnectionPolicies");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListConnectionPolicyRequest.class,
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
                      "ListConnectionPolicy", 
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
                            "ListConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListConnectionPolicy",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListConnectionPolicyResponse.Builder _resBuilder = 
            ListConnectionPolicyResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListConnectionPolicyResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ListConnectionPolicyListConnectionPolicyResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ListConnectionPolicyListConnectionPolicyResponse>() {});
                _res.withListConnectionPolicyResponse(Optional.ofNullable(_out));
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



    public FetchConnectionPolicyRequestBuilder fetchConnectionPolicy() {
        return new FetchConnectionPolicyRequestBuilder(this);
    }

    public FetchConnectionPolicyResponse fetchConnectionPolicy(
            String sid) throws Exception {
        return fetchConnectionPolicy(sid, Optional.empty());
    }
    
    public FetchConnectionPolicyResponse fetchConnectionPolicy(
            String sid,
            Optional<String> serverURL) throws Exception {
        FetchConnectionPolicyRequest request =
            FetchConnectionPolicyRequest
                .builder()
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(FETCH_CONNECTION_POLICY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                FetchConnectionPolicyRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{Sid}",
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
                      "FetchConnectionPolicy", 
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
                            "FetchConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "FetchConnectionPolicy",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "FetchConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        FetchConnectionPolicyResponse.Builder _resBuilder = 
            FetchConnectionPolicyResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        FetchConnectionPolicyResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1ConnectionPolicy _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1ConnectionPolicy>() {});
                _res.withVoiceV1ConnectionPolicy(Optional.ofNullable(_out));
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



    public UpdateConnectionPolicyRequestBuilder updateConnectionPolicy() {
        return new UpdateConnectionPolicyRequestBuilder(this);
    }

    public UpdateConnectionPolicyResponse updateConnectionPolicy(
            String sid) throws Exception {
        return updateConnectionPolicy(sid, Optional.empty(), Optional.empty());
    }
    
    public UpdateConnectionPolicyResponse updateConnectionPolicy(
            String sid,
            Optional<? extends UpdateConnectionPolicyUpdateConnectionPolicyRequest> requestBody,
            Optional<String> serverURL) throws Exception {
        UpdateConnectionPolicyRequest request =
            UpdateConnectionPolicyRequest
                .builder()
                .sid(sid)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = Utils.templateUrl(UPDATE_CONNECTION_POLICY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                UpdateConnectionPolicyRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{Sid}",
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
                      "UpdateConnectionPolicy", 
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
                            "UpdateConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateConnectionPolicy",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateConnectionPolicyResponse.Builder _resBuilder = 
            UpdateConnectionPolicyResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateConnectionPolicyResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                org.openapis.openapi.models.components.VoiceV1ConnectionPolicy _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.components.VoiceV1ConnectionPolicy>() {});
                _res.withVoiceV1ConnectionPolicy(Optional.ofNullable(_out));
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



    public DeleteConnectionPolicyRequestBuilder deleteConnectionPolicy() {
        return new DeleteConnectionPolicyRequestBuilder(this);
    }

    public DeleteConnectionPolicyResponse deleteConnectionPolicy(
            String sid) throws Exception {
        return deleteConnectionPolicy(sid, Optional.empty());
    }
    
    public DeleteConnectionPolicyResponse deleteConnectionPolicy(
            String sid,
            Optional<String> serverURL) throws Exception {
        DeleteConnectionPolicyRequest request =
            DeleteConnectionPolicyRequest
                .builder()
                .sid(sid)
                .build();
        
        String _baseUrl = Utils.templateUrl(DELETE_CONNECTION_POLICY_SERVERS[0], new HashMap<String, String>());
        if (serverURL.isPresent() && !serverURL.get().isBlank()) {
            _baseUrl = serverURL.get();
        }
        String _url = Utils.generateURL(
                DeleteConnectionPolicyRequest.class,
                _baseUrl,
                "/v1/ConnectionPolicies/{Sid}",
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
                      "DeleteConnectionPolicy", 
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
                            "DeleteConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteConnectionPolicy",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteConnectionPolicy",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteConnectionPolicyResponse.Builder _resBuilder = 
            DeleteConnectionPolicyResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteConnectionPolicyResponse _res = _resBuilder.build();
        
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

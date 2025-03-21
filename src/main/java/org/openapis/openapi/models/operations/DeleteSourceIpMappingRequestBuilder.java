/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class DeleteSourceIpMappingRequestBuilder {

    private String sid;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteSourceIpMapping sdk;

    public DeleteSourceIpMappingRequestBuilder(SDKMethodInterfaces.MethodCallDeleteSourceIpMapping sdk) {
        this.sdk = sdk;
    }

    public DeleteSourceIpMappingRequestBuilder sid(String sid) {
        Utils.checkNotNull(sid, "sid");
        this.sid = sid;
        return this;
    }
                
    public DeleteSourceIpMappingRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public DeleteSourceIpMappingRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public DeleteSourceIpMappingResponse call() throws Exception {

        return sdk.deleteSourceIpMapping(
            sid,
            serverURL);
    }
}

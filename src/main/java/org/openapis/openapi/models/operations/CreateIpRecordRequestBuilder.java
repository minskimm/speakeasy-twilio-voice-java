/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class CreateIpRecordRequestBuilder {

    private Optional<? extends CreateIpRecordCreateIpRecordRequest> request = Optional.empty();
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateIpRecord sdk;

    public CreateIpRecordRequestBuilder(SDKMethodInterfaces.MethodCallCreateIpRecord sdk) {
        this.sdk = sdk;
    }
                
    public CreateIpRecordRequestBuilder request(CreateIpRecordCreateIpRecordRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateIpRecordRequestBuilder request(Optional<? extends CreateIpRecordCreateIpRecordRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateIpRecordRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public CreateIpRecordRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public CreateIpRecordResponse call() throws Exception {

        return sdk.createIpRecord(
            request,
            serverURL);
    }
}

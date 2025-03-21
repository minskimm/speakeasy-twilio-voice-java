/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Long;
import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class ListConnectionPolicyTargetRequestBuilder {

    private String connectionPolicySid;
    private Optional<Long> pageSize = Optional.empty();
    private Optional<Long> page = Optional.empty();
    private Optional<String> pageToken = Optional.empty();
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListConnectionPolicyTarget sdk;

    public ListConnectionPolicyTargetRequestBuilder(SDKMethodInterfaces.MethodCallListConnectionPolicyTarget sdk) {
        this.sdk = sdk;
    }

    public ListConnectionPolicyTargetRequestBuilder connectionPolicySid(String connectionPolicySid) {
        Utils.checkNotNull(connectionPolicySid, "connectionPolicySid");
        this.connectionPolicySid = connectionPolicySid;
        return this;
    }
                
    public ListConnectionPolicyTargetRequestBuilder pageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.of(pageSize);
        return this;
    }

    public ListConnectionPolicyTargetRequestBuilder pageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }
                
    public ListConnectionPolicyTargetRequestBuilder page(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public ListConnectionPolicyTargetRequestBuilder page(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public ListConnectionPolicyTargetRequestBuilder pageToken(String pageToken) {
        Utils.checkNotNull(pageToken, "pageToken");
        this.pageToken = Optional.of(pageToken);
        return this;
    }

    public ListConnectionPolicyTargetRequestBuilder pageToken(Optional<String> pageToken) {
        Utils.checkNotNull(pageToken, "pageToken");
        this.pageToken = pageToken;
        return this;
    }
                
    public ListConnectionPolicyTargetRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public ListConnectionPolicyTargetRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public ListConnectionPolicyTargetResponse call() throws Exception {

        return sdk.listConnectionPolicyTarget(
            connectionPolicySid,
            pageSize,
            page,
            pageToken,
            serverURL);
    }
}

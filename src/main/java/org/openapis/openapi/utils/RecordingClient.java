/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

// internal testing use
public final class RecordingClient implements HTTPClient {

    private final List<HttpRequest> requests = new CopyOnWriteArrayList<>();
    private final HTTPClient client;
    private final List<Function<HttpRequest, HttpRequest>> beforeRequestHooks = new ArrayList<>();

    public RecordingClient() {
        this.client = new SpeakeasyHTTPClient();
    }

    @Override
    public HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException {
        for (Function<HttpRequest, HttpRequest> hook : beforeRequestHooks) {
            request = hook.apply(request);
        }
        requests.add(request);
        return client.send(request);
    }

    public List<HttpRequest> requests() {
        return requests;
    }

    public RecordingClient beforeRequest(Function<HttpRequest, HttpRequest> hook) {
        beforeRequestHooks.add(hook);
        return this;
    }

    public void reset() {
        requests.clear();
    }

}
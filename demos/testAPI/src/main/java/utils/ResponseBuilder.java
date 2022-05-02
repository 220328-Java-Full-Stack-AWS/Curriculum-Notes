package utils;

import java.util.HashMap;
import java.util.Map;

public class ResponseBuilder {
    Map<String, String> headers = new HashMap<>();
    Map<String, String> params = new HashMap<>();
    String requestBody;

    public ResponseBuilder() {
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}

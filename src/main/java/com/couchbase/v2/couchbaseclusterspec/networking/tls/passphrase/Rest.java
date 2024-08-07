package com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"addressFamily","headers","timeout","url","verifyPeer"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Rest implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum AddressFamily {

        @com.fasterxml.jackson.annotation.JsonProperty("inet")
        INET("inet"), @com.fasterxml.jackson.annotation.JsonProperty("inet6")
        INET6("inet6");

        String value;

        AddressFamily(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * AddressFamily is the address family to use. By default inet (meaning IPV4) is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addressFamily")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AddressFamily is the address family to use. By default inet (meaning IPV4) is used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private AddressFamily addressFamily = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"inet\"", AddressFamily.class);

    public AddressFamily getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * Headers is a map of one or more key-value pairs to pass alongside the Get request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Headers is a map of one or more key-value pairs to pass alongside the Get request.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> headers;

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Timeout is  the number of milliseconds that must elapse before the call is timed out.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timeout is  the number of milliseconds that must elapse before the call is timed out.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long timeout = 5000L;

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * URL is the endpoint to be called to retrieve the passphrase. URL will be called using the GET method and may use http/https protocol.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URL is the endpoint to be called to retrieve the passphrase. URL will be called using the GET method and may use http/https protocol.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * VerifyPeer ensures peer verification is performed when Https is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verifyPeer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VerifyPeer ensures peer verification is performed when Https is used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean verifyPeer = true;

    public Boolean getVerifyPeer() {
        return verifyPeer;
    }

    public void setVerifyPeer(Boolean verifyPeer) {
        this.verifyPeer = verifyPeer;
    }
}


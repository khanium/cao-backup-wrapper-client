package com.couchbase.v2.couchbasebackupspec.objectstore;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"secret","url","useVirtualPath"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Endpoint implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The name of the secret, in this namespace, that contains the CA certificate for verification of a TLS endpoint The secret must have the key with the name "tls.crt"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the secret, in this namespace, that contains the CA certificate for verification of a TLS endpoint The secret must have the key with the name \"tls.crt\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * The host/address of the custom object endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The host/address of the custom object endpoint.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * UseVirtualPath will force the AWS SDK to use the new virtual style paths which are often required by S3 compatible object stores.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useVirtualPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UseVirtualPath will force the AWS SDK to use the new virtual style paths which are often required by S3 compatible object stores.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean useVirtualPath;

    public Boolean getUseVirtualPath() {
        return useVirtualPath;
    }

    public void setUseVirtualPath(Boolean useVirtualPath) {
        this.useVirtualPath = useVirtualPath;
    }
}


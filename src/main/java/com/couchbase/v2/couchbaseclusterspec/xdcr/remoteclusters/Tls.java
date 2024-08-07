package com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"secret"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Secret references a secret containing the CA certificate (data key "ca"), and optionally a client certificate (data key "certificate") and key (data key "key").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Secret references a secret containing the CA certificate (data key \"ca\"), and optionally a client certificate (data key \"certificate\") and key (data key \"key\").")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}


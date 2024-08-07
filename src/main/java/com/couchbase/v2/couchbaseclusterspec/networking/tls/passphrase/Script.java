package com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"secret"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Script implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Secret is the secret containing the passphrase string. The secret is expected to contain "passphrase" key with the passphrase string as a value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Secret is the secret containing the passphrase string. The secret is expected to contain \"passphrase\" key with the passphrase string as a value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}


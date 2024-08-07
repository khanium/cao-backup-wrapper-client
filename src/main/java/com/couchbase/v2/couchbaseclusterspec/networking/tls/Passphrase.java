package com.couchbase.v2.couchbaseclusterspec.networking.tls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"rest","script"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Passphrase implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * PassphraseRestConfig is the configuration to register a private key passphrase with a rest endpoint. When the private key is accessed, Couchbase Server attempts to extract the password by means of the specified endpoint. The response status must be 200 and the response text must be the exact passphrase excluding newlines and extraneous spaces.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PassphraseRestConfig is the configuration to register a private key passphrase with a rest endpoint. When the private key is accessed, Couchbase Server attempts to extract the password by means of the specified endpoint. The response status must be 200 and the response text must be the exact passphrase excluding newlines and extraneous spaces.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase.Rest rest;

    public com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase.Rest getRest() {
        return rest;
    }

    public void setRest(com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase.Rest rest) {
        this.rest = rest;
    }

    /**
     * PassphraseScriptConfig is the configuration to register a private key passphrase with a script. The Operator auto-provisions the underlying script so this config simply provides a mechanism to perform the decryption of the Couchbase Private Key using a local script.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("script")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PassphraseScriptConfig is the configuration to register a private key passphrase with a script. The Operator auto-provisions the underlying script so this config simply provides a mechanism to perform the decryption of the Couchbase Private Key using a local script.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase.Script script;

    public com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase.Script getScript() {
        return script;
    }

    public void setScript(com.couchbase.v2.couchbaseclusterspec.networking.tls.passphrase.Script script) {
        this.script = script;
    }
}


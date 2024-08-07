package com.couchbase.v2.couchbaseclusterspec.networking.exposedfeatureservicetemplate.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientIP"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SessionAffinityConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * clientIP contains the configurations of Client IP based session affinity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientIP")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("clientIP contains the configurations of Client IP based session affinity.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.exposedfeatureservicetemplate.spec.sessionaffinityconfig.ClientIP clientIP;

    public com.couchbase.v2.couchbaseclusterspec.networking.exposedfeatureservicetemplate.spec.sessionaffinityconfig.ClientIP getClientIP() {
        return clientIP;
    }

    public void setClientIP(com.couchbase.v2.couchbaseclusterspec.networking.exposedfeatureservicetemplate.spec.sessionaffinityconfig.ClientIP clientIP) {
        this.clientIP = clientIP;
    }
}


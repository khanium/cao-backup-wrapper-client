package com.couchbase.v2.couchbaseclusterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ready","unready"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Members implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Ready are the Couchbase members that are clustered and ready to serve client requests.  The member names are the same as the Couchbase pod names.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ready")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ready are the Couchbase members that are clustered and ready to serve client requests.  The member names are the same as the Couchbase pod names.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> ready;

    public java.util.List<String> getReady() {
        return ready;
    }

    public void setReady(java.util.List<String> ready) {
        this.ready = ready;
    }

    /**
     * Unready are the Couchbase members not clustered or unready to serve client requests.  The member names are the same as the Couchbase pod names.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unready")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Unready are the Couchbase members not clustered or unready to serve client requests.  The member names are the same as the Couchbase pod names.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> unready;

    public java.util.List<String> getUnready() {
        return unready;
    }

    public void setUnready(java.util.List<String> unready) {
        this.unready = unready;
    }
}


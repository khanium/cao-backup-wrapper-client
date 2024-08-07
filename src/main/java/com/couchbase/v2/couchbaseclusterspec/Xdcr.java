package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"managed","remoteClusters"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Xdcr implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Managed defines whether XDCR is managed by the operator or not.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Managed defines whether XDCR is managed by the operator or not.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean managed;

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * RemoteClusters is a set of named remote clusters to establish replications to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteClusters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RemoteClusters is a set of named remote clusters to establish replications to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.xdcr.RemoteClusters> remoteClusters;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.xdcr.RemoteClusters> getRemoteClusters() {
        return remoteClusters;
    }

    public void setRemoteClusters(java.util.List<com.couchbase.v2.couchbaseclusterspec.xdcr.RemoteClusters> remoteClusters) {
        this.remoteClusters = remoteClusters;
    }
}


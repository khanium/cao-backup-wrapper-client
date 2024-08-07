package com.couchbase.v2.couchbaseclusterspec.servers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Pod implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Standard objects metadata.  This is a curated version for use with Couchbase resource templates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Standard objects metadata.  This is a curated version for use with Couchbase resource templates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.Metadata metadata;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(com.couchbase.v2.couchbaseclusterspec.servers.pod.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * PodSpec is a description of a pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PodSpec is a description of a pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.Spec spec;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.Spec getSpec() {
        return spec;
    }

    public void setSpec(com.couchbase.v2.couchbaseclusterspec.servers.pod.Spec spec) {
        this.spec = spec;
    }
}


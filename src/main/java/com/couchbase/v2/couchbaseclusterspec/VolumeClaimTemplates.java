package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class VolumeClaimTemplates implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Standard objects metadata.  This is a curated version for use with Couchbase resource templates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Standard objects metadata.  This is a curated version for use with Couchbase resource templates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.volumeclaimtemplates.Metadata metadata;

    public com.couchbase.v2.couchbaseclusterspec.volumeclaimtemplates.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(com.couchbase.v2.couchbaseclusterspec.volumeclaimtemplates.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.volumeclaimtemplates.Spec spec;

    public com.couchbase.v2.couchbaseclusterspec.volumeclaimtemplates.Spec getSpec() {
        return spec;
    }

    public void setSpec(com.couchbase.v2.couchbaseclusterspec.volumeclaimtemplates.Spec spec) {
        this.spec = spec;
    }
}


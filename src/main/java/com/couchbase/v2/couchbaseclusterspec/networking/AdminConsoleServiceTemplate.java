package com.couchbase.v2.couchbaseclusterspec.networking;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AdminConsoleServiceTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Standard objects metadata.  This is a curated version for use with Couchbase resource templates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Standard objects metadata.  This is a curated version for use with Couchbase resource templates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.adminconsoleservicetemplate.Metadata metadata;

    public com.couchbase.v2.couchbaseclusterspec.networking.adminconsoleservicetemplate.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(com.couchbase.v2.couchbaseclusterspec.networking.adminconsoleservicetemplate.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * ServiceSpec describes the attributes that a user creates on a service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServiceSpec describes the attributes that a user creates on a service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.adminconsoleservicetemplate.Spec spec;

    public com.couchbase.v2.couchbaseclusterspec.networking.adminconsoleservicetemplate.Spec getSpec() {
        return spec;
    }

    public void setSpec(com.couchbase.v2.couchbaseclusterspec.networking.adminconsoleservicetemplate.Spec spec) {
        this.spec = spec;
    }
}


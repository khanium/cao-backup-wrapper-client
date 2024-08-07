package com.couchbase.v2.couchbasegroupspec.roles;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resources","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Collections implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Resources is an explicit list of named resources that will be considered for inclusion in this collection or collections.  If a resource reference doesn't match a resource, then no error conditions are raised due to undefined resource creation ordering and eventual consistency.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is an explicit list of named resources that will be considered for inclusion in this collection or collections.  If a resource reference doesn't match a resource, then no error conditions are raised due to undefined resource creation ordering and eventual consistency.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbasegroupspec.roles.collections.Resources> resources;

    public java.util.List<com.couchbase.v2.couchbasegroupspec.roles.collections.Resources> getResources() {
        return resources;
    }

    public void setResources(java.util.List<com.couchbase.v2.couchbasegroupspec.roles.collections.Resources> resources) {
        this.resources = resources;
    }

    /**
     * Selector allows resources to be implicitly considered for inclusion in this collection or collections.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#labelselector-v1-meta
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector allows resources to be implicitly considered for inclusion in this collection or collections.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#labelselector-v1-meta")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasegroupspec.roles.collections.Selector selector;

    public com.couchbase.v2.couchbasegroupspec.roles.collections.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbasegroupspec.roles.collections.Selector selector) {
        this.selector = selector;
    }
}


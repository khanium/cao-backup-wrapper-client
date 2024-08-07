package com.couchbase.v2.couchbasescopegroupspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"managed","preserveDefaultCollection","resources","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Collections implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Managed indicates whether collections within this scope are managed. If not then you can dynamically create and delete collections with the Couchbase UI or SDKs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Managed indicates whether collections within this scope are managed. If not then you can dynamically create and delete collections with the Couchbase UI or SDKs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean managed;

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * PreserveDefaultCollection indicates whether the Operator should manage the default collection within the default scope.  The default collection can be deleted, but can not be recreated by Couchbase Server.  By setting this field to `true`, the Operator will implicitly manage the default collection within the default scope.  The default collection cannot be modified and will have no document time-to-live (TTL).  When set to `false`, the operator will not manage the default collection, which will be deleted and cannot be used or recreated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preserveDefaultCollection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreserveDefaultCollection indicates whether the Operator should manage the default collection within the default scope.  The default collection can be deleted, but can not be recreated by Couchbase Server.  By setting this field to `true`, the Operator will implicitly manage the default collection within the default scope.  The default collection cannot be modified and will have no document time-to-live (TTL).  When set to `false`, the operator will not manage the default collection, which will be deleted and cannot be used or recreated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preserveDefaultCollection;

    public Boolean getPreserveDefaultCollection() {
        return preserveDefaultCollection;
    }

    public void setPreserveDefaultCollection(Boolean preserveDefaultCollection) {
        this.preserveDefaultCollection = preserveDefaultCollection;
    }

    /**
     * Resources is an explicit list of named resources that will be considered for inclusion in this scope or scopes.  If a resource reference doesn't match a resource, then no error conditions are raised due to undefined resource creation ordering and eventual consistency.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is an explicit list of named resources that will be considered for inclusion in this scope or scopes.  If a resource reference doesn't match a resource, then no error conditions are raised due to undefined resource creation ordering and eventual consistency.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbasescopegroupspec.collections.Resources> resources;

    public java.util.List<com.couchbase.v2.couchbasescopegroupspec.collections.Resources> getResources() {
        return resources;
    }

    public void setResources(java.util.List<com.couchbase.v2.couchbasescopegroupspec.collections.Resources> resources) {
        this.resources = resources;
    }

    /**
     * Selector allows resources to be implicitly considered for inclusion in this scope or scopes.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#labelselector-v1-meta
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector allows resources to be implicitly considered for inclusion in this scope or scopes.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#labelselector-v1-meta")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasescopegroupspec.collections.Selector selector;

    public com.couchbase.v2.couchbasescopegroupspec.collections.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbasescopegroupspec.collections.Selector selector) {
        this.selector = selector;
    }
}


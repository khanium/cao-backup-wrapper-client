package com.couchbase.v2.couchbaseephemeralbucketspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"managed","resources","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Scopes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Managed defines whether scopes are managed for this bucket. This field is `false` by default, and the Operator will take no actions that will affect scopes and collections in this bucket.  The default scope and collection will be present.  When set to `true`, the Operator will manage user defined scopes, and optionally, their collections as defined by the `CouchbaseScope`, `CouchbaseScopeGroup`, `CouchbaseCollection` and `CouchbaseCollectionGroup` resource documentation.  If this field is set to `false` while the  already managed, then the Operator will leave whatever configuration is already present.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Managed defines whether scopes are managed for this bucket. This field is `false` by default, and the Operator will take no actions that will affect scopes and collections in this bucket.  The default scope and collection will be present.  When set to `true`, the Operator will manage user defined scopes, and optionally, their collections as defined by the `CouchbaseScope`, `CouchbaseScopeGroup`, `CouchbaseCollection` and `CouchbaseCollectionGroup` resource documentation.  If this field is set to `false` while the  already managed, then the Operator will leave whatever configuration is already present.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean managed;

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * Resources is an explicit list of named resources that will be considered for inclusion in this bucket.  If a resource reference doesn't match a resource, then no error conditions are raised due to undefined resource creation ordering and eventual consistency.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is an explicit list of named resources that will be considered for inclusion in this bucket.  If a resource reference doesn't match a resource, then no error conditions are raised due to undefined resource creation ordering and eventual consistency.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseephemeralbucketspec.scopes.Resources> resources;

    public java.util.List<com.couchbase.v2.couchbaseephemeralbucketspec.scopes.Resources> getResources() {
        return resources;
    }

    public void setResources(java.util.List<com.couchbase.v2.couchbaseephemeralbucketspec.scopes.Resources> resources) {
        this.resources = resources;
    }

    /**
     * Selector allows resources to be implicitly considered for inclusion in this bucket.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#labelselector-v1-meta
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector allows resources to be implicitly considered for inclusion in this bucket.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#labelselector-v1-meta")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseephemeralbucketspec.scopes.Selector selector;

    public com.couchbase.v2.couchbaseephemeralbucketspec.scopes.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbaseephemeralbucketspec.scopes.Selector selector) {
        this.selector = selector;
    }
}


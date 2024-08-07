package com.couchbase.v2;

@io.fabric8.kubernetes.model.annotation.Version(value = "v2" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("couchbase.com")
@io.fabric8.kubernetes.model.annotation.Singular("couchbasescope")
@io.fabric8.kubernetes.model.annotation.Plural("couchbasescopes")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseScope extends io.fabric8.kubernetes.client.CustomResource<CouchbaseScopeSpec, Void> implements io.fabric8.kubernetes.api.model.Namespaced {
}


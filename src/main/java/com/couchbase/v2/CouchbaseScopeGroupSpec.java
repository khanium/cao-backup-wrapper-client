package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"collections","names"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseScopeGroupSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Collections defines how to collate collections included in this scope or scope group. Any of the provided methods may be used to collate a set of collections to manage.  Collated collections must have unique names, otherwise it is considered ambiguous, and an error condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collections")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Collections defines how to collate collections included in this scope or scope group. Any of the provided methods may be used to collate a set of collections to manage.  Collated collections must have unique names, otherwise it is considered ambiguous, and an error condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasescopegroupspec.Collections collections;

    public com.couchbase.v2.couchbasescopegroupspec.Collections getCollections() {
        return collections;
    }

    public void setCollections(com.couchbase.v2.couchbasescopegroupspec.Collections collections) {
        this.collections = collections;
    }

    /**
     * Names specifies the names of the scopes.  Unlike CouchbaseScope, which specifies a single scope, a scope group specifies multiple, and the scope group must specify at least one scope name. Any scope names specified must be unique. Scope names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("names")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Names specifies the names of the scopes.  Unlike CouchbaseScope, which specifies a single scope, a scope group specifies multiple, and the scope group must specify at least one scope name. Any scope names specified must be unique. Scope names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> names;

    public java.util.List<String> getNames() {
        return names;
    }

    public void setNames(java.util.List<String> names) {
        this.names = names;
    }
}


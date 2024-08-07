package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"collections","defaultScope","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseScopeSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Collections defines how to collate collections included in this scope or scope group. Any of the provided methods may be used to collate a set of collections to manage.  Collated collections must have unique names, otherwise it is considered ambiguous, and an error condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collections")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Collections defines how to collate collections included in this scope or scope group. Any of the provided methods may be used to collate a set of collections to manage.  Collated collections must have unique names, otherwise it is considered ambiguous, and an error condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasescopespec.Collections collections;

    public com.couchbase.v2.couchbasescopespec.Collections getCollections() {
        return collections;
    }

    public void setCollections(com.couchbase.v2.couchbasescopespec.Collections collections) {
        this.collections = collections;
    }

    /**
     * DefaultScope indicates whether this resource represents the default scope for a bucket.  When set to `true`, this allows the user to refer to and manage collections within the default scope.  When not defined, the Operator will implicitly manage the default scope as the default scope can not be deleted from Couchbase Server.  The Operator defined default scope will also have the `persistDefaultCollection` flag set to `true`.  Only one default scope is permitted to be contained in a bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultScope")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultScope indicates whether this resource represents the default scope for a bucket.  When set to `true`, this allows the user to refer to and manage collections within the default scope.  When not defined, the Operator will implicitly manage the default scope as the default scope can not be deleted from Couchbase Server.  The Operator defined default scope will also have the `persistDefaultCollection` flag set to `true`.  Only one default scope is permitted to be contained in a bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean defaultScope;

    public Boolean getDefaultScope() {
        return defaultScope;
    }

    public void setDefaultScope(Boolean defaultScope) {
        this.defaultScope = defaultScope;
    }

    /**
     * Name specifies the name of the scope.  By default, the metadata.name is used to define the scope name, however, due to the limited character set, this field can be used to override the default and provide the full functionality. Additionally the `metadata.name` field is a DNS label, and thus limited to 63 characters, this field must be used if the name is longer than this limit. Scope names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,250}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name specifies the name of the scope.  By default, the metadata.name is used to define the scope name, however, due to the limited character set, this field can be used to override the default and provide the full functionality. Additionally the `metadata.name` field is a DNS label, and thus limited to 63 characters, this field must be used if the name is longer than this limit. Scope names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


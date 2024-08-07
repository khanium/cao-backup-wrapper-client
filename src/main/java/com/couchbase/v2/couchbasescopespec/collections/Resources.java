package com.couchbase.v2.couchbasescopespec.collections;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"kind","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Kind {

        @com.fasterxml.jackson.annotation.JsonProperty("CouchbaseCollection")
        COUCHBASECOLLECTION("CouchbaseCollection"), @com.fasterxml.jackson.annotation.JsonProperty("CouchbaseCollectionGroup")
        COUCHBASECOLLECTIONGROUP("CouchbaseCollectionGroup");

        String value;

        Kind(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Kind indicates the kind of resource that is being referenced.  A scope can only reference `CouchbaseCollection` and `CouchbaseCollectionGroup` resource kinds.  This field defaults to `CouchbaseCollection` if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kind indicates the kind of resource that is being referenced.  A scope can only reference `CouchbaseCollection` and `CouchbaseCollectionGroup` resource kinds.  This field defaults to `CouchbaseCollection` if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Kind kind = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"CouchbaseCollection\"", Kind.class);

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * Name is the name of the Kubernetes resource name that is being referenced. Legal collection names have a maximum length of 251 characters and may be composed of any character from "a-z", "A-Z", "0-9" and "_-%".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,250}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the Kubernetes resource name that is being referenced. Legal collection names have a maximum length of 251 characters and may be composed of any character from \"a-z\", \"A-Z\", \"0-9\" and \"_-%\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


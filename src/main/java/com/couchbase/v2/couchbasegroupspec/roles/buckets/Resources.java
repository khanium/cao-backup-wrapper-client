package com.couchbase.v2.couchbasegroupspec.roles.buckets;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"kind","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Kind {

        @com.fasterxml.jackson.annotation.JsonProperty("CouchbaseBucket")
        COUCHBASEBUCKET("CouchbaseBucket");

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
     * Kind indicates the kind of resource that is being referenced.  A Role can only reference `CouchbaseBucket` kind.  This field defaults to `CouchbaseBucket` if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kind indicates the kind of resource that is being referenced.  A Role can only reference `CouchbaseBucket` kind.  This field defaults to `CouchbaseBucket` if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Kind kind = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"CouchbaseBucket\"", Kind.class);

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * Name is the name of the Kubernetes resource name that is being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the Kubernetes resource name that is being referenced.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


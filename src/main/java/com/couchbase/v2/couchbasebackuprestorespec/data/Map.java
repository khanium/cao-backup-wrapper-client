package com.couchbase.v2.couchbasebackuprestorespec.data;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"source","target"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Map implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Source defines the data source of the mapping, this may be either a bucket, scope or collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^(?:[a-zA-Z0-9\\-_%]|\\\\.){1,100}(\\._default(\\._default)?|\\.[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,29}(\\.[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,29})?)?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source defines the data source of the mapping, this may be either a bucket, scope or collection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Target defines the data target of the mapping, this may be either a bucket, scope or collection, and must refer to the same type as the restore source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^(?:[a-zA-Z0-9\\-_%]|\\\\.){1,100}(\\._default(\\._default)?|\\.[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,29}(\\.[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,29})?)?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Target defines the data target of the mapping, this may be either a bucket, scope or collection, and must refer to the same type as the restore source.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}


package com.couchbase.v2.couchbaseclusterspec.networking.exposedfeatureservicetemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"annotations","labels"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Metadata implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> annotations;

    public java.util.Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> labels;

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }
}


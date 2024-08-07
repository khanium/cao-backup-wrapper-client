package com.couchbase.v2.couchbasebackuprestorespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Buckets implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    public java.util.Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperty(String key, Object value) {
        this.additionalProperties.put(key, value);
    }
}


package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"prometheus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Monitoring implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Prometheus provides integration with Prometheus monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prometheus provides integration with Prometheus monitoring.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.monitoring.Prometheus prometheus;

    public com.couchbase.v2.couchbaseclusterspec.monitoring.Prometheus getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(com.couchbase.v2.couchbaseclusterspec.monitoring.Prometheus prometheus) {
        this.prometheus = prometheus;
    }
}


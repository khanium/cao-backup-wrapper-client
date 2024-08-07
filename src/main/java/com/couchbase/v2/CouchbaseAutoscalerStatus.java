package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"labelSelector","size"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseAutoscalerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * LabelSelector allows the HPA to select resources to monitor for resource utilization in order to trigger scaling.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labelSelector")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LabelSelector allows the HPA to select resources to monitor for resource utilization in order to trigger scaling.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String labelSelector;

    public String getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
    }

    /**
     * Size is the current size of the server group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size is the current size of the server group.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long size;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}


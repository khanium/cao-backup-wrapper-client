package com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"percent","size"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DatabaseFragmentationThreshold implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Percent is the percentage of disk fragmentation after which to decompaction will be triggered. This field must be in the range 2-100, defaulting to 30.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("percent")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(2.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Percent is the percentage of disk fragmentation after which to decompaction will be triggered. This field must be in the range 2-100, defaulting to 30.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long percent = 30L;

    public Long getPercent() {
        return percent;
    }

    public void setPercent(Long percent) {
        this.percent = percent;
    }

    /**
     * Size is the amount of disk framentation, that once exceeded, will trigger decompaction. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size is the amount of disk framentation, that once exceeded, will trigger decompaction. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString size;

    public io.fabric8.kubernetes.api.model.IntOrString getSize() {
        return size;
    }

    public void setSize(io.fabric8.kubernetes.api.model.IntOrString size) {
        this.size = size;
    }
}


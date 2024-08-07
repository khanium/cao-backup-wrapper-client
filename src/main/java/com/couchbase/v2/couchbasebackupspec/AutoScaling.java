package com.couchbase.v2.couchbasebackupspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"incrementPercent","limit","thresholdPercent"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AutoScaling implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * IncrementPercent controls how much the volume is increased each time the threshold is exceeded, upto a maximum as defined by the limit. This field defaults to 20 if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incrementPercent")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IncrementPercent controls how much the volume is increased each time the threshold is exceeded, upto a maximum as defined by the limit. This field defaults to 20 if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long incrementPercent = 20L;

    public Long getIncrementPercent() {
        return incrementPercent;
    }

    public void setIncrementPercent(Long incrementPercent) {
        this.incrementPercent = incrementPercent;
    }

    /**
     * Limit imposes a hard limit on the size we can autoscale to.  When not specified no bounds are imposed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limit imposes a hard limit on the size we can autoscale to.  When not specified no bounds are imposed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString limit;

    public io.fabric8.kubernetes.api.model.IntOrString getLimit() {
        return limit;
    }

    public void setLimit(io.fabric8.kubernetes.api.model.IntOrString limit) {
        this.limit = limit;
    }

    /**
     * ThresholdPercent determines the point at which a volume is autoscaled. This represents the percentage of free space remaining on the volume, when less than this threshold, it will trigger a volume expansion. For example, if the volume is 100Gi, and the threshold 20%, then a resize will be triggered when the used capacity exceeds 80Gi, and free space is less than 20Gi.  This field defaults to 20 if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thresholdPercent")
    @io.fabric8.generator.annotation.Max(99.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ThresholdPercent determines the point at which a volume is autoscaled. This represents the percentage of free space remaining on the volume, when less than this threshold, it will trigger a volume expansion. For example, if the volume is 100Gi, and the threshold 20%, then a resize will be triggered when the used capacity exceeds 80Gi, and free space is less than 20Gi.  This field defaults to 20 if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thresholdPercent = 20L;

    public Long getThresholdPercent() {
        return thresholdPercent;
    }

    public void setThresholdPercent(Long thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
    }
}


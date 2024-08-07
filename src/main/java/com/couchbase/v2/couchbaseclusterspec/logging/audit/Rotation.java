package com.couchbase.v2.couchbaseclusterspec.logging.audit;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"interval","size"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Rotation implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The interval at which to rotate log files, defaults to 15 minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interval at which to rotate log files, defaults to 15 minutes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval = "15m";

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Size allows the specification of a rotation size for the log, defaults to 20Mi. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size allows the specification of a rotation size for the log, defaults to 20Mi. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString size = new io.fabric8.kubernetes.api.model.IntOrString("20Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getSize() {
        return size;
    }

    public void setSize(io.fabric8.kubernetes.api.model.IntOrString size) {
        this.size = size;
    }
}


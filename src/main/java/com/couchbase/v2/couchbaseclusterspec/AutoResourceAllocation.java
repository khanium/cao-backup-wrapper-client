package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cpuLimits","cpuRequests","enabled","overheadPercent"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AutoResourceAllocation implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CPULimits automatically populates the CPU limits across all Couchbase server pods.  This field defaults to "4" CPUs.  Explicitly specifying the CPU limit for a particular server class will override this value.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLimits")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPULimits automatically populates the CPU limits across all Couchbase server pods.  This field defaults to \"4\" CPUs.  Explicitly specifying the CPU limit for a particular server class will override this value.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString cpuLimits = new io.fabric8.kubernetes.api.model.IntOrString("4");

    public io.fabric8.kubernetes.api.model.IntOrString getCpuLimits() {
        return cpuLimits;
    }

    public void setCpuLimits(io.fabric8.kubernetes.api.model.IntOrString cpuLimits) {
        this.cpuLimits = cpuLimits;
    }

    /**
     * CPURequests automatically populates the CPU requests across all Couchbase server pods.  The default value of "2", is the minimum recommended number of CPUs required to run Couchbase Server.  Explicitly specifying the CPU request for a particular server class will override this value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuRequests")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPURequests automatically populates the CPU requests across all Couchbase server pods.  The default value of \"2\", is the minimum recommended number of CPUs required to run Couchbase Server.  Explicitly specifying the CPU request for a particular server class will override this value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString cpuRequests = new io.fabric8.kubernetes.api.model.IntOrString("2");

    public io.fabric8.kubernetes.api.model.IntOrString getCpuRequests() {
        return cpuRequests;
    }

    public void setCpuRequests(io.fabric8.kubernetes.api.model.IntOrString cpuRequests) {
        this.cpuRequests = cpuRequests;
    }

    /**
     * Enabled defines whether auto-resource allocation is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled defines whether auto-resource allocation is enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * OverheadPercent defines the amount of memory above that required for individual services on a pod.  For Couchbase Server this should be approximately 25%.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overheadPercent")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OverheadPercent defines the amount of memory above that required for individual services on a pod.  For Couchbase Server this should be approximately 25%.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long overheadPercent = 25L;

    public Long getOverheadPercent() {
        return overheadPercent;
    }

    public void setOverheadPercent(Long overheadPercent) {
        this.overheadPercent = overheadPercent;
    }
}


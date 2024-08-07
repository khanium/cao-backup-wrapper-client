package com.couchbase.v2.couchbaseclusterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allocatedMemory","allocatedMemoryPercent","analyticsServiceAllocation","dataServiceAllocation","eventingServiceAllocation","indexServiceAllocation","name","requestedMemory","searchServiceAllocation","unusedMemory","unusedMemoryPercent"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Allocations implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AllocatedMemory defines the total memory allocated for constrained Couchbase services. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedMemory")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllocatedMemory defines the total memory allocated for constrained Couchbase services. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString allocatedMemory;

    public io.fabric8.kubernetes.api.model.IntOrString getAllocatedMemory() {
        return allocatedMemory;
    }

    public void setAllocatedMemory(io.fabric8.kubernetes.api.model.IntOrString allocatedMemory) {
        this.allocatedMemory = allocatedMemory;
    }

    /**
     * AllocatedMemoryPercent is set when memory resources are requested and define how much of the requested memory is allocated to constrained Couchbase services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedMemoryPercent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllocatedMemoryPercent is set when memory resources are requested and define how much of the requested memory is allocated to constrained Couchbase services.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long allocatedMemoryPercent;

    public Long getAllocatedMemoryPercent() {
        return allocatedMemoryPercent;
    }

    public void setAllocatedMemoryPercent(Long allocatedMemoryPercent) {
        this.allocatedMemoryPercent = allocatedMemoryPercent;
    }

    /**
     * AnalyticsServiceAllocation is set when the analytics service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("analyticsServiceAllocation")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AnalyticsServiceAllocation is set when the analytics service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString analyticsServiceAllocation;

    public io.fabric8.kubernetes.api.model.IntOrString getAnalyticsServiceAllocation() {
        return analyticsServiceAllocation;
    }

    public void setAnalyticsServiceAllocation(io.fabric8.kubernetes.api.model.IntOrString analyticsServiceAllocation) {
        this.analyticsServiceAllocation = analyticsServiceAllocation;
    }

    /**
     * DataServiceAllocation is set when the data service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataServiceAllocation")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataServiceAllocation is set when the data service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString dataServiceAllocation;

    public io.fabric8.kubernetes.api.model.IntOrString getDataServiceAllocation() {
        return dataServiceAllocation;
    }

    public void setDataServiceAllocation(io.fabric8.kubernetes.api.model.IntOrString dataServiceAllocation) {
        this.dataServiceAllocation = dataServiceAllocation;
    }

    /**
     * EventingServiceAllocation is set when the eventing service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventingServiceAllocation")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EventingServiceAllocation is set when the eventing service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString eventingServiceAllocation;

    public io.fabric8.kubernetes.api.model.IntOrString getEventingServiceAllocation() {
        return eventingServiceAllocation;
    }

    public void setEventingServiceAllocation(io.fabric8.kubernetes.api.model.IntOrString eventingServiceAllocation) {
        this.eventingServiceAllocation = eventingServiceAllocation;
    }

    /**
     * IndexServiceAllocation is set when the index service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indexServiceAllocation")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IndexServiceAllocation is set when the index service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString indexServiceAllocation;

    public io.fabric8.kubernetes.api.model.IntOrString getIndexServiceAllocation() {
        return indexServiceAllocation;
    }

    public void setIndexServiceAllocation(io.fabric8.kubernetes.api.model.IntOrString indexServiceAllocation) {
        this.indexServiceAllocation = indexServiceAllocation;
    }

    /**
     * Name is the name of the server class defined in spec.servers
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the server class defined in spec.servers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * RequestedMemory, if set, defines the Kubernetes resource request for the server class. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedMemory")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RequestedMemory, if set, defines the Kubernetes resource request for the server class. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString requestedMemory;

    public io.fabric8.kubernetes.api.model.IntOrString getRequestedMemory() {
        return requestedMemory;
    }

    public void setRequestedMemory(io.fabric8.kubernetes.api.model.IntOrString requestedMemory) {
        this.requestedMemory = requestedMemory;
    }

    /**
     * SearchServiceAllocation is set when the search service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchServiceAllocation")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SearchServiceAllocation is set when the search service is enabled for this class and defines how much memory this service consumes per pod.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString searchServiceAllocation;

    public io.fabric8.kubernetes.api.model.IntOrString getSearchServiceAllocation() {
        return searchServiceAllocation;
    }

    public void setSearchServiceAllocation(io.fabric8.kubernetes.api.model.IntOrString searchServiceAllocation) {
        this.searchServiceAllocation = searchServiceAllocation;
    }

    /**
     * UnusedMemory is set when memory resources are requested and is the difference between the requestedMemory and allocatedMemory.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unusedMemory")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UnusedMemory is set when memory resources are requested and is the difference between the requestedMemory and allocatedMemory.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString unusedMemory;

    public io.fabric8.kubernetes.api.model.IntOrString getUnusedMemory() {
        return unusedMemory;
    }

    public void setUnusedMemory(io.fabric8.kubernetes.api.model.IntOrString unusedMemory) {
        this.unusedMemory = unusedMemory;
    }

    /**
     * UnusedMemoryPercent is set when memory resources are requested and defines how much requested memory is not allocated.  Couchbase server expects at least a 20% overhead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unusedMemoryPercent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UnusedMemoryPercent is set when memory resources are requested and defines how much requested memory is not allocated.  Couchbase server expects at least a 20% overhead.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long unusedMemoryPercent;

    public Long getUnusedMemoryPercent() {
        return unusedMemoryPercent;
    }

    public void setUnusedMemoryPercent(Long unusedMemoryPercent) {
        this.unusedMemoryPercent = unusedMemoryPercent;
    }
}


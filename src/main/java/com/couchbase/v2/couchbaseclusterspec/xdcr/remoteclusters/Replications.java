package com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Replications implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Selector allows CouchbaseReplication resources to be filtered based on labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector allows CouchbaseReplication resources to be filtered based on labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications.Selector selector;

    public com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications.Selector selector) {
        this.selector = selector;
    }
}


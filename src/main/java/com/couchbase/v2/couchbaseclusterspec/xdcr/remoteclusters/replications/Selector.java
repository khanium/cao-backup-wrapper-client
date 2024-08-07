package com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"matchExpressions","matchLabels"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Selector implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("matchExpressions is a list of label selector requirements. The requirements are ANDed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications.selector.MatchExpressions> matchExpressions;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications.selector.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(java.util.List<com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.replications.selector.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> matchLabels;

    public java.util.Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(java.util.Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }
}


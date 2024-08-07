package com.couchbase.v2.couchbaseclusterspec.servers.pod.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeAffinity","podAffinity","podAntiAffinity"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Describes node affinity scheduling rules for the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes node affinity scheduling rules for the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.NodeAffinity nodeAffinity;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.PodAffinity podAffinity;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.PodAntiAffinity podAntiAffinity;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }
}


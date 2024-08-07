package com.couchbase.v2.couchbaseclusterspec.networking;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"domain"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Dns implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Domain is the domain to create pods in.  When populated the Operator will annotate the admin console and per-pod services with the key "external-dns.alpha.kubernetes.io/hostname".  These annotations can be used directly by a Kubernetes External-DNS controller to replicate load balancer service IP addresses into a public DNS server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Domain is the domain to create pods in.  When populated the Operator will annotate the admin console and per-pod services with the key \"external-dns.alpha.kubernetes.io/hostname\".  These annotations can be used directly by a Kubernetes External-DNS controller to replicate load balancer service IP addresses into a public DNS server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}


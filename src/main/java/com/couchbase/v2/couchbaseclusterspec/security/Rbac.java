package com.couchbase.v2.couchbaseclusterspec.security;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"managed","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Rbac implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Managed defines whether RBAC is managed by us or the clients.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Managed defines whether RBAC is managed by us or the clients.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean managed;

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * Selector is a label selector used to list RBAC resources in the namespace that are managed by the Operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector is a label selector used to list RBAC resources in the namespace that are managed by the Operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.security.rbac.Selector selector;

    public com.couchbase.v2.couchbaseclusterspec.security.rbac.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbaseclusterspec.security.rbac.Selector selector) {
        this.selector = selector;
    }
}


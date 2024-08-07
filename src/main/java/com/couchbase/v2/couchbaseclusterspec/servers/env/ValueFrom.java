package com.couchbase.v2.couchbaseclusterspec.servers.env;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapKeyRef","fieldRef","resourceFieldRef","secretKeyRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ValueFrom implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Selects a key of a ConfigMap.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapKeyRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a key of a ConfigMap.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.ConfigMapKeyRef configMapKeyRef;

    public com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.FieldRef fieldRef;

    public com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.FieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceFieldRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.ResourceFieldRef resourceFieldRef;

    public com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * Selects a key of a secret in the pod's namespace
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretKeyRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a key of a secret in the pod's namespace")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.SecretKeyRef secretKeyRef;

    public com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(com.couchbase.v2.couchbaseclusterspec.servers.env.valuefrom.SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }
}


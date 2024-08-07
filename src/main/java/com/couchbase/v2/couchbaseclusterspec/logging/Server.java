package com.couchbase.v2.couchbaseclusterspec.logging;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configurationName","enabled","manageConfiguration","sidecar"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Server implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ConfigurationName is the name of the Secret to use holding the logging configuration in the namespace. A Secret is used to ensure we can safely store credentials but this can be populated from plaintext if acceptable too. If it does not exist then one will be created with defaults in the namespace so it can be easily updated whilst running. Note that if running multiple clusters in the same kubernetes namespace then you should use a separate Secret for each, otherwise the first cluster will take ownership (if created) and the Secret will be cleaned up when that cluster is removed. If running clusters in separate namespaces then they will be separate Secrets anyway.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigurationName is the name of the Secret to use holding the logging configuration in the namespace. A Secret is used to ensure we can safely store credentials but this can be populated from plaintext if acceptable too. If it does not exist then one will be created with defaults in the namespace so it can be easily updated whilst running. Note that if running multiple clusters in the same kubernetes namespace then you should use a separate Secret for each, otherwise the first cluster will take ownership (if created) and the Secret will be cleaned up when that cluster is removed. If running clusters in separate namespaces then they will be separate Secrets anyway.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String configurationName = "fluent-bit-config";

    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * Enabled is a boolean that enables the logging sidecar container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is a boolean that enables the logging sidecar container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * A boolean which indicates whether the operator should manage the configuration or not. If omitted then this defaults to true which means the operator will attempt to reconcile it to default values. To use a custom configuration make sure to set this to false. Note that the ownership of any Secret is not changed so if a Secret is created externally it can be updated by the operator but it's ownership stays the same so it will be cleaned up when it's owner is.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manageConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A boolean which indicates whether the operator should manage the configuration or not. If omitted then this defaults to true which means the operator will attempt to reconcile it to default values. To use a custom configuration make sure to set this to false. Note that the ownership of any Secret is not changed so if a Secret is created externally it can be updated by the operator but it's ownership stays the same so it will be cleaned up when it's owner is.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean manageConfiguration = true;

    public Boolean getManageConfiguration() {
        return manageConfiguration;
    }

    public void setManageConfiguration(Boolean manageConfiguration) {
        this.manageConfiguration = manageConfiguration;
    }

    /**
     * Any specific logging sidecar container configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sidecar")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Any specific logging sidecar container configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.server.Sidecar sidecar = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbaseclusterspec.logging.server.Sidecar.class);

    public com.couchbase.v2.couchbaseclusterspec.logging.server.Sidecar getSidecar() {
        return sidecar;
    }

    public void setSidecar(com.couchbase.v2.couchbaseclusterspec.logging.server.Sidecar sidecar) {
        this.sidecar = sidecar;
    }
}


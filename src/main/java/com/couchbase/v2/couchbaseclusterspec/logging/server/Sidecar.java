package com.couchbase.v2.couchbaseclusterspec.logging.server;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configurationMountPath","image","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Sidecar implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ConfigurationMountPath is the location to mount the ConfigurationName Secret into the image. If another log shipping image is used that needs a different mount then modify this. Note that the configuration file must be called 'fluent-bit.conf' at the root of this path, there is no provision for overriding the name of the config file passed as the COUCHBASE_LOGS_CONFIG_FILE environment variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationMountPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigurationMountPath is the location to mount the ConfigurationName Secret into the image. If another log shipping image is used that needs a different mount then modify this. Note that the configuration file must be called 'fluent-bit.conf' at the root of this path, there is no provision for overriding the name of the config file passed as the COUCHBASE_LOGS_CONFIG_FILE environment variable.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String configurationMountPath = "/fluent-bit/config/";

    public String getConfigurationMountPath() {
        return configurationMountPath;
    }

    public void setConfigurationMountPath(String configurationMountPath) {
        this.configurationMountPath = configurationMountPath;
    }

    /**
     * Image is the image to be used to deal with logging as a sidecar. No validation is carried out as this can be any arbitrary repo and tag. It will default to the latest supported version of Fluent Bit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the image to be used to deal with logging as a sidecar. No validation is carried out as this can be any arbitrary repo and tag. It will default to the latest supported version of Fluent Bit.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image = "couchbase/fluent-bit:1.2.1";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Resources is the resource requirements for the sidecar container. Will be populated by Kubernetes defaults if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is the resource requirements for the sidecar container. Will be populated by Kubernetes defaults if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.server.sidecar.Resources resources;

    public com.couchbase.v2.couchbaseclusterspec.logging.server.sidecar.Resources getResources() {
        return resources;
    }

    public void setResources(com.couchbase.v2.couchbaseclusterspec.logging.server.sidecar.Resources resources) {
        this.resources = resources;
    }
}


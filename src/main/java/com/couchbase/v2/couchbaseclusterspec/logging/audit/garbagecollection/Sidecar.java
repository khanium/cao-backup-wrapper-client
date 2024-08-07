package com.couchbase.v2.couchbaseclusterspec.logging.audit.garbagecollection;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"age","enabled","image","interval","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Sidecar implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The minimum age of rotated log files to remove, defaults to one hour.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum age of rotated log files to remove, defaults to one hour.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String age = "1h";

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Enable this sidecar by setting to true, defaults to being disabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable this sidecar by setting to true, defaults to being disabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Image is the image to be used to run the audit sidecar helper. No validation is carried out as this can be any arbitrary repo and tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the image to be used to run the audit sidecar helper. No validation is carried out as this can be any arbitrary repo and tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image = "busybox:1.33.1";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * The interval at which to check for rotated log files to remove, defaults to 20 minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interval at which to check for rotated log files to remove, defaults to 20 minutes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval = "20m";

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Resources is the resource requirements for the cleanup container. Will be populated by Kubernetes defaults if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is the resource requirements for the cleanup container. Will be populated by Kubernetes defaults if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.audit.garbagecollection.sidecar.Resources resources;

    public com.couchbase.v2.couchbaseclusterspec.logging.audit.garbagecollection.sidecar.Resources getResources() {
        return resources;
    }

    public void setResources(com.couchbase.v2.couchbaseclusterspec.logging.audit.garbagecollection.sidecar.Resources resources) {
        this.resources = resources;
    }
}


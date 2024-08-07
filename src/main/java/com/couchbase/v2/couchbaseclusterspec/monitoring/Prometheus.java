package com.couchbase.v2.couchbaseclusterspec.monitoring;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authorizationSecret","enabled","image","refreshRate","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Prometheus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AuthorizationSecret is the name of a Kubernetes secret that contains a bearer token to authorize GET requests to the metrics endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AuthorizationSecret is the name of a Kubernetes secret that contains a bearer token to authorize GET requests to the metrics endpoint")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String authorizationSecret;

    public String getAuthorizationSecret() {
        return authorizationSecret;
    }

    public void setAuthorizationSecret(String authorizationSecret) {
        this.authorizationSecret = authorizationSecret;
    }

    /**
     * Enabled is a boolean that enables/disables the metrics sidecar container. This must be set to true, when image is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is a boolean that enables/disables the metrics sidecar container. This must be set to true, when image is provided.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Image is the metrics image to be used to collect metrics. No validation is carried out as this can be any arbitrary repo and tag. enabled must be set to true, when image is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the metrics image to be used to collect metrics. No validation is carried out as this can be any arbitrary repo and tag. enabled must be set to true, when image is provided.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * RefreshRate is the frequency in which cached statistics are updated in seconds. Shorter intervals will add additional resource overhead to clusters running Couchbase Server 7.0+ Default is 60 seconds, Maximum value is 600 seconds, and minimum value is 1 second.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshRate")
    @io.fabric8.generator.annotation.Max(600.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RefreshRate is the frequency in which cached statistics are updated in seconds. Shorter intervals will add additional resource overhead to clusters running Couchbase Server 7.0+ Default is 60 seconds, Maximum value is 600 seconds, and minimum value is 1 second.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long refreshRate = 60L;

    public Long getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Long refreshRate) {
        this.refreshRate = refreshRate;
    }

    /**
     * Resources is the resource requirements for the metrics container. Will be populated by Kubernetes defaults if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is the resource requirements for the metrics container. Will be populated by Kubernetes defaults if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.monitoring.prometheus.Resources resources;

    public com.couchbase.v2.couchbaseclusterspec.monitoring.prometheus.Resources getResources() {
        return resources;
    }

    public void setResources(com.couchbase.v2.couchbaseclusterspec.monitoring.prometheus.Resources resources) {
        this.resources = resources;
    }
}


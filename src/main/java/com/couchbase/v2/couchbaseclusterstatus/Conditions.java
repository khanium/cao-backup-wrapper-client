package com.couchbase.v2.couchbaseclusterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"lastTransitionTime","lastUpdateTime","message","reason","status","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Conditions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Last time the condition transitioned from one status to another.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastTransitionTime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Last time the condition transitioned from one status to another.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lastTransitionTime;

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    /**
     * Last time the condition status message updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Last time the condition status message updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lastUpdateTime;

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * A human readable message indicating details about the transition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A human readable message indicating details about the transition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Unique, one-word, CamelCase reason for the condition's last transition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Status is the status of the condition. Can be one of True, False, Unknown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status is the status of the condition. Can be one of True, False, Unknown.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("Available")
        AVAILABLE("Available"),
        @com.fasterxml.jackson.annotation.JsonProperty("Balanced")
        BALANCED("Balanced"),
        @com.fasterxml.jackson.annotation.JsonProperty("ManageConfig")
        MANAGECONFIG("ManageConfig"),
        @com.fasterxml.jackson.annotation.JsonProperty("Scaling")
        SCALING("Scaling"),
        @com.fasterxml.jackson.annotation.JsonProperty("ScalingUp")
        SCALINGUP("ScalingUp"),
        @com.fasterxml.jackson.annotation.JsonProperty("ScalingDown")
        SCALINGDOWN("ScalingDown"),
        @com.fasterxml.jackson.annotation.JsonProperty("Upgrading")
        UPGRADING("Upgrading"),
        @com.fasterxml.jackson.annotation.JsonProperty("Hibernating")
        HIBERNATING("Hibernating"),
        @com.fasterxml.jackson.annotation.JsonProperty("Error")
        ERROR("Error"),
        @com.fasterxml.jackson.annotation.JsonProperty("AutoscaleReady")
        AUTOSCALEREADY("AutoscaleReady"),
        @com.fasterxml.jackson.annotation.JsonProperty("Synchronized")
        SYNCHRONIZED("Synchronized");

        String value;

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Type is the type of condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type is the type of condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}


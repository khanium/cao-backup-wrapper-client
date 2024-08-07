package com.couchbase.v2.couchbasebackuprestorestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"full","incrementals","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Backups implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Full backup inside the repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("full")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Full backup inside the repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String full;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    /**
     * Incremental backups inside the repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incrementals")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Incremental backups inside the repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> incrementals;

    public java.util.List<String> getIncrementals() {
        return incrementals;
    }

    public void setIncrementals(java.util.List<String> incrementals) {
        this.incrementals = incrementals;
    }

    /**
     * Name of the repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allocations","autoscalers","buckets","clusterId","conditions","controlPaused","currentVersion","groups","members","size","users"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseClusterStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Allocations shows memory allocations within server classes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allocations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allocations shows memory allocations within server classes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterstatus.Allocations> allocations;

    public java.util.List<com.couchbase.v2.couchbaseclusterstatus.Allocations> getAllocations() {
        return allocations;
    }

    public void setAllocations(java.util.List<com.couchbase.v2.couchbaseclusterstatus.Allocations> allocations) {
        this.allocations = allocations;
    }

    /**
     * Autscalers describes all the autoscalers managed by the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscalers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Autscalers describes all the autoscalers managed by the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> autoscalers;

    public java.util.List<String> getAutoscalers() {
        return autoscalers;
    }

    public void setAutoscalers(java.util.List<String> autoscalers) {
        this.autoscalers = autoscalers;
    }

    /**
     * Buckets describes all the buckets managed by the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buckets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Buckets describes all the buckets managed by the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterstatus.Buckets> buckets;

    public java.util.List<com.couchbase.v2.couchbaseclusterstatus.Buckets> getBuckets() {
        return buckets;
    }

    public void setBuckets(java.util.List<com.couchbase.v2.couchbaseclusterstatus.Buckets> buckets) {
        this.buckets = buckets;
    }

    /**
     * ClusterID is the unique cluster UUID.  This is generated every time a new cluster is created, so may vary over the lifetime of a cluster if it is recreated by disaster recovery mechanisms.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClusterID is the unique cluster UUID.  This is generated every time a new cluster is created, so may vary over the lifetime of a cluster if it is recreated by disaster recovery mechanisms.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clusterId;

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * Current service state of the Couchbase cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Current service state of the Couchbase cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterstatus.Conditions> conditions;

    public java.util.List<com.couchbase.v2.couchbaseclusterstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<com.couchbase.v2.couchbaseclusterstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * ControlPaused indicates if the Operator has acknowledged and paused the control of the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("controlPaused")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ControlPaused indicates if the Operator has acknowledged and paused the control of the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean controlPaused;

    public Boolean getControlPaused() {
        return controlPaused;
    }

    public void setControlPaused(Boolean controlPaused) {
        this.controlPaused = controlPaused;
    }

    /**
     * CurrentVersion is the current Couchbase version.  This reflects the version of the whole cluster, therefore during upgrade, it is only updated when the upgrade has completed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CurrentVersion is the current Couchbase version.  This reflects the version of the whole cluster, therefore during upgrade, it is only updated when the upgrade has completed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String currentVersion;

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * Groups describes all the groups managed by the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Groups describes all the groups managed by the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> groups;

    public java.util.List<String> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * Members are the Couchbase members in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Members are the Couchbase members in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterstatus.Members members;

    public com.couchbase.v2.couchbaseclusterstatus.Members getMembers() {
        return members;
    }

    public void setMembers(com.couchbase.v2.couchbaseclusterstatus.Members members) {
        this.members = members;
    }

    /**
     * Size is the current size of the cluster in terms of pods.  Individual pod status conditions are listed in the members status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size is the current size of the cluster in terms of pods.  Individual pod status conditions are listed in the members status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long size;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * Users describes all the users managed by the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("users")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Users describes all the users managed by the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> users;

    public java.util.List<String> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<String> users) {
        this.users = users;
    }
}


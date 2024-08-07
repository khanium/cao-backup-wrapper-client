package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autoscaleEnabled","env","envFrom","name","pod","resources","serverGroups","services","size","volumeMounts"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Servers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AutoscaledEnabled defines whether the autoscaling feature is enabled for this class. When true, the Operator will create a CouchbaseAutoscaler resource for this server class.  The CouchbaseAutoscaler implements the Kubernetes scale API and can be controlled by the Kubernetes horizontal pod autoscaler (HPA).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscaleEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoscaledEnabled defines whether the autoscaling feature is enabled for this class. When true, the Operator will create a CouchbaseAutoscaler resource for this server class.  The CouchbaseAutoscaler implements the Kubernetes scale API and can be controlled by the Kubernetes horizontal pod autoscaler (HPA).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean autoscaleEnabled;

    public Boolean getAutoscaleEnabled() {
        return autoscaleEnabled;
    }

    public void setAutoscaleEnabled(Boolean autoscaleEnabled) {
        this.autoscaleEnabled = autoscaleEnabled;
    }

    /**
     * Env allows the setting of environment variables in the Couchbase server container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env allows the setting of environment variables in the Couchbase server container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.Env> env;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.Env> env) {
        this.env = env;
    }

    /**
     * EnvFrom allows the setting of environment variables in the Couchbase server container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("envFrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnvFrom allows the setting of environment variables in the Couchbase server container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.EnvFrom> envFrom;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.EnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.EnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    /**
     * Name is a textual name for the server configuration and must be unique. The name is used by the operator to uniquely identify a server class, and map pods back to an intended configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is a textual name for the server configuration and must be unique. The name is used by the operator to uniquely identify a server class, and map pods back to an intended configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Pod defines a template used to create pod for each Couchbase server instance.  Modifying pod metadata such as labels and annotations will update the pod in-place.  Any other modification will result in a cluster upgrade in order to fulfill the request. The Operator reserves the right to modify or replace any field.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#pod-v1-core
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod defines a template used to create pod for each Couchbase server instance.  Modifying pod metadata such as labels and annotations will update the pod in-place.  Any other modification will result in a cluster upgrade in order to fulfill the request. The Operator reserves the right to modify or replace any field.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#pod-v1-core")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.Pod pod;

    public com.couchbase.v2.couchbaseclusterspec.servers.Pod getPod() {
        return pod;
    }

    public void setPod(com.couchbase.v2.couchbaseclusterspec.servers.Pod pod) {
        this.pod = pod;
    }

    /**
     * Resources are the resource requirements for the Couchbase server container. This field overrides any automatic allocation as defined by `spec.autoResourceAllocation`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources are the resource requirements for the Couchbase server container. This field overrides any automatic allocation as defined by `spec.autoResourceAllocation`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.Resources resources;

    public com.couchbase.v2.couchbaseclusterspec.servers.Resources getResources() {
        return resources;
    }

    public void setResources(com.couchbase.v2.couchbaseclusterspec.servers.Resources resources) {
        this.resources = resources;
    }

    /**
     * ServerGroups define the set of availability zones you want to distribute pods over, and construct Couchbase server groups for.  By default, most cloud providers will label nodes with the key "topology.kubernetes.io/zone", the values associated with that key are used here to provide explicit scheduling by the Operator.  You may manually label nodes using the "topology.kubernetes.io/zone" key, to provide failure-domain aware scheduling when none is provided for you.  Global server groups are applied to all server classes, and may be overridden on a per-server class basis to give more control over scheduling and server groups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverGroups")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServerGroups define the set of availability zones you want to distribute pods over, and construct Couchbase server groups for.  By default, most cloud providers will label nodes with the key \"topology.kubernetes.io/zone\", the values associated with that key are used here to provide explicit scheduling by the Operator.  You may manually label nodes using the \"topology.kubernetes.io/zone\" key, to provide failure-domain aware scheduling when none is provided for you.  Global server groups are applied to all server classes, and may be overridden on a per-server class basis to give more control over scheduling and server groups.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> serverGroups;

    public java.util.List<String> getServerGroups() {
        return serverGroups;
    }

    public void setServerGroups(java.util.List<String> serverGroups) {
        this.serverGroups = serverGroups;
    }

    public enum Services {

        @com.fasterxml.jackson.annotation.JsonProperty("admin")
        ADMIN("admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        DATA("data"),
        @com.fasterxml.jackson.annotation.JsonProperty("index")
        INDEX("index"),
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        QUERY("query"),
        @com.fasterxml.jackson.annotation.JsonProperty("search")
        SEARCH("search"),
        @com.fasterxml.jackson.annotation.JsonProperty("eventing")
        EVENTING("eventing"),
        @com.fasterxml.jackson.annotation.JsonProperty("analytics")
        ANALYTICS("analytics");

        String value;

        Services(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Services is the set of Couchbase services to run on this server class. At least one class must contain the data service.  The field may contain any of "data", "index", "query", "search", "eventing" or "analytics". Each service may only be specified once.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Services is the set of Couchbase services to run on this server class. At least one class must contain the data service.  The field may contain any of \"data\", \"index\", \"query\", \"search\", \"eventing\" or \"analytics\". Each service may only be specified once.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Services> services;

    public java.util.List<Services> getServices() {
        return services;
    }

    public void setServices(java.util.List<Services> services) {
        this.services = services;
    }

    /**
     * Size is the expected requested of the server class.  This field must be greater than or equal to 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size is the expected requested of the server class.  This field must be greater than or equal to 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long size;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * VolumeMounts define persistent volume claims to attach to pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeMounts define persistent volume claims to attach to pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.VolumeMounts volumeMounts;

    public com.couchbase.v2.couchbaseclusterspec.servers.VolumeMounts getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(com.couchbase.v2.couchbaseclusterspec.servers.VolumeMounts volumeMounts) {
        this.volumeMounts = volumeMounts;
    }
}


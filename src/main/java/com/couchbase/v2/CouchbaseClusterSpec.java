package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"antiAffinity","autoResourceAllocation","autoscaleStabilizationPeriod","backup","buckets","cluster","enableOnlineVolumeExpansion","enablePreviewScaling","envImagePrecedence","hibernate","hibernationStrategy","image","logging","monitoring","networking","onlineVolumeExpansionTimeoutInMins","paused","platform","recoveryPolicy","rollingUpgrade","security","securityContext","serverGroups","servers","softwareUpdateNotifications","upgradeProcess","upgradeStrategy","volumeClaimTemplates","xdcr"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseClusterSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AntiAffinity forces the Operator to schedule different Couchbase server pods on different Kubernetes nodes.  Anti-affinity reduces the likelihood of unrecoverable failure in the event of a node issue.  Use of anti-affinity is highly recommended for production clusters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("antiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AntiAffinity forces the Operator to schedule different Couchbase server pods on different Kubernetes nodes.  Anti-affinity reduces the likelihood of unrecoverable failure in the event of a node issue.  Use of anti-affinity is highly recommended for production clusters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean antiAffinity;

    public Boolean getAntiAffinity() {
        return antiAffinity;
    }

    public void setAntiAffinity(Boolean antiAffinity) {
        this.antiAffinity = antiAffinity;
    }

    /**
     * AutoResourceAllocation populates pod resource requests based on the services running on that pod.  When enabled, this feature will calculate the memory request as the total of service allocations defined in `spec.cluster`, plus an overhead defined by `spec.autoResourceAllocation.overheadPercent`.Changing individual allocations for a service will cause a cluster upgrade as allocations are modified in the underlying pods.  This field also allows default pod CPU requests and limits to be applied. All resource allocations can be overridden by explicitly configuring them in the `spec.servers.resources` field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoResourceAllocation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoResourceAllocation populates pod resource requests based on the services running on that pod.  When enabled, this feature will calculate the memory request as the total of service allocations defined in `spec.cluster`, plus an overhead defined by `spec.autoResourceAllocation.overheadPercent`.Changing individual allocations for a service will cause a cluster upgrade as allocations are modified in the underlying pods.  This field also allows default pod CPU requests and limits to be applied. All resource allocations can be overridden by explicitly configuring them in the `spec.servers.resources` field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.AutoResourceAllocation autoResourceAllocation;

    public com.couchbase.v2.couchbaseclusterspec.AutoResourceAllocation getAutoResourceAllocation() {
        return autoResourceAllocation;
    }

    public void setAutoResourceAllocation(com.couchbase.v2.couchbaseclusterspec.AutoResourceAllocation autoResourceAllocation) {
        this.autoResourceAllocation = autoResourceAllocation;
    }

    /**
     * AutoscaleStabilizationPeriod defines how long after a rebalance the corresponding HorizontalPodAutoscaler should remain in maintenance mode. During maintenance mode all autoscaling is disabled since every HorizontalPodAutoscaler associated with the cluster becomes inactive. Since certain metrics can be unpredictable when Couchbase is rebalancing or upgrading, setting a stabilization period helps to prevent scaling recommendations from the HorizontalPodAutoscaler for a provided period of time.
     *  Values must be a valid Kubernetes duration of 0s or higher: https://golang.org/pkg/time/#ParseDuration A value of 0, puts the cluster in maintenance mode during rebalance but immediately exits this mode once the rebalance has completed. When undefined, the HPA is never put into maintenance mode during rebalance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscaleStabilizationPeriod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoscaleStabilizationPeriod defines how long after a rebalance the corresponding HorizontalPodAutoscaler should remain in maintenance mode. During maintenance mode all autoscaling is disabled since every HorizontalPodAutoscaler associated with the cluster becomes inactive. Since certain metrics can be unpredictable when Couchbase is rebalancing or upgrading, setting a stabilization period helps to prevent scaling recommendations from the HorizontalPodAutoscaler for a provided period of time. \n Values must be a valid Kubernetes duration of 0s or higher: https://golang.org/pkg/time/#ParseDuration A value of 0, puts the cluster in maintenance mode during rebalance but immediately exits this mode once the rebalance has completed. When undefined, the HPA is never put into maintenance mode during rebalance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String autoscaleStabilizationPeriod;

    public String getAutoscaleStabilizationPeriod() {
        return autoscaleStabilizationPeriod;
    }

    public void setAutoscaleStabilizationPeriod(String autoscaleStabilizationPeriod) {
        this.autoscaleStabilizationPeriod = autoscaleStabilizationPeriod;
    }

    /**
     * Backup defines whether the Operator should manage automated backups, and how to lookup backup resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Backup defines whether the Operator should manage automated backups, and how to lookup backup resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Backup backup;

    public com.couchbase.v2.couchbaseclusterspec.Backup getBackup() {
        return backup;
    }

    public void setBackup(com.couchbase.v2.couchbaseclusterspec.Backup backup) {
        this.backup = backup;
    }

    /**
     * Buckets defines whether the Operator should manage buckets, and how to lookup bucket resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buckets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Buckets defines whether the Operator should manage buckets, and how to lookup bucket resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Buckets buckets;

    public com.couchbase.v2.couchbaseclusterspec.Buckets getBuckets() {
        return buckets;
    }

    public void setBuckets(com.couchbase.v2.couchbaseclusterspec.Buckets buckets) {
        this.buckets = buckets;
    }

    /**
     * ClusterSettings define Couchbase cluster-wide settings such as memory allocation, failover characteristics and index settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClusterSettings define Couchbase cluster-wide settings such as memory allocation, failover characteristics and index settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Cluster cluster = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbaseclusterspec.Cluster.class);

    public com.couchbase.v2.couchbaseclusterspec.Cluster getCluster() {
        return cluster;
    }

    public void setCluster(com.couchbase.v2.couchbaseclusterspec.Cluster cluster) {
        this.cluster = cluster;
    }

    /**
     * EnableOnlineVolumeExpansion enables online expansion of Persistent Volumes. You can only expand a PVC if its storage class's "allowVolumeExpansion" field is set to true. Additionally, Kubernetes feature "ExpandInUsePersistentVolumes" must be enabled in order to expand the volumes which are actively bound to Pods. Volumes can only be expanded and not reduced to a smaller size. See: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#resizing-an-in-use-persistentvolumeclaim
     *  If "EnableOnlineVolumeExpansion" is enabled for use within an environment that does not actually support online volume and file system expansion then the cluster will fallback to rolling upgrade procedure to create a new set of Pods for use with resized Volumes. More info:  https://kubernetes.io/docs/concepts/storage/persistent-volumes/#expanding-persistent-volumes-claims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableOnlineVolumeExpansion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableOnlineVolumeExpansion enables online expansion of Persistent Volumes. You can only expand a PVC if its storage class's \"allowVolumeExpansion\" field is set to true. Additionally, Kubernetes feature \"ExpandInUsePersistentVolumes\" must be enabled in order to expand the volumes which are actively bound to Pods. Volumes can only be expanded and not reduced to a smaller size. See: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#resizing-an-in-use-persistentvolumeclaim \n If \"EnableOnlineVolumeExpansion\" is enabled for use within an environment that does not actually support online volume and file system expansion then the cluster will fallback to rolling upgrade procedure to create a new set of Pods for use with resized Volumes. More info:  https://kubernetes.io/docs/concepts/storage/persistent-volumes/#expanding-persistent-volumes-claims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableOnlineVolumeExpansion;

    public Boolean getEnableOnlineVolumeExpansion() {
        return enableOnlineVolumeExpansion;
    }

    public void setEnableOnlineVolumeExpansion(Boolean enableOnlineVolumeExpansion) {
        this.enableOnlineVolumeExpansion = enableOnlineVolumeExpansion;
    }

    /**
     * DEPRECATED - This option only exists for backwards compatibility and no longer restricts autoscaling to ephemeral services. EnablePreviewScaling enables autoscaling for stateful services and buckets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enablePreviewScaling")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - This option only exists for backwards compatibility and no longer restricts autoscaling to ephemeral services. EnablePreviewScaling enables autoscaling for stateful services and buckets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enablePreviewScaling;

    public Boolean getEnablePreviewScaling() {
        return enablePreviewScaling;
    }

    public void setEnablePreviewScaling(Boolean enablePreviewScaling) {
        this.enablePreviewScaling = enablePreviewScaling;
    }

    /**
     * EnvImagePrecedence gives precedence over the default container image name in `spec.Image` to an image name provided through Operator environment variables. For more info on using Operator environment variables: https://docs.couchbase.com/operator/current/reference-operator-configuration.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("envImagePrecedence")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnvImagePrecedence gives precedence over the default container image name in `spec.Image` to an image name provided through Operator environment variables. For more info on using Operator environment variables: https://docs.couchbase.com/operator/current/reference-operator-configuration.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean envImagePrecedence;

    public Boolean getEnvImagePrecedence() {
        return envImagePrecedence;
    }

    public void setEnvImagePrecedence(Boolean envImagePrecedence) {
        this.envImagePrecedence = envImagePrecedence;
    }

    /**
     * Hibernate is whether to hibernate the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hibernate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hibernate is whether to hibernate the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hibernate;

    public Boolean getHibernate() {
        return hibernate;
    }

    public void setHibernate(Boolean hibernate) {
        this.hibernate = hibernate;
    }

    public enum HibernationStrategy {

        @com.fasterxml.jackson.annotation.JsonProperty("Immediate")
        IMMEDIATE("Immediate");

        String value;

        HibernationStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * HibernationStrategy defines how to hibernate the cluster.  When Immediate the Operator will immediately delete all pods and take no further action until the hibernate field is set to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hibernationStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HibernationStrategy defines how to hibernate the cluster.  When Immediate the Operator will immediately delete all pods and take no further action until the hibernate field is set to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private HibernationStrategy hibernationStrategy;

    public HibernationStrategy getHibernationStrategy() {
        return hibernationStrategy;
    }

    public void setHibernationStrategy(HibernationStrategy hibernationStrategy) {
        this.hibernationStrategy = hibernationStrategy;
    }

    /**
     * Image is the container image name that will be used to launch Couchbase server instances.  Updating this field will cause an automatic upgrade of the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^(.*?(:\\d+)?/)?.*?/.*?(:.*?\\d+\\.\\d+\\.\\d+.*|@sha256:[0-9a-f]{64})$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the container image name that will be used to launch Couchbase server instances.  Updating this field will cause an automatic upgrade of the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Logging defines Operator logging options.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging defines Operator logging options.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Logging logging;

    public com.couchbase.v2.couchbaseclusterspec.Logging getLogging() {
        return logging;
    }

    public void setLogging(com.couchbase.v2.couchbaseclusterspec.Logging logging) {
        this.logging = logging;
    }

    /**
     * Monitoring defines any Operator managed integration into 3rd party monitoring infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitoring")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Monitoring defines any Operator managed integration into 3rd party monitoring infrastructure.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Monitoring monitoring;

    public com.couchbase.v2.couchbaseclusterspec.Monitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(com.couchbase.v2.couchbaseclusterspec.Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * Networking defines Couchbase cluster networking options such as network topology, TLS and DDNS settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networking")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Networking defines Couchbase cluster networking options such as network topology, TLS and DDNS settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Networking networking;

    public com.couchbase.v2.couchbaseclusterspec.Networking getNetworking() {
        return networking;
    }

    public void setNetworking(com.couchbase.v2.couchbaseclusterspec.Networking networking) {
        this.networking = networking;
    }

    /**
     * OnlineVolumeExpansionTimeoutInMins must be provided as a retry mechanism with a timeout in minutes for expanding volumes. This must only be provided, if EnableOnlineVolumeExpansion is set to true. Value must be between 0 and 30. If no value is provided, then it defaults to 10 minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineVolumeExpansionTimeoutInMins")
    @io.fabric8.generator.annotation.Max(30.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OnlineVolumeExpansionTimeoutInMins must be provided as a retry mechanism with a timeout in minutes for expanding volumes. This must only be provided, if EnableOnlineVolumeExpansion is set to true. Value must be between 0 and 30. If no value is provided, then it defaults to 10 minutes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long onlineVolumeExpansionTimeoutInMins;

    public Long getOnlineVolumeExpansionTimeoutInMins() {
        return onlineVolumeExpansionTimeoutInMins;
    }

    public void setOnlineVolumeExpansionTimeoutInMins(Long onlineVolumeExpansionTimeoutInMins) {
        this.onlineVolumeExpansionTimeoutInMins = onlineVolumeExpansionTimeoutInMins;
    }

    /**
     * Paused is to pause the control of the operator for the Couchbase cluster. This does not pause the cluster itself, instead stopping the operator from taking any action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paused")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Paused is to pause the control of the operator for the Couchbase cluster. This does not pause the cluster itself, instead stopping the operator from taking any action.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean paused;

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public enum Platform {

        @com.fasterxml.jackson.annotation.JsonProperty("aws")
        AWS("aws"), @com.fasterxml.jackson.annotation.JsonProperty("gce")
        GCE("gce"), @com.fasterxml.jackson.annotation.JsonProperty("azure")
        AZURE("azure");

        String value;

        Platform(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Platform gives a hint as to what platform we are running on and how to configure services.  This field must be one of "aws", "gke" or "azure".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Platform gives a hint as to what platform we are running on and how to configure services.  This field must be one of \"aws\", \"gke\" or \"azure\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Platform platform;

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public enum RecoveryPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("PrioritizeDataIntegrity")
        PRIORITIZEDATAINTEGRITY("PrioritizeDataIntegrity"), @com.fasterxml.jackson.annotation.JsonProperty("PrioritizeUptime")
        PRIORITIZEUPTIME("PrioritizeUptime");

        String value;

        RecoveryPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * RecoveryPolicy controls how aggressive the Operator is when recovering cluster topology.  When PrioritizeDataIntegrity, the Operator will delegate failover exclusively to Couchbase server, relying on it to only allow recovery when safe to do so.  When PrioritizeUptime, the Operator will wait for a period after the expected auto-failover of the cluster, before forcefully failing-over the pods. This may cause data loss, and is only expected to be used on clusters with ephemeral data, where the loss of the pod means that the data is known to be unrecoverable. This field must be either "PrioritizeDataIntegrity" or "PrioritizeUptime", defaulting to "PrioritizeDataIntegrity".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RecoveryPolicy controls how aggressive the Operator is when recovering cluster topology.  When PrioritizeDataIntegrity, the Operator will delegate failover exclusively to Couchbase server, relying on it to only allow recovery when safe to do so.  When PrioritizeUptime, the Operator will wait for a period after the expected auto-failover of the cluster, before forcefully failing-over the pods. This may cause data loss, and is only expected to be used on clusters with ephemeral data, where the loss of the pod means that the data is known to be unrecoverable. This field must be either \"PrioritizeDataIntegrity\" or \"PrioritizeUptime\", defaulting to \"PrioritizeDataIntegrity\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private RecoveryPolicy recoveryPolicy;

    public RecoveryPolicy getRecoveryPolicy() {
        return recoveryPolicy;
    }

    public void setRecoveryPolicy(RecoveryPolicy recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
    }

    /**
     * When `spec.upgradeStrategy` is set to `RollingUpgrade` it will, by default, upgrade one pod at a time.  If this field is specified then that number can be increased.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rollingUpgrade")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When `spec.upgradeStrategy` is set to `RollingUpgrade` it will, by default, upgrade one pod at a time.  If this field is specified then that number can be increased.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.RollingUpgrade rollingUpgrade;

    public com.couchbase.v2.couchbaseclusterspec.RollingUpgrade getRollingUpgrade() {
        return rollingUpgrade;
    }

    public void setRollingUpgrade(com.couchbase.v2.couchbaseclusterspec.RollingUpgrade rollingUpgrade) {
        this.rollingUpgrade = rollingUpgrade;
    }

    /**
     * Security defines Couchbase cluster security options such as the administrator account username and password, and user RBAC settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("security")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Security defines Couchbase cluster security options such as the administrator account username and password, and user RBAC settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Security security;

    public com.couchbase.v2.couchbaseclusterspec.Security getSecurity() {
        return security;
    }

    public void setSecurity(com.couchbase.v2.couchbaseclusterspec.Security security) {
        this.security = security;
    }

    /**
     * DEPRECATED - by spec.security.securityContext SecurityContext allows the configuration of the security context for all Couchbase server pods.  When using persistent volumes you may need to set the fsGroup field in order to write to the volume.  For non-root clusters you must also set runAsUser to 1000, corresponding to the Couchbase user in official container images.  More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by spec.security.securityContext SecurityContext allows the configuration of the security context for all Couchbase server pods.  When using persistent volumes you may need to set the fsGroup field in order to write to the volume.  For non-root clusters you must also set runAsUser to 1000, corresponding to the Couchbase user in official container images.  More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.SecurityContext securityContext;

    public com.couchbase.v2.couchbaseclusterspec.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(com.couchbase.v2.couchbaseclusterspec.SecurityContext securityContext) {
        this.securityContext = securityContext;
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

    /**
     * Servers defines server classes for the Operator to provision and manage. A server class defines what services are running and how many members make up that class.  Specifying multiple server classes allows the Operator to provision clusters with Multi-Dimensional Scaling (MDS).  At least one server class must be defined, and at least one server class must be running the data service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Servers defines server classes for the Operator to provision and manage. A server class defines what services are running and how many members make up that class.  Specifying multiple server classes allows the Operator to provision clusters with Multi-Dimensional Scaling (MDS).  At least one server class must be defined, and at least one server class must be running the data service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.Servers> servers;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.Servers> getServers() {
        return servers;
    }

    public void setServers(java.util.List<com.couchbase.v2.couchbaseclusterspec.Servers> servers) {
        this.servers = servers;
    }

    /**
     * SoftwareUpdateNotifications enables software update notifications in the UI. When enabled, the UI will alert when a Couchbase server upgrade is available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateNotifications")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SoftwareUpdateNotifications enables software update notifications in the UI. When enabled, the UI will alert when a Couchbase server upgrade is available.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean softwareUpdateNotifications;

    public Boolean getSoftwareUpdateNotifications() {
        return softwareUpdateNotifications;
    }

    public void setSoftwareUpdateNotifications(Boolean softwareUpdateNotifications) {
        this.softwareUpdateNotifications = softwareUpdateNotifications;
    }

    public enum UpgradeProcess {

        @com.fasterxml.jackson.annotation.JsonProperty("SwapRebalance")
        SWAPREBALANCE("SwapRebalance"), @com.fasterxml.jackson.annotation.JsonProperty("DeltaRecovery")
        DELTARECOVERY("DeltaRecovery");

        String value;

        UpgradeProcess(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * UpgradeProcess defines the process that will be used when performing a couchbase cluster upgrade. When SwapRebalance is requested (default), pods will be upgraded using either a RollingUpgrade or ImmediateUpgrade (determined by UpgradeStrategy). When DeltaRecovery is requested, the operator will perform an in-place upgrade on a best effort basis. DeltaRecovery cannot be used if the UpgradeStrategy is set to ImmediateUpgrade.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeProcess")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UpgradeProcess defines the process that will be used when performing a couchbase cluster upgrade. When SwapRebalance is requested (default), pods will be upgraded using either a RollingUpgrade or ImmediateUpgrade (determined by UpgradeStrategy). When DeltaRecovery is requested, the operator will perform an in-place upgrade on a best effort basis. DeltaRecovery cannot be used if the UpgradeStrategy is set to ImmediateUpgrade.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private UpgradeProcess upgradeProcess;

    public UpgradeProcess getUpgradeProcess() {
        return upgradeProcess;
    }

    public void setUpgradeProcess(UpgradeProcess upgradeProcess) {
        this.upgradeProcess = upgradeProcess;
    }

    public enum UpgradeStrategy {

        @com.fasterxml.jackson.annotation.JsonProperty("RollingUpgrade")
        ROLLINGUPGRADE("RollingUpgrade"), @com.fasterxml.jackson.annotation.JsonProperty("ImmediateUpgrade")
        IMMEDIATEUPGRADE("ImmediateUpgrade");

        String value;

        UpgradeStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * UpgradeStrategy controls how aggressive the Operator is when performing a cluster upgrade.  When a rolling upgrade is requested, pods are upgraded one at a time.  This strategy is slower, however less disruptive.  When an immediate upgrade strategy is requested, all pods are upgraded at the same time.  This strategy is faster, but more disruptive.  This field must be either "RollingUpgrade" or "ImmediateUpgrade", defaulting to "RollingUpgrade".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UpgradeStrategy controls how aggressive the Operator is when performing a cluster upgrade.  When a rolling upgrade is requested, pods are upgraded one at a time.  This strategy is slower, however less disruptive.  When an immediate upgrade strategy is requested, all pods are upgraded at the same time.  This strategy is faster, but more disruptive.  This field must be either \"RollingUpgrade\" or \"ImmediateUpgrade\", defaulting to \"RollingUpgrade\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private UpgradeStrategy upgradeStrategy;

    public UpgradeStrategy getUpgradeStrategy() {
        return upgradeStrategy;
    }

    public void setUpgradeStrategy(UpgradeStrategy upgradeStrategy) {
        this.upgradeStrategy = upgradeStrategy;
    }

    /**
     * VolumeClaimTemplates define the desired characteristics of a volume that can be requested/claimed by a pod, for example the storage class to use and the volume size.  Volume claim templates are referred to by name by server class volume mount configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeClaimTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeClaimTemplates define the desired characteristics of a volume that can be requested/claimed by a pod, for example the storage class to use and the volume size.  Volume claim templates are referred to by name by server class volume mount configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.VolumeClaimTemplates> volumeClaimTemplates;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.VolumeClaimTemplates> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(java.util.List<com.couchbase.v2.couchbaseclusterspec.VolumeClaimTemplates> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    /**
     * XDCR defines whether the Operator should manage XDCR, remote clusters and how to lookup replication resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xdcr")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("XDCR defines whether the Operator should manage XDCR, remote clusters and how to lookup replication resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.Xdcr xdcr;

    public com.couchbase.v2.couchbaseclusterspec.Xdcr getXdcr() {
        return xdcr;
    }

    public void setXdcr(com.couchbase.v2.couchbaseclusterspec.Xdcr xdcr) {
        this.xdcr = xdcr;
    }
}


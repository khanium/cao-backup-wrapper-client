package com.couchbase.v2.couchbaseclusterspec.servers.pod;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"activeDeadlineSeconds","affinity","automountServiceAccountToken","dnsConfig","dnsPolicy","enableServiceLinks","hostIPC","hostNetwork","hostPID","hostUsers","imagePullSecrets","nodeName","nodeSelector","os","overhead","preemptionPolicy","priority","priorityClassName","resourceClaims","runtimeClassName","schedulerName","schedulingGates","serviceAccount","serviceAccountName","setHostnameAsFQDN","shareProcessNamespace","terminationGracePeriodSeconds","tolerations","topologySpreadConstraints"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeDeadlineSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long activeDeadlineSeconds;

    public Long getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * If specified, the pod's scheduling constraints
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the pod's scheduling constraints")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Affinity affinity;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("automountServiceAccountToken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean automountServiceAccountToken;

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    /**
     * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.DnsConfig dnsConfig;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dnsPolicy;

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableServiceLinks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableServiceLinks;

    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    /**
     * Use the host's ipc namespace. Optional: Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostIPC")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the host's ipc namespace. Optional: Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostIPC;

    public Boolean getHostIPC() {
        return hostIPC;
    }

    public void setHostIPC(Boolean hostIPC) {
        this.hostIPC = hostIPC;
    }

    /**
     * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostNetwork")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostNetwork;

    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    /**
     * Use the host's pid namespace. Optional: Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostPID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the host's pid namespace. Optional: Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostPID;

    public Boolean getHostPID() {
        return hostPID;
    }

    public void setHostPID(Boolean hostPID) {
        this.hostPID = hostPID;
    }

    /**
     * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostUsers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostUsers;

    public Boolean getHostUsers() {
        return hostUsers;
    }

    public void setHostUsers(Boolean hostUsers) {
        this.hostUsers = hostUsers;
    }

    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.ImagePullSecrets> imagePullSecrets;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.ImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.ImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> nodeSelector;

    public java.util.Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set.
     *  If the OS field is set to linux, the following fields must be unset: -securityContext.windowsOptions
     *  If the OS field is set to windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.hostUsers - spec.securityContext.seLinuxOptions - spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy - spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser - spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups - spec.containers[*].securityContext.seLinuxOptions - spec.containers[*].securityContext.seccompProfile - spec.containers[*].securityContext.capabilities - spec.containers[*].securityContext.readOnlyRootFilesystem - spec.containers[*].securityContext.privileged - spec.containers[*].securityContext.allowPrivilegeEscalation - spec.containers[*].securityContext.procMount - spec.containers[*].securityContext.runAsUser - spec.containers[*].securityContext.runAsGroup
     */
    @com.fasterxml.jackson.annotation.JsonProperty("os")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set. \n If the OS field is set to linux, the following fields must be unset: -securityContext.windowsOptions \n If the OS field is set to windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.hostUsers - spec.securityContext.seLinuxOptions - spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy - spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser - spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups - spec.containers[*].securityContext.seLinuxOptions - spec.containers[*].securityContext.seccompProfile - spec.containers[*].securityContext.capabilities - spec.containers[*].securityContext.readOnlyRootFilesystem - spec.containers[*].securityContext.privileged - spec.containers[*].securityContext.allowPrivilegeEscalation - spec.containers[*].securityContext.procMount - spec.containers[*].securityContext.runAsUser - spec.containers[*].securityContext.runAsGroup")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Os os;

    public com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Os getOs() {
        return os;
    }

    public void setOs(com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Os os) {
        this.os = os;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overhead")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, io.fabric8.kubernetes.api.model.IntOrString> overhead;

    public java.util.Map<String, io.fabric8.kubernetes.api.model.IntOrString> getOverhead() {
        return overhead;
    }

    public void setOverhead(java.util.Map<String, io.fabric8.kubernetes.api.model.IntOrString> overhead) {
        this.overhead = overhead;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preemptionPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String preemptionPolicy;

    public String getPreemptionPolicy() {
        return preemptionPolicy;
    }

    public void setPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
    }

    /**
     * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer priority;

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String priorityClassName;

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name.
     *  This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     *  This field is immutable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceClaims")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name. \n This is an alpha field and requires enabling the DynamicResourceAllocation feature gate. \n This field is immutable.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.ResourceClaims> resourceClaims;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.ResourceClaims> getResourceClaims() {
        return resourceClaims;
    }

    public void setResourceClaims(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.ResourceClaims> resourceClaims) {
        this.resourceClaims = resourceClaims;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeClassName;

    public String getRuntimeClassName() {
        return runtimeClassName;
    }

    public void setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    /**
     * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulerName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedulerName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    /**
     * SchedulingGates is an opaque list of values that if specified will block scheduling the pod. If schedulingGates is not empty, the pod will stay in the SchedulingGated state and the scheduler will not attempt to schedule the pod.
     *  SchedulingGates can only be set at pod creation time, and be removed only afterwards.
     *  This is a beta feature enabled by the PodSchedulingReadiness feature gate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingGates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SchedulingGates is an opaque list of values that if specified will block scheduling the pod. If schedulingGates is not empty, the pod will stay in the SchedulingGated state and the scheduler will not attempt to schedule the pod. \n SchedulingGates can only be set at pod creation time, and be removed only afterwards. \n This is a beta feature enabled by the PodSchedulingReadiness feature gate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.SchedulingGates> schedulingGates;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.SchedulingGates> getSchedulingGates() {
        return schedulingGates;
    }

    public void setSchedulingGates(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.SchedulingGates> schedulingGates) {
        this.schedulingGates = schedulingGates;
    }

    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccount;

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccountName;

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("setHostnameAsFQDN")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\\\SYSTEM\\\\CurrentControlSet\\\\Services\\\\Tcpip\\\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean setHostnameAsFQDN;

    public Boolean getSetHostnameAsFQDN() {
        return setHostnameAsFQDN;
    }

    public void setSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
        this.setHostnameAsFQDN = setHostnameAsFQDN;
    }

    /**
     * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shareProcessNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean shareProcessNamespace;

    public Boolean getShareProcessNamespace() {
        return shareProcessNamespace;
    }

    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationGracePeriodSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long terminationGracePeriodSeconds;

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * If specified, the pod's tolerations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the pod's tolerations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Tolerations> tolerations;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topologySpreadConstraints")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.TopologySpreadConstraints> topologySpreadConstraints;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.TopologySpreadConstraints> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(java.util.List<com.couchbase.v2.couchbaseclusterspec.servers.pod.spec.TopologySpreadConstraints> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
    }
}


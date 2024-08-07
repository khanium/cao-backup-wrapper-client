package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"addressFamily","adminConsoleServiceTemplate","adminConsoleServiceType","adminConsoleServices","cloudNativeGateway","disableUIOverHTTP","disableUIOverHTTPS","dns","exposeAdminConsole","exposedFeatureServiceTemplate","exposedFeatureServiceType","exposedFeatureTrafficPolicy","exposedFeatures","loadBalancerSourceRanges","networkPlatform","serviceAnnotations","tls","waitForAddressReachable","waitForAddressReachableDelay"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Networking implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum AddressFamily {

        @com.fasterxml.jackson.annotation.JsonProperty("IPv4")
        IPV4("IPv4"), @com.fasterxml.jackson.annotation.JsonProperty("IPv6")
        IPV6("IPv6");

        String value;

        AddressFamily(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * AddressFamily allows the manual selection of the address family to use. When this field is not set, Couchbase server will default to using IPv4 for internal communication and also support IPv6 on dual stack systems. Setting this field to either IPv4 or IPv6 will force Couchbase to use the selected protocol for internal communication, and also disable all other protocols to provide added security and simplicty when defining firewall rules.  Disabling of address families is only supported in Couchbase Server 7.0.2+.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addressFamily")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AddressFamily allows the manual selection of the address family to use. When this field is not set, Couchbase server will default to using IPv4 for internal communication and also support IPv6 on dual stack systems. Setting this field to either IPv4 or IPv6 will force Couchbase to use the selected protocol for internal communication, and also disable all other protocols to provide added security and simplicty when defining firewall rules.  Disabling of address families is only supported in Couchbase Server 7.0.2+.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private AddressFamily addressFamily;

    public AddressFamily getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * AdminConsoleServiceTemplate provides a template used by the Operator to create and manage the admin console service.  This allows services to be annotated, the service type defined and any other options that Kubernetes provides.  When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. The Operator reserves the right to modify or replace any field.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#service-v1-core
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminConsoleServiceTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AdminConsoleServiceTemplate provides a template used by the Operator to create and manage the admin console service.  This allows services to be annotated, the service type defined and any other options that Kubernetes provides.  When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. The Operator reserves the right to modify or replace any field.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#service-v1-core")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.AdminConsoleServiceTemplate adminConsoleServiceTemplate;

    public com.couchbase.v2.couchbaseclusterspec.networking.AdminConsoleServiceTemplate getAdminConsoleServiceTemplate() {
        return adminConsoleServiceTemplate;
    }

    public void setAdminConsoleServiceTemplate(com.couchbase.v2.couchbaseclusterspec.networking.AdminConsoleServiceTemplate adminConsoleServiceTemplate) {
        this.adminConsoleServiceTemplate = adminConsoleServiceTemplate;
    }

    public enum AdminConsoleServiceType {

        @com.fasterxml.jackson.annotation.JsonProperty("NodePort")
        NODEPORT("NodePort"), @com.fasterxml.jackson.annotation.JsonProperty("LoadBalancer")
        LOADBALANCER("LoadBalancer");

        String value;

        AdminConsoleServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * DEPRECATED - by adminConsoleServiceTemplate. AdminConsoleServiceType defines whether to create a node port or load balancer service. When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. This field must be one of "NodePort" or "LoadBalancer", defaulting to "NodePort".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminConsoleServiceType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by adminConsoleServiceTemplate. AdminConsoleServiceType defines whether to create a node port or load balancer service. When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. This field must be one of \"NodePort\" or \"LoadBalancer\", defaulting to \"NodePort\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private AdminConsoleServiceType adminConsoleServiceType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"NodePort\"", AdminConsoleServiceType.class);

    public AdminConsoleServiceType getAdminConsoleServiceType() {
        return adminConsoleServiceType;
    }

    public void setAdminConsoleServiceType(AdminConsoleServiceType adminConsoleServiceType) {
        this.adminConsoleServiceType = adminConsoleServiceType;
    }

    public enum AdminConsoleServices {

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

        AdminConsoleServices(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * DEPRECATED - not required by Couchbase Server. AdminConsoleServices is a selector to choose specific services to expose via the admin console. This field may contain any of "data", "index", "query", "search", "eventing" and "analytics".  Each service may only be included once.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminConsoleServices")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - not required by Couchbase Server. AdminConsoleServices is a selector to choose specific services to expose via the admin console. This field may contain any of \"data\", \"index\", \"query\", \"search\", \"eventing\" and \"analytics\".  Each service may only be included once.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<AdminConsoleServices> adminConsoleServices;

    public java.util.List<AdminConsoleServices> getAdminConsoleServices() {
        return adminConsoleServices;
    }

    public void setAdminConsoleServices(java.util.List<AdminConsoleServices> adminConsoleServices) {
        this.adminConsoleServices = adminConsoleServices;
    }

    /**
     * CloudNativeGateway is used to provision a gRPC gateway proxying a Couchbase cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudNativeGateway")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CloudNativeGateway is used to provision a gRPC gateway proxying a Couchbase cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.CloudNativeGateway cloudNativeGateway;

    public com.couchbase.v2.couchbaseclusterspec.networking.CloudNativeGateway getCloudNativeGateway() {
        return cloudNativeGateway;
    }

    public void setCloudNativeGateway(com.couchbase.v2.couchbaseclusterspec.networking.CloudNativeGateway cloudNativeGateway) {
        this.cloudNativeGateway = cloudNativeGateway;
    }

    /**
     * DisableUIOverHTTP is used to explicitly enable and disable UI access over the HTTP protocol.  If not specified, this field defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableUIOverHTTP")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DisableUIOverHTTP is used to explicitly enable and disable UI access over the HTTP protocol.  If not specified, this field defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableUIOverHTTP;

    public Boolean getDisableUIOverHTTP() {
        return disableUIOverHTTP;
    }

    public void setDisableUIOverHTTP(Boolean disableUIOverHTTP) {
        this.disableUIOverHTTP = disableUIOverHTTP;
    }

    /**
     * DisableUIOverHTTPS is used to explicitly enable and disable UI access over the HTTPS protocol.  If not specified, this field defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableUIOverHTTPS")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DisableUIOverHTTPS is used to explicitly enable and disable UI access over the HTTPS protocol.  If not specified, this field defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableUIOverHTTPS;

    public Boolean getDisableUIOverHTTPS() {
        return disableUIOverHTTPS;
    }

    public void setDisableUIOverHTTPS(Boolean disableUIOverHTTPS) {
        this.disableUIOverHTTPS = disableUIOverHTTPS;
    }

    /**
     * DNS defines information required for Dynamic DNS support.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dns")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DNS defines information required for Dynamic DNS support.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.Dns dns;

    public com.couchbase.v2.couchbaseclusterspec.networking.Dns getDns() {
        return dns;
    }

    public void setDns(com.couchbase.v2.couchbaseclusterspec.networking.Dns dns) {
        this.dns = dns;
    }

    /**
     * ExposeAdminConsole creates a service referencing the admin console. The service is configured by the adminConsoleServiceTemplate field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposeAdminConsole")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExposeAdminConsole creates a service referencing the admin console. The service is configured by the adminConsoleServiceTemplate field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean exposeAdminConsole;

    public Boolean getExposeAdminConsole() {
        return exposeAdminConsole;
    }

    public void setExposeAdminConsole(Boolean exposeAdminConsole) {
        this.exposeAdminConsole = exposeAdminConsole;
    }

    /**
     * ExposedFeatureServiceTemplate provides a template used by the Operator to create and manage per-pod services.  This allows services to be annotated, the service type defined and any other options that Kubernetes provides.  When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. The Operator reserves the right to modify or replace any field.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#service-v1-core
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposedFeatureServiceTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExposedFeatureServiceTemplate provides a template used by the Operator to create and manage per-pod services.  This allows services to be annotated, the service type defined and any other options that Kubernetes provides.  When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. The Operator reserves the right to modify or replace any field.  More info: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.28/#service-v1-core")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.ExposedFeatureServiceTemplate exposedFeatureServiceTemplate;

    public com.couchbase.v2.couchbaseclusterspec.networking.ExposedFeatureServiceTemplate getExposedFeatureServiceTemplate() {
        return exposedFeatureServiceTemplate;
    }

    public void setExposedFeatureServiceTemplate(com.couchbase.v2.couchbaseclusterspec.networking.ExposedFeatureServiceTemplate exposedFeatureServiceTemplate) {
        this.exposedFeatureServiceTemplate = exposedFeatureServiceTemplate;
    }

    public enum ExposedFeatureServiceType {

        @com.fasterxml.jackson.annotation.JsonProperty("NodePort")
        NODEPORT("NodePort"), @com.fasterxml.jackson.annotation.JsonProperty("LoadBalancer")
        LOADBALANCER("LoadBalancer");

        String value;

        ExposedFeatureServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * DEPRECATED - by exposedFeatureServiceTemplate. ExposedFeatureServiceType defines whether to create a node port or load balancer service. When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. This field must be one of "NodePort" or "LoadBalancer", defaulting to "NodePort".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposedFeatureServiceType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by exposedFeatureServiceTemplate. ExposedFeatureServiceType defines whether to create a node port or load balancer service. When using a LoadBalancer service type, TLS and dynamic DNS must also be enabled. This field must be one of \"NodePort\" or \"LoadBalancer\", defaulting to \"NodePort\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ExposedFeatureServiceType exposedFeatureServiceType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"NodePort\"", ExposedFeatureServiceType.class);

    public ExposedFeatureServiceType getExposedFeatureServiceType() {
        return exposedFeatureServiceType;
    }

    public void setExposedFeatureServiceType(ExposedFeatureServiceType exposedFeatureServiceType) {
        this.exposedFeatureServiceType = exposedFeatureServiceType;
    }

    public enum ExposedFeatureTrafficPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("Cluster")
        CLUSTER("Cluster"), @com.fasterxml.jackson.annotation.JsonProperty("Local")
        LOCAL("Local");

        String value;

        ExposedFeatureTrafficPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * DEPRECATED  - by exposedFeatureServiceTemplate. ExposedFeatureTrafficPolicy defines how packets should be routed from a load balancer service to a Couchbase pod.  When local, traffic is routed directly to the pod.  When cluster, traffic is routed to any node, then forwarded on.  While cluster routing may be slower, there are some situations where it is required for connectivity.  This field must be either "Cluster" or "Local", defaulting to "Local",
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposedFeatureTrafficPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED  - by exposedFeatureServiceTemplate. ExposedFeatureTrafficPolicy defines how packets should be routed from a load balancer service to a Couchbase pod.  When local, traffic is routed directly to the pod.  When cluster, traffic is routed to any node, then forwarded on.  While cluster routing may be slower, there are some situations where it is required for connectivity.  This field must be either \"Cluster\" or \"Local\", defaulting to \"Local\",")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ExposedFeatureTrafficPolicy exposedFeatureTrafficPolicy;

    public ExposedFeatureTrafficPolicy getExposedFeatureTrafficPolicy() {
        return exposedFeatureTrafficPolicy;
    }

    public void setExposedFeatureTrafficPolicy(ExposedFeatureTrafficPolicy exposedFeatureTrafficPolicy) {
        this.exposedFeatureTrafficPolicy = exposedFeatureTrafficPolicy;
    }

    public enum ExposedFeatures {

        @com.fasterxml.jackson.annotation.JsonProperty("admin")
        ADMIN("admin"), @com.fasterxml.jackson.annotation.JsonProperty("xdcr")
        XDCR("xdcr"), @com.fasterxml.jackson.annotation.JsonProperty("client")
        CLIENT("client");

        String value;

        ExposedFeatures(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * ExposedFeatures is a list of Couchbase features to expose when using a networking model that exposes the Couchbase cluster externally to Kubernetes.  This field also triggers the creation of per-pod services used by clients to connect to the Couchbase cluster.  When admin, only the administrator port is exposed, allowing remote administration.  When xdcr, only the services required for remote replication are exposed. The xdcr feature is only required when the cluster is the destination of an XDCR replication.  When client, all services are exposed as required for client SDK operation. This field may contain any of "admin", "xdcr" and "client".  Each feature may only be included once.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposedFeatures")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExposedFeatures is a list of Couchbase features to expose when using a networking model that exposes the Couchbase cluster externally to Kubernetes.  This field also triggers the creation of per-pod services used by clients to connect to the Couchbase cluster.  When admin, only the administrator port is exposed, allowing remote administration.  When xdcr, only the services required for remote replication are exposed. The xdcr feature is only required when the cluster is the destination of an XDCR replication.  When client, all services are exposed as required for client SDK operation. This field may contain any of \"admin\", \"xdcr\" and \"client\".  Each feature may only be included once.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<ExposedFeatures> exposedFeatures;

    public java.util.List<ExposedFeatures> getExposedFeatures() {
        return exposedFeatures;
    }

    public void setExposedFeatures(java.util.List<ExposedFeatures> exposedFeatures) {
        this.exposedFeatures = exposedFeatures;
    }

    /**
     * DEPRECATED - by adminConsoleServiceTemplate and exposedFeatureServiceTemplate. LoadBalancerSourceRanges applies only when an exposed service is of type LoadBalancer and limits the source IP ranges that are allowed to use the service.  Items must use IPv4 class-less interdomain routing (CIDR) notation e.g. 10.0.0.0/16.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerSourceRanges")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by adminConsoleServiceTemplate and exposedFeatureServiceTemplate. LoadBalancerSourceRanges applies only when an exposed service is of type LoadBalancer and limits the source IP ranges that are allowed to use the service.  Items must use IPv4 class-less interdomain routing (CIDR) notation e.g. 10.0.0.0/16.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> loadBalancerSourceRanges;

    public java.util.List<String> getLoadBalancerSourceRanges() {
        return loadBalancerSourceRanges;
    }

    public void setLoadBalancerSourceRanges(java.util.List<String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    }

    public enum NetworkPlatform {

        @com.fasterxml.jackson.annotation.JsonProperty("Istio")
        ISTIO("Istio");

        String value;

        NetworkPlatform(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * NetworkPlatform is used to enable support for various networking technologies.  This field must be one of "Istio".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkPlatform")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NetworkPlatform is used to enable support for various networking technologies.  This field must be one of \"Istio\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private NetworkPlatform networkPlatform;

    public NetworkPlatform getNetworkPlatform() {
        return networkPlatform;
    }

    public void setNetworkPlatform(NetworkPlatform networkPlatform) {
        this.networkPlatform = networkPlatform;
    }

    /**
     * DEPRECATED - by adminConsoleServiceTemplate and exposedFeatureServiceTemplate. ServiceAnnotations allows services to be annotated with custom labels. Operator annotations are merged on top of these so have precedence as they are required for correct operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAnnotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by adminConsoleServiceTemplate and exposedFeatureServiceTemplate. ServiceAnnotations allows services to be annotated with custom labels. Operator annotations are merged on top of these so have precedence as they are required for correct operation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> serviceAnnotations;

    public java.util.Map<String, String> getServiceAnnotations() {
        return serviceAnnotations;
    }

    public void setServiceAnnotations(java.util.Map<String, String> serviceAnnotations) {
        this.serviceAnnotations = serviceAnnotations;
    }

    /**
     * TLS defines the TLS configuration for the cluster including server and client certificate configuration, and TLS security policies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS defines the TLS configuration for the cluster including server and client certificate configuration, and TLS security policies.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.Tls tls;

    public com.couchbase.v2.couchbaseclusterspec.networking.Tls getTls() {
        return tls;
    }

    public void setTls(com.couchbase.v2.couchbaseclusterspec.networking.Tls tls) {
        this.tls = tls;
    }

    /**
     * WaitForAddressReachable is used to set the timeout between when polling of external addresses is started, and when it is deemed a failure.  Polling of DNS name availability inherently dangerous due to negative caching, so prefer the use of an initial `waitForAddressReachableDelay` to allow propagation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("waitForAddressReachable")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WaitForAddressReachable is used to set the timeout between when polling of external addresses is started, and when it is deemed a failure.  Polling of DNS name availability inherently dangerous due to negative caching, so prefer the use of an initial `waitForAddressReachableDelay` to allow propagation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String waitForAddressReachable = "10m";

    public String getWaitForAddressReachable() {
        return waitForAddressReachable;
    }

    public void setWaitForAddressReachable(String waitForAddressReachable) {
        this.waitForAddressReachable = waitForAddressReachable;
    }

    /**
     * WaitForAddressReachableDelay is used to defer operator checks that ensure external addresses are reachable before new nodes are balanced in to the cluster.  This prevents negative DNS caching while waiting for external-DDNS controllers to propagate addresses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("waitForAddressReachableDelay")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WaitForAddressReachableDelay is used to defer operator checks that ensure external addresses are reachable before new nodes are balanced in to the cluster.  This prevents negative DNS caching while waiting for external-DDNS controllers to propagate addresses.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String waitForAddressReachableDelay = "2m";

    public String getWaitForAddressReachableDelay() {
        return waitForAddressReachableDelay;
    }

    public void setWaitForAddressReachableDelay(String waitForAddressReachableDelay) {
        this.waitForAddressReachableDelay = waitForAddressReachableDelay;
    }
}


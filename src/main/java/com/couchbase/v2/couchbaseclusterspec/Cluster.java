package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"analyticsServiceMemoryQuota","autoCompaction","autoFailoverMaxCount","autoFailoverOnDataDiskIssues","autoFailoverOnDataDiskIssuesTimePeriod","autoFailoverServerGroup","autoFailoverTimeout","clusterName","data","dataServiceMemoryQuota","eventingServiceMemoryQuota","indexServiceMemoryQuota","indexStorageSetting","indexer","query","queryServiceMemoryQuota","searchServiceMemoryQuota"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Cluster implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AnalyticsServiceMemQuota is the amount of memory that should be allocated to the analytics service. This value is per-pod, and only applicable to pods belonging to server classes running the analytics service.  This field must be a quantity greater than or equal to 1Gi.  This field defaults to 1Gi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("analyticsServiceMemoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AnalyticsServiceMemQuota is the amount of memory that should be allocated to the analytics service. This value is per-pod, and only applicable to pods belonging to server classes running the analytics service.  This field must be a quantity greater than or equal to 1Gi.  This field defaults to 1Gi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString analyticsServiceMemoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("1Gi");

    public io.fabric8.kubernetes.api.model.IntOrString getAnalyticsServiceMemoryQuota() {
        return analyticsServiceMemoryQuota;
    }

    public void setAnalyticsServiceMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString analyticsServiceMemoryQuota) {
        this.analyticsServiceMemoryQuota = analyticsServiceMemoryQuota;
    }

    /**
     * AutoCompaction allows the configuration of auto-compaction, including on what conditions disk space is reclaimed and when it is allowed to run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoCompaction")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoCompaction allows the configuration of auto-compaction, including on what conditions disk space is reclaimed and when it is allowed to run.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.AutoCompaction autoCompaction = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbaseclusterspec.cluster.AutoCompaction.class);

    public com.couchbase.v2.couchbaseclusterspec.cluster.AutoCompaction getAutoCompaction() {
        return autoCompaction;
    }

    public void setAutoCompaction(com.couchbase.v2.couchbaseclusterspec.cluster.AutoCompaction autoCompaction) {
        this.autoCompaction = autoCompaction;
    }

    /**
     * AutoFailoverMaxCount is the maximum number of automatic failovers Couchbase server will allow before not allowing any more.  This field must be between 1-3 for server versions prior to 7.1.0 default is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverMaxCount")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoFailoverMaxCount is the maximum number of automatic failovers Couchbase server will allow before not allowing any more.  This field must be between 1-3 for server versions prior to 7.1.0 default is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autoFailoverMaxCount = 1L;

    public Long getAutoFailoverMaxCount() {
        return autoFailoverMaxCount;
    }

    public void setAutoFailoverMaxCount(Long autoFailoverMaxCount) {
        this.autoFailoverMaxCount = autoFailoverMaxCount;
    }

    /**
     * AutoFailoverOnDataDiskIssues defines whether Couchbase server should failover a pod if a disk issue was detected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverOnDataDiskIssues")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoFailoverOnDataDiskIssues defines whether Couchbase server should failover a pod if a disk issue was detected.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean autoFailoverOnDataDiskIssues;

    public Boolean getAutoFailoverOnDataDiskIssues() {
        return autoFailoverOnDataDiskIssues;
    }

    public void setAutoFailoverOnDataDiskIssues(Boolean autoFailoverOnDataDiskIssues) {
        this.autoFailoverOnDataDiskIssues = autoFailoverOnDataDiskIssues;
    }

    /**
     * AutoFailoverOnDataDiskIssuesTimePeriod defines how long to wait for transient errors before failing over a faulty disk.  This field must be in the range 5-3600s, defaulting to 120s.  More info:  https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverOnDataDiskIssuesTimePeriod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoFailoverOnDataDiskIssuesTimePeriod defines how long to wait for transient errors before failing over a faulty disk.  This field must be in the range 5-3600s, defaulting to 120s.  More info:  https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String autoFailoverOnDataDiskIssuesTimePeriod = "120s";

    public String getAutoFailoverOnDataDiskIssuesTimePeriod() {
        return autoFailoverOnDataDiskIssuesTimePeriod;
    }

    public void setAutoFailoverOnDataDiskIssuesTimePeriod(String autoFailoverOnDataDiskIssuesTimePeriod) {
        this.autoFailoverOnDataDiskIssuesTimePeriod = autoFailoverOnDataDiskIssuesTimePeriod;
    }

    /**
     * AutoFailoverServerGroup whether to enable failing over a server group. This field is ignored in server versions 7.1+ as it has been removed from the Couchbase API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverServerGroup")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoFailoverServerGroup whether to enable failing over a server group. This field is ignored in server versions 7.1+ as it has been removed from the Couchbase API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean autoFailoverServerGroup;

    public Boolean getAutoFailoverServerGroup() {
        return autoFailoverServerGroup;
    }

    public void setAutoFailoverServerGroup(Boolean autoFailoverServerGroup) {
        this.autoFailoverServerGroup = autoFailoverServerGroup;
    }

    /**
     * AutoFailoverTimeout defines how long Couchbase server will wait between a pod being witnessed as down, until when it will failover the pod.  Couchbase server will only failover pods if it deems it safe to do so, and not result in data loss.  This field must be in the range 5-3600s, defaulting to 120s. More info:  https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoFailoverTimeout defines how long Couchbase server will wait between a pod being witnessed as down, until when it will failover the pod.  Couchbase server will only failover pods if it deems it safe to do so, and not result in data loss.  This field must be in the range 5-3600s, defaulting to 120s. More info:  https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String autoFailoverTimeout = "120s";

    public String getAutoFailoverTimeout() {
        return autoFailoverTimeout;
    }

    public void setAutoFailoverTimeout(String autoFailoverTimeout) {
        this.autoFailoverTimeout = autoFailoverTimeout;
    }

    /**
     * ClusterName defines the name of the cluster, as displayed in the Couchbase UI. By default, the cluster name is that specified in the CouchbaseCluster resource's metadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClusterName defines the name of the cluster, as displayed in the Couchbase UI. By default, the cluster name is that specified in the CouchbaseCluster resource's metadata.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clusterName;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * Data allows the data service to be configured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Data allows the data service to be configured.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.Data data;

    public com.couchbase.v2.couchbaseclusterspec.cluster.Data getData() {
        return data;
    }

    public void setData(com.couchbase.v2.couchbaseclusterspec.cluster.Data data) {
        this.data = data;
    }

    /**
     * DataServiceMemQuota is the amount of memory that should be allocated to the data service. This value is per-pod, and only applicable to pods belonging to server classes running the data service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataServiceMemoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataServiceMemQuota is the amount of memory that should be allocated to the data service. This value is per-pod, and only applicable to pods belonging to server classes running the data service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString dataServiceMemoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("256Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getDataServiceMemoryQuota() {
        return dataServiceMemoryQuota;
    }

    public void setDataServiceMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString dataServiceMemoryQuota) {
        this.dataServiceMemoryQuota = dataServiceMemoryQuota;
    }

    /**
     * EventingServiceMemQuota is the amount of memory that should be allocated to the eventing service. This value is per-pod, and only applicable to pods belonging to server classes running the eventing service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventingServiceMemoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EventingServiceMemQuota is the amount of memory that should be allocated to the eventing service. This value is per-pod, and only applicable to pods belonging to server classes running the eventing service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString eventingServiceMemoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("256Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getEventingServiceMemoryQuota() {
        return eventingServiceMemoryQuota;
    }

    public void setEventingServiceMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString eventingServiceMemoryQuota) {
        this.eventingServiceMemoryQuota = eventingServiceMemoryQuota;
    }

    /**
     * IndexServiceMemQuota is the amount of memory that should be allocated to the index service. This value is per-pod, and only applicable to pods belonging to server classes running the index service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indexServiceMemoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IndexServiceMemQuota is the amount of memory that should be allocated to the index service. This value is per-pod, and only applicable to pods belonging to server classes running the index service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString indexServiceMemoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("256Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getIndexServiceMemoryQuota() {
        return indexServiceMemoryQuota;
    }

    public void setIndexServiceMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString indexServiceMemoryQuota) {
        this.indexServiceMemoryQuota = indexServiceMemoryQuota;
    }

    public enum IndexStorageSetting {

        @com.fasterxml.jackson.annotation.JsonProperty("memory_optimized")
        MEMORY_OPTIMIZED("memory_optimized"), @com.fasterxml.jackson.annotation.JsonProperty("plasma")
        PLASMA("plasma");

        String value;

        IndexStorageSetting(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * DEPRECATED - by indexer. The index storage mode to use for secondary indexing.  This field must be one of "memory_optimized" or "plasma", defaulting to "memory_optimized".  This field is immutable and cannot be changed unless there are no server classes running the index service in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indexStorageSetting")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by indexer. The index storage mode to use for secondary indexing.  This field must be one of \"memory_optimized\" or \"plasma\", defaulting to \"memory_optimized\".  This field is immutable and cannot be changed unless there are no server classes running the index service in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private IndexStorageSetting indexStorageSetting = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"memory_optimized\"", IndexStorageSetting.class);

    public IndexStorageSetting getIndexStorageSetting() {
        return indexStorageSetting;
    }

    public void setIndexStorageSetting(IndexStorageSetting indexStorageSetting) {
        this.indexStorageSetting = indexStorageSetting;
    }

    /**
     * Indexer allows the indexer to be configured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indexer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indexer allows the indexer to be configured.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.Indexer indexer;

    public com.couchbase.v2.couchbaseclusterspec.cluster.Indexer getIndexer() {
        return indexer;
    }

    public void setIndexer(com.couchbase.v2.couchbaseclusterspec.cluster.Indexer indexer) {
        this.indexer = indexer;
    }

    /**
     * Query allows the query service to be configured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Query allows the query service to be configured.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.Query query;

    public com.couchbase.v2.couchbaseclusterspec.cluster.Query getQuery() {
        return query;
    }

    public void setQuery(com.couchbase.v2.couchbaseclusterspec.cluster.Query query) {
        this.query = query;
    }

    /**
     * QueryServiceMemQuota is a dummy field.  By default, Couchbase server provides no memory resource constraints for the query service, so this has no effect on Couchbase server.  It is, however, used when the spec.autoResourceAllocation feature is enabled, and is used to define the amount of memory reserved by the query service for use with Kubernetes resource scheduling. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryServiceMemoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("QueryServiceMemQuota is a dummy field.  By default, Couchbase server provides no memory resource constraints for the query service, so this has no effect on Couchbase server.  It is, however, used when the spec.autoResourceAllocation feature is enabled, and is used to define the amount of memory reserved by the query service for use with Kubernetes resource scheduling. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString queryServiceMemoryQuota;

    public io.fabric8.kubernetes.api.model.IntOrString getQueryServiceMemoryQuota() {
        return queryServiceMemoryQuota;
    }

    public void setQueryServiceMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString queryServiceMemoryQuota) {
        this.queryServiceMemoryQuota = queryServiceMemoryQuota;
    }

    /**
     * SearchServiceMemQuota is the amount of memory that should be allocated to the search service. This value is per-pod, and only applicable to pods belonging to server classes running the search service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchServiceMemoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SearchServiceMemQuota is the amount of memory that should be allocated to the search service. This value is per-pod, and only applicable to pods belonging to server classes running the search service.  This field must be a quantity greater than or equal to 256Mi.  This field defaults to 256Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString searchServiceMemoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("256Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getSearchServiceMemoryQuota() {
        return searchServiceMemoryQuota;
    }

    public void setSearchServiceMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString searchServiceMemoryQuota) {
        this.searchServiceMemoryQuota = searchServiceMemoryQuota;
    }
}


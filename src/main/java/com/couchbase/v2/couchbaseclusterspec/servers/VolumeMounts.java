package com.couchbase.v2.couchbaseclusterspec.servers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"analytics","data","default","index","logs"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class VolumeMounts implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AnalyticsClaims are persistent volumes that encompass analytics storage associated with the analytics service.  Analytics claims can only be used on server classes running the analytics service, and must be used in conjunction with the default claim. This field allows the analytics service to use different storage media (e.g. SSD), and scale horizontally, to improve performance of this service.  This field references a volume claim template name as defined in "spec.volumeClaimTemplates".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("analytics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AnalyticsClaims are persistent volumes that encompass analytics storage associated with the analytics service.  Analytics claims can only be used on server classes running the analytics service, and must be used in conjunction with the default claim. This field allows the analytics service to use different storage media (e.g. SSD), and scale horizontally, to improve performance of this service.  This field references a volume claim template name as defined in \"spec.volumeClaimTemplates\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> analytics;

    public java.util.List<String> getAnalytics() {
        return analytics;
    }

    public void setAnalytics(java.util.List<String> analytics) {
        this.analytics = analytics;
    }

    /**
     * DataClaim is a persistent volume that encompasses key/value storage associated with the data service.  The data claim can only be used on server classes running the data service, and must be used in conjunction with the default claim.  This field allows the data service to use different storage media (e.g. SSD) to improve performance of this service.  This field references a volume claim template name as defined in "spec.volumeClaimTemplates".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataClaim is a persistent volume that encompasses key/value storage associated with the data service.  The data claim can only be used on server classes running the data service, and must be used in conjunction with the default claim.  This field allows the data service to use different storage media (e.g. SSD) to improve performance of this service.  This field references a volume claim template name as defined in \"spec.volumeClaimTemplates\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * DefaultClaim is a persistent volume that encompasses all Couchbase persistent data, including document storage, indexes and logs.  The default volume can be used with any server class.  Use of the default claim allows the Operator to recover failed pods from the persistent volume far quicker than if the pod were using ephemeral storage.  The default claim cannot be used at the same time as the logs claim within the same server class.  This field references a volume claim template name as defined in "spec.volumeClaimTemplates".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultClaim is a persistent volume that encompasses all Couchbase persistent data, including document storage, indexes and logs.  The default volume can be used with any server class.  Use of the default claim allows the Operator to recover failed pods from the persistent volume far quicker than if the pod were using ephemeral storage.  The default claim cannot be used at the same time as the logs claim within the same server class.  This field references a volume claim template name as defined in \"spec.volumeClaimTemplates\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _default;

    public String get_default() {
        return _default;
    }

    public void set_default(String _default) {
        this._default = _default;
    }

    /**
     * IndexClaim s a persistent volume that encompasses index storage associated with the index and search services.  The index claim can only be used on server classes running the index or search services, and must be used in conjunction with the default claim.  This field allows the index and/or search service to use different storage media (e.g. SSD) to improve performance of this service. This field references a volume claim template name as defined in "spec.volumeClaimTemplates". Whilst this references index primarily, note that the full text search (FTS) service also uses this same mount.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IndexClaim s a persistent volume that encompasses index storage associated with the index and search services.  The index claim can only be used on server classes running the index or search services, and must be used in conjunction with the default claim.  This field allows the index and/or search service to use different storage media (e.g. SSD) to improve performance of this service. This field references a volume claim template name as defined in \"spec.volumeClaimTemplates\". Whilst this references index primarily, note that the full text search (FTS) service also uses this same mount.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * LogsClaim is a persistent volume that encompasses only Couchbase server logs to aid with supporting the product.  The logs claim can only be used on server classes running the following services: query, search & eventing.  The logs claim cannot be used at the same time as the default claim within the same server class.  This field references a volume claim template name as defined in "spec.volumeClaimTemplates". Whilst the logs claim can be used with the search service, the recommendation is to use the default claim for these. The reason for this is that a failure of these nodes will require indexes to be rebuilt and subsequent performance impact.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogsClaim is a persistent volume that encompasses only Couchbase server logs to aid with supporting the product.  The logs claim can only be used on server classes running the following services: query, search & eventing.  The logs claim cannot be used at the same time as the default claim within the same server class.  This field references a volume claim template name as defined in \"spec.volumeClaimTemplates\". Whilst the logs claim can be used with the search service, the recommendation is to use the default claim for these. The reason for this is that a failure of these nodes will require indexes to be rebuilt and subsequent performance impact.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logs;

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }
}


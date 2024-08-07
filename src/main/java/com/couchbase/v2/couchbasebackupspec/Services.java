package com.couchbase.v2.couchbasebackupspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"analytics","bucketConfig","bucketQuery","clusterAnalytics","clusterQuery","data","eventing","ftsAliases","ftsIndexes","gsIndexes","views"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Services implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Analytics enables the backup of analytics data. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("analytics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Analytics enables the backup of analytics data. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean analytics = true;

    public Boolean getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Boolean analytics) {
        this.analytics = analytics;
    }

    /**
     * BucketConfig enables the backup of bucket configuration. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketConfig enables the backup of bucket configuration. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean bucketConfig = true;

    public Boolean getBucketConfig() {
        return bucketConfig;
    }

    public void setBucketConfig(Boolean bucketConfig) {
        this.bucketConfig = bucketConfig;
    }

    /**
     * BucketQuery enables the backup of query metadata for all buckets. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketQuery")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketQuery enables the backup of query metadata for all buckets. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean bucketQuery = true;

    public Boolean getBucketQuery() {
        return bucketQuery;
    }

    public void setBucketQuery(Boolean bucketQuery) {
        this.bucketQuery = bucketQuery;
    }

    /**
     * ClusterAnalytics enables the backup of cluster-wide analytics data, for example synonyms. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAnalytics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClusterAnalytics enables the backup of cluster-wide analytics data, for example synonyms. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean clusterAnalytics = true;

    public Boolean getClusterAnalytics() {
        return clusterAnalytics;
    }

    public void setClusterAnalytics(Boolean clusterAnalytics) {
        this.clusterAnalytics = clusterAnalytics;
    }

    /**
     * ClusterQuery enables the backup of cluster level query metadata. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterQuery")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClusterQuery enables the backup of cluster level query metadata. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean clusterQuery = true;

    public Boolean getClusterQuery() {
        return clusterQuery;
    }

    public void setClusterQuery(Boolean clusterQuery) {
        this.clusterQuery = clusterQuery;
    }

    /**
     * Data enables the backup of key-value data/documents for all buckets. This can be further refined with the couchbasebackups.spec.data configuration. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Data enables the backup of key-value data/documents for all buckets. This can be further refined with the couchbasebackups.spec.data configuration. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean data = true;

    public Boolean getData() {
        return data;
    }

    public void setData(Boolean data) {
        this.data = data;
    }

    /**
     * Eventing enables the backup of eventing service metadata. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Eventing enables the backup of eventing service metadata. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean eventing = true;

    public Boolean getEventing() {
        return eventing;
    }

    public void setEventing(Boolean eventing) {
        this.eventing = eventing;
    }

    /**
     * FTSAliases enables the backup of full-text search alias definitions. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ftsAliases")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FTSAliases enables the backup of full-text search alias definitions. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ftsAliases = true;

    public Boolean getFtsAliases() {
        return ftsAliases;
    }

    public void setFtsAliases(Boolean ftsAliases) {
        this.ftsAliases = ftsAliases;
    }

    /**
     * FTSIndexes enables the backup of full-text search index definitions for all buckets. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ftsIndexes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FTSIndexes enables the backup of full-text search index definitions for all buckets. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ftsIndexes = true;

    public Boolean getFtsIndexes() {
        return ftsIndexes;
    }

    public void setFtsIndexes(Boolean ftsIndexes) {
        this.ftsIndexes = ftsIndexes;
    }

    /**
     * GSIndexes enables the backup of global secondary index definitions for all buckets. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gsIndexes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GSIndexes enables the backup of global secondary index definitions for all buckets. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gsIndexes = true;

    public Boolean getGsIndexes() {
        return gsIndexes;
    }

    public void setGsIndexes(Boolean gsIndexes) {
        this.gsIndexes = gsIndexes;
    }

    /**
     * Views enables the backup of view definitions for all buckets. This field defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("views")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Views enables the backup of view definitions for all buckets. This field defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean views = true;

    public Boolean getViews() {
        return views;
    }

    public void setViews(Boolean views) {
        this.views = views;
    }
}


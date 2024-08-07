package com.couchbase.v2.couchbasebackuprestorespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"analytics","bucketConfig","bucketQuery","clusterAnalytics","clusterQuery","data","eventing","ftAlias","ftIndex","gsiIndex","views"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Services implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Analytics restores analytics datasets from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("analytics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Analytics restores analytics datasets from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean analytics = true;

    public Boolean getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Boolean analytics) {
        this.analytics = analytics;
    }

    /**
     * BucketConfig restores all bucket configuration settings. If you are restoring to cluster with managed buckets, then this option may conflict with existing bucket settings, and the results are undefined, so avoid use.  This option is intended for use with unmanaged buckets.  Note that bucket durability settings are not restored in versions less than and equal to 1.1.0, and will need to be manually applied.  This field defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketConfig restores all bucket configuration settings. If you are restoring to cluster with managed buckets, then this option may conflict with existing bucket settings, and the results are undefined, so avoid use.  This option is intended for use with unmanaged buckets.  Note that bucket durability settings are not restored in versions less than and equal to 1.1.0, and will need to be manually applied.  This field defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean bucketConfig;

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
     * Data restores document data from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Data restores document data from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean data = true;

    public Boolean getData() {
        return data;
    }

    public void setData(Boolean data) {
        this.data = data;
    }

    /**
     * Eventing restores eventing functions from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Eventing restores eventing functions from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean eventing = true;

    public Boolean getEventing() {
        return eventing;
    }

    public void setEventing(Boolean eventing) {
        this.eventing = eventing;
    }

    /**
     * FTAlias restores full-text search aliases from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ftAlias")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FTAlias restores full-text search aliases from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ftAlias = true;

    public Boolean getFtAlias() {
        return ftAlias;
    }

    public void setFtAlias(Boolean ftAlias) {
        this.ftAlias = ftAlias;
    }

    /**
     * FTIndex restores full-text search indexes from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ftIndex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FTIndex restores full-text search indexes from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ftIndex = true;

    public Boolean getFtIndex() {
        return ftIndex;
    }

    public void setFtIndex(Boolean ftIndex) {
        this.ftIndex = ftIndex;
    }

    /**
     * GSIIndex restores document indexes from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gsiIndex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GSIIndex restores document indexes from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gsiIndex = true;

    public Boolean getGsiIndex() {
        return gsiIndex;
    }

    public void setGsiIndex(Boolean gsiIndex) {
        this.gsiIndex = gsiIndex;
    }

    /**
     * Views restores views from the backup.  This field defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("views")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Views restores views from the backup.  This field defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean views = true;

    public Boolean getViews() {
        return views;
    }

    public void setViews(Boolean views) {
        this.views = views;
    }
}


package com.couchbase.v2.couchbaseclusterspec.cluster;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"databaseFragmentationThreshold","parallelCompaction","timeWindow","tombstonePurgeInterval","viewFragmentationThreshold"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AutoCompaction implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DatabaseFragmentationThreshold defines triggers for when database compaction should start.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseFragmentationThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DatabaseFragmentationThreshold defines triggers for when database compaction should start.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.DatabaseFragmentationThreshold databaseFragmentationThreshold = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.DatabaseFragmentationThreshold.class);

    public com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.DatabaseFragmentationThreshold getDatabaseFragmentationThreshold() {
        return databaseFragmentationThreshold;
    }

    public void setDatabaseFragmentationThreshold(com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.DatabaseFragmentationThreshold databaseFragmentationThreshold) {
        this.databaseFragmentationThreshold = databaseFragmentationThreshold;
    }

    /**
     * ParallelCompaction controls whether database and view compactions can happen in parallel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelCompaction")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ParallelCompaction controls whether database and view compactions can happen in parallel.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean parallelCompaction;

    public Boolean getParallelCompaction() {
        return parallelCompaction;
    }

    public void setParallelCompaction(Boolean parallelCompaction) {
        this.parallelCompaction = parallelCompaction;
    }

    /**
     * TimeWindow allows restriction of when compaction can occur.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeWindow")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TimeWindow allows restriction of when compaction can occur.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.TimeWindow timeWindow;

    public com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.TimeWindow getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    /**
     * TombstonePurgeInterval controls how long to wait before purging tombstones. This field must be in the range 1h-1440h, defaulting to 72h. More info:  https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tombstonePurgeInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TombstonePurgeInterval controls how long to wait before purging tombstones. This field must be in the range 1h-1440h, defaulting to 72h. More info:  https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tombstonePurgeInterval = "72h";

    public String getTombstonePurgeInterval() {
        return tombstonePurgeInterval;
    }

    public void setTombstonePurgeInterval(String tombstonePurgeInterval) {
        this.tombstonePurgeInterval = tombstonePurgeInterval;
    }

    /**
     * ViewFragmentationThreshold defines triggers for when view compaction should start.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("viewFragmentationThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ViewFragmentationThreshold defines triggers for when view compaction should start.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.ViewFragmentationThreshold viewFragmentationThreshold = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.ViewFragmentationThreshold.class);

    public com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.ViewFragmentationThreshold getViewFragmentationThreshold() {
        return viewFragmentationThreshold;
    }

    public void setViewFragmentationThreshold(com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction.ViewFragmentationThreshold viewFragmentationThreshold) {
        this.viewFragmentationThreshold = viewFragmentationThreshold;
    }
}


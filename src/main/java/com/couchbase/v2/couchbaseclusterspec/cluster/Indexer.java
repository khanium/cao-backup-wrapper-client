package com.couchbase.v2.couchbaseclusterspec.cluster;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"logLevel","maxRollbackPoints","memorySnapshotInterval","numReplica","redistributeIndexes","stableSnapshotInterval","storageMode","threads"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Indexer implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum LogLevel {

        @com.fasterxml.jackson.annotation.JsonProperty("silent")
        SILENT("silent"),
        @com.fasterxml.jackson.annotation.JsonProperty("fatal")
        FATAL("fatal"),
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        ERROR("error"),
        @com.fasterxml.jackson.annotation.JsonProperty("warn")
        WARN("warn"),
        @com.fasterxml.jackson.annotation.JsonProperty("info")
        INFO("info"),
        @com.fasterxml.jackson.annotation.JsonProperty("verbose")
        VERBOSE("verbose"),
        @com.fasterxml.jackson.annotation.JsonProperty("timing")
        TIMING("timing"),
        @com.fasterxml.jackson.annotation.JsonProperty("debug")
        DEBUG("debug"),
        @com.fasterxml.jackson.annotation.JsonProperty("trace")
        TRACE("trace");

        String value;

        LogLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * LogLevel controls the verbosity of indexer logs.  This field must be one of "silent", "fatal", "error", "warn", "info", "verbose", "timing", "debug" or "trace", defaulting to "info".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogLevel controls the verbosity of indexer logs.  This field must be one of \"silent\", \"fatal\", \"error\", \"warn\", \"info\", \"verbose\", \"timing\", \"debug\" or \"trace\", defaulting to \"info\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private LogLevel logLevel = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"info\"", LogLevel.class);

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * MaxRollbackPoints controls the number of checkpoints that can be rolled back to.  The default is 2, with a minimum of 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRollbackPoints")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MaxRollbackPoints controls the number of checkpoints that can be rolled back to.  The default is 2, with a minimum of 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxRollbackPoints = 2L;

    public Long getMaxRollbackPoints() {
        return maxRollbackPoints;
    }

    public void setMaxRollbackPoints(Long maxRollbackPoints) {
        this.maxRollbackPoints = maxRollbackPoints;
    }

    /**
     * MemorySnapshotInterval controls when memory indexes should be snapshotted. This defaults to 200ms, and must be greater than or equal to 1ms.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySnapshotInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemorySnapshotInterval controls when memory indexes should be snapshotted. This defaults to 200ms, and must be greater than or equal to 1ms.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String memorySnapshotInterval = "200ms";

    public String getMemorySnapshotInterval() {
        return memorySnapshotInterval;
    }

    public void setMemorySnapshotInterval(String memorySnapshotInterval) {
        this.memorySnapshotInterval = memorySnapshotInterval;
    }

    /**
     * NumberOfReplica specifies number of secondary index replicas to be created by the Index Service whenever CREATE INDEX is invoked, which ensures high availability and high performance. Note, if nodes and num_replica are both specified in the WITH clause, the specified number of nodes must be one greater than num_replica This defaults to 0, which means no index replicas to be created by default. Minimum must be 0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numReplica")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NumberOfReplica specifies number of secondary index replicas to be created by the Index Service whenever CREATE INDEX is invoked, which ensures high availability and high performance. Note, if nodes and num_replica are both specified in the WITH clause, the specified number of nodes must be one greater than num_replica This defaults to 0, which means no index replicas to be created by default. Minimum must be 0.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long numReplica = 0L;

    public Long getNumReplica() {
        return numReplica;
    }

    public void setNumReplica(Long numReplica) {
        this.numReplica = numReplica;
    }

    /**
     * RedistributeIndexes when true, Couchbase Server redistributes indexes when rebalance occurs, in order to optimize performance. If false (the default), such redistribution does not occur.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redistributeIndexes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RedistributeIndexes when true, Couchbase Server redistributes indexes when rebalance occurs, in order to optimize performance. If false (the default), such redistribution does not occur.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean redistributeIndexes = false;

    public Boolean getRedistributeIndexes() {
        return redistributeIndexes;
    }

    public void setRedistributeIndexes(Boolean redistributeIndexes) {
        this.redistributeIndexes = redistributeIndexes;
    }

    /**
     * StableSnapshotInterval controls when disk indexes should be snapshotted. This defaults to 5s, and must be greater than or equal to 1ms.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stableSnapshotInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StableSnapshotInterval controls when disk indexes should be snapshotted. This defaults to 5s, and must be greater than or equal to 1ms.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String stableSnapshotInterval = "5s";

    public String getStableSnapshotInterval() {
        return stableSnapshotInterval;
    }

    public void setStableSnapshotInterval(String stableSnapshotInterval) {
        this.stableSnapshotInterval = stableSnapshotInterval;
    }

    public enum StorageMode {

        @com.fasterxml.jackson.annotation.JsonProperty("memory_optimized")
        MEMORY_OPTIMIZED("memory_optimized"), @com.fasterxml.jackson.annotation.JsonProperty("plasma")
        PLASMA("plasma");

        String value;

        StorageMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * StorageMode controls the underlying storage engine for indexes.  Once set it can only be modified if there are no nodes in the cluster running the index service.  The field must be one of "memory_optimized" or "plasma", defaulting to "memory_optimized".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StorageMode controls the underlying storage engine for indexes.  Once set it can only be modified if there are no nodes in the cluster running the index service.  The field must be one of \"memory_optimized\" or \"plasma\", defaulting to \"memory_optimized\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private StorageMode storageMode = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"memory_optimized\"", StorageMode.class);

    public StorageMode getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(StorageMode storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * Threads controls the number of processor threads to use for indexing. A value of 0 means 1 per CPU.  This attribute must be greater than or equal to 0, defaulting to 0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threads")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Threads controls the number of processor threads to use for indexing. A value of 0 means 1 per CPU.  This attribute must be greater than or equal to 0, defaulting to 0.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long threads;

    public Long getThreads() {
        return threads;
    }

    public void setThreads(Long threads) {
        this.threads = threads;
    }
}


package com.couchbase.v2.couchbaseclusterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"compressionMode","conflictResolution","enableFlush","enableIndexReplica","evictionPolicy","ioPriority","memoryQuota","name","password","replicas","storageBackend","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Buckets implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CompressionMode defines how documents are compressed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compressionMode")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CompressionMode defines how documents are compressed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String compressionMode;

    public String getCompressionMode() {
        return compressionMode;
    }

    public void setCompressionMode(String compressionMode) {
        this.compressionMode = compressionMode;
    }

    /**
     * ConflictResolution is relevant for `couchbase` and `ephemeral` bucket types and indicates how to resolve conflicts when using multi-master XDCR.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conflictResolution")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConflictResolution is relevant for `couchbase` and `ephemeral` bucket types and indicates how to resolve conflicts when using multi-master XDCR.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String conflictResolution;

    public String getConflictResolution() {
        return conflictResolution;
    }

    public void setConflictResolution(String conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * EnableFlush is whether a client can delete all documents in a bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableFlush")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableFlush is whether a client can delete all documents in a bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableFlush;

    public Boolean getEnableFlush() {
        return enableFlush;
    }

    public void setEnableFlush(Boolean enableFlush) {
        this.enableFlush = enableFlush;
    }

    /**
     * EnableIndexReplica is whether indexes against bucket documents are replicated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableIndexReplica")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableIndexReplica is whether indexes against bucket documents are replicated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableIndexReplica;

    public Boolean getEnableIndexReplica() {
        return enableIndexReplica;
    }

    public void setEnableIndexReplica(Boolean enableIndexReplica) {
        this.enableIndexReplica = enableIndexReplica;
    }

    /**
     * EvictionPolicy is relevant for `couchbase` and `ephemeral` bucket types and indicates how documents are evicted from memory when it is exhausted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evictionPolicy")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EvictionPolicy is relevant for `couchbase` and `ephemeral` bucket types and indicates how documents are evicted from memory when it is exhausted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String evictionPolicy;

    public String getEvictionPolicy() {
        return evictionPolicy;
    }

    public void setEvictionPolicy(String evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
    }

    /**
     * IoPriority is `low` or `high` depending on the number of threads spawned for data processing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ioPriority")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IoPriority is `low` or `high` depending on the number of threads spawned for data processing.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ioPriority;

    public String getIoPriority() {
        return ioPriority;
    }

    public void setIoPriority(String ioPriority) {
        this.ioPriority = ioPriority;
    }

    /**
     * BucketMemoryQuota is the bucket memory quota in megabytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryQuota")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketMemoryQuota is the bucket memory quota in megabytes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long memoryQuota;

    public Long getMemoryQuota() {
        return memoryQuota;
    }

    public void setMemoryQuota(Long memoryQuota) {
        this.memoryQuota = memoryQuota;
    }

    /**
     * BucketName is the full name of the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketName is the full name of the bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * BucketPassword will never be populated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketPassword will never be populated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * BucketReplicas is the number of data replicas.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketReplicas is the number of data replicas.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replicas;

    public Long getReplicas() {
        return replicas;
    }

    public void setReplicas(Long replicas) {
        this.replicas = replicas;
    }

    /**
     * BucketStorageBackend is the storage backend of the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageBackend")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketStorageBackend is the storage backend of the bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageBackend;

    public String getStorageBackend() {
        return storageBackend;
    }

    public void setStorageBackend(String storageBackend) {
        this.storageBackend = storageBackend;
    }

    /**
     * BucketType is the type of the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BucketType is the type of the bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


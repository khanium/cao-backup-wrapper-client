package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"compressionMode","conflictResolution","enableFlush","enableIndexReplica","evictionPolicy","ioPriority","maxTTL","memoryQuota","minimumDurability","name","replicas","scopes","storageBackend"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseBucketSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum CompressionMode {

        @com.fasterxml.jackson.annotation.JsonProperty("off")
        OFF("off"), @com.fasterxml.jackson.annotation.JsonProperty("passive")
        PASSIVE("passive"), @com.fasterxml.jackson.annotation.JsonProperty("active")
        ACTIVE("active");

        String value;

        CompressionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * CompressionMode defines how Couchbase server handles document compression.  When off, documents are stored in memory, and transferred to the client uncompressed. When passive, documents are stored compressed in memory, and transferred to the client compressed when requested.  When active, documents are stored compresses in memory and when transferred to the client.  This field must be "off", "passive" or "active", defaulting to "passive".  Be aware "off" in YAML 1.2 is a boolean, so must be quoted as a string in configuration files.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compressionMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CompressionMode defines how Couchbase server handles document compression.  When off, documents are stored in memory, and transferred to the client uncompressed. When passive, documents are stored compressed in memory, and transferred to the client compressed when requested.  When active, documents are stored compresses in memory and when transferred to the client.  This field must be \"off\", \"passive\" or \"active\", defaulting to \"passive\".  Be aware \"off\" in YAML 1.2 is a boolean, so must be quoted as a string in configuration files.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private CompressionMode compressionMode = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"passive\"", CompressionMode.class);

    public CompressionMode getCompressionMode() {
        return compressionMode;
    }

    public void setCompressionMode(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public enum ConflictResolution {

        @com.fasterxml.jackson.annotation.JsonProperty("seqno")
        SEQNO("seqno"), @com.fasterxml.jackson.annotation.JsonProperty("lww")
        LWW("lww");

        String value;

        ConflictResolution(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * ConflictResolution defines how XDCR handles concurrent write conflicts.  Sequence number based resolution selects the document with the highest sequence number as the most recent. Timestamp based resolution selects the document that was written to most recently as the most recent.  This field must be "seqno" (sequence based), or "lww" (timestamp based), defaulting to "seqno".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conflictResolution")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConflictResolution defines how XDCR handles concurrent write conflicts.  Sequence number based resolution selects the document with the highest sequence number as the most recent. Timestamp based resolution selects the document that was written to most recently as the most recent.  This field must be \"seqno\" (sequence based), or \"lww\" (timestamp based), defaulting to \"seqno\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ConflictResolution conflictResolution = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"seqno\"", ConflictResolution.class);

    public ConflictResolution getConflictResolution() {
        return conflictResolution;
    }

    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * EnableFlush defines whether a client can delete all documents in a bucket. This field defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableFlush")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableFlush defines whether a client can delete all documents in a bucket. This field defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableFlush;

    public Boolean getEnableFlush() {
        return enableFlush;
    }

    public void setEnableFlush(Boolean enableFlush) {
        this.enableFlush = enableFlush;
    }

    /**
     * EnableIndexReplica defines whether indexes for this bucket are replicated. This field defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableIndexReplica")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableIndexReplica defines whether indexes for this bucket are replicated. This field defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableIndexReplica;

    public Boolean getEnableIndexReplica() {
        return enableIndexReplica;
    }

    public void setEnableIndexReplica(Boolean enableIndexReplica) {
        this.enableIndexReplica = enableIndexReplica;
    }

    public enum EvictionPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("valueOnly")
        VALUEONLY("valueOnly"), @com.fasterxml.jackson.annotation.JsonProperty("fullEviction")
        FULLEVICTION("fullEviction");

        String value;

        EvictionPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * EvictionPolicy controls how Couchbase handles memory exhaustion.  Value only eviction flushes documents to disk but maintains document metadata in memory in order to improve query performance.  Full eviction removes all data from memory after the document is flushed to disk.  This field must be "valueOnly" or "fullEviction", defaulting to "valueOnly".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evictionPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EvictionPolicy controls how Couchbase handles memory exhaustion.  Value only eviction flushes documents to disk but maintains document metadata in memory in order to improve query performance.  Full eviction removes all data from memory after the document is flushed to disk.  This field must be \"valueOnly\" or \"fullEviction\", defaulting to \"valueOnly\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private EvictionPolicy evictionPolicy = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"valueOnly\"", EvictionPolicy.class);

    public EvictionPolicy getEvictionPolicy() {
        return evictionPolicy;
    }

    public void setEvictionPolicy(EvictionPolicy evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
    }

    public enum IoPriority {

        @com.fasterxml.jackson.annotation.JsonProperty("low")
        LOW("low"), @com.fasterxml.jackson.annotation.JsonProperty("high")
        HIGH("high");

        String value;

        IoPriority(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * IOPriority controls how many threads a bucket has, per pod, to process reads and writes. This field must be "low" or "high", defaulting to "low".  Modification of this field will cause a temporary service disruption as threads are restarted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ioPriority")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IOPriority controls how many threads a bucket has, per pod, to process reads and writes. This field must be \"low\" or \"high\", defaulting to \"low\".  Modification of this field will cause a temporary service disruption as threads are restarted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private IoPriority ioPriority = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"low\"", IoPriority.class);

    public IoPriority getIoPriority() {
        return ioPriority;
    }

    public void setIoPriority(IoPriority ioPriority) {
        this.ioPriority = ioPriority;
    }

    /**
     * MaxTTL defines how long a document is permitted to exist for, without modification, until it is automatically deleted.  This is a default and maximum time-to-live and may be set to a lower value by the client.  If the client specifies a higher value, then it is truncated to the maximum durability.  Documents are removed by Couchbase, after they have expired, when either accessed, the expiry pager is run, or the bucket is compacted.  When set to 0, then documents are not expired by default.  This field must be a duration in the range 0-2147483648s, defaulting to 0.  More info: https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTTL")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MaxTTL defines how long a document is permitted to exist for, without modification, until it is automatically deleted.  This is a default and maximum time-to-live and may be set to a lower value by the client.  If the client specifies a higher value, then it is truncated to the maximum durability.  Documents are removed by Couchbase, after they have expired, when either accessed, the expiry pager is run, or the bucket is compacted.  When set to 0, then documents are not expired by default.  This field must be a duration in the range 0-2147483648s, defaulting to 0.  More info: https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String maxTTL;

    public String getMaxTTL() {
        return maxTTL;
    }

    public void setMaxTTL(String maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * MemoryQuota is a memory limit to the size of a bucket.  When this limit is exceeded, documents will be evicted from memory to disk as defined by the eviction policy.  The memory quota is defined per Couchbase pod running the data service.  This field defaults to, and must be greater than or equal to 100Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemoryQuota is a memory limit to the size of a bucket.  When this limit is exceeded, documents will be evicted from memory to disk as defined by the eviction policy.  The memory quota is defined per Couchbase pod running the data service.  This field defaults to, and must be greater than or equal to 100Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString memoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("100Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getMemoryQuota() {
        return memoryQuota;
    }

    public void setMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString memoryQuota) {
        this.memoryQuota = memoryQuota;
    }

    public enum MinimumDurability {

        @com.fasterxml.jackson.annotation.JsonProperty("none")
        NONE("none"), @com.fasterxml.jackson.annotation.JsonProperty("majority")
        MAJORITY("majority"), @com.fasterxml.jackson.annotation.JsonProperty("majorityAndPersistActive")
        MAJORITYANDPERSISTACTIVE("majorityAndPersistActive"), @com.fasterxml.jackson.annotation.JsonProperty("persistToMajority")
        PERSISTTOMAJORITY("persistToMajority");

        String value;

        MinimumDurability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * MiniumumDurability defines how durable a document write is by default, and can be made more durable by the client.  This feature enables ACID transactions. When none, Couchbase server will respond when the document is in memory, it will become eventually consistent across the cluster.  When majority, Couchbase server will respond when the document is replicated to at least half of the pods running the data service in the cluster.  When majorityAndPersistActive, Couchbase server will respond when the document is replicated to at least half of the pods running the data service in the cluster and the document has been persisted to disk on the document master pod.  When persistToMajority, Couchbase server will respond when the document is replicated and persisted to disk on at least half of the pods running the data service in the cluster.  This field must be either "none", "majority", "majorityAndPersistActive" or "persistToMajority", defaulting to "none".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumDurability")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MiniumumDurability defines how durable a document write is by default, and can be made more durable by the client.  This feature enables ACID transactions. When none, Couchbase server will respond when the document is in memory, it will become eventually consistent across the cluster.  When majority, Couchbase server will respond when the document is replicated to at least half of the pods running the data service in the cluster.  When majorityAndPersistActive, Couchbase server will respond when the document is replicated to at least half of the pods running the data service in the cluster and the document has been persisted to disk on the document master pod.  When persistToMajority, Couchbase server will respond when the document is replicated and persisted to disk on at least half of the pods running the data service in the cluster.  This field must be either \"none\", \"majority\", \"majorityAndPersistActive\" or \"persistToMajority\", defaulting to \"none\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private MinimumDurability minimumDurability;

    public MinimumDurability getMinimumDurability() {
        return minimumDurability;
    }

    public void setMinimumDurability(MinimumDurability minimumDurability) {
        this.minimumDurability = minimumDurability;
    }

    /**
     * Name is the name of the bucket within Couchbase server.  By default the Operator will use the `metadata.name` field to define the bucket name.  The `metadata.name` field only supports a subset of the supported character set.  When specified, this field overrides `metadata.name`.  Legal bucket names have a maximum length of 100 characters and may be composed of any character from "a-z", "A-Z", "0-9" and "-_%\.".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_%\\.]{1,100}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the bucket within Couchbase server.  By default the Operator will use the `metadata.name` field to define the bucket name.  The `metadata.name` field only supports a subset of the supported character set.  When specified, this field overrides `metadata.name`.  Legal bucket names have a maximum length of 100 characters and may be composed of any character from \"a-z\", \"A-Z\", \"0-9\" and \"-_%\\.\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Replicas defines how many copies of documents Couchbase server maintains.  This directly affects how fault tolerant a Couchbase cluster is.  With a single replica, the cluster can tolerate one data pod going down and still service requests without data loss.  The number of replicas also affect memory use.  With a single replica, the effective memory quota for documents is halved, with two replicas it is one third.  The number of replicas must be between 0 and 3, defaulting to 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Max(3.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas defines how many copies of documents Couchbase server maintains.  This directly affects how fault tolerant a Couchbase cluster is.  With a single replica, the cluster can tolerate one data pod going down and still service requests without data loss.  The number of replicas also affect memory use.  With a single replica, the effective memory quota for documents is halved, with two replicas it is one third.  The number of replicas must be between 0 and 3, defaulting to 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replicas = 1L;

    public Long getReplicas() {
        return replicas;
    }

    public void setReplicas(Long replicas) {
        this.replicas = replicas;
    }

    /**
     * Scopes defines whether the Operator manages scopes for the bucket or not, and the set of scopes defined for the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scopes defines whether the Operator manages scopes for the bucket or not, and the set of scopes defined for the bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebucketspec.Scopes scopes;

    public com.couchbase.v2.couchbasebucketspec.Scopes getScopes() {
        return scopes;
    }

    public void setScopes(com.couchbase.v2.couchbasebucketspec.Scopes scopes) {
        this.scopes = scopes;
    }

    public enum StorageBackend {

        @com.fasterxml.jackson.annotation.JsonProperty("couchstore")
        COUCHSTORE("couchstore"), @com.fasterxml.jackson.annotation.JsonProperty("magma")
        MAGMA("magma");

        String value;

        StorageBackend(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * StorageBackend to be assigned to and used by the bucket. Only valid for Couchbase Server 7.0.0 onward. Two different backend storage mechanisms can be used - "couchstore" or "magma", defaulting to "couchstore". This cannot be edited after bucket creation. Note: "magma" is only valid for Couchbase Server 7.1.0 onward.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageBackend")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StorageBackend to be assigned to and used by the bucket. Only valid for Couchbase Server 7.0.0 onward. Two different backend storage mechanisms can be used - \"couchstore\" or \"magma\", defaulting to \"couchstore\". This cannot be edited after bucket creation. Note: \"magma\" is only valid for Couchbase Server 7.1.0 onward.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private StorageBackend storageBackend;

    public StorageBackend getStorageBackend() {
        return storageBackend;
    }

    public void setStorageBackend(StorageBackend storageBackend) {
        this.storageBackend = storageBackend;
    }
}


package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autoScaling","backoffLimit","backupRetention","data","defaultRecoveryMethod","ephemeralVolume","failedJobsHistoryLimit","full","incremental","logRetention","objectStore","s3bucket","services","size","storageClassName","strategy","successfulJobsHistoryLimit","threads","ttlSecondsAfterFinished"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseBackupSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AutoScaling allows the volume size to be dynamically increased. When specified, the backup volume will start with an initial size as defined by `spec.size`, and increase as required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoScaling")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoScaling allows the volume size to be dynamically increased. When specified, the backup volume will start with an initial size as defined by `spec.size`, and increase as required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.AutoScaling autoScaling;

    public com.couchbase.v2.couchbasebackupspec.AutoScaling getAutoScaling() {
        return autoScaling;
    }

    public void setAutoScaling(com.couchbase.v2.couchbasebackupspec.AutoScaling autoScaling) {
        this.autoScaling = autoScaling;
    }

    /**
     * Number of times a backup job should try to execute. Once it hits the BackoffLimit it will not run until the next scheduled job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backoffLimit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of times a backup job should try to execute. Once it hits the BackoffLimit it will not run until the next scheduled job.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer backoffLimit = 2;

    public Integer getBackoffLimit() {
        return backoffLimit;
    }

    public void setBackoffLimit(Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
    }

    /**
     * Number of hours to hold backups for, everything older will be deleted.  More info: https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupRetention")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of hours to hold backups for, everything older will be deleted.  More info: https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String backupRetention = "720h";

    public String getBackupRetention() {
        return backupRetention;
    }

    public void setBackupRetention(String backupRetention) {
        this.backupRetention = backupRetention;
    }

    /**
     * Data allows control over what key-value/document data is included in the backup.  By default, all data is included.  Modifications to this field will only take effect on the next full backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Data allows control over what key-value/document data is included in the backup.  By default, all data is included.  Modifications to this field will only take effect on the next full backup.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.Data data;

    public com.couchbase.v2.couchbasebackupspec.Data getData() {
        return data;
    }

    public void setData(com.couchbase.v2.couchbasebackupspec.Data data) {
        this.data = data;
    }

    public enum DefaultRecoveryMethod {

        @com.fasterxml.jackson.annotation.JsonProperty("none")
        NONE("none"), @com.fasterxml.jackson.annotation.JsonProperty("resume")
        RESUME("resume"), @com.fasterxml.jackson.annotation.JsonProperty("purge")
        PURGE("purge");

        String value;

        DefaultRecoveryMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * DefaultRecoveryMethod specifies how cbbackupmgr should recover from broken backup/restore attempts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRecoveryMethod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultRecoveryMethod specifies how cbbackupmgr should recover from broken backup/restore attempts.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private DefaultRecoveryMethod defaultRecoveryMethod = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"none\"", DefaultRecoveryMethod.class);

    public DefaultRecoveryMethod getDefaultRecoveryMethod() {
        return defaultRecoveryMethod;
    }

    public void setDefaultRecoveryMethod(DefaultRecoveryMethod defaultRecoveryMethod) {
        this.defaultRecoveryMethod = defaultRecoveryMethod;
    }

    /**
     * EphemeralVolume sets backup to use an ephemeral volume instead of a persistent volume. This is used when backing up to a remote cloud provider, where a persistent volume is not needed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeralVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EphemeralVolume sets backup to use an ephemeral volume instead of a persistent volume. This is used when backing up to a remote cloud provider, where a persistent volume is not needed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ephemeralVolume = false;

    public Boolean getEphemeralVolume() {
        return ephemeralVolume;
    }

    public void setEphemeralVolume(Boolean ephemeralVolume) {
        this.ephemeralVolume = ephemeralVolume;
    }

    /**
     * Amount of failed jobs to keep.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failedJobsHistoryLimit")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Amount of failed jobs to keep.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer failedJobsHistoryLimit = 3;

    public Integer getFailedJobsHistoryLimit() {
        return failedJobsHistoryLimit;
    }

    public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    }

    /**
     * Full is the schedule on when to take full backups. Used in Full/Incremental and FullOnly backup strategies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("full")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Full is the schedule on when to take full backups. Used in Full/Incremental and FullOnly backup strategies.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.Full full;

    public com.couchbase.v2.couchbasebackupspec.Full getFull() {
        return full;
    }

    public void setFull(com.couchbase.v2.couchbasebackupspec.Full full) {
        this.full = full;
    }

    /**
     * Incremental is the schedule on when to take incremental backups. Used in Full/Incremental backup strategies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incremental")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Incremental is the schedule on when to take incremental backups. Used in Full/Incremental backup strategies.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.Incremental incremental;

    public com.couchbase.v2.couchbasebackupspec.Incremental getIncremental() {
        return incremental;
    }

    public void setIncremental(com.couchbase.v2.couchbasebackupspec.Incremental incremental) {
        this.incremental = incremental;
    }

    /**
     * Number of hours to hold script logs for, everything older will be deleted.  More info: https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logRetention")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of hours to hold script logs for, everything older will be deleted.  More info: https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logRetention = "168h";

    public String getLogRetention() {
        return logRetention;
    }

    public void setLogRetention(String logRetention) {
        this.logRetention = logRetention;
    }

    /**
     * ObjectStore allows for backing up to a remote cloud storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObjectStore allows for backing up to a remote cloud storage.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.ObjectStore objectStore;

    public com.couchbase.v2.couchbasebackupspec.ObjectStore getObjectStore() {
        return objectStore;
    }

    public void setObjectStore(com.couchbase.v2.couchbasebackupspec.ObjectStore objectStore) {
        this.objectStore = objectStore;
    }

    /**
     * DEPRECATED - by spec.objectStore.uri Name of S3 bucket to backup to. If non-empty this overrides local backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("s3bucket")
    @io.fabric8.generator.annotation.Pattern("^s3://[a-z0-9-\\.\\/]{3,63}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by spec.objectStore.uri Name of S3 bucket to backup to. If non-empty this overrides local backup.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String s3bucket;

    public String getS3bucket() {
        return s3bucket;
    }

    public void setS3bucket(String s3bucket) {
        this.s3bucket = s3bucket;
    }

    /**
     * Services allows control over what services are included in the backup. By default, all service data and metadata are included.  Modifications to this field will only take effect on the next full backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Services allows control over what services are included in the backup. By default, all service data and metadata are included.  Modifications to this field will only take effect on the next full backup.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.Services services = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbasebackupspec.Services.class);

    public com.couchbase.v2.couchbasebackupspec.Services getServices() {
        return services;
    }

    public void setServices(com.couchbase.v2.couchbasebackupspec.Services services) {
        this.services = services;
    }

    /**
     * Size allows the specification of a backup persistent volume, when using volume based backup. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size allows the specification of a backup persistent volume, when using volume based backup. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString size = new io.fabric8.kubernetes.api.model.IntOrString("20Gi");

    public io.fabric8.kubernetes.api.model.IntOrString getSize() {
        return size;
    }

    public void setSize(io.fabric8.kubernetes.api.model.IntOrString size) {
        this.size = size;
    }

    /**
     * Name of StorageClass to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of StorageClass to use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageClassName;

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public enum Strategy {

        @com.fasterxml.jackson.annotation.JsonProperty("full_incremental")
        FULL_INCREMENTAL("full_incremental"), @com.fasterxml.jackson.annotation.JsonProperty("full_only")
        FULL_ONLY("full_only"), @com.fasterxml.jackson.annotation.JsonProperty("immediate_incremental")
        IMMEDIATE_INCREMENTAL("immediate_incremental"), @com.fasterxml.jackson.annotation.JsonProperty("immediate_full")
        IMMEDIATE_FULL("immediate_full");

        String value;

        Strategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Strategy defines how to perform backups.  `full_only` will only perform full backups, and you must define a schedule in the `spec.full` field.  `full_incremental` will perform periodic full backups, and incremental backups in between.  You must define full and incremental schedules in the `spec.full` and `spec.incremental` fields respectively.  Care should be taken to ensure full and incremental schedules do not overlap, taking into account the backup time, as this will cause failures as the jobs attempt to mount the same backup volume. To cause a backup to occur immediately use `immediate_incremental` or `immediate_full` for incremental or full backups respectively. This field default to `full_incremental`. Info: https://docs.couchbase.com/server/current/backup-restore/cbbackupmgr-strategies.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Strategy defines how to perform backups.  `full_only` will only perform full backups, and you must define a schedule in the `spec.full` field.  `full_incremental` will perform periodic full backups, and incremental backups in between.  You must define full and incremental schedules in the `spec.full` and `spec.incremental` fields respectively.  Care should be taken to ensure full and incremental schedules do not overlap, taking into account the backup time, as this will cause failures as the jobs attempt to mount the same backup volume. To cause a backup to occur immediately use `immediate_incremental` or `immediate_full` for incremental or full backups respectively. This field default to `full_incremental`. Info: https://docs.couchbase.com/server/current/backup-restore/cbbackupmgr-strategies.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Strategy strategy = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"full_incremental\"", Strategy.class);

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Amount of successful jobs to keep.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("successfulJobsHistoryLimit")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Amount of successful jobs to keep.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer successfulJobsHistoryLimit = 3;

    public Integer getSuccessfulJobsHistoryLimit() {
        return successfulJobsHistoryLimit;
    }

    public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    }

    /**
     * How many threads to use during the backup.  This field defaults to 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threads")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How many threads to use during the backup.  This field defaults to 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long threads = 1L;

    public Long getThreads() {
        return threads;
    }

    public void setThreads(Long threads) {
        this.threads = threads;
    }

    /**
     * Amount of time to elapse before a completed job is deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ttlSecondsAfterFinished")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Amount of time to elapse before a completed job is deleted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer ttlSecondsAfterFinished;

    public Integer getTtlSecondsAfterFinished() {
        return ttlSecondsAfterFinished;
    }

    public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }
}


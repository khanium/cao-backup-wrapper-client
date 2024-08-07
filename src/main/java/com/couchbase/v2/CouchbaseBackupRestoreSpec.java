package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"backoffLimit","backup","buckets","data","end","forceUpdates","logRetention","objectStore","repo","s3bucket","services","stagingVolume","start","threads","ttlSecondsAfterFinished"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseBackupRestoreSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Number of times the restore job should try to execute.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backoffLimit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of times the restore job should try to execute.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer backoffLimit = 2;

    public Integer getBackoffLimit() {
        return backoffLimit;
    }

    public void setBackoffLimit(Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
    }

    /**
     * The backup resource name associated with this restore, or the backup PVC name to restore from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The backup resource name associated with this restore, or the backup PVC name to restore from.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String backup;

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    /**
     * DEPRECATED - by spec.data. Specific buckets can be explicitly included or excluded in the restore, as well as bucket mappings.  This field is now ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buckets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by spec.data. Specific buckets can be explicitly included or excluded in the restore, as well as bucket mappings.  This field is now ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.Buckets buckets;

    public com.couchbase.v2.couchbasebackuprestorespec.Buckets getBuckets() {
        return buckets;
    }

    public void setBuckets(com.couchbase.v2.couchbasebackuprestorespec.Buckets buckets) {
        this.buckets = buckets;
    }

    /**
     * Data allows control over what key-value/document data is included in the restore.  By default, all data is included.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Data allows control over what key-value/document data is included in the restore.  By default, all data is included.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.Data data;

    public com.couchbase.v2.couchbasebackuprestorespec.Data getData() {
        return data;
    }

    public void setData(com.couchbase.v2.couchbasebackuprestorespec.Data data) {
        this.data = data;
    }

    /**
     * End denotes the last backup to restore from.  Omitting this field will only restore the backup referenced by start.  This may be specified as an integer index (starting from 1), a string specifying a short date DD-MM-YYYY, the backup name, or one of either `start` or `oldest` keywords.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("End denotes the last backup to restore from.  Omitting this field will only restore the backup referenced by start.  This may be specified as an integer index (starting from 1), a string specifying a short date DD-MM-YYYY, the backup name, or one of either `start` or `oldest` keywords.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.End end;

    public com.couchbase.v2.couchbasebackuprestorespec.End getEnd() {
        return end;
    }

    public void setEnd(com.couchbase.v2.couchbasebackuprestorespec.End end) {
        this.end = end;
    }

    /**
     * Forces data in the Couchbase cluster to be overwritten even if the data in the cluster is newer than the restore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forceUpdates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Forces data in the Couchbase cluster to be overwritten even if the data in the cluster is newer than the restore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean forceUpdates;

    public Boolean getForceUpdates() {
        return forceUpdates;
    }

    public void setForceUpdates(Boolean forceUpdates) {
        this.forceUpdates = forceUpdates;
    }

    /**
     * Number of hours to hold restore script logs for, everything older will be deleted. More info: https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logRetention")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of hours to hold restore script logs for, everything older will be deleted. More info: https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logRetention = "168h";

    public String getLogRetention() {
        return logRetention;
    }

    public void setLogRetention(String logRetention) {
        this.logRetention = logRetention;
    }

    /**
     * The remote destination for backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The remote destination for backup.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.ObjectStore objectStore;

    public com.couchbase.v2.couchbasebackuprestorespec.ObjectStore getObjectStore() {
        return objectStore;
    }

    public void setObjectStore(com.couchbase.v2.couchbasebackuprestorespec.ObjectStore objectStore) {
        this.objectStore = objectStore;
    }

    /**
     * Repo is the backup folder to restore from.  If no repository is specified, the backup container will choose the latest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Repo is the backup folder to restore from.  If no repository is specified, the backup container will choose the latest.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repo;

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * DEPRECATED - by spec.objectStore.uri Name of S3 bucket to restore from. If non-empty this overrides local backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("s3bucket")
    @io.fabric8.generator.annotation.Pattern("^s3://[a-z0-9-\\.\\/]{3,63}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by spec.objectStore.uri Name of S3 bucket to restore from. If non-empty this overrides local backup.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String s3bucket;

    public String getS3bucket() {
        return s3bucket;
    }

    public void setS3bucket(String s3bucket) {
        this.s3bucket = s3bucket;
    }

    /**
     * This list accepts a certain set of parameters that will disable that data and prevent it being restored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This list accepts a certain set of parameters that will disable that data and prevent it being restored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.Services services = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", com.couchbase.v2.couchbasebackuprestorespec.Services.class);

    public com.couchbase.v2.couchbasebackuprestorespec.Services getServices() {
        return services;
    }

    public void setServices(com.couchbase.v2.couchbasebackuprestorespec.Services services) {
        this.services = services;
    }

    /**
     * StagingVolume contains configuration related to the ephemeral volume used as staging when restoring from a cloud backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stagingVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StagingVolume contains configuration related to the ephemeral volume used as staging when restoring from a cloud backup.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.StagingVolume stagingVolume = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"size\":\"20Gi\"}", com.couchbase.v2.couchbasebackuprestorespec.StagingVolume.class);

    public com.couchbase.v2.couchbasebackuprestorespec.StagingVolume getStagingVolume() {
        return stagingVolume;
    }

    public void setStagingVolume(com.couchbase.v2.couchbasebackuprestorespec.StagingVolume stagingVolume) {
        this.stagingVolume = stagingVolume;
    }

    /**
     * Start denotes the first backup to restore from.  This may be specified as an integer index (starting from 1), a string specifying a short date DD-MM-YYYY, the backup name, or one of either `start` or `oldest` keywords.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Start denotes the first backup to restore from.  This may be specified as an integer index (starting from 1), a string specifying a short date DD-MM-YYYY, the backup name, or one of either `start` or `oldest` keywords.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackuprestorespec.Start start;

    public com.couchbase.v2.couchbasebackuprestorespec.Start getStart() {
        return start;
    }

    public void setStart(com.couchbase.v2.couchbasebackuprestorespec.Start start) {
        this.start = start;
    }

    /**
     * How many threads to use during the restore.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threads")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How many threads to use during the restore.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long threads = 1L;

    public Long getThreads() {
        return threads;
    }

    public void setThreads(Long threads) {
        this.threads = threads;
    }

    /**
     * Number of seconds to elapse before a completed job is deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ttlSecondsAfterFinished")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds to elapse before a completed job is deleted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer ttlSecondsAfterFinished;

    public Integer getTtlSecondsAfterFinished() {
        return ttlSecondsAfterFinished;
    }

    public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }
}


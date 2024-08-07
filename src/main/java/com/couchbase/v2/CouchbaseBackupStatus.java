package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"archive","backups","capacityUsed","cronjob","duration","failed","job","lastFailure","lastRun","lastSuccess","output","pod","repo","running"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseBackupStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Location of Backup Archive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("archive")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Location of Backup Archive.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String archive;

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    /**
     * Backups gives us a full list of all backups and their respective repository locations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backups")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Backups gives us a full list of all backups and their respective repository locations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbasebackupstatus.Backups> backups;

    public java.util.List<com.couchbase.v2.couchbasebackupstatus.Backups> getBackups() {
        return backups;
    }

    public void setBackups(java.util.List<com.couchbase.v2.couchbasebackupstatus.Backups> backups) {
        this.backups = backups;
    }

    /**
     * CapacityUsed tells us how much of the PVC we are using. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityUsed")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CapacityUsed tells us how much of the PVC we are using. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString capacityUsed;

    public io.fabric8.kubernetes.api.model.IntOrString getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(io.fabric8.kubernetes.api.model.IntOrString capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    /**
     * DEPRECATED - field may no longer be populated. Cronjob tells us which Cronjob the job belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cronjob")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - field may no longer be populated. Cronjob tells us which Cronjob the job belongs to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cronjob;

    public String getCronjob() {
        return cronjob;
    }

    public void setCronjob(String cronjob) {
        this.cronjob = cronjob;
    }

    /**
     * Duration tells us how long the last backup took.  More info: https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Duration tells us how long the last backup took.  More info: https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Failed indicates whether the most recent backup has failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failed")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Failed indicates whether the most recent backup has failed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean failed;

    public Boolean getFailed() {
        return failed;
    }

    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    /**
     * DEPRECATED - field may no longer be populated. Job tells us which job is running/ran last.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("job")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - field may no longer be populated. Job tells us which job is running/ran last.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    /**
     * LastFailure tells us the time the last failed backup failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastFailure")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastFailure tells us the time the last failed backup failed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastFailure;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastFailure() {
        return lastFailure;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastFailure(java.time.ZonedDateTime lastFailure) {
        this.lastFailure = lastFailure;
    }

    /**
     * LastRun tells us the time the last backup job started.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastRun")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastRun tells us the time the last backup job started.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastRun;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastRun() {
        return lastRun;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastRun(java.time.ZonedDateTime lastRun) {
        this.lastRun = lastRun;
    }

    /**
     * LastSuccess gives us the time the last successful backup finished.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSuccess")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastSuccess gives us the time the last successful backup finished.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastSuccess;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastSuccess() {
        return lastSuccess;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastSuccess(java.time.ZonedDateTime lastSuccess) {
        this.lastSuccess = lastSuccess;
    }

    /**
     * DEPRECATED - field may no longer be populated. Output reports useful information from the backup_script.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - field may no longer be populated. Output reports useful information from the backup_script.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String output;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * DEPRECATED - field may no longer be populated. Pod tells us which pod is running/ran last.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - field may no longer be populated. Pod tells us which pod is running/ran last.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pod;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    /**
     * Repo is where we are currently performing operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Repo is where we are currently performing operations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repo;

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * Running indicates whether a backup is currently being performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("running")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Running indicates whether a backup is currently being performed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean running;

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }
}


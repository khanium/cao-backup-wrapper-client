package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"annotations","image","imagePullSecrets","labels","managed","nodeSelector","objectEndpoint","resources","s3Secret","selector","serviceAccountName","tolerations","useIAMRole"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Backup implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Annotations defines additional annotations to appear on the backup/restore pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations defines additional annotations to appear on the backup/restore pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> annotations;

    public java.util.Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * The Backup Image to run on backup pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Backup Image to run on backup pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image = "couchbase/operator-backup:1.3.1";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ImagePullSecrets allow you to use an image from private repositories and non-dockerhub ones.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImagePullSecrets allow you to use an image from private repositories and non-dockerhub ones.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.backup.ImagePullSecrets> imagePullSecrets;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.backup.ImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(java.util.List<com.couchbase.v2.couchbaseclusterspec.backup.ImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * Labels defines additional labels to appear on the backup/restore pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Labels defines additional labels to appear on the backup/restore pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> labels;

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * Managed defines whether backups are managed by us or the clients.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Managed defines whether backups are managed by us or the clients.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean managed;

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * NodeSelector defines which nodes to constrain the pods that run any backup and restore operations to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeSelector defines which nodes to constrain the pods that run any backup and restore operations to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<String, String> nodeSelector;

    public java.util.Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * Deprecated: by CouchbaseBackup.spec.objectStore.Endpoint ObjectEndpoint contains the configuration for connecting to a custom S3 compliant object store.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectEndpoint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: by CouchbaseBackup.spec.objectStore.Endpoint ObjectEndpoint contains the configuration for connecting to a custom S3 compliant object store.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.backup.ObjectEndpoint objectEndpoint;

    public com.couchbase.v2.couchbaseclusterspec.backup.ObjectEndpoint getObjectEndpoint() {
        return objectEndpoint;
    }

    public void setObjectEndpoint(com.couchbase.v2.couchbaseclusterspec.backup.ObjectEndpoint objectEndpoint) {
        this.objectEndpoint = objectEndpoint;
    }

    /**
     * Resources is the resource requirements for the backup and restore containers.  Will be populated by defaults if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources is the resource requirements for the backup and restore containers.  Will be populated by defaults if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.backup.Resources resources;

    public com.couchbase.v2.couchbaseclusterspec.backup.Resources getResources() {
        return resources;
    }

    public void setResources(com.couchbase.v2.couchbaseclusterspec.backup.Resources resources) {
        this.resources = resources;
    }

    /**
     * Deprecated: by CouchbaseBackup.spec.objectStore.secret S3Secret contains the key region and optionally access-key-id and secret-access-key for operating backups in S3. This field must be popluated when the `spec.s3bucket` field is specified for a backup or restore resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("s3Secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: by CouchbaseBackup.spec.objectStore.secret S3Secret contains the key region and optionally access-key-id and secret-access-key for operating backups in S3. This field must be popluated when the `spec.s3bucket` field is specified for a backup or restore resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String s3Secret;

    public String getS3Secret() {
        return s3Secret;
    }

    public void setS3Secret(String s3Secret) {
        this.s3Secret = s3Secret;
    }

    /**
     * Selector allows CouchbaseBackup and CouchbaseBackupRestore resources to be filtered based on labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector allows CouchbaseBackup and CouchbaseBackupRestore resources to be filtered based on labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.backup.Selector selector;

    public com.couchbase.v2.couchbaseclusterspec.backup.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbaseclusterspec.backup.Selector selector) {
        this.selector = selector;
    }

    /**
     * The Service Account to run backup (and restore) pods under. Without this backup pods will not be able to update status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Service Account to run backup (and restore) pods under. Without this backup pods will not be able to update status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccountName = "couchbase-backup";

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * Tolerations specifies all backup and restore pod tolerations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tolerations specifies all backup and restore pod tolerations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.backup.Tolerations> tolerations;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.backup.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(java.util.List<com.couchbase.v2.couchbaseclusterspec.backup.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * Deprecated: by CouchbaseBackup.spec.objectStore.useIAM UseIAMRole enables backup to fetch EC2 instance metadata. This allows the AWS SDK to use the EC2's IAM Role for S3 access. UseIAMRole will ignore credentials in s3Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useIAMRole")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: by CouchbaseBackup.spec.objectStore.useIAM UseIAMRole enables backup to fetch EC2 instance metadata. This allows the AWS SDK to use the EC2's IAM Role for S3 access. UseIAMRole will ignore credentials in s3Secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean useIAMRole;

    public Boolean getUseIAMRole() {
        return useIAMRole;
    }

    public void setUseIAMRole(Boolean useIAMRole) {
        this.useIAMRole = useIAMRole;
    }
}


package com.couchbase.v2.couchbasebackupspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"endpoint","secret","uri","useIAM"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ObjectStore implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Endpoint contains the configuration for connecting to a custom Azure/S3/GCP compliant object store. If set will override `CouchbaseCluster.spec.backup.objectEndpoint` See https://docs.couchbase.com/server/current/backup-restore/cbbackupmgr-cloud.html#compatible-object-stores
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Endpoint contains the configuration for connecting to a custom Azure/S3/GCP compliant object store. If set will override `CouchbaseCluster.spec.backup.objectEndpoint` See https://docs.couchbase.com/server/current/backup-restore/cbbackupmgr-cloud.html#compatible-object-stores")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasebackupspec.objectstore.Endpoint endpoint;

    public com.couchbase.v2.couchbasebackupspec.objectstore.Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(com.couchbase.v2.couchbasebackupspec.objectstore.Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * ObjStoreSecret must contain two fields, access-key-id, secret-access-key and optionally either region or refresh-token. These correspond to the fields used by cbbackupmgr https://docs.couchbase.com/server/current/backup-restore/cbbackupmgr-backup.html#optional-2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObjStoreSecret must contain two fields, access-key-id, secret-access-key and optionally either region or refresh-token. These correspond to the fields used by cbbackupmgr https://docs.couchbase.com/server/current/backup-restore/cbbackupmgr-backup.html#optional-2")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * URI is a reference to a remote object store. This is the prefix of the object store and the bucket name. i.e s3://bucket, az://bucket or gs://bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    @io.fabric8.generator.annotation.Pattern("^(az|s3|gs)://.{3,}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI is a reference to a remote object store. This is the prefix of the object store and the bucket name. i.e s3://bucket, az://bucket or gs://bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Whether to allow the backup SDK to attempt to authenticate using the instance metadata api. If set, will override `CouchbaseCluster.spec.backup.useIAM`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useIAM")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to allow the backup SDK to attempt to authenticate using the instance metadata api. If set, will override `CouchbaseCluster.spec.backup.useIAM`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean useIAM;

    public Boolean getUseIAM() {
        return useIAM;
    }

    public void setUseIAM(Boolean useIAM) {
        this.useIAM = useIAM;
    }
}


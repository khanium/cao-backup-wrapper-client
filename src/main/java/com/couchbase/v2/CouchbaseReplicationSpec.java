package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bucket","compressionType","filterExpression","paused","remoteBucket"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseReplicationSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Bucket is the source bucket to replicate from.  This refers to the Couchbase bucket name, not the resource name of the bucket.  A bucket with this name must be defined on this cluster.  Legal bucket names have a maximum length of 100 characters and may be composed of any character from "a-z", "A-Z", "0-9" and "-_%\.".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_%\\.]{1,100}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bucket is the source bucket to replicate from.  This refers to the Couchbase bucket name, not the resource name of the bucket.  A bucket with this name must be defined on this cluster.  Legal bucket names have a maximum length of 100 characters and may be composed of any character from \"a-z\", \"A-Z\", \"0-9\" and \"-_%\\.\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bucket;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public enum CompressionType {

        @com.fasterxml.jackson.annotation.JsonProperty("None")
        NONE("None"), @com.fasterxml.jackson.annotation.JsonProperty("Auto")
        AUTO("Auto");

        String value;

        CompressionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * CompressionType is the type of compression to apply to the replication. When None, no compression will be applied to documents as they are transferred between clusters.  When Auto, Couchbase server will automatically compress documents as they are transferred to reduce bandwidth requirements. This field must be one of "None" or "Auto", defaulting to "Auto".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compressionType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CompressionType is the type of compression to apply to the replication. When None, no compression will be applied to documents as they are transferred between clusters.  When Auto, Couchbase server will automatically compress documents as they are transferred to reduce bandwidth requirements. This field must be one of \"None\" or \"Auto\", defaulting to \"Auto\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private CompressionType compressionType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"Auto\"", CompressionType.class);

    public CompressionType getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * FilterExpression allows certain documents to be filtered out of the replication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterExpression")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FilterExpression allows certain documents to be filtered out of the replication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String filterExpression;

    public String getFilterExpression() {
        return filterExpression;
    }

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * Paused allows a replication to be stopped and restarted without having to restart the replication from the beginning.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paused")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Paused allows a replication to be stopped and restarted without having to restart the replication from the beginning.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean paused;

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    /**
     * RemoteBucket is the remote bucket name to synchronize to.  This refers to the Couchbase bucket name, not the resource name of the bucket.  Legal bucket names have a maximum length of 100 characters and may be composed of any character from "a-z", "A-Z", "0-9" and "-_%\.".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteBucket")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_%\\.]{1,100}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RemoteBucket is the remote bucket name to synchronize to.  This refers to the Couchbase bucket name, not the resource name of the bucket.  Legal bucket names have a maximum length of 100 characters and may be composed of any character from \"a-z\", \"A-Z\", \"0-9\" and \"-_%\\.\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String remoteBucket;

    public String getRemoteBucket() {
        return remoteBucket;
    }

    public void setRemoteBucket(String remoteBucket) {
        this.remoteBucket = remoteBucket;
    }
}


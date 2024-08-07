package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enableFlush","memoryQuota","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseMemcachedBucketSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * MemoryQuota is a memory limit to the size of a bucket. The memory quota is defined per Couchbase pod running the data service.  This field defaults to, and must be greater than or equal to 100Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryQuota")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemoryQuota is a memory limit to the size of a bucket. The memory quota is defined per Couchbase pod running the data service.  This field defaults to, and must be greater than or equal to 100Mi.  More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString memoryQuota = new io.fabric8.kubernetes.api.model.IntOrString("100Mi");

    public io.fabric8.kubernetes.api.model.IntOrString getMemoryQuota() {
        return memoryQuota;
    }

    public void setMemoryQuota(io.fabric8.kubernetes.api.model.IntOrString memoryQuota) {
        this.memoryQuota = memoryQuota;
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
}


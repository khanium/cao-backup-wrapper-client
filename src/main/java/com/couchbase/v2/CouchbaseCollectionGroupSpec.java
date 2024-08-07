package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"maxTTL","names"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseCollectionGroupSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * MaxTTL defines how long a document is permitted to exist for, without modification, until it is automatically deleted.  This field takes precedence over any TTL defined at the bucket level.  This is a default, and maximum time-to-live and may be set to a lower value by the client.  If the client specifies a higher value, then it is truncated to the maximum durability.  Documents are removed by Couchbase, after they have expired, when either accessed, the expiry pager is run, or the bucket is compacted.  When set to 0, then documents are not expired by default.  This field must be a duration in the range 0-2147483648s, defaulting to 0.  More info: https://golang.org/pkg/time/#ParseDuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTTL")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MaxTTL defines how long a document is permitted to exist for, without modification, until it is automatically deleted.  This field takes precedence over any TTL defined at the bucket level.  This is a default, and maximum time-to-live and may be set to a lower value by the client.  If the client specifies a higher value, then it is truncated to the maximum durability.  Documents are removed by Couchbase, after they have expired, when either accessed, the expiry pager is run, or the bucket is compacted.  When set to 0, then documents are not expired by default.  This field must be a duration in the range 0-2147483648s, defaulting to 0.  More info: https://golang.org/pkg/time/#ParseDuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String maxTTL;

    public String getMaxTTL() {
        return maxTTL;
    }

    public void setMaxTTL(String maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * Names specifies the names of the collections.  Unlike CouchbaseCollection, which specifies a single collection, a collection group specifies multiple, and the collection group must specify at least one collection name. Any collection names specified must be unique. Collection names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("names")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Names specifies the names of the collections.  Unlike CouchbaseCollection, which specifies a single collection, a collection group specifies multiple, and the collection group must specify at least one collection name. Any collection names specified must be unique. Collection names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> names;

    public java.util.List<String> getNames() {
        return names;
    }

    public void setNames(java.util.List<String> names) {
        this.names = names;
    }
}


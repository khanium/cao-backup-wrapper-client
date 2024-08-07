package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"maxTTL","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseCollectionSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * Name specifies the name of the collection.  By default, the metadata.name is used to define the collection name, however, due to the limited character set, this field can be used to override the default and provide the full functionality. Additionally the `metadata.name` field is a DNS label, and thus limited to 63 characters, this field must be used if the name is longer than this limit. Collection names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9\\-][a-zA-Z0-9\\-%_]{0,250}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name specifies the name of the collection.  By default, the metadata.name is used to define the collection name, however, due to the limited character set, this field can be used to override the default and provide the full functionality. Additionally the `metadata.name` field is a DNS label, and thus limited to 63 characters, this field must be used if the name is longer than this limit. Collection names must be 1-251 characters in length, contain only [a-zA-Z0-9_-%] and not start with either _ or %.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


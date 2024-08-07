package com.couchbase.v2.couchbasebackupspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exclude","include"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Data implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Exclude defines the buckets, scopes or collections that are excluded from the backup. When this field is set, it implies that by default everything will be backed up, and data items can be explicitly excluded.  You may define an exclusion as a bucket -- `my-bucket`, a scope -- `my-bucket.my-scope`, or a collection -- `my-bucket.my-scope.my-collection`. Buckets may contain periods, and therefore must be escaped -- `my\.bucket.my-scope`, as period is the separator used to delimit scopes and collections.  Excluded data cannot overlap e.g. specifying `my-bucket` and `my-bucket.my-scope` is illegal.  This field cannot be used at the same time as included items.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exclude defines the buckets, scopes or collections that are excluded from the backup. When this field is set, it implies that by default everything will be backed up, and data items can be explicitly excluded.  You may define an exclusion as a bucket -- `my-bucket`, a scope -- `my-bucket.my-scope`, or a collection -- `my-bucket.my-scope.my-collection`. Buckets may contain periods, and therefore must be escaped -- `my\\.bucket.my-scope`, as period is the separator used to delimit scopes and collections.  Excluded data cannot overlap e.g. specifying `my-bucket` and `my-bucket.my-scope` is illegal.  This field cannot be used at the same time as included items.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> exclude;

    public java.util.List<String> getExclude() {
        return exclude;
    }

    public void setExclude(java.util.List<String> exclude) {
        this.exclude = exclude;
    }

    /**
     * Include defines the buckets, scopes or collections that are included in the backup. When this field is set, it implies that by default nothing will be backed up, and data items must be explicitly included.  You may define an inclusion as a bucket -- `my-bucket`, a scope -- `my-bucket.my-scope`, or a collection -- `my-bucket.my-scope.my-collection`. Buckets may contain periods, and therefore must be escaped -- `my\.bucket.my-scope`, as period is the separator used to delimit scopes and collections.  Included data cannot overlap e.g. specifying `my-bucket` and `my-bucket.my-scope` is illegal.  This field cannot be used at the same time as excluded items.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("include")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Include defines the buckets, scopes or collections that are included in the backup. When this field is set, it implies that by default nothing will be backed up, and data items must be explicitly included.  You may define an inclusion as a bucket -- `my-bucket`, a scope -- `my-bucket.my-scope`, or a collection -- `my-bucket.my-scope.my-collection`. Buckets may contain periods, and therefore must be escaped -- `my\\.bucket.my-scope`, as period is the separator used to delimit scopes and collections.  Included data cannot overlap e.g. specifying `my-bucket` and `my-bucket.my-scope` is illegal.  This field cannot be used at the same time as excluded items.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> include;

    public java.util.List<String> getInclude() {
        return include;
    }

    public void setInclude(java.util.List<String> include) {
        this.include = include;
    }
}


package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"managed","selector","synchronize"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Buckets implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Managed defines whether buckets are managed by the Operator (true), or user managed (false). When Operator managed, all buckets must be defined with either CouchbaseBucket, CouchbaseEphemeralBucket or CouchbaseMemcachedBucket resources.  Manual addition of buckets will be reverted by the Operator.  When user managed, the Operator will not interrogate buckets at all.  This field defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Managed defines whether buckets are managed by the Operator (true), or user managed (false). When Operator managed, all buckets must be defined with either CouchbaseBucket, CouchbaseEphemeralBucket or CouchbaseMemcachedBucket resources.  Manual addition of buckets will be reverted by the Operator.  When user managed, the Operator will not interrogate buckets at all.  This field defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean managed;

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * Selector is a label selector used to list buckets in the namespace that are managed by the Operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector is a label selector used to list buckets in the namespace that are managed by the Operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.buckets.Selector selector;

    public com.couchbase.v2.couchbaseclusterspec.buckets.Selector getSelector() {
        return selector;
    }

    public void setSelector(com.couchbase.v2.couchbaseclusterspec.buckets.Selector selector) {
        this.selector = selector;
    }

    /**
     * Synchronize allows unmanaged buckets, scopes, and collections to be synchronized as Kubernetes resources by the Operator.  This feature is intended for development only and should not be used for production workloads.  The synchronization workflow starts with `spec.buckets.managed` being set to false, the user can manually create buckets, scopes, and collections using the Couchbase UI, or other tooling.  When you wish to commit to Kubernetes resources, you must specify a unique label selector in the `spec.buckets.selector` field, and this field is set to true.  The Operator will create Kubernetes resources for you, and upon completion set the cluster's `Synchronized` status condition. Synchronizing will not create a Kubernetes resource for the Couchbase Server maintained _system scope. You may then safely set `spec.buckets.managed` to true and the Operator will manage these resources as per usual.  To update an already managed data topology, you must first set it to unmanaged, make any changes, and delete any old resources, then follow the standard synchronization workflow.  The Operator can not, and will not, ever delete, or make modifications to resource specifications that are intended to be user managed, or managed by a life cycle management tool. These actions must be instigated by an end user.  For a more complete experience, refer to the documentation for the `cao save` and `cao restore` CLI commands.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("synchronize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Synchronize allows unmanaged buckets, scopes, and collections to be synchronized as Kubernetes resources by the Operator.  This feature is intended for development only and should not be used for production workloads.  The synchronization workflow starts with `spec.buckets.managed` being set to false, the user can manually create buckets, scopes, and collections using the Couchbase UI, or other tooling.  When you wish to commit to Kubernetes resources, you must specify a unique label selector in the `spec.buckets.selector` field, and this field is set to true.  The Operator will create Kubernetes resources for you, and upon completion set the cluster's `Synchronized` status condition. Synchronizing will not create a Kubernetes resource for the Couchbase Server maintained _system scope. You may then safely set `spec.buckets.managed` to true and the Operator will manage these resources as per usual.  To update an already managed data topology, you must first set it to unmanaged, make any changes, and delete any old resources, then follow the standard synchronization workflow.  The Operator can not, and will not, ever delete, or make modifications to resource specifications that are intended to be user managed, or managed by a life cycle management tool. These actions must be instigated by an end user.  For a more complete experience, refer to the documentation for the `cao save` and `cao restore` CLI commands.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean synchronize;

    public Boolean getSynchronize() {
        return synchronize;
    }

    public void setSynchronize(Boolean synchronize) {
        this.synchronize = synchronize;
    }
}


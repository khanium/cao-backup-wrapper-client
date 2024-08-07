package com.couchbase.v2.couchbasebackuprestorespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"size","storageClassName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class StagingVolume implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Size allows the specification of a staging volume. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes The ephemeral volume will only be used when restoring from a cloud provider, if the backup job was created using ephemeral storage. Otherwise the restore job will share a staging volume with the backup job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size allows the specification of a staging volume. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes The ephemeral volume will only be used when restoring from a cloud provider, if the backup job was created using ephemeral storage. Otherwise the restore job will share a staging volume with the backup job.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString size = new io.fabric8.kubernetes.api.model.IntOrString("20Gi");

    public io.fabric8.kubernetes.api.model.IntOrString getSize() {
        return size;
    }

    public void setSize(io.fabric8.kubernetes.api.model.IntOrString size) {
        this.size = size;
    }

    /**
     * Name of StorageClass to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of StorageClass to use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageClassName;

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }
}


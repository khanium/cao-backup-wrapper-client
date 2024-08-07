package com.couchbase.v2.couchbaseclusterspec.cluster;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"backfillEnabled","temporarySpace","temporarySpaceUnlimited"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Query implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * BackfillEnabled allows the query service to backfill.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backfillEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BackfillEnabled allows the query service to backfill.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean backfillEnabled = true;

    public Boolean getBackfillEnabled() {
        return backfillEnabled;
    }

    public void setBackfillEnabled(Boolean backfillEnabled) {
        this.backfillEnabled = backfillEnabled;
    }

    /**
     * TemporarySpace allows the temporary storage used by the query service backfill, per-pod, to be modified.  This field requires `backfillEnabled` to be set to true in order to have any effect. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temporarySpace")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TemporarySpace allows the temporary storage used by the query service backfill, per-pod, to be modified.  This field requires `backfillEnabled` to be set to true in order to have any effect. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#resource-units-in-kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString temporarySpace = new io.fabric8.kubernetes.api.model.IntOrString("5Gi");

    public io.fabric8.kubernetes.api.model.IntOrString getTemporarySpace() {
        return temporarySpace;
    }

    public void setTemporarySpace(io.fabric8.kubernetes.api.model.IntOrString temporarySpace) {
        this.temporarySpace = temporarySpace;
    }

    /**
     * TemporarySpaceUnlimited allows the temporary storage used by the query service backfill, per-pod, to be unconstrained.  This field requires `backfillEnabled` to be set to true in order to have any effect. This field overrides `temporarySpace`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temporarySpaceUnlimited")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TemporarySpaceUnlimited allows the temporary storage used by the query service backfill, per-pod, to be unconstrained.  This field requires `backfillEnabled` to be set to true in order to have any effect. This field overrides `temporarySpace`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean temporarySpaceUnlimited;

    public Boolean getTemporarySpaceUnlimited() {
        return temporarySpaceUnlimited;
    }

    public void setTemporarySpaceUnlimited(Boolean temporarySpaceUnlimited) {
        this.temporarySpaceUnlimited = temporarySpaceUnlimited;
    }
}


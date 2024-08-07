package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"audit","logRetentionCount","logRetentionTime","server"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Logging implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Used to manage the audit configuration directly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("audit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Used to manage the audit configuration directly")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.Audit audit;

    public com.couchbase.v2.couchbaseclusterspec.logging.Audit getAudit() {
        return audit;
    }

    public void setAudit(com.couchbase.v2.couchbaseclusterspec.logging.Audit audit) {
        this.audit = audit;
    }

    /**
     * LogRetentionCount gives the number of persistent log PVCs to keep.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logRetentionCount")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogRetentionCount gives the number of persistent log PVCs to keep.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long logRetentionCount;

    public Long getLogRetentionCount() {
        return logRetentionCount;
    }

    public void setLogRetentionCount(Long logRetentionCount) {
        this.logRetentionCount = logRetentionCount;
    }

    /**
     * LogRetentionTime gives the time to keep persistent log PVCs alive for.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logRetentionTime")
    @io.fabric8.generator.annotation.Pattern("^\\d+(ns|us|ms|s|m|h)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogRetentionTime gives the time to keep persistent log PVCs alive for.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logRetentionTime;

    public String getLogRetentionTime() {
        return logRetentionTime;
    }

    public void setLogRetentionTime(String logRetentionTime) {
        this.logRetentionTime = logRetentionTime;
    }

    /**
     * Specification of all logging configuration required to manage the sidecar containers in each pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specification of all logging configuration required to manage the sidecar containers in each pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.Server server;

    public com.couchbase.v2.couchbaseclusterspec.logging.Server getServer() {
        return server;
    }

    public void setServer(com.couchbase.v2.couchbaseclusterspec.logging.Server server) {
        this.server = server;
    }
}


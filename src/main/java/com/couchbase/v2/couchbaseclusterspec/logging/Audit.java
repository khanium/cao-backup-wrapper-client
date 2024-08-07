package com.couchbase.v2.couchbaseclusterspec.logging;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"disabledEvents","disabledUsers","enabled","garbageCollection","rotation"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Audit implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The list of event ids to disable for auditing purposes. This is passed to the REST API with no verification by the operator. Refer to the documentation for details: https://docs.couchbase.com/server/current/audit-event-reference/audit-event-reference.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disabledEvents")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The list of event ids to disable for auditing purposes. This is passed to the REST API with no verification by the operator. Refer to the documentation for details: https://docs.couchbase.com/server/current/audit-event-reference/audit-event-reference.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Long> disabledEvents;

    public java.util.List<Long> getDisabledEvents() {
        return disabledEvents;
    }

    public void setDisabledEvents(java.util.List<Long> disabledEvents) {
        this.disabledEvents = disabledEvents;
    }

    /**
     * The list of users to ignore for auditing purposes. This is passed to the REST API with minimal validation it meets an acceptable regex pattern. Refer to the documentation for full details on how to configure this: https://docs.couchbase.com/server/current/manage/manage-security/manage-auditing.html#ignoring-events-by-user
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disabledUsers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The list of users to ignore for auditing purposes. This is passed to the REST API with minimal validation it meets an acceptable regex pattern. Refer to the documentation for full details on how to configure this: https://docs.couchbase.com/server/current/manage/manage-security/manage-auditing.html#ignoring-events-by-user")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> disabledUsers;

    public java.util.List<String> getDisabledUsers() {
        return disabledUsers;
    }

    public void setDisabledUsers(java.util.List<String> disabledUsers) {
        this.disabledUsers = disabledUsers;
    }

    /**
     * Enabled is a boolean that enables the audit capabilities.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is a boolean that enables the audit capabilities.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Handle all optional garbage collection (GC) configuration for the audit functionality. This is not part of the audit REST API, it is intended to handle GC automatically for the audit logs. By default the Couchbase Server rotates the audit logs but does not clean up the rotated logs. This is left as an operation for the cluster administrator to manage, the operator allows for us to automate this: https://docs.couchbase.com/server/current/manage/manage-security/manage-auditing.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("garbageCollection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Handle all optional garbage collection (GC) configuration for the audit functionality. This is not part of the audit REST API, it is intended to handle GC automatically for the audit logs. By default the Couchbase Server rotates the audit logs but does not clean up the rotated logs. This is left as an operation for the cluster administrator to manage, the operator allows for us to automate this: https://docs.couchbase.com/server/current/manage/manage-security/manage-auditing.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.audit.GarbageCollection garbageCollection;

    public com.couchbase.v2.couchbaseclusterspec.logging.audit.GarbageCollection getGarbageCollection() {
        return garbageCollection;
    }

    public void setGarbageCollection(com.couchbase.v2.couchbaseclusterspec.logging.audit.GarbageCollection garbageCollection) {
        this.garbageCollection = garbageCollection;
    }

    /**
     * The interval to optionally rotate the audit log. This is passed to the REST API, see here for details: https://docs.couchbase.com/server/current/manage/manage-security/manage-auditing.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rotation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interval to optionally rotate the audit log. This is passed to the REST API, see here for details: https://docs.couchbase.com/server/current/manage/manage-security/manage-auditing.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.logging.audit.Rotation rotation;

    public com.couchbase.v2.couchbaseclusterspec.logging.audit.Rotation getRotation() {
        return rotation;
    }

    public void setRotation(com.couchbase.v2.couchbaseclusterspec.logging.audit.Rotation rotation) {
        this.rotation = rotation;
    }
}


package com.couchbase.v2.couchbasegroupspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bucket","buckets","collections","name","scopes"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Roles implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Bucket name for bucket admin roles.  When not specified for a role that can be scoped to a specific bucket, the role will apply to all buckets in the cluster. Deprecated:  Couchbase Autonomous Operator 2.3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    @io.fabric8.generator.annotation.Pattern("^\\*$|^[a-zA-Z0-9-_%\\.]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bucket name for bucket admin roles.  When not specified for a role that can be scoped to a specific bucket, the role will apply to all buckets in the cluster. Deprecated:  Couchbase Autonomous Operator 2.3")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bucket;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * Bucket level access to apply to specified role. The bucket must exist.  When not specified, the bucket field will be checked. If both are empty and the role can be scoped to a specific bucket, the role will apply to all buckets in the cluster
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buckets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bucket level access to apply to specified role. The bucket must exist.  When not specified, the bucket field will be checked. If both are empty and the role can be scoped to a specific bucket, the role will apply to all buckets in the cluster")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasegroupspec.roles.Buckets buckets;

    public com.couchbase.v2.couchbasegroupspec.roles.Buckets getBuckets() {
        return buckets;
    }

    public void setBuckets(com.couchbase.v2.couchbasegroupspec.roles.Buckets buckets) {
        this.buckets = buckets;
    }

    /**
     * Collection level access to apply to the specified role.  The collection must exist. When not specified, the role is subject to scope or bucket level access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collections")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Collection level access to apply to the specified role.  The collection must exist. When not specified, the role is subject to scope or bucket level access.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasegroupspec.roles.Collections collections;

    public com.couchbase.v2.couchbasegroupspec.roles.Collections getCollections() {
        return collections;
    }

    public void setCollections(com.couchbase.v2.couchbasegroupspec.roles.Collections collections) {
        this.collections = collections;
    }

    public enum Name {

        @com.fasterxml.jackson.annotation.JsonProperty("admin")
        ADMIN("admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("analytics_admin")
        ANALYTICS_ADMIN("analytics_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("analytics_manager")
        ANALYTICS_MANAGER("analytics_manager"),
        @com.fasterxml.jackson.annotation.JsonProperty("analytics_reader")
        ANALYTICS_READER("analytics_reader"),
        @com.fasterxml.jackson.annotation.JsonProperty("analytics_select")
        ANALYTICS_SELECT("analytics_select"),
        @com.fasterxml.jackson.annotation.JsonProperty("backup_admin")
        BACKUP_ADMIN("backup_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("bucket_admin")
        BUCKET_ADMIN("bucket_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("bucket_full_access")
        BUCKET_FULL_ACCESS("bucket_full_access"),
        @com.fasterxml.jackson.annotation.JsonProperty("cluster_admin")
        CLUSTER_ADMIN("cluster_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("data_backup")
        DATA_BACKUP("data_backup"),
        @com.fasterxml.jackson.annotation.JsonProperty("data_dcp_reader")
        DATA_DCP_READER("data_dcp_reader"),
        @com.fasterxml.jackson.annotation.JsonProperty("data_monitoring")
        DATA_MONITORING("data_monitoring"),
        @com.fasterxml.jackson.annotation.JsonProperty("data_reader")
        DATA_READER("data_reader"),
        @com.fasterxml.jackson.annotation.JsonProperty("data_writer")
        DATA_WRITER("data_writer"),
        @com.fasterxml.jackson.annotation.JsonProperty("eventing_admin")
        EVENTING_ADMIN("eventing_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("external_stats_reader")
        EXTERNAL_STATS_READER("external_stats_reader"),
        @com.fasterxml.jackson.annotation.JsonProperty("fts_admin")
        FTS_ADMIN("fts_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("fts_searcher")
        FTS_SEARCHER("fts_searcher"),
        @com.fasterxml.jackson.annotation.JsonProperty("mobile_sync_gateway")
        MOBILE_SYNC_GATEWAY("mobile_sync_gateway"),
        @com.fasterxml.jackson.annotation.JsonProperty("mobile_sync_gateway_application")
        MOBILE_SYNC_GATEWAY_APPLICATION("mobile_sync_gateway_application"),
        @com.fasterxml.jackson.annotation.JsonProperty("mobile_sync_gateway_application_read_only")
        MOBILE_SYNC_GATEWAY_APPLICATION_READ_ONLY("mobile_sync_gateway_application_read_only"),
        @com.fasterxml.jackson.annotation.JsonProperty("mobile_sync_gateway_architect")
        MOBILE_SYNC_GATEWAY_ARCHITECT("mobile_sync_gateway_architect"),
        @com.fasterxml.jackson.annotation.JsonProperty("mobile_sync_gateway_dev_ops")
        MOBILE_SYNC_GATEWAY_DEV_OPS("mobile_sync_gateway_dev_ops"),
        @com.fasterxml.jackson.annotation.JsonProperty("mobile_sync_gateway_replicator")
        MOBILE_SYNC_GATEWAY_REPLICATOR("mobile_sync_gateway_replicator"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_delete")
        QUERY_DELETE("query_delete"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_execute_external_functions")
        QUERY_EXECUTE_EXTERNAL_FUNCTIONS("query_execute_external_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_execute_functions")
        QUERY_EXECUTE_FUNCTIONS("query_execute_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_execute_global_external_functions")
        QUERY_EXECUTE_GLOBAL_EXTERNAL_FUNCTIONS("query_execute_global_external_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_execute_global_functions")
        QUERY_EXECUTE_GLOBAL_FUNCTIONS("query_execute_global_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_external_access")
        QUERY_EXTERNAL_ACCESS("query_external_access"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_insert")
        QUERY_INSERT("query_insert"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_manage_external_functions")
        QUERY_MANAGE_EXTERNAL_FUNCTIONS("query_manage_external_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_manage_functions")
        QUERY_MANAGE_FUNCTIONS("query_manage_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_manage_global_external_functions")
        QUERY_MANAGE_GLOBAL_EXTERNAL_FUNCTIONS("query_manage_global_external_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_manage_global_functions")
        QUERY_MANAGE_GLOBAL_FUNCTIONS("query_manage_global_functions"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_manage_index")
        QUERY_MANAGE_INDEX("query_manage_index"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_select")
        QUERY_SELECT("query_select"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_system_catalog")
        QUERY_SYSTEM_CATALOG("query_system_catalog"),
        @com.fasterxml.jackson.annotation.JsonProperty("query_update")
        QUERY_UPDATE("query_update"),
        @com.fasterxml.jackson.annotation.JsonProperty("replication_admin")
        REPLICATION_ADMIN("replication_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("replication_target")
        REPLICATION_TARGET("replication_target"),
        @com.fasterxml.jackson.annotation.JsonProperty("ro_admin")
        RO_ADMIN("ro_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("scope_admin")
        SCOPE_ADMIN("scope_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("security_admin")
        SECURITY_ADMIN("security_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("security_admin_external")
        SECURITY_ADMIN_EXTERNAL("security_admin_external"),
        @com.fasterxml.jackson.annotation.JsonProperty("security_admin_local")
        SECURITY_ADMIN_LOCAL("security_admin_local"),
        @com.fasterxml.jackson.annotation.JsonProperty("views_admin")
        VIEWS_ADMIN("views_admin"),
        @com.fasterxml.jackson.annotation.JsonProperty("views_reader")
        VIEWS_READER("views_reader");

        String value;

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Name of role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of role.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Scope level access to apply to specified role.  The scope must exist.  When not specified, the role will apply to selected bucket or all buckets in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scope level access to apply to specified role.  The scope must exist.  When not specified, the role will apply to selected bucket or all buckets in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbasegroupspec.roles.Scopes scopes;

    public com.couchbase.v2.couchbasegroupspec.roles.Scopes getScopes() {
        return scopes;
    }

    public void setScopes(com.couchbase.v2.couchbasegroupspec.roles.Scopes scopes) {
        this.scopes = scopes;
    }
}


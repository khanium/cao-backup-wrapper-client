package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"roleRef","subjects"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseRoleBindingSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CouchbaseGroup being bound to subjects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roleRef")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CouchbaseGroup being bound to subjects.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaserolebindingspec.RoleRef roleRef;

    public com.couchbase.v2.couchbaserolebindingspec.RoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(com.couchbase.v2.couchbaserolebindingspec.RoleRef roleRef) {
        this.roleRef = roleRef;
    }

    /**
     * List of users to bind a role to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjects")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of users to bind a role to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaserolebindingspec.Subjects> subjects;

    public java.util.List<com.couchbase.v2.couchbaserolebindingspec.Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(java.util.List<com.couchbase.v2.couchbaserolebindingspec.Subjects> subjects) {
        this.subjects = subjects;
    }
}


package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ldapGroupRef","roles"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseGroupSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * LDAPGroupRef is a reference to an LDAP group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ldapGroupRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LDAPGroupRef is a reference to an LDAP group.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ldapGroupRef;

    public String getLdapGroupRef() {
        return ldapGroupRef;
    }

    public void setLdapGroupRef(String ldapGroupRef) {
        this.ldapGroupRef = ldapGroupRef;
    }

    /**
     * Roles is a list of roles that this group is granted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Roles is a list of roles that this group is granted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbasegroupspec.Roles> roles;

    public java.util.List<com.couchbase.v2.couchbasegroupspec.Roles> getRoles() {
        return roles;
    }

    public void setRoles(java.util.List<com.couchbase.v2.couchbasegroupspec.Roles> roles) {
        this.roles = roles;
    }
}


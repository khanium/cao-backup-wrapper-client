package com.couchbase.v2.couchbaseclusterspec.security.ldap;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"query","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class UserDNMapping implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Query is the LDAP query to run to map from Couchbase user to LDAP distinguished name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Query is the LDAP query to run to map from Couchbase user to LDAP distinguished name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * This field specifies list of templates to use for providing username to DN mapping. The template may contain a placeholder specified as `%u` to represent the Couchbase user who is attempting to gain access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field specifies list of templates to use for providing username to DN mapping. The template may contain a placeholder specified as `%u` to represent the Couchbase user who is attempting to gain access.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String template;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}


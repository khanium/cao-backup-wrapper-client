package com.couchbase.v2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authDomain","authSecret","fullName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseUserSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum AuthDomain {

        @com.fasterxml.jackson.annotation.JsonProperty("local")
        LOCAL("local"), @com.fasterxml.jackson.annotation.JsonProperty("external")
        EXTERNAL("external");

        String value;

        AuthDomain(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * The domain which provides user authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authDomain")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The domain which provides user authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private AuthDomain authDomain;

    public AuthDomain getAuthDomain() {
        return authDomain;
    }

    public void setAuthDomain(AuthDomain authDomain) {
        this.authDomain = authDomain;
    }

    /**
     * Name of Kubernetes secret with password for Couchbase domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of Kubernetes secret with password for Couchbase domain.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String authSecret;

    public String getAuthSecret() {
        return authSecret;
    }

    public void setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
    }

    /**
     * Full Name of Couchbase user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fullName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Full Name of Couchbase user.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}


package com.couchbase.v2.couchbaseclusterspec.security;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authenticationEnabled","authorizationEnabled","bindDN","bindSecret","cacert","cacheValueLifetime","encryption","groupsQuery","hosts","nestedGroupsEnabled","nestedGroupsMaxDepth","port","serverCertValidation","tlsSecret","userDNMapping"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ldap implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AuthenticationEnabled allows users who attempt to access Couchbase Server without having been added as local users to be authenticated against the specified LDAP Host(s).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AuthenticationEnabled allows users who attempt to access Couchbase Server without having been added as local users to be authenticated against the specified LDAP Host(s).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean authenticationEnabled = true;

    public Boolean getAuthenticationEnabled() {
        return authenticationEnabled;
    }

    public void setAuthenticationEnabled(Boolean authenticationEnabled) {
        this.authenticationEnabled = authenticationEnabled;
    }

    /**
     * AuthorizationEnabled allows authenticated LDAP users to be authorized with RBAC roles granted to any Couchbase Server group associated with the user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AuthorizationEnabled allows authenticated LDAP users to be authorized with RBAC roles granted to any Couchbase Server group associated with the user.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean authorizationEnabled;

    public Boolean getAuthorizationEnabled() {
        return authorizationEnabled;
    }

    public void setAuthorizationEnabled(Boolean authorizationEnabled) {
        this.authorizationEnabled = authorizationEnabled;
    }

    /**
     * DN to use for searching users and groups synchronization. More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bindDN")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DN to use for searching users and groups synchronization. More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bindDN;

    public String getBindDN() {
        return bindDN;
    }

    public void setBindDN(String bindDN) {
        this.bindDN = bindDN;
    }

    /**
     * BindSecret is the name of a Kubernetes secret to use containing password for LDAP user binding. The bindSecret must have a key with the name "password" and a value which corresponds to the password of the binding LDAP user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bindSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BindSecret is the name of a Kubernetes secret to use containing password for LDAP user binding. The bindSecret must have a key with the name \"password\" and a value which corresponds to the password of the binding LDAP user.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bindSecret;

    public String getBindSecret() {
        return bindSecret;
    }

    public void setBindSecret(String bindSecret) {
        this.bindSecret = bindSecret;
    }

    /**
     * DEPRECATED - Field is ignored, use tlsSecret. CA Certificate in PEM format to be used in LDAP server certificate validation. This cert is the string form of the secret provided to `spec.tls.tlsSecret`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cacert")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - Field is ignored, use tlsSecret. CA Certificate in PEM format to be used in LDAP server certificate validation. This cert is the string form of the secret provided to `spec.tls.tlsSecret`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cacert;

    public String getCacert() {
        return cacert;
    }

    public void setCacert(String cacert) {
        this.cacert = cacert;
    }

    /**
     * Lifetime of values in cache in milliseconds. Default 300000 ms.  More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheValueLifetime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Lifetime of values in cache in milliseconds. Default 300000 ms.  More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long cacheValueLifetime = 30000L;

    public Long getCacheValueLifetime() {
        return cacheValueLifetime;
    }

    public void setCacheValueLifetime(Long cacheValueLifetime) {
        this.cacheValueLifetime = cacheValueLifetime;
    }

    public enum Encryption {

        @com.fasterxml.jackson.annotation.JsonProperty("None")
        NONE("None"), @com.fasterxml.jackson.annotation.JsonProperty("StartTLSExtension")
        STARTTLSEXTENSION("StartTLSExtension"), @com.fasterxml.jackson.annotation.JsonProperty("TLS")
        TLS("TLS");

        String value;

        Encryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * Encryption determines how the connection with the LDAP server should be encrypted. Encryption may set as either StartTLSExtension, TLS, or false. When set to "false" then no verification of the LDAP hostname is performed. When Encryption is StartTLSExtension, or TLS is set then the default behavior is to use the certificate already loaded into the Couchbase Cluster for certificate validation, otherwise `ldap.tlsSecret` may be set to override The Couchbase certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryption")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Encryption determines how the connection with the LDAP server should be encrypted. Encryption may set as either StartTLSExtension, TLS, or false. When set to \"false\" then no verification of the LDAP hostname is performed. When Encryption is StartTLSExtension, or TLS is set then the default behavior is to use the certificate already loaded into the Couchbase Cluster for certificate validation, otherwise `ldap.tlsSecret` may be set to override The Couchbase certificate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Encryption encryption;

    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * LDAP query, to get the users' groups by username in RFC4516 format.  More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupsQuery")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LDAP query, to get the users' groups by username in RFC4516 format.  More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupsQuery;

    public String getGroupsQuery() {
        return groupsQuery;
    }

    public void setGroupsQuery(String groupsQuery) {
        this.groupsQuery = groupsQuery;
    }

    /**
     * List of LDAP hosts to provide authentication-support for Couchbase Server. Host name must be a valid IP address or DNS Name e.g openldap.default.svc, 10.0.92.147.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of LDAP hosts to provide authentication-support for Couchbase Server. Host name must be a valid IP address or DNS Name e.g openldap.default.svc, 10.0.92.147.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> hosts;

    public java.util.List<String> getHosts() {
        return hosts;
    }

    public void setHosts(java.util.List<String> hosts) {
        this.hosts = hosts;
    }

    /**
     * If enabled Couchbase server will try to recursively search for groups for every discovered ldap group. groups_query will be user for the search. More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nestedGroupsEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If enabled Couchbase server will try to recursively search for groups for every discovered ldap group. groups_query will be user for the search. More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean nestedGroupsEnabled;

    public Boolean getNestedGroupsEnabled() {
        return nestedGroupsEnabled;
    }

    public void setNestedGroupsEnabled(Boolean nestedGroupsEnabled) {
        this.nestedGroupsEnabled = nestedGroupsEnabled;
    }

    /**
     * Maximum number of recursive groups requests the server is allowed to perform. Requires NestedGroupsEnabled.  Values between 1 and 100: the default is 10. More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nestedGroupsMaxDepth")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of recursive groups requests the server is allowed to perform. Requires NestedGroupsEnabled.  Values between 1 and 100: the default is 10. More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long nestedGroupsMaxDepth = 10L;

    public Long getNestedGroupsMaxDepth() {
        return nestedGroupsMaxDepth;
    }

    public void setNestedGroupsMaxDepth(Long nestedGroupsMaxDepth) {
        this.nestedGroupsMaxDepth = nestedGroupsMaxDepth;
    }

    /**
     * LDAP port. This is typically 389 for LDAP, and 636 for LDAPS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LDAP port. This is typically 389 for LDAP, and 636 for LDAPS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port = 389L;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * Whether server certificate validation be enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCertValidation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether server certificate validation be enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean serverCertValidation;

    public Boolean getServerCertValidation() {
        return serverCertValidation;
    }

    public void setServerCertValidation(Boolean serverCertValidation) {
        this.serverCertValidation = serverCertValidation;
    }

    /**
     * TLSSecret is the name of a Kubernetes secret to use explcitly for LDAP ca cert. If TLSSecret is not provided, certificates found in `couchbaseclusters.spec.networking.tls.rootCAs` will be used instead. If provided, the secret must contain the ca to be used under the name "ca.crt".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSSecret is the name of a Kubernetes secret to use explcitly for LDAP ca cert. If TLSSecret is not provided, certificates found in `couchbaseclusters.spec.networking.tls.rootCAs` will be used instead. If provided, the secret must contain the ca to be used under the name \"ca.crt\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsSecret;

    public String getTlsSecret() {
        return tlsSecret;
    }

    public void setTlsSecret(String tlsSecret) {
        this.tlsSecret = tlsSecret;
    }

    /**
     * User to distinguished name (DN) mapping. If none is specified, the username is used as the user’s distinguished name.  More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userDNMapping")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("User to distinguished name (DN) mapping. If none is specified, the username is used as the user’s distinguished name.  More info: https://docs.couchbase.com/server/current/manage/manage-security/configure-ldap.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.security.ldap.UserDNMapping userDNMapping;

    public com.couchbase.v2.couchbaseclusterspec.security.ldap.UserDNMapping getUserDNMapping() {
        return userDNMapping;
    }

    public void setUserDNMapping(com.couchbase.v2.couchbaseclusterspec.security.ldap.UserDNMapping userDNMapping) {
        this.userDNMapping = userDNMapping;
    }
}


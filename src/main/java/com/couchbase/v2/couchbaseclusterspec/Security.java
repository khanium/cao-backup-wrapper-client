package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"adminSecret","ldap","podSecurityContext","rbac","securityContext","uiSessionTimeout"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Security implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AdminSecret is the name of a Kubernetes secret to use for administrator authentication. The admin secret must contain the keys "username" and "password".  The password data must be at least 6 characters in length, and not contain the any of the characters `()<>,;:\"/[]?={}`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AdminSecret is the name of a Kubernetes secret to use for administrator authentication. The admin secret must contain the keys \"username\" and \"password\".  The password data must be at least 6 characters in length, and not contain the any of the characters `()<>,;:\\\"/[]?={}`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String adminSecret;

    public String getAdminSecret() {
        return adminSecret;
    }

    public void setAdminSecret(String adminSecret) {
        this.adminSecret = adminSecret;
    }

    /**
     * LDAP provides settings to authenticate and authorize LDAP users with Couchbase Server. When specified, the Operator keeps these settings in sync with Cocuhbase Server's LDAP configuration. Leave empty to manually manage LDAP configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ldap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LDAP provides settings to authenticate and authorize LDAP users with Couchbase Server. When specified, the Operator keeps these settings in sync with Cocuhbase Server's LDAP configuration. Leave empty to manually manage LDAP configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.security.Ldap ldap;

    public com.couchbase.v2.couchbaseclusterspec.security.Ldap getLdap() {
        return ldap;
    }

    public void setLdap(com.couchbase.v2.couchbaseclusterspec.security.Ldap ldap) {
        this.ldap = ldap;
    }

    /**
     * PodSecurityContext allows the configuration of the security context for all Couchbase server pods.  When using persistent volumes you may need to set the fsGroup field in order to write to the volume.  For non-root clusters you must also set runAsUser to 1000, corresponding to the Couchbase user in official container images.  More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podSecurityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PodSecurityContext allows the configuration of the security context for all Couchbase server pods.  When using persistent volumes you may need to set the fsGroup field in order to write to the volume.  For non-root clusters you must also set runAsUser to 1000, corresponding to the Couchbase user in official container images.  More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.security.PodSecurityContext podSecurityContext;

    public com.couchbase.v2.couchbaseclusterspec.security.PodSecurityContext getPodSecurityContext() {
        return podSecurityContext;
    }

    public void setPodSecurityContext(com.couchbase.v2.couchbaseclusterspec.security.PodSecurityContext podSecurityContext) {
        this.podSecurityContext = podSecurityContext;
    }

    /**
     * RBAC is the options provided for enabling and selecting RBAC User resources to manage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rbac")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RBAC is the options provided for enabling and selecting RBAC User resources to manage.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.security.Rbac rbac;

    public com.couchbase.v2.couchbaseclusterspec.security.Rbac getRbac() {
        return rbac;
    }

    public void setRbac(com.couchbase.v2.couchbaseclusterspec.security.Rbac rbac) {
        this.rbac = rbac;
    }

    /**
     * SecurityContext defines the security options the container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext. Use securityContext.allowPrivilegeEscalation field to grant more privileges than its parent process. More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecurityContext defines the security options the container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext. Use securityContext.allowPrivilegeEscalation field to grant more privileges than its parent process. More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.security.SecurityContext securityContext;

    public com.couchbase.v2.couchbaseclusterspec.security.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(com.couchbase.v2.couchbaseclusterspec.security.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * UISessionTimeout sets how long, in minutes, before a user is declared inactive and signed out from the Couchbase Server UI. 0 represents no time out.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uiSessionTimeout")
    @io.fabric8.generator.annotation.Max(16666.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UISessionTimeout sets how long, in minutes, before a user is declared inactive and signed out from the Couchbase Server UI. 0 represents no time out.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long uiSessionTimeout = 0L;

    public Long getUiSessionTimeout() {
        return uiSessionTimeout;
    }

    public void setUiSessionTimeout(Long uiSessionTimeout) {
        this.uiSessionTimeout = uiSessionTimeout;
    }
}


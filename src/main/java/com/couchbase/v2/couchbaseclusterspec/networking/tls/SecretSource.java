package com.couchbase.v2.couchbaseclusterspec.networking.tls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientSecretName","serverSecretName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SecretSource implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ClientSecretName specifies the secret name, in the same namespace as the cluster, the contains client TLS data.  The secret is expected to contain "tls.crt" and "tls.key" as per the Kubernetes.io/tls secret type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClientSecretName specifies the secret name, in the same namespace as the cluster, the contains client TLS data.  The secret is expected to contain \"tls.crt\" and \"tls.key\" as per the Kubernetes.io/tls secret type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientSecretName;

    public String getClientSecretName() {
        return clientSecretName;
    }

    public void setClientSecretName(String clientSecretName) {
        this.clientSecretName = clientSecretName;
    }

    /**
     * ServerSecretName specifies the secret name, in the same namespace as the cluster, that contains server TLS data.  The secret is expected to contain "tls.crt" and "tls.key" as per the kubernetes.io/tls secret type.  It may also contain "ca.crt". Only a single PEM formated x509 certificate can be provided to "ca.crt". The single certificate may also bundle together multiple root CA certificates. Multiple root CA certificates are only supported on Couchbase Server 7.1 and greater.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverSecretName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServerSecretName specifies the secret name, in the same namespace as the cluster, that contains server TLS data.  The secret is expected to contain \"tls.crt\" and \"tls.key\" as per the kubernetes.io/tls secret type.  It may also contain \"ca.crt\". Only a single PEM formated x509 certificate can be provided to \"ca.crt\". The single certificate may also bundle together multiple root CA certificates. Multiple root CA certificates are only supported on Couchbase Server 7.1 and greater.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serverSecretName;

    public String getServerSecretName() {
        return serverSecretName;
    }

    public void setServerSecretName(String serverSecretName) {
        this.serverSecretName = serverSecretName;
    }
}


package com.couchbase.v2.couchbaseclusterspec.networking;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allowPlainTextCertReload","cipherSuites","clientCertificatePaths","clientCertificatePolicy","nodeToNodeEncryption","passphrase","rootCAs","secretSource","static","tlsMinimumVersion"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AllowPlainTextCertReload allows the reload of TLS certificates in plain text. This option should only be enabled as a means to recover connectivity with server in the event that any of the server certificates expire. When enabled the Operator only attempts plain text cert reloading when expired certificates are detected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowPlainTextCertReload")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllowPlainTextCertReload allows the reload of TLS certificates in plain text. This option should only be enabled as a means to recover connectivity with server in the event that any of the server certificates expire. When enabled the Operator only attempts plain text cert reloading when expired certificates are detected.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allowPlainTextCertReload = false;

    public Boolean getAllowPlainTextCertReload() {
        return allowPlainTextCertReload;
    }

    public void setAllowPlainTextCertReload(Boolean allowPlainTextCertReload) {
        this.allowPlainTextCertReload = allowPlainTextCertReload;
    }

    /**
     * CipherSuites specifies a list of cipher suites for Couchbase server to select from when negotiating TLS handshakes with a client.  Suites are not validated by the Operator.  Run "openssl ciphers -v" in a Couchbase server pod to interrogate supported values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cipherSuites")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CipherSuites specifies a list of cipher suites for Couchbase server to select from when negotiating TLS handshakes with a client.  Suites are not validated by the Operator.  Run \"openssl ciphers -v\" in a Couchbase server pod to interrogate supported values.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> cipherSuites;

    public java.util.List<String> getCipherSuites() {
        return cipherSuites;
    }

    public void setCipherSuites(java.util.List<String> cipherSuites) {
        this.cipherSuites = cipherSuites;
    }

    /**
     * ClientCertificatePaths defines where to look in client certificates in order to extract the user name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCertificatePaths")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClientCertificatePaths defines where to look in client certificates in order to extract the user name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.couchbase.v2.couchbaseclusterspec.networking.tls.ClientCertificatePaths> clientCertificatePaths;

    public java.util.List<com.couchbase.v2.couchbaseclusterspec.networking.tls.ClientCertificatePaths> getClientCertificatePaths() {
        return clientCertificatePaths;
    }

    public void setClientCertificatePaths(java.util.List<com.couchbase.v2.couchbaseclusterspec.networking.tls.ClientCertificatePaths> clientCertificatePaths) {
        this.clientCertificatePaths = clientCertificatePaths;
    }

    public enum ClientCertificatePolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("enable")
        ENABLE("enable"), @com.fasterxml.jackson.annotation.JsonProperty("mandatory")
        MANDATORY("mandatory");

        String value;

        ClientCertificatePolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * ClientCertificatePolicy defines the client authentication policy to use. If set, the Operator expects TLS configuration to contain a valid certificate/key pair for the Administrator account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCertificatePolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClientCertificatePolicy defines the client authentication policy to use. If set, the Operator expects TLS configuration to contain a valid certificate/key pair for the Administrator account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ClientCertificatePolicy clientCertificatePolicy;

    public ClientCertificatePolicy getClientCertificatePolicy() {
        return clientCertificatePolicy;
    }

    public void setClientCertificatePolicy(ClientCertificatePolicy clientCertificatePolicy) {
        this.clientCertificatePolicy = clientCertificatePolicy;
    }

    public enum NodeToNodeEncryption {

        @com.fasterxml.jackson.annotation.JsonProperty("ControlPlaneOnly")
        CONTROLPLANEONLY("ControlPlaneOnly"), @com.fasterxml.jackson.annotation.JsonProperty("All")
        ALL("All"), @com.fasterxml.jackson.annotation.JsonProperty("Strict")
        STRICT("Strict");

        String value;

        NodeToNodeEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * NodeToNodeEncryption specifies whether to encrypt data between Couchbase nodes within the same cluster.  This may come at the expense of performance.  When control plane only encryption is used, only cluster management traffic is encrypted between nodes.  When all, all traffic is encrypted, including database documents. When strict mode is used, it is the same as all, but also disables all plaintext ports.  Strict mode is only available on Couchbase Server versions 7.1 and greater. Node to node encryption can only be used when TLS certificates are managed by the Operator.  This field must be either "ControlPlaneOnly", "All", or "Strict".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeToNodeEncryption")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeToNodeEncryption specifies whether to encrypt data between Couchbase nodes within the same cluster.  This may come at the expense of performance.  When control plane only encryption is used, only cluster management traffic is encrypted between nodes.  When all, all traffic is encrypted, including database documents. When strict mode is used, it is the same as all, but also disables all plaintext ports.  Strict mode is only available on Couchbase Server versions 7.1 and greater. Node to node encryption can only be used when TLS certificates are managed by the Operator.  This field must be either \"ControlPlaneOnly\", \"All\", or \"Strict\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private NodeToNodeEncryption nodeToNodeEncryption;

    public NodeToNodeEncryption getNodeToNodeEncryption() {
        return nodeToNodeEncryption;
    }

    public void setNodeToNodeEncryption(NodeToNodeEncryption nodeToNodeEncryption) {
        this.nodeToNodeEncryption = nodeToNodeEncryption;
    }

    /**
     * PassphraseConfig configures the passphrase key to use with encrypted certificates. The passphrase may be registered with Couchbase Server using a local script or a rest endpoint. Private key encryption is only available on Couchbase Server versions 7.1 and greater.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PassphraseConfig configures the passphrase key to use with encrypted certificates. The passphrase may be registered with Couchbase Server using a local script or a rest endpoint. Private key encryption is only available on Couchbase Server versions 7.1 and greater.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.tls.Passphrase passphrase;

    public com.couchbase.v2.couchbaseclusterspec.networking.tls.Passphrase getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(com.couchbase.v2.couchbaseclusterspec.networking.tls.Passphrase passphrase) {
        this.passphrase = passphrase;
    }

    /**
     * RootCAs defines a set of secrets that reside in this namespace that contain additional CA certificates that should be installed in Couchbase.  The CA certificates that are defined here are in addition to those defined for the cluster, optionally by couchbaseclusters.spec.networking.tls.secretSource, and thus should not be duplicated.  Each Secret referred to must be of well-known type "kubernetes.io/tls" and must contain one or more CA certificates under the key "tls.crt". Multiple root CA certificates are only supported on Couchbase Server 7.1 and greater, and not with legacy couchbaseclusters.spec.networking.tls.static configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootCAs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RootCAs defines a set of secrets that reside in this namespace that contain additional CA certificates that should be installed in Couchbase.  The CA certificates that are defined here are in addition to those defined for the cluster, optionally by couchbaseclusters.spec.networking.tls.secretSource, and thus should not be duplicated.  Each Secret referred to must be of well-known type \"kubernetes.io/tls\" and must contain one or more CA certificates under the key \"tls.crt\". Multiple root CA certificates are only supported on Couchbase Server 7.1 and greater, and not with legacy couchbaseclusters.spec.networking.tls.static configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> rootCAs;

    public java.util.List<String> getRootCAs() {
        return rootCAs;
    }

    public void setRootCAs(java.util.List<String> rootCAs) {
        this.rootCAs = rootCAs;
    }

    /**
     * SecretSource enables the user to specify a secret conforming to the Kubernetes TLS secret specification that is used for the Couchbase server certificate, and optionally the Operator's client certificate, providing cert-manager compatibility without having to specify a separate root CA.  A server CA certificate must be supplied by one of the provided methods. Certificates referred to must conform to the keys of well-known type "kubernetes.io/tls" with "tls.crt" and "tls.key". If the "tls.key" is an encrypted private key then the secret type can be the generic Opaque type since "kubernetes.io/tls" type secrets cannot verify encrypted keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretSource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretSource enables the user to specify a secret conforming to the Kubernetes TLS secret specification that is used for the Couchbase server certificate, and optionally the Operator's client certificate, providing cert-manager compatibility without having to specify a separate root CA.  A server CA certificate must be supplied by one of the provided methods. Certificates referred to must conform to the keys of well-known type \"kubernetes.io/tls\" with \"tls.crt\" and \"tls.key\". If the \"tls.key\" is an encrypted private key then the secret type can be the generic Opaque type since \"kubernetes.io/tls\" type secrets cannot verify encrypted keys.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.tls.SecretSource secretSource;

    public com.couchbase.v2.couchbaseclusterspec.networking.tls.SecretSource getSecretSource() {
        return secretSource;
    }

    public void setSecretSource(com.couchbase.v2.couchbaseclusterspec.networking.tls.SecretSource secretSource) {
        this.secretSource = secretSource;
    }

    /**
     * DEPRECATED - by couchbaseclusters.spec.networking.tls.secretSource. Static enables user to generate static x509 certificates and keys, put them into Kubernetes secrets, and specify them here.  Static secrets are Couchbase specific, and follow no well-known standards.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("static")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED - by couchbaseclusters.spec.networking.tls.secretSource. Static enables user to generate static x509 certificates and keys, put them into Kubernetes secrets, and specify them here.  Static secrets are Couchbase specific, and follow no well-known standards.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.tls.Static _static;

    public com.couchbase.v2.couchbaseclusterspec.networking.tls.Static get_static() {
        return _static;
    }

    public void set_static(com.couchbase.v2.couchbaseclusterspec.networking.tls.Static _static) {
        this._static = _static;
    }

    public enum TlsMinimumVersion {

        @com.fasterxml.jackson.annotation.JsonProperty("TLS1.0")
        TLS1_0("TLS1.0"), @com.fasterxml.jackson.annotation.JsonProperty("TLS1.1")
        TLS1_1("TLS1.1"), @com.fasterxml.jackson.annotation.JsonProperty("TLS1.2")
        TLS1_2("TLS1.2"), @com.fasterxml.jackson.annotation.JsonProperty("TLS1.3")
        TLS1_3("TLS1.3");

        String value;

        TlsMinimumVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public String getValue() {
            return value;
        }
    }

    /**
     * TLSMinimumVersion specifies the minimum TLS version the Couchbase server can negotiate with a client.  Must be one of TLS1.0, TLS1.1 TLS1.2 or TLS1.3, defaulting to TLS1.2.  TLS1.3 is only valid for Couchbase Server 7.1.0 onward.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsMinimumVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSMinimumVersion specifies the minimum TLS version the Couchbase server can negotiate with a client.  Must be one of TLS1.0, TLS1.1 TLS1.2 or TLS1.3, defaulting to TLS1.2.  TLS1.3 is only valid for Couchbase Server 7.1.0 onward.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private TlsMinimumVersion tlsMinimumVersion = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"TLS1.2\"", TlsMinimumVersion.class);

    public TlsMinimumVersion getTlsMinimumVersion() {
        return tlsMinimumVersion;
    }

    public void setTlsMinimumVersion(TlsMinimumVersion tlsMinimumVersion) {
        this.tlsMinimumVersion = tlsMinimumVersion;
    }
}


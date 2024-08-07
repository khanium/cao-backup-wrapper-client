package com.couchbase.v2.couchbaseclusterspec.networking.tls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"operatorSecret","serverSecret"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Static implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * OperatorSecret is a secret name containing TLS certs used by operator to talk securely to this cluster.  The secret must contain a CA certificate (data key ca.crt).  If client authentication is enabled, then the secret must also contain a client certificate chain (data key "couchbase-operator.crt") and private key (data key "couchbase-operator.key").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OperatorSecret is a secret name containing TLS certs used by operator to talk securely to this cluster.  The secret must contain a CA certificate (data key ca.crt).  If client authentication is enabled, then the secret must also contain a client certificate chain (data key \"couchbase-operator.crt\") and private key (data key \"couchbase-operator.key\").")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorSecret;

    public String getOperatorSecret() {
        return operatorSecret;
    }

    public void setOperatorSecret(String operatorSecret) {
        this.operatorSecret = operatorSecret;
    }

    /**
     * ServerSecret is a secret name containing TLS certs used by each Couchbase member pod for the communication between Couchbase server and its clients.  The secret must contain a certificate chain (data key "chain.pem") and a private key (data key "pkey.key").  The private key must be in the PKCS#1 RSA format.  The certificate chain must have a required set of X.509v3 subject alternative names for all cluster addressing modes.  See the Operator TLS documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServerSecret is a secret name containing TLS certs used by each Couchbase member pod for the communication between Couchbase server and its clients.  The secret must contain a certificate chain (data key \"chain.pem\") and a private key (data key \"pkey.key\").  The private key must be in the PKCS#1 RSA format.  The certificate chain must have a required set of X.509v3 subject alternative names for all cluster addressing modes.  See the Operator TLS documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serverSecret;

    public String getServerSecret() {
        return serverSecret;
    }

    public void setServerSecret(String serverSecret) {
        this.serverSecret = serverSecret;
    }
}


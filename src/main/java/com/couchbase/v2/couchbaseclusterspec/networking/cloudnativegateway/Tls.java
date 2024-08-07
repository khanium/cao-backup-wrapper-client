package com.couchbase.v2.couchbaseclusterspec.networking.cloudnativegateway;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"serverSecretName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ServerSecretName specifies the secret name, in the same namespace as the cluster, that contains Cloud Native Gateway gRPC server TLS data. The secret is expected to contain "tls.crt" and "tls.key" as per the kubernetes.io/tls secret type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverSecretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServerSecretName specifies the secret name, in the same namespace as the cluster, that contains Cloud Native Gateway gRPC server TLS data. The secret is expected to contain \"tls.crt\" and \"tls.key\" as per the kubernetes.io/tls secret type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serverSecretName;

    public String getServerSecretName() {
        return serverSecretName;
    }

    public void setServerSecretName(String serverSecretName) {
        this.serverSecretName = serverSecretName;
    }
}


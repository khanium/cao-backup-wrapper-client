package com.couchbase.v2.couchbaseclusterspec.networking;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"image","tls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CloudNativeGateway implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Image is the Cloud Native Gateway image to be used to run the sidecar container. No validation is carried out as this can be any arbitrary repo and tag. TODO: provide a default kubebuilder default image tag as field is mandatory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Cloud Native Gateway image to be used to run the sidecar container. No validation is carried out as this can be any arbitrary repo and tag. TODO: provide a default kubebuilder default image tag as field is mandatory.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * TLS defines the TLS configuration for the Cloud Native Gateway server including server and client certificate configuration, and TLS security policies. If no TLS config are explicitly provided, the operator generates/manages self-signed certs/keys and creates a k8s secret named `couchbase-cloud-native-gateway-self-signed-secret-<cluster-name>` unique to a Couchbase cluster, which is volume mounted to the cb k8s pod. This action could be overidden at the outset or later, by using the below TLS config or generating the secret of same name as `couchbase-cloud-native-gateway-self-signed-secret-<cluster-name>` with certificates conforming to the keys of well-known type "kubernetes.io/tls" with "tls.crt" and "tls.key". N.B. The secret is on per cluster basis so it's advised to use the unique cluster name else would be ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS defines the TLS configuration for the Cloud Native Gateway server including server and client certificate configuration, and TLS security policies. If no TLS config are explicitly provided, the operator generates/manages self-signed certs/keys and creates a k8s secret named `couchbase-cloud-native-gateway-self-signed-secret-<cluster-name>` unique to a Couchbase cluster, which is volume mounted to the cb k8s pod. This action could be overidden at the outset or later, by using the below TLS config or generating the secret of same name as `couchbase-cloud-native-gateway-self-signed-secret-<cluster-name>` with certificates conforming to the keys of well-known type \"kubernetes.io/tls\" with \"tls.crt\" and \"tls.key\". N.B. The secret is on per cluster basis so it's advised to use the unique cluster name else would be ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.networking.cloudnativegateway.Tls tls;

    public com.couchbase.v2.couchbaseclusterspec.networking.cloudnativegateway.Tls getTls() {
        return tls;
    }

    public void setTls(com.couchbase.v2.couchbaseclusterspec.networking.cloudnativegateway.Tls tls) {
        this.tls = tls;
    }
}


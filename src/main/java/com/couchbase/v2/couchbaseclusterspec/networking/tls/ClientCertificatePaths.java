package com.couchbase.v2.couchbaseclusterspec.networking.tls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"delimiter","path","prefix"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClientCertificatePaths implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Delimiter if specified allows a suffix to be stripped from the username, once extracted from the certificate path.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Delimiter if specified allows a suffix to be stripped from the username, once extracted from the certificate path.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String delimiter;

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Path defines where in the X.509 specification to extract the username from. This field must be either "subject.cn", "san.uri", "san.dnsname" or  "san.email".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^subject\\.cn|san\\.uri|san\\.dnsname|san\\.email$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path defines where in the X.509 specification to extract the username from. This field must be either \"subject.cn\", \"san.uri\", \"san.dnsname\" or  \"san.email\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Prefix allows a prefix to be stripped from the username, once extracted from the certificate path.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prefix allows a prefix to be stripped from the username, once extracted from the certificate path.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String prefix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}


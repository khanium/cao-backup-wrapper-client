package com.couchbase.v2.couchbaseclusterspec.xdcr;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authenticationSecret","hostname","name","replications","tls","uuid"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RemoteClusters implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AuthenticationSecret is a secret used to authenticate when establishing a remote connection.  It is only required when not using mTLS.  The secret must contain a username (secret key "username") and password (secret key "password").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AuthenticationSecret is a secret used to authenticate when establishing a remote connection.  It is only required when not using mTLS.  The secret must contain a username (secret key \"username\") and password (secret key \"password\").")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String authenticationSecret;

    public String getAuthenticationSecret() {
        return authenticationSecret;
    }

    public void setAuthenticationSecret(String authenticationSecret) {
        this.authenticationSecret = authenticationSecret;
    }

    /**
     * Hostname is the connection string to use to connect the remote cluster.  To use IPv6, place brackets (`[`, `]`) around the IPv6 value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^((couchbase|http)(s)?(://))?((\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b)|((([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9]))|\\[(\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*\\]))(:[0-9]{0,5})?(\\\\{0,1}\\?network=[^&]+)?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname is the connection string to use to connect the remote cluster.  To use IPv6, place brackets (`[`, `]`) around the IPv6 value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Name of the remote cluster. Note that, -operator-managed is added as suffix by operator automatically to the name in order to diffrentiate from non operator managed remote clusters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the remote cluster. Note that, -operator-managed is added as suffix by operator automatically to the name in order to diffrentiate from non operator managed remote clusters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Replications are replication streams from this cluster to the remote one. This field defines how to look up CouchbaseReplication resources.  By default any CouchbaseReplication resources in the namespace will be considered.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replications")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replications are replication streams from this cluster to the remote one. This field defines how to look up CouchbaseReplication resources.  By default any CouchbaseReplication resources in the namespace will be considered.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.Replications replications;

    public com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.Replications getReplications() {
        return replications;
    }

    public void setReplications(com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.Replications replications) {
        this.replications = replications;
    }

    /**
     * TLS if specified references a resource containing the necessary certificate data for an encrypted connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS if specified references a resource containing the necessary certificate data for an encrypted connection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.Tls tls;

    public com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.Tls getTls() {
        return tls;
    }

    public void setTls(com.couchbase.v2.couchbaseclusterspec.xdcr.remoteclusters.Tls tls) {
        this.tls = tls;
    }

    /**
     * UUID of the remote cluster.  The UUID of a CouchbaseCluster resource is advertised in the status.clusterId field of the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[0-9a-f]{32}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UUID of the remote cluster.  The UUID of a CouchbaseCluster resource is advertised in the status.clusterId field of the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}


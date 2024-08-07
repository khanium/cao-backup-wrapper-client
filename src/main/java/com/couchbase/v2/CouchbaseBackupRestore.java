package com.couchbase.v2;

@io.fabric8.kubernetes.model.annotation.Version(value = "v2" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("couchbase.com")
@io.fabric8.kubernetes.model.annotation.Singular("couchbasebackuprestore")
@io.fabric8.kubernetes.model.annotation.Plural("couchbasebackuprestores")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CouchbaseBackupRestore extends io.fabric8.kubernetes.client.CustomResource<CouchbaseBackupRestoreSpec, CouchbaseBackupRestoreStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


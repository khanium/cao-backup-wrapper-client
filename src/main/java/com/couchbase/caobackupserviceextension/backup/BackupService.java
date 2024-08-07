package com.couchbase.caobackupserviceextension.backup;

import com.couchbase.caobackupserviceextension.config.KubeConfigProperties;
import com.couchbase.caobackupserviceextension.pods.PodInfo;
import com.couchbase.v2.CouchbaseBackup;
import com.couchbase.v2.CouchbaseBackupStatus;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.batch.v1.CronJob;
import io.fabric8.kubernetes.api.model.batch.v1.Job;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.utils.internal.CreateOrReplaceHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackupService {
    public static final String DEFAULT_SERVICE_NAME = "backup-service";
    public static final String DEFAULT_NAMESPACE = "default";
    private final KubeConfigProperties.KubeServiceProperties config;
    private final MixedOperation<CouchbaseBackup, KubernetesResourceList<CouchbaseBackup>, Resource<CouchbaseBackup>> couchbaseBackupService;
    private final KubernetesClient client;

    public BackupService(KubeConfigProperties.KubeServiceProperties backupServiceProperties, KubernetesClient client) {
        this.config = backupServiceProperties;
        this.client = client;
        this.couchbaseBackupService = client.resources(CouchbaseBackup.class);
    }

    public List<Job> getJobs() {
        return client.batch().v1().jobs().inNamespace(config.getNamespace()).list().getItems();
    }

    public List<CronJob> getCronJobs() {
        return client.batch().v1().cronjobs().inNamespace(config.getNamespace()).list().getItems();
    }

    public List<PersistentVolumeClaim> getPersistentVolumeClaims() {
        return client.persistentVolumeClaims().inNamespace(config.getNamespace()).list().getItems();
    }

    public List<CouchbaseBackup> getBackups() {
        return couchbaseBackupService.inNamespace(config.getNamespace()).list().getItems();
    }


    public String getNamespace() {
        return config.getNamespace();
    }

    public String getServiceName() {
        return config.getName();
    }

    public CouchbaseBackupStatus getBackupStatus(String backupName) {
        return couchbaseBackupService.inNamespace(config.getNamespace()).withName(backupName).get().getStatus();
    }

    public void backup(BackupRequest cfg) {
        CouchbaseBackup backup = new CouchbaseBackup();
      //  backup.setSpec(cfg); //TODO convert request to spec
      //  couchbaseBackupService.inNamespace(config.getNamespace()).create(backup);
    }

}

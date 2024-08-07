package com.couchbase.k8client.backup;

import com.couchbase.k8client.pods.PodInfo;
import com.couchbase.k8client.pods.PodService;
import com.couchbase.v2.CouchbaseBackup;
import com.couchbase.v2.CouchbaseBackupStatus;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.batch.v1.CronJob;
import io.fabric8.kubernetes.api.model.batch.v1.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backup")
public class BackupController {
    private final BackupService service;
    private final PodService podService;

    public BackupController(BackupService service, PodService podService, PodService podService1) {
        this.service = service;
        this.podService = podService1;
    }

    @GetMapping("/pods")
    public List<PodInfo> getPods() {
        return podService.getPodsFromService(service.getNamespace(), service.getServiceName());
    }

    @GetMapping("/backups")
    public List<CouchbaseBackup> backups() {
        return service.getBackups();
    }

    @GetMapping("/backup/{backupName}/status")
    public CouchbaseBackupStatus getBackupStatus(@PathVariable String backupName) {
        return service.getBackupStatus(backupName);
    }

    @GetMapping("/backups/info")
    public BackupListInfo getBackupListInfo() {
        return BackupListInfo.builder().backups(BackupListInfo.Converter.from(service.getBackups())).build();
    }

    @GetMapping("/jobs")
    public List<Job> jobs() {
        return service.getJobs();
    }

    @GetMapping("/cronjobs")
    public List<CronJob> cronJobs() {
        return service.getCronJobs();
    }

    @GetMapping("/pvcs")
    public List<PersistentVolumeClaim> persistentVolumeClaims() {
        return service.getPersistentVolumeClaims();
    }

    public void immediateIncrementalBackup() {

    }

    public void immediateFullBackup() {

    }

    public void backup(BackupRequest cfg) {
        service.backup(cfg);
    }


}

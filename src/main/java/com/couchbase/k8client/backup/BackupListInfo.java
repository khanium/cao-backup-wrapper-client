package com.couchbase.k8client.backup;

import com.couchbase.v2.CouchbaseBackup;
import com.couchbase.v2.CouchbaseBackupSpec;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class BackupListInfo {
    @Builder.Default
    private List<BackupRepositoryInfo> backups = new ArrayList<>();

    @Slf4j
    public static class Converter {
        public static List<BackupRepositoryInfo> from(List<CouchbaseBackup> backups) {
            List<BackupRepositoryInfo> response = new ArrayList<>();
            for (CouchbaseBackup backup : backups) {
                response.add(repositoryInfofrom(backup));
            }
            return response;
        }

        private static BackupRepositoryInfo repositoryInfofrom(CouchbaseBackup backup) {
            return BackupRepositoryInfo.builder()
                    .name(backup.getMetadata().getName())
                    .namespace(backup.getMetadata().getNamespace())

                    .configuration(configurationFrom(backup.getSpec()))
                    .backups(backup.getStatus().getBackups())
                    .build();
        }

        private static BackupRequest configurationFrom(CouchbaseBackupSpec spec) {
            return BackupRequest.builder()
                    //TODO add fields
                    .build();
        }

    }
}

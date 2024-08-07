package com.couchbase.caobackupserviceextension.backup;

import com.couchbase.v2.couchbasebackupstatus.Backups;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class BackupRepositoryInfo {
    private String name;
    private String namespace;
    private BackupRequest configuration;
    @Builder.Default
    private List<Backups> backups = new ArrayList<>();


}

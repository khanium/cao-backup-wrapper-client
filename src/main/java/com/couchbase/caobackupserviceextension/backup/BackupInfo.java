package com.couchbase.caobackupserviceextension.backup;

import com.couchbase.v2.couchbasebackupspec.Incremental;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class BackupInfo {
    private String name;
    List<Incremental> incrementalList;
    private String full;

}

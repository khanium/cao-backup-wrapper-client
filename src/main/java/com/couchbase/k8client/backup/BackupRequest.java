package com.couchbase.k8client.backup;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BackupRequest {
    private String name;
}

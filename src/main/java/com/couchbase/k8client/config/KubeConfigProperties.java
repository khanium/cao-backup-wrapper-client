package com.couchbase.k8client.config;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.HashMap;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "spring.kubernetes.services")
@ConfigurationPropertiesScan
public class KubeConfigProperties {
    private Map<String, KubeServiceProperties> services = new HashMap<>();

    @Builder
    @Data
    public static class KubeServiceProperties {
        private String namespace;
        private String name;
    }
}

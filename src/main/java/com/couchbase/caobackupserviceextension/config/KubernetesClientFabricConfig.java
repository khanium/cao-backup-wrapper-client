package com.couchbase.caobackupserviceextension.config;

import com.couchbase.caobackupserviceextension.backup.BackupService;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConfigurationPropertiesScan
@EnableConfigurationProperties(KubeConfigProperties.class)
@Configuration
public class KubernetesClientFabricConfig {
    private final KubeConfigProperties kubeConfigProperties;

    public KubernetesClientFabricConfig(KubeConfigProperties kubeConfigProperties) {
        this.kubeConfigProperties = kubeConfigProperties;
    }

    @Bean
    public KubernetesClient k8Client(KubeConfigProperties.KubeServiceProperties cfg){
        return new KubernetesClientBuilder().build();
                //.withConfig(new ConfigBuilder()
                //.withNamespace(cfg.getNamespace()).build())
                //                                                    .build()) {
    }


    @Bean
    public KubeConfigProperties.KubeServiceProperties backupServiceProperties() {
        KubeConfigProperties.KubeServiceProperties defaultServiceProperties = KubeConfigProperties.KubeServiceProperties.builder().name(BackupService.DEFAULT_SERVICE_NAME).namespace(BackupService.DEFAULT_NAMESPACE).build();
        return kubeConfigProperties!= null ? kubeConfigProperties.getServices().getOrDefault("backup", defaultServiceProperties): defaultServiceProperties;
    }
}

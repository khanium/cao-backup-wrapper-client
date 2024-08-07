package com.couchbase.caobackupserviceextension.config;

import com.couchbase.caobackupserviceextension.backup.BackupService;
//import io.kubernetes.client.openapi.ApiClient;
//import io.kubernetes.client.openapi.apis.CoreV1Api;
//import io.kubernetes.client.openapi.models.V1Service;
//import io.kubernetes.client.util.ClientBuilder;
//import io.kubernetes.client.util.Config;
//import io.kubernetes.client.util.KubeConfig;
//import io.kubernetes.client.util.Yaml;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileReader;
import java.io.IOException;

@Slf4j
@ConfigurationPropertiesScan
@EnableConfigurationProperties(KubeConfigProperties.class)
@Configuration
public class KubernetesConfig {
//
//    private final KubeConfigProperties kubeConfigProperties;
//
//    public KubernetesConfig(KubeConfigProperties kubeConfigProperties) {
//        this.kubeConfigProperties = kubeConfigProperties;
//    }
//
//    @Bean
//    public ApiClient apiClient() throws IOException {
//        // loading the in-cluster config, including:
//        //   1. service-account CA
//        //   2. service-account bearer-token
//        //   3. service-account namespace
//        //   4. master endpoints(ip, port) from pre-set environment variables
//       // ApiClient client = ClientBuilder.cluster().build();
//        // Read yaml configuration file, and deploy it
//        ApiClient client = Config.defaultClient();
//        io.kubernetes.client.openapi.Configuration.setDefaultApiClient(client);
//
//        //  See issue #474. Not needed at most cases, but it is needed if you are using war
//        //  packging or running this on JUnit.
//        Yaml.addModelMap("v1", "Service", V1Service.class);
//        // if you prefer not to refresh service account token, please use:
//        // ApiClient client = ClientBuilder.oldCluster().build();
//
//        // set the global default api-client to the in-cluster one from above
//        //Configuration.setDefaultApiClient(client);
//     //   return Config.defaultClient();
//        // file path to your KubeConfig
//
//       // String kubeConfigPath = System.getenv("HOME") + "/.kube/config";
//       // log.info("KubeConfigPath: {}", kubeConfigPath);
//        // loading the out-of-cluster config, a kubeconfig from file-system
//       // KubeConfig config = KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath));
//       // log.info("Kube Config: {}", config.getServer());
//        //ApiClient client = ClientBuilder.kubeconfig(config).setBasePath(config.getServer()).build();
//
//        // set the global default api-client to the out-of-cluster one from above
//       // io.kubernetes.client.openapi.Configuration.setDefaultApiClient(client);
//        return client;
//    }
//
//    @Bean
//    public CoreV1Api coreV1Api(ApiClient client) throws IOException {
//        return new CoreV1Api(client);
//    }
//
//    @Bean
//    public KubeConfigProperties.KubeServiceProperties backupServiceProperties() {
//        KubeConfigProperties.KubeServiceProperties defaultServiceProperties = KubeConfigProperties.KubeServiceProperties.builder().name(BackupService.DEFAULT_SERVICE_NAME).namespace(BackupService.DEFAULT_NAMESPACE).build();
//        return kubeConfigProperties!= null ? kubeConfigProperties.getServices().getOrDefault("backup", defaultServiceProperties): defaultServiceProperties;
//    }

}

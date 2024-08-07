package com.couchbase.k8client.pods;

import io.fabric8.kubernetes.client.KubernetesClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PodService {
    private final KubernetesClient client;

    public PodService(KubernetesClient client) {
        this.client = client;
    }

    public List<PodInfo> getPodsFromService(String namespace, String serviceName) {
        log.info("getting pods from {} namespace... ",namespace);
        return client.pods().inNamespace(namespace).list().getItems().stream().map(x -> new PodInfo(x.getMetadata().getName(), x.getMetadata().getNamespace())).toList();
    }

}

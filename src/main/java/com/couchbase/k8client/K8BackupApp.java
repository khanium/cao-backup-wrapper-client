package com.couchbase.k8client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class K8BackupApp {

    public static void main(String[] args) {
        SpringApplication.run(K8BackupApp.class, args);
    }

}

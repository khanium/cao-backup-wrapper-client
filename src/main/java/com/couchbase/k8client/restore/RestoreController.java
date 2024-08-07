package com.couchbase.k8client.restore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restore")
public class RestoreController {
    private final RestoreService service;

    public RestoreController(RestoreService service) {
        this.service = service;
    }

    public void immediateRestore() {}

}

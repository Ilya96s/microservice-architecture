package com.example.hw2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("health")
    public String health() {
        return "status: OK";
    }
}

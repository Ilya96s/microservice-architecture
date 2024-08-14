package com.example.hw3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("health")
    public String health() {
        return "status: OK";
    }
}

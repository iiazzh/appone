package com.suhasmh.app.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/test")
    public Map<String, String> testApplicationStatus() {
        return Map.of("statuscode", "0", "status", "alive");
    }
}

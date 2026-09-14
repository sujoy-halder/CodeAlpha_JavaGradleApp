package com.codealpha.gradleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "application", "CodeAlpha Java Gradle Application",
                "message", "Welcome to CodeAlpha DevOps Internship Task 3"
        );
    }

    @GetMapping("/api/status")
     public Map<String, String> status() {
    return Map.of(
            "status", "UP",
            "environment", "CodeAlpha",
            "buildTool", "Gradle",
            "javaVersion", "17",
            "timestamp", Instant.now().toString()
       );
   }
}
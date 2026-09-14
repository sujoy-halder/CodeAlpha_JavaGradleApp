package com.codealpha.gradleapp;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StatusControllerTest {

    private final StatusController controller = new StatusController();

    @Test
    void homeEndpointShouldReturnApplicationInformation() {

        Map<String, String> response = controller.home();

        assertEquals(
                "CodeAlpha Java Gradle Application",
                response.get("application")
        );

        assertEquals(
                "Welcome to CodeAlpha DevOps Internship Task 3",
                response.get("message")
        );
    }

    @Test
    void statusEndpointShouldReturnUpStatus() {

        Map<String, String> response = controller.status();

        assertEquals("UP", response.get("status"));
        assertEquals("Gradle", response.get("buildTool"));
        assertEquals("17", response.get("javaVersion"));
        assertNotNull(response.get("timestamp"));
    }
}
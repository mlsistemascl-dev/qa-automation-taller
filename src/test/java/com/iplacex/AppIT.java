package com.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppIT {

    @Test
    public void testIntegrationSystem() {
        // Simulated Integration Test
        App app = new App();
        int result = app.add(10, 20);
        String msg = app.getMessage();
        
        assertTrue(result == 30 && msg.contains("QA"));
    }
}

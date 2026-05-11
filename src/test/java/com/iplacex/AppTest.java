package com.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    public void testGetMessage() {
        App app = new App();
        assertNotNull(app.getMessage());
        assertEquals("Hello QA Automation!", app.getMessage());
    }

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
}

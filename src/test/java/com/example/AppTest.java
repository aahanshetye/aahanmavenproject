package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testAdd() {
        App app = new App();
        assertEquals(4, app.add(2, 2));
    }
}
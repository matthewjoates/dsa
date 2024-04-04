package org.algorithms.maps;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

class MapTest {
    Map<String, Number> testClass;

    @BeforeEach
    public void setUp(){
        testClass = new Map();
        testClass.put("TEST_KEY", 25d);
    }

    @org.junit.jupiter.api.Test
    void put() {
        testClass.put("TEST_KEY2", 26d);
        Double value = (Double)testClass.get("TEST_KEY2");
        assertEquals(26d, value, 0);
    }

    @org.junit.jupiter.api.Test
    void get() {
        Double value = (Double)testClass.get("TEST_KEY");
        assertEquals(25d, value, 0);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        testClass.remove("TEST_KEY");
        assertNull(testClass.get("TEST_KEY"));
    }
}
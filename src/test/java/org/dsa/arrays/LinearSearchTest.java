package org.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void search_Found() {
        Double[] array = {10.0d, 1.9, 2.5, 4.0d};
        int index = LinearSearch.search(array, 2.5d);
        assertEquals(2, index);
    }

    @Test
    void search_NotFound() {
        Double[] array = {10.0d, 1.9, 2.5, 4.0d};
        int index = LinearSearch.search(array, 3);
        assertEquals(-1, index);
    }
}
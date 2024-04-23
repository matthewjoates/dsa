package org.dsa.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search_Found_25() {
        double[] array = new double[100];
        for(int i=0; i<array.length; i++){
            array[i] = Double.valueOf(i+1);
        }
        int index = BinarySearch.search(array, 25d);
        assertEquals(24, index);
    }

    @Test
    void search_Found_30() {
        double[] array = new double[100];
        for(int i=0; i<array.length; i++){
            array[i] = Double.valueOf(i+1);
        }
        int index = BinarySearch.search(array, 30d);
        assertEquals(29, index);
    }

    @Test
    void search_Found_87() {
        double[] array = new double[100];
        for(int i=0; i<array.length; i++){
            array[i] = Double.valueOf(i+1);
        }
        int index = BinarySearch.search(array, 87d);
        assertEquals(86, index);
    }

    @Test
    void search_NotFound() {
        double[] array = {1.9, 2.5, 4.0d, 5.0d, 9.0d};
        int index = BinarySearch.search(array, 3);
        assertEquals(-1, index);
    }
}
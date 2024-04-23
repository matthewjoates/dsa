package org.dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sorted(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{1, 2, 9, 4, 5, 6, 7, 82, 5, 3};
        int[] arraySorted = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 9, 82};
        bubbleSort.sort(array);
//        for(int i = 0; i<array.length; i++){
//            System.out.println(array[i]);
//        }
        assertArrayEquals(arraySorted, array);
    }
}
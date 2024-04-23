package org.dsa.sort;

public class BubbleSort {

    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length -1 - i; j++){
                int left = j;
                int right = j+1;
                if(array[left] > array[right]){
                int leftValue = array[left];
                int rightValue = array[right];
                array[j] = rightValue;
                array[j+1] = leftValue;
                }
            }
        }
    }
}

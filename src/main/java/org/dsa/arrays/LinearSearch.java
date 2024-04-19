package org.dsa.arrays;

// O(N) search
public class LinearSearch {

    public static int search(Object[] array, Object value){
        boolean ret = false;
        for(int i=0; i<array.length; i++){
            if (array[i].equals(value)) {
                System.out.println("value found at index: "+i);
                return i;
            }
            System.out.println("value not found at index: "+i);

        }
        return -1;
    }
}

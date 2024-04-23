package org.dsa.search;

// N/2k = 1 == N/2k * 2k = 1 * 2k == N = 2k == Log2(N) = k
// Log2(N) search on an ORDERED array
// Halve the space between Low and High until both values converge, i.e no longer able to halve the space.
public class BinarySearch {

    public static int search(double[] haystack, double needle) {
        int low = 0; // inclusive
        int high = haystack.length; // exclusive

        while (low < high) {
            int midpoint = low + ((high - low) / 2);
            System.out.println("low: "+low + "; high: "+high + "; midpoint: "+midpoint);
            double value =  haystack[midpoint];
            if (value == needle) {
                System.out.println("value found: "+value + " at index: "+midpoint);
                return midpoint;
            } else if (value > needle){
                System.out.print("shifting left of array -> ");
                System.out.print("value > needle: "+value + "; needle: "+needle + ". ");
                System.out.print("high changing from: "+high + " to : "+midpoint + "\n\n");
                high = midpoint;
            } else {
                System.out.print("shifting right of array -> ");
                System.out.print("value < needle: "+value + "; needle: "+needle + ". ");
                System.out.print("low changing from "+low + " to "+ midpoint +"+1. \n\n");
                // Don't need to consider midpoint because we know it's not the correct value.
                // Adjust low end and put it right in front of where the midpoint is.
                low = midpoint + 1;
            }
        }

        return -1;
    }

}

package org.dsa.search;

public class TwoCrystalBalls {
    public int search(boolean[] breaks){
        int jumpAmount = (int) Math.floor(Math.sqrt(breaks.length));
        int i = jumpAmount;

        for(; i < breaks.length; i+= jumpAmount){
            if(breaks[i]){
                break;
            }
        }

        i -= jumpAmount;
        for(int j = 0; j < jumpAmount && i < breaks.length; ++j, ++i){
            if(breaks[i]){
                return i;
            }
        }

        return -1;
    }
}

package org.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCrystalBallsTest {


    @Test
    void search_Found(){
        boolean[] crystalBall = new boolean[10];
        int ceiling = crystalBall.length-1;
        crystalBall[ceiling] = true;
        crystalBall[ceiling-1] = true;
        crystalBall[ceiling-2] = true;
        TwoCrystalBalls crystalBalls = new TwoCrystalBalls();
        int value = crystalBalls.search(crystalBall);
        assertEquals(7, value);
    }
}
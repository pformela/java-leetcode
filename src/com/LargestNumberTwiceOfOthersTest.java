package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTwiceOfOthersTest {

    private LargestNumberTwiceOfOthers numbers;

    @BeforeEach
    public void initialize() {
        numbers = new LargestNumberTwiceOfOthers();
    }

    @Test
    public void test_index1() {
        assertEquals(1, numbers.dominantIndex(new int[]{3,6,1,0}));
    }

    @Test
    public void test_index2() {
        assertEquals(-1, numbers.dominantIndex(new int[]{1,2,3,4}));
    }

    @Test
    public void test_index3() {
        assertEquals(0, numbers.dominantIndex(new int[]{1}));
    }

}
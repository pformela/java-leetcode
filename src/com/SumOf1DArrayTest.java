package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumOf1DArrayTest {

    private SumOf1DArray sum;

    @BeforeEach
    public void initialize() {
        sum = new SumOf1DArray();
    }

    @Test
    public void test1() {
        assertTrue(Arrays.equals(new int[] {1,3,6,10}, sum.runningSum(new int[] {1,2,3,4})));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.equals(new int[] {1,2,3,4,5}, sum.runningSum(new int[] {1,1,1,1,1})));
    }

    @Test
    public void test3() {
        assertTrue(Arrays.equals(new int[] {3,4,6,16,17}, sum.runningSum(new int[] {3,1,2,10,1})));
    }

}
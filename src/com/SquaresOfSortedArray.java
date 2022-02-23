package com;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] result = Arrays.stream(nums).map(p -> p = p * p).toArray();
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}

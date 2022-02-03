package com;


import java.util.*;

class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : nums) {
            if(num % 2 == 1) {
                odd.add(num);
            } else {
                even.add(num);
            }
        }

        Collections.sort(odd);
        Collections.sort(even);

        List<Integer> result = new ArrayList<>();
        result.addAll(even);
        result.addAll(odd);

        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = (int) result.get(i);
        }

        return array;
    }
    public static int[] sortArrayByParity2(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B);
        Arrays.sort(B, Comparator.comparingInt(a -> a % 2));

        for (int t = 0; t < A.length; ++t)
                A[t] = B[t];
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity2(arr)));
    }
}
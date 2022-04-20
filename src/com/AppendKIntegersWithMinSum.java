package com;


import java.util.Arrays;

public class AppendKIntegersWithMinSum {

    public static long minimalKSum(int[] nums, int k) {

        Arrays.sort(nums);
        int[] arr = new int[k];
        int l = 0;
        int i;

        for(i = 1; k > 0 && l < nums.length - 1; i++) {
            if(nums[l] == i) l++;
            else {
                arr[arr.length - k] = i;
                k--;
            }
        }

        while(k > 0) {
            i++;
            arr[arr.length - k] = i;
            k--;
        }

        return Arrays.stream(arr).asLongStream().reduce(0, Long::sum);
    }


    public static void main(String[] args) {
        int[] arr = {1,4,25,10,25};

//        System.out.println(minimalKSum(arr, 2));
//        long result = minimalKSum(new int[]{5,6}, 6);
        System.out.println(minimalKSum(arr, 2));
        System.out.println(minimalKSum(new int[]{5,6}, 6));
    }
}

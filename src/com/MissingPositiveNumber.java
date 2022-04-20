package com;

public class MissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
//        if(arr[0] < k) return k;
        int l = 0;
        int i;
        for(i = 1; i < arr[arr.length-1]; i++) {
            if(arr[l] == i) l++;
            else if(i < arr[l]) k--;
            if(k <= 0) return i;
        }

        return i + k;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println(findKthPositive(new int[]{1,2,3,4}, 2));
        int result = findKthPositive(new int[]{1,3}, 1);
        int result2 = findKthPositive(new int[]{1,2,3,4}, 2);
        System.out.println(result);
    }
}

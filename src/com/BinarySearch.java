package com;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int begin = 0;
        int middle = 0;
        int last = nums.length - 1;

        while(begin <= last) {
            middle = (begin + last) / 2;
            if(target > nums[middle])
                begin = middle + 1;
            else if(target < nums[middle])
                last = middle -1;
            else
                return middle;
        }

        return -1;
    }
}

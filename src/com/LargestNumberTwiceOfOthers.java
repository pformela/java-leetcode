package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class LargestNumberTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) { return 0; }
        ArrayList<Integer> numsNew = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());

        Integer max = Collections.max(numsNew);
        Integer index = numsNew.indexOf(max);
        numsNew.remove(max);

        for(Integer item : numsNew) {
            if(max < item * 2)
                return -1;
        }
        return index;
    }
}

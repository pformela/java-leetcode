package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maximum69Number {

    public int maximum69Number(int num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int tmp = num;

        while(tmp > 0) {
            numbers.add(tmp % 10);
            tmp = tmp / 10;
        }

        Collections.reverse(numbers);

        if(numbers.contains(Integer.valueOf(6))) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == Integer.valueOf(6)) {
                    numbers.set(i, Integer.valueOf(9));
                    break;
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++){
            tmp += Integer.valueOf(numbers.get(i)) * Math.pow(10, (numbers.size() - i - 1));
        }

        num = tmp;

        return num;
    }

}

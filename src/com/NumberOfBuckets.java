package com;

import java.util.Arrays;

public class NumberOfBuckets {
    public static int minimumBuckets(String street) {
        int buckets = 0;
        int h_counter = 0;
        for (int i = 0; i < street.length(); i++) {
            if(street.charAt(i) == 'H') {
                h_counter++;
                int tmp = 0;
                for (int j = i + 1; j < street.length(); j++) {
                    if(street.charAt(j) == '.')
                        tmp++;
                    else if(street.charAt(j) == 'H') {
                        buckets += tmp;
                        break;
                    }
                }
            }
        }

        if(h_counter == 0)
            return 0;
        else if(buckets == 0)
            return -1;

        return buckets;
    }

    public static void main(String[] args) {
        System.out.println(minimumBuckets(".HH.HH.HH.HH..H"));

    }

}

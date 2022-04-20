package com;

public class FirstBadVersion {
    static boolean isBadVersion(int version) {
        return version >= 2;
    }

    public static int firstBadVersion(int n) {
        int start = 1, end = n;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(!isBadVersion(mid))
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }
}

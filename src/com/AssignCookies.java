package com;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        for(int i = 0; i < s.length && result < g.length; i++) {
            if(g[result] <= s[i]) result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] {1,2}, new int[] {1,2,3}));
    }
}

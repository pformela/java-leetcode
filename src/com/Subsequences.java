package com;

import java.util.*;
class Subsequences {

    static List<String> al = new ArrayList<>();

    public static void main(String[] args)
    {
        String s = "aabca";
        findsubsequences(s, "");
        System.out.println(al);
    }

    private static void findsubsequences(String str, String sub)
    {
        if (str.length() == 0) {
            al.add(sub);
            return;
        }

        findsubsequences(str.substring(1), sub + str.charAt(0));

        findsubsequences(str.substring(1), sub);
    }
}
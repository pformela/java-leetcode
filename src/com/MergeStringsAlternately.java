package com;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int index = 0;

        for(int i = 0; i < word1.length(); i++) {
            result += word1.toCharArray()[i];
            result += (i < word2.length()) ? word2.toCharArray()[i] : "";
            index = i;
        }

        if(word2.length() > word1.length())
            for(int i = index + 1; i < word2.length(); i++)
                result += word2.toCharArray()[i];

        return result;
    }

}

package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordsFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        int result = 0;

        for (String word : words) {
            if(checkWord(word, chars) == true) {
                result += word.toCharArray().length;
            }
        }
        return result;
    }

    public boolean checkWord(String word, String chars) {
        List<Character> wordChars = word.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> charsList = chars.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> result = new ArrayList<>(wordChars.size());

        for (char wordChar : wordChars) {
            if(charsList.contains(wordChar)) {
                result.add(wordChar);
                charsList.remove(Character.valueOf(wordChar));
            }
        }

        Collections.sort(wordChars);
        Collections.sort(result);

        if(wordChars.equals(result))
            return true;

        return false;
    }

}

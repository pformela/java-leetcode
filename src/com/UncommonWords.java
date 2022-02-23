package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> words1 = Arrays.asList(s1.split(" "));
        List<String> words2 = Arrays.asList(s2.split(" "));

        List<String> final_words = new ArrayList<>();

        for (String s : words1) {
            if(Collections.frequency(words1, s) == 1 && Collections.frequency(words2, s) == 0)
                final_words.add(s);
        }

        for (String s : words2) {
            if(Collections.frequency(words2, s) == 1 && Collections.frequency(words1, s) == 0)
                final_words.add(s);
        }

        String[] result = new String[final_words.size()];
        final_words.toArray(result);

        return result;
    }
}

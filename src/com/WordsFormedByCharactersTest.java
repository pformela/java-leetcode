package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsFormedByCharactersTest {

    private WordsFormedByCharacters words;

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Words");
        words = new WordsFormedByCharacters();
    }

    @ParameterizedTest
    @MethodSource("trueWordList")
    public void checkWordTrue(String word) {
        assertTrue(words.checkWord(word,"attach"));
    }

    @ParameterizedTest
    @MethodSource("falseWordList")
    public void checkWordFalse(String word) {
        assertFalse(words.checkWord(word,"attach"));
    }

    @Test
    public void countCharactersTest1() {
        assertEquals(6, words.countCharacters(new String[]{"cat","bt","hat","tree"}, "attach"));
    }

    @Test
    public void countCharactersTest2() {
        assertEquals(10, words.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    private static List<String> trueWordList() {
        return Arrays.asList("cat","hat");
    }

    private static List<String> falseWordList() {
        return Arrays.asList("bt", "tree");
    }

}
package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringWithDistinctCharactersTest {

    private SubstringWithDistinctCharacters substring;

    @BeforeEach
    public void initialize() {
        substring = new SubstringWithDistinctCharacters();
    }

    @Test
    public void test1() {
        assertEquals(1, substring.countGoodSubstrings("xyzzaz"));
    }

    @Test
    public void test2() {
        assertEquals(4, substring.countGoodSubstrings("aababcabc"));
    }

}
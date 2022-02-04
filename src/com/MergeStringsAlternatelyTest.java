package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    private MergeStringsAlternately merge;

    @BeforeEach
    public void initialize() {
        merge =  new MergeStringsAlternately();
    }

    @Test
    public void test_merge1() {
        assertEquals("apbqcr", merge.mergeAlternately("abc", "pqr"));
    }

    @Test
    public void test_merge2() {
        assertEquals("apbqrs", merge.mergeAlternately("ab", "pqrs"));
    }

    @Test
    public void test_merge3() {
        assertEquals("apbqcd", merge.mergeAlternately("abcd", "pq"));
    }


}
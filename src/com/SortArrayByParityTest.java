package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    private SortArrayByParity sort;

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Contact Manager");
        SortArrayByParity sort = new SortArrayByParity();
    }

    @Test
    public void testParity() {
        assertArrayEquals(new int[]{2, 4, 1, 3}, sort.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }

}
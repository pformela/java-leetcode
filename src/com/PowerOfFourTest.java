package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {

    private PowerOfFour power;

    @BeforeEach
    public void initialize() {
        power = new PowerOfFour();
    }

    @Test
    public void test_true1() {
        assertEquals(true, power.isPowerOfFour(16));
    }

    @Test
    public void test_true2() {
        assertEquals(true, power.isPowerOfFour(1));
    }

    @Test
    public void test_false1() {
        assertEquals(false, power.isPowerOfFour(5));
    }

    @Test
    public void test_false2() {
        assertEquals(false, power.isPowerOfFour(9));
    }

}
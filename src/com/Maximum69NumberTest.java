package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {

    private Maximum69Number max69;

    @BeforeEach
    public void setup() {
        max69 = new Maximum69Number();
    }

    @Test
    public void maxTest1() {
        assertEquals(9999 , max69.maximum69Number(9969));
    }

    @Test
    public void maxTest2() {
        assertEquals(9999 , max69.maximum69Number(9999));
    }

    @Test
    public void maxTest3() {
        assertEquals(9669 , max69.maximum69Number(6669));
    }

    @Test
    public void maxTest4() {
        assertEquals(9666, max69.maximum69Number(6666));
    }

    @Test
    public void maxTest5() {
        assertEquals(9 , max69.maximum69Number(6));
    }

    @Test
    public void maxTest6() {
        assertEquals(9 , max69.maximum69Number(9));
    }

    @Test
    public void maxTest7() {
        assertEquals(999966699 , max69.maximum69Number(999666699));
    }

}
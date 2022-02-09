package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfBucketsTest {

    private NumberOfBuckets buckets;

    @BeforeEach
    public void initialize() {
        buckets = new NumberOfBuckets();
    }

    @Test
    public void test_buckets_multiple() {
        assertEquals(2, buckets.minimumBuckets("H..H"));
    }

    @Test
    public void test_buckets_one() {
        assertEquals(1, buckets.minimumBuckets(".H.H."));
    }

    @Test
    public void test_buckets_zero() {
        assertEquals(-1, buckets.minimumBuckets(".HHH."));
    }

    @Test
    public void test_buckets_many() {
        assertEquals(6, buckets.minimumBuckets(".HH.HH.HH.HH..H"));
    }

}
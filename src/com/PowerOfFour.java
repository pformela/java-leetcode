package com;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n <= 0)
            return false;
        double result = Math.log(n) / Math.log(4);
        return result == (int) result;
    }

    public static void main(String[] args) {
        isPowerOfFour(16);
        isPowerOfFour(1);
        isPowerOfFour(9);
        isPowerOfFour(5);
    }
}

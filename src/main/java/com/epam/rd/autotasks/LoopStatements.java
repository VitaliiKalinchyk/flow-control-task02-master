package com.epam.rd.autotasks;


class LoopStatements {
    public static int sumOfBinary(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        return Integer.bitCount(n);
    }
}

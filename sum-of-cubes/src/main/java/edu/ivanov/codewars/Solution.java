package edu.ivanov.codewars;

import java.util.stream.LongStream;

public class Solution {

    public static long sumCubes(long n) {
        return LongStream.rangeClosed(1, n).reduce(0L, (sum, l) -> (sum + l * l * l));
    }

}

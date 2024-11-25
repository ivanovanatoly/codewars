package edu.ivanov.codewars;

import java.util.stream.IntStream;

public class Solution {

    public static boolean isAscOrder(int[] arr) {
        return IntStream.range(0, arr.length - 1).noneMatch(i -> arr[i] > arr[i + 1]);
    }

}

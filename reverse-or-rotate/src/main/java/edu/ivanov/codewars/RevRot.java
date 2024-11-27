package edu.ivanov.codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevRot {

    public static String revRot(String strng, int sz) {
        if (sz <= 0 || sz > strng.length()) {
            return "";
        }

        return Stream.of(strng.split("(?<=\\G.{" + sz + "})"))
                .filter(s -> s.length() == sz)
                .map(s -> isSumEven(s) ? reverse(s) : rotate(s))
                .collect(Collectors.joining());
    }

    private static boolean isSumEven(String digits) {
        return digits.chars().map(c -> c - '0').sum() % 2 == 0;
    }

    private static String reverse(String src) {
        return new StringBuilder(src).reverse().toString();
    }

    private static String rotate(String src) {
        return src.substring(1) + src.charAt(0);
    }

}
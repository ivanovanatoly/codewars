package edu.ivanov.codewars;

import java.util.Arrays;

public class Kata {

    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("\\s+"))
                .reduce(" " + original + " ", (o, s) ->
                        new StringBuilder(new StringBuilder(o).reverse().toString()
                                .replaceFirst(" " + new StringBuilder(s).reverse() + " ", " " + s + " ")
                        ).reverse().toString())
                .replaceAll("^\\s|\\s$", "");
    }

//    public static String reverseWords(final String original) {
//        return Arrays.stream(original.split(" ", -1))
//                .map(StringBuilder::new)
//                .map(StringBuilder::reverse)
//                .collect(Collectors.joining(" "));
//    }

}

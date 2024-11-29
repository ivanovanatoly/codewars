package edu.ivanov.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Meeting {

//    FIRST
//    public static String meeting(String s) {
//        return Arrays.stream(s.split(";")).map(str ->
//                        "(" + str.substring(str.lastIndexOf(':') + 1).toUpperCase() + ", " +
//                                str.substring(0, str.lastIndexOf(':')).toUpperCase() + ")")
//                .sorted().collect(Collectors.joining());
//    }

    public static String meeting(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining());
    }

}

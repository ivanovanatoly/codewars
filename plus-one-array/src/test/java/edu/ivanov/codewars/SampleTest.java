package edu.ivanov.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SampleTest {

    @Test
    public void exampleTests() {
        doTest(new int[]{2, 3, 9}, new int[]{2, 4, 0});
        doTest(new int[]{4, 3, 2, 5}, new int[]{4, 3, 2, 6});
        doTest(new int[]{9, 9, 9}, new int[]{1, 0, 0, 0});
        doTest(new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 7}, new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 8});
        doTest(new int[]{1, -9}, null);
    }

    private static void doTest(final int[] arr, final int[] expected) {
        String arrAsString = Arrays.toString(arr);
        int[] actual = PlusOneArray.upArray(arr);
        assertArrayEquals(expected, actual, "Incorrect answer for arr = " + arrAsString);
    }

}

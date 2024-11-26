package edu.ivanov.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
        assertEquals("elppa", Kata.reverseWords("apple"), "Input: \"apple\"");
        assertEquals("a b c d", Kata.reverseWords("a b c d"), "Input: \"a b c d\"");
        assertEquals("  elbuod  decaps  sdrow  ", Kata.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
        assertEquals("modnar stset dedocodrah stset syawla evah syawla si .noitulos !elur sihT stset esac sihT   modnar si sihT dedocodrah   ", Kata.reverseWords("random tests hardocoded tests always have always is solution. rule! This tests case This   random is This hardocoded   "));
    }

}
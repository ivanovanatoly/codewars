package edu.ivanov.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void exampleTests() {
        assertEquals(1, Solution.sumCubes(1));
        assertEquals(9, Solution.sumCubes(2));
        assertEquals(36, Solution.sumCubes(3));
        assertEquals(100, Solution.sumCubes(4));
        assertEquals(3025, Solution.sumCubes(10));
        assertEquals(58155876, Solution.sumCubes(123));
    }

}

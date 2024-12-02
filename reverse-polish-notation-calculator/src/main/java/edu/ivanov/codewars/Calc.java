package edu.ivanov.codewars;

import java.util.Arrays;
import java.util.Stack;

public class Calc {

    public double evaluate(String expr) {
        if (expr.length() == 0) {
            return 0;
        }

        var stack = new Stack<Double>();
        Arrays.stream(expr.split("\\s")).forEach(s -> {
            switch (s) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(-1 * stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> stack.push(1 / stack.pop() * stack.pop());
                default  -> stack.push(Double.valueOf(s));
            }
        });

        return stack.pop();
    }

}

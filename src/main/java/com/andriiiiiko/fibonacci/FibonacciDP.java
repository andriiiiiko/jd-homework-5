package com.andriiiiiko.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP implements Fibonacci {

    private static final Map<Integer, Long> MEMO = new HashMap<>();

    @Override
    public long fibonacci(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid number entered!");
        } else if (number <= 1) {
            return number;
        }

        if (MEMO.containsKey(number)) {
            return MEMO.get(number);
        }

        long fib = fibonacci(number - 1) + fibonacci(number - 2);
        MEMO.put(number, fib);
        return fib;
    }
}

package com.andriiiiiko.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP implements Fibonacci {

    private static final Map<Integer, Long> MEMO = new HashMap<>();

    @Override
    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid number entered");
        } else if (n <= 1) {
            return n;
        }

        if (MEMO.containsKey(n)) {
            return MEMO.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        MEMO.put(n, fib);
        return fib;
    }
}

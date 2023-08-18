package com.andriiiiiko.fibonacci;

public class FibonacciRecursion implements Fibonacci {

    @Override
    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid number entered!");
        } else if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

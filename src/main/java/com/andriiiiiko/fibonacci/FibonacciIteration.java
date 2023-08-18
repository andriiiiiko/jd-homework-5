package com.andriiiiiko.fibonacci;

public class FibonacciIteration implements Fibonacci{

    @Override
    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid number entered");
        } else if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
}

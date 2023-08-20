package com.andriiiiiko.fibonacci;

public class FibonacciIteration implements Fibonacci{

    @Override
    public long fibonacci(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid number entered!");
        } else if (number <= 1) {
            return number;
        }

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= number; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
}

package com.andriiiiiko.fibonacci;

public class FibonacciRecursion implements Fibonacci {

    @Override
    public long fibonacci(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid number entered!");
        } else if (number <= 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

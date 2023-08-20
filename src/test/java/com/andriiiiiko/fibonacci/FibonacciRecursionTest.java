package com.andriiiiiko.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciRecursionTest {

    @BeforeEach
    void startTime() {
        System.out.println("Test started at: " + System.currentTimeMillis());
    }

    @AfterEach
    void endTime() {
        System.out.println("Test finished at: " + System.currentTimeMillis());
    }

    @Test
    void testFibonacci() {
        // Given
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        int number = 25;

        // When
        long result = fibonacciRecursion.fibonacci(number);

        // Then
        long expected = 75025;
        assertEquals(expected, result);
    }

    @Test
    void testInputIsZero() {
        // Given
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        int number = 0;

        // When
        long result = fibonacciRecursion.fibonacci(number);

        // Then
        long expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void testInputIsOne() {
        // Given
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        int number = 1;

        // When
        long result = fibonacciRecursion.fibonacci(number);

        // Then
        long expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void testNegativeInput() {
        // Given
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        int number = -5;

        // When & Then
        assertThrows(IllegalArgumentException.class, () -> fibonacciRecursion.fibonacci(number));
    }
}

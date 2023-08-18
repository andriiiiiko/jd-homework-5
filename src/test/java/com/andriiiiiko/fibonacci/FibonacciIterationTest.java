package com.andriiiiiko.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciIterationTest {

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
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        int n = 25;

        // When
        long result = fibonacciIteration.fibonacci(n);

        // Then
        long expected = 75025;
        assertEquals(expected, result);
    }

    @Test
    void testInputIsZero() {
        // Given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        int n = 0;

        // When
        long result = fibonacciIteration.fibonacci(n);

        // Then
        long expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void testInputIsOne() {
        // Given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        int n = 1;

        // When
        long result = fibonacciIteration.fibonacci(n);

        // Then
        long expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void testNegativeInput() {
        // Given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        int n = -5;

        // When & Then
        assertThrows(IllegalArgumentException.class, () -> fibonacciIteration.fibonacci(n));
    }
}

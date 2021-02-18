package com.foo.fizzbuzz;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest extends TestCase {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void before() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturn1When1() {
        assertEquals(fizzBuzz.apply(1), "1");
    }

    @Test
    void shouldReturn2When2() {
        assertEquals(fizzBuzz.apply(2), "2");
    }

    @Test
    void shouldReturnFizzWhen3() {
        assertEquals(fizzBuzz.apply(3), "fizz");
    }

    @Test
    void shouldReturnBuzzWhen5() {
        assertEquals(fizzBuzz.apply(5), "buzz");
    }

    @Test
    void shouldReturnFizzBuzzWhen15() {
        assertEquals(fizzBuzz.apply(15), "fizzbuzz");
    }

    @Test
    void shouldReturnFizzWhenMultipleOf3() {
        Integer baseNumber = 4;
        assertEquals(fizzBuzz.apply(baseNumber * 3), "fizz");
        baseNumber = 1;
        assertEquals(fizzBuzz.apply(baseNumber * 3), "fizz");
        baseNumber = 2;
        assertEquals(fizzBuzz.apply(baseNumber * 3), "fizz");
        baseNumber = 3;
        assertEquals(fizzBuzz.apply(baseNumber * 3), "fizz");
        baseNumber = 7;
        assertEquals(fizzBuzz.apply(baseNumber * 3), "fizz");
    }

    @Test
    void shouldReturnBuzzWhenMultipleOf5() {
        Integer baseNumber = 4;
        assertEquals(fizzBuzz.apply(baseNumber * 5), "buzz");
        baseNumber = 1;
        assertEquals(fizzBuzz.apply(baseNumber * 5), "buzz");
        baseNumber = 2;
        assertEquals(fizzBuzz.apply(baseNumber * 5), "buzz");
        baseNumber = 5;
        assertEquals(fizzBuzz.apply(baseNumber * 5), "buzz");
        baseNumber = 7;
        assertEquals(fizzBuzz.apply(baseNumber * 5), "buzz");
    }
    @Test
    void shouldReturnFizzBuzzWhenMultipleOf3And5() {
        Integer baseNumber = 4;
        assertEquals(fizzBuzz.apply(baseNumber * 5*3), "fizzbuzz");
        baseNumber = 1;
        assertEquals(fizzBuzz.apply(baseNumber * 5*3), "fizzbuzz");
        baseNumber = 2;
        assertEquals(fizzBuzz.apply(baseNumber * 5*3), "fizzbuzz");
        baseNumber = 5;
        assertEquals(fizzBuzz.apply(baseNumber * 5*3), "fizzbuzz");
        baseNumber = 7;
        assertEquals(fizzBuzz.apply(baseNumber * 5*3), "fizzbuzz");
    }

}

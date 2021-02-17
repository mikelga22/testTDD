package com.foo.fizzbuzz;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest extends TestCase {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void before(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturn1When1(){
        assertEquals(fizzBuzz.apply(1), "1");
    }

    @Test
    void shouldReturn2When2(){
        assertEquals(fizzBuzz.apply(2), "2");
    }

    @Test
    void shouldReturnFizzWhen3(){
        assertEquals(fizzBuzz.apply(3), "fizz");
    }

}
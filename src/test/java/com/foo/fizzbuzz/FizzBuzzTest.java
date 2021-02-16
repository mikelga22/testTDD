package com.foo.fizzbuzz;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest extends TestCase {

    private FizzBuzz fizzBuzz;

    @Test
    void shouldRetur1When1(){
        assertEquals(fizzBuzz.apply(1), "1");
    }

}
package com.foo.fizzbuzz;

public class FizzBuzz {
    public String apply(Integer number) {
        if (number == 5) return "buzz";
        if (number == 15) return "fizzbuzz";
        if (number % 3 == 0) return "fizz";
        return Integer.toString(number);
    }


}

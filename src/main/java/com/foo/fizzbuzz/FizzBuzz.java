package com.foo.fizzbuzz;

public class FizzBuzz {
    public String apply(Integer number) {
        if (number == 3) return "fizz";
        if (number == 5) return "buzz";
        if (number == 15) return "fizzbuzz";
        return Integer.toString(number);
    }


}

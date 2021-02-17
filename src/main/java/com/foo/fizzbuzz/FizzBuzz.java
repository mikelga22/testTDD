package com.foo.fizzbuzz;

public class FizzBuzz {
    public String apply(Integer number) {
        if (number == 3) return "fizz";
        else if (number == 5) return "buzz";
        else
            return Integer.toString(number);
    }


}

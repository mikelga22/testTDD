package com.foo.fizzbuzz;

public class Main {

    public static void main(String[] args){
        for(int i=1;i<101;i++) {
            System.out.println(new FizzBuzz().apply(i));
        }
    }
}

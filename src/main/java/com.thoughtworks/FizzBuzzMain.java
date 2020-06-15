package com.thoughtworks;

public class FizzBuzzMain {
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for( int i = 0; i < 100; i++) {
            String result = fizzBuzz.say(i+1);
            System.out.println(result);
        }
    }
}

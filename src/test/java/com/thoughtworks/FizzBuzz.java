package com.thoughtworks;

public class FizzBuzz {
    public String say(int s) {
        if (s%3 == 0)
        {
         return "Fizz";
        }
        return String.valueOf(s);
    }
}

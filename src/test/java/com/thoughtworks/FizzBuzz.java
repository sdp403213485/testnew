package com.thoughtworks;

public class FizzBuzz {
    public String say(int s) {
        if (s%3 == 0)
        {
         return "Fizz";
        }else if (s%5 == 0)
        {
            return "Buzz";
        }
        return String.valueOf(s);
    }
}

package com.thoughtworks;

public class FizzBuzz {
    public String say(int s) {

        if(String.valueOf(s).contains("7") && s%3 == 0){
            return "Fizz";
        }else if(String.valueOf(s).contains("5") && s%5 == 0 && s%7 == 0 ){
            return "BuzzWhizz";
        }else if (String.valueOf(s).contains("3")) {
            return "Fizz";
        }
        else if (s%3 == 0 && s%5 == 0 && s%7 == 0) {
            return "FizzBuzzWhizz";
        }else if (s%3 == 0 && s%5 == 0){
            return "FizzBuzz";
        }else if (s%3 == 0 && s%7 == 0){
            return "FizzWhizz";
        }else if (s%5 == 0 && s%7 == 0){
            return "BuzzWhizz";
        }else if (s%3 == 0) {
            return "Fizz";
        }else if (s%5 == 0) {
            return "Buzz";
        }else if (s%7 == 0){
            return "Whizz";
        }
        return String.valueOf(s);
    }
}

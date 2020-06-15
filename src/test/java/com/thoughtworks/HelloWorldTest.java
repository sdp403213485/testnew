package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertEquals(actual,"Leave me alone.");
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertEquals(actual, "Hello World");
    }

    @Test
    public void should_return_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);
        //then
        assertEquals(result, "1");
    }
    @Test
    public void should_return_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);
        //then
        assertEquals(result, "Buzz");
    }

    @Test
    public void should_return_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(15);
        //then
        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void should_return_13(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(13);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_30(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(30);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(7);
        //then
        assertEquals(result, "Whizz");
    }

    @Test
    public void should_return_21(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(21);
        //then
        assertEquals(result, "FizzWhizz");
    }

    @Test
    public void should_return_35(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(35);
        //then
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_105(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(105);
        //then
        assertEquals(result, "BuzzWhizz");
    }

    @Test
    public void should_return_70(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(70);
        //then
        assertEquals(result, "BuzzWhizz");
    }
    @Test
    public void should_return_153(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(153);
        //then
        assertEquals(result, "153");
    }
    @Test
    public void should_return_73(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(73);
        //then
        assertEquals(result, "Fizz");
    }

}

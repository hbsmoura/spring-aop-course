package com.hbsmoura.springaopcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class SomeComponent {

    public void someMethod() {
        System.out.println(getClass() + ": Some method");
    }

    public void someOtherMethod() {
        System.out.println(getClass() + ": Some other method");
    }

    public void aThirdMethod() {
        System.out.println(getClass() + ": A third method");
    }

    public void someMethodWithOneParameter(String param) {
        System.out.println(getClass() + ": Some method with one parameter: " + param);
    }

    public void someMethodWithMultipleParameters(String param1, int param2) {
        System.out.println(getClass() + ": Some method with two parameters: " + param1 + ", " + param2);
    }

    public List<String> someListOfStrings() {
        return Arrays.asList("Item 1", "Item 2", "Item3");
    }

    public void someThrowingMethod() {
        throw new RuntimeException("Some");
    }

    public void someDelayedMethod() {
        try {
            TimeUnit.SECONDS.sleep(5L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Some delayed method");
    }
}

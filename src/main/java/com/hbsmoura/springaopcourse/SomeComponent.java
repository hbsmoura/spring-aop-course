package com.hbsmoura.springaopcourse;

import org.springframework.stereotype.Component;

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
}

package com.hbsmoura.springaopcourse;

import org.springframework.stereotype.Component;

@Component
public class SomeComponent {

    public void someMethod() {
        System.out.println(getClass() + ": Doing some stuff");
    }
}

package com.hbsmoura.springaopcourse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SomeAspect {
    // this is where we add all of our related advice for logging

    // let's start with a @Before advice
    @Before("execution(public void someMethod())")
    void beforeSomeMethod() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> BEFORE ADVICE ON someMethod <<<<<<<<<<<<<<<<<");
    }

}

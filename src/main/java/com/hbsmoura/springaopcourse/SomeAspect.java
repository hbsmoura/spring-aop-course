package com.hbsmoura.springaopcourse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class SomeAspect {

    @Before("com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()")
    void beforeInitiateWithSomeAdvice(JoinPoint joinPoint) {
        System.out.println("\n>>> " + joinPoint.getSignature() +" args: "
                + Arrays.toString(joinPoint.getArgs()) +" <<<"
        );

        for(Object arg : joinPoint.getArgs()) {
            System.out.println(arg + (arg instanceof String ? " is a String" : " is not a String"));
        }
    }

}

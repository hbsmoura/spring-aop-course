package com.hbsmoura.springaopcourse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SomeAspect {

    @Before("com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()")
    void beforeSomeMethod(JoinPoint joinPoint) {
        System.out.println("\n>>> Initiate with some: "+ joinPoint.getSignature() +" <<<");
    }

}

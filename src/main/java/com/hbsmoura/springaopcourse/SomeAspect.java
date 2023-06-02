package com.hbsmoura.springaopcourse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
@Order(1)
public class SomeAspect {

    @Before("com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()")
    void beforeInitiateWithSomeAdvice(JoinPoint joinPoint) {
        System.out.println("\n>>> " + joinPoint.getSignature() +" args: "
                + Arrays.toString(joinPoint.getArgs()) +" <<<"
        );

        if(joinPoint.getTarget() instanceof SomeComponent) {
            System.out.println("Join point target is a SomeComponent instance");
        }

        for(Object arg : joinPoint.getArgs()) {
            System.out.println(arg + (arg instanceof String ? " is a String" : " is not a String"));
        }
    }

    @AfterReturning(
            pointcut = "com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()",
            returning = "result"
    )
    void afterReturningSomeListAdvice(JoinPoint joinPoint, List<String> result){
        if (result instanceof List) {
            System.out.println("Instance of List -> " + result);
        }
    }

}

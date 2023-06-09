package com.hbsmoura.springaopcourse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Aspect
@Component
@Order(1)
public class SomeAspect {

//    @Before("com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()")
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

//    @AfterReturning(
//            pointcut = "com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()",
//            returning = "result"
//    )
    void afterReturningSomeListAdvice(JoinPoint joinPoint, List<String> result){
        if (result instanceof List) {
            // Be careful with modifications
            result.set(0, "Not the item 1");
            System.out.println("Instance of List -> " + result);
        }
    }

//    @AfterThrowing(
//            pointcut = "com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()",
//            throwing = "exc"
//    )
    void afterThrowingAdvice(JoinPoint joinPoint, Throwable exc) {
        System.out.println("Aspect exception: " + exc.getMessage());
    }

//    @After("com.hbsmoura.springaopcourse.PointcutExpressions.initiateWithSome()")
    void afterAdvice(JoinPoint joinPoint) {
        // It does not have access over the return or the exception, only the join point
        System.out.println(">>> After advice works like finally clause on java exceptions <<<");
    }

    // these bad guy is a mashup of before and after advices
    @Around("execution(void someDelayedMethod())")
    Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(LocalDateTime.now());

        // The method needs to be called here
        Object proceed = pjp.proceed();

        System.out.println(LocalDateTime.now());

        return proceed;
    }

}

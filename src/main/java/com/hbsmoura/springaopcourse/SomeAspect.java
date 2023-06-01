package com.hbsmoura.springaopcourse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SomeAspect {
    @Pointcut("execution(void some*(..))")
    private void initiateWithSome() {}

    @Before("initiateWithSome()")
    void beforeSomeMethod() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Initiate with some <<<<<<<<<<<<<<<<<");
    }

}

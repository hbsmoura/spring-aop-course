package com.hbsmoura.springaopcourse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class SomeOtherAspect {
    @Pointcut("execution(void *.*(String))")
    private void haveOneStringParameter() {}

    @Before("haveOneStringParameter()")
    void beforeOneStringParameter() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Have one string parameter <<<<<<<<<<<<<<<<<");
    }

}

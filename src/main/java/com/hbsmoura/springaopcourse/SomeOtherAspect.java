package com.hbsmoura.springaopcourse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class SomeOtherAspect {

    @Before("com.hbsmoura.springaopcourse.PointcutExpressions.haveOneStringParameter()")
    void beforeOneStringParameter() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Have one string parameter <<<<<<<<<<<<<<<<<");
    }

}

package com.hbsmoura.springaopcourse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SomeAspect {
    @Pointcut("execution(void some*())")
    private void initiateWithSome() {}

    @Pointcut("execution(void *.*(String))")
    private void haveOneStringParameter() {}

    @Pointcut("execution(void com.hbsmoura.springaopcourse.*.*(*))")
    private void haveOneParameterOfAnyType() {}

    @Pointcut("execution(void *.*(String,..))")
    private void haveStringOnParameters() {}

    @Before("initiateWithSome()")
    void beforeSomeMethod() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Initiate with some <<<<<<<<<<<<<<<<<");
    }

    @Before("haveOneStringParameter()")
    void beforeOneStringParameter() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Have one string parameter <<<<<<<<<<<<<<<<<");
    }

    @Before("initiateWithSome() || haveOneStringParameter()")
    void beforeSomeOrStringParameter() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Initiate with some or have one string parameter <<<<<<<<<<<<<<<<<");
    }

    @Before("haveOneParameterOfAnyType()")
    void beforeParameterOfAnyType() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Have one parameter of any type <<<<<<<<<<<<<<<<<");
    }

    @Before("haveStringOnParameters()")
    void beforeStringOnParameters() {
        System.out.println("\n>>>>>>>>>>>>>>>>>> Have string on parameters <<<<<<<<<<<<<<<<<");
    }

}

package com.hbsmoura.springaopcourse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {

    @Pointcut("execution(void some*(..))")
    public void initiateWithSome() {}

    @Pointcut("execution(void *.*(String))")
    public void haveOneStringParameter() {}
}

package com.revature.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
    @Before("execution(public void testBeforeJoinPoint())")
    public void before() {
        System.out.println("This is before advice");
    }

    @AfterThrowing("execution(boolean testAfterThrowingJoinPoint(..))")
    public void afterThrowing() {
        System.out.println("This is afterThrowing advice");
    }

    @After("execution(public * testAfterJoinPoint(*))")
    public void after() {
        System.out.println("This is after advice");
    }

    @Around("execution(public String testAroundJoinPoint(*))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        pjp.proceed();
        System.out.println("This is around advice");
    }

}

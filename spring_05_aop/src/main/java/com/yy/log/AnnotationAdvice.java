package com.yy.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author LYY
 * @Date 2020/9/22 21:18
 * @Version 1.0
 * @Title 注解实现aop
 */
@Aspect
public class AnnotationAdvice {

    @Before("execution(* com.yy.service.*.*(..))")
    public void beforeAdvice() {
        System.out.println("====注解前置增强====");
    }

    @After("execution(* com.yy.service.*.*(..))")
    public void afterAdvice() {
        System.out.println("====注解后置增强====");
    }

    /*
    结果：
    环绕执行前
    ====注解前置增强====
    吃饭
    ====注解后置增强====
    环绕执行后
    */
    @Around("execution(* com.yy.service.*.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕执行前");
        // 执行方法
        Object o = jp.proceed();
        System.out.println("环绕执行后");

    }
}

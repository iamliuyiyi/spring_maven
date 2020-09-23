package com.yy.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author LYY
 * @Date 2020/9/22 17:13
 * @Version 1.0
 * @Title  使用spring  api实现aop
 */
public class AfterLog implements AfterReturningAdvice {


    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行后置增强代码……");
    }
}

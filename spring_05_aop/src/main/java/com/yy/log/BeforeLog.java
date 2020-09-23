package com.yy.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author LYY
 * @Date 2020/9/22 16:55
 * @Version 1.0
 * @Title 使用spring  api实现aop
 */
public class BeforeLog implements MethodBeforeAdvice {
    // method：目标对象的方法
    // args：参数
    // target：目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行前置增强代码……");
    }
}

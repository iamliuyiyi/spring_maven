package com.yy.log;

/**
 * @Author LYY
 * @Date 2020/9/22 21:05
 * @Version 1.0
 * @Title  自定义类实现aop
 */
public class DiyAdvice {

    public void beforeAdvice(){
        System.out.println("这里是自定义前置增强");
    }

    public void afterAdvice(){
        System.out.println("这里是自定义后置增强");
    }
}

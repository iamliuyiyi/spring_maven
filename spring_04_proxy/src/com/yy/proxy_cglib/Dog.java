package com.yy.proxy_cglib;

/**
 * @Author LYY
 * @Date 2020/9/16 10:56
 * @Version 1.0
 * @Title   目标类
 */
public class Dog {
     final public void run(String name){
         System.out.println("狗狗的名字"+name+"---run");
    }

    public void eat(){
        System.out.println("狗狗吃东西");
    }
}

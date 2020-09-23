package com.yy.static_factory;

import com.yy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LYY
 * @Date 2020/8/31 20:42
 * @Version 1.0
 * @Title
 */
public class test03 {
    // 还执行不了，以为工厂可以生产service对象，但是service依赖的dao层对象怎么注入呢？
    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)context.getBean("factory");
        userService.animals();

    }
}

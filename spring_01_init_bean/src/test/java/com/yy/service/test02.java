package com.yy.service;

import com.yy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LYY
 * @Date 2020/8/31 20:20
 * @Version 1.0
 * @Title
 */
public class test02 {

    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)context.getBean("userService");
        userService.animals();
    }
}

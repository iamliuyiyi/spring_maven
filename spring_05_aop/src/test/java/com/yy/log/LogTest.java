package com.yy.log;

import com.yy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LYY
 * @Date 2020/9/22 18:01
 * @Version 1.0
 * @Title
 */
public class LogTest {
    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.play();
    }
}

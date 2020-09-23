package com.yy.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;


/**
 * @Author LYY
 * @Date 2020/9/22 10:19
 * @Version 1.0
 * @Title
 */
public class TestDao {

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = context.getBean("userDao", UserDao.class);
//        userDao.play();
//    }


    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDaoImpl", UserDao.class);
        userDao.play();
    }


}

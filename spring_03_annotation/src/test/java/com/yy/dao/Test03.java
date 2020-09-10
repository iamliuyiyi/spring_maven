package com.yy.dao;

import com.yy.controller.StudentController;
import com.yy.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LYY
 * @Date 2020/9/9 10:48
 * @Version 1.0
 * @Title
 */
public class Test03 {
//    public static Logger logger = Logger.getLogger(String.valueOf(Test03.class));
    // Dao
    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);
        studentDao.homeWork();
    }

    // Service
    @Test
    public void demo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentServiceImpl", StudentService.class);
        studentService.study();
    }

    // Controller
    @Test
    public void demo3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController = context.getBean("studentController", StudentController.class);
        studentController.study();
    }
}

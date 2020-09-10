package com.yy.service.impl;

import com.yy.dao.StudentDao;
import com.yy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author LYY
 * @Date 2020/9/9 13:15
 * @Version 1.0
 * @Title
 */
@Service
public class StudentServiceImpl implements StudentService {


    private StudentDao studentDao;

    public StudentServiceImpl(){}

    //    @Qualifier("studentDao1Impl")  当一个接口有多个实现类时，可以使用Qualifier注解指定要注入的对象
    // @Autowired当只有一个构造函数的时候，这个注释可以省略
    @Autowired
    public StudentServiceImpl(@Qualifier("studentDaoImpl") StudentDao studentDao) {
        this.studentDao = studentDao;
        System.out.println(this.studentDao);
    }

    public void study() {
        studentDao.study();
    }

    public void homeWork() {
        studentDao.homeWork();
    }
}

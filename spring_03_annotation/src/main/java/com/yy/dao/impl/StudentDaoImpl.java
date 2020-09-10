package com.yy.dao.impl;

import com.yy.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @Author LYY
 * @Date 2020/9/9 11:20
 * @Version 1.0
 * @Title
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    public void study() {
        System.out.println("学生要听课");
    }

    public void homeWork() {
        System.out.println("学生要做家庭作业");
    }
}

package com.yy.dao.impl;

import com.yy.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @Author LYY
 * @Date 2020/9/9 15:32
 * @Version 1.0
 * @Title
 */
@Repository
public class StudentDao1Impl implements StudentDao {
    public void study() {
        System.out.println("第二个实现类的study");
    }

    public void homeWork() {
        System.out.println("第二个实现类的homeWork");
    }
}

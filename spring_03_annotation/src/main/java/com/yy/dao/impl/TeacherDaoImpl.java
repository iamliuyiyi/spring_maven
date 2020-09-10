package com.yy.dao.impl;

import com.yy.dao.TeacherDao;
import org.springframework.stereotype.Repository;

/**
 * @Author LYY
 * @Date 2020/9/9 11:21
 * @Version 1.0
 * @Title
 */
@Repository
public class TeacherDaoImpl implements TeacherDao {
    public void teach() {
        System.out.println("老师要教书");
    }

    public void criticism() {
        System.out.println("老师要教育学生");
    }
}

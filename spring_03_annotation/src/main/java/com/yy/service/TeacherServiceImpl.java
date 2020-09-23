package com.yy.service;

import com.yy.dao.TeacherDao;
import com.yy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LYY
 * @Date 2020/9/9 13:18
 * @Version 1.0
 * @Title
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public TeacherServiceImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void teach() {

    }

    public void criticism() {

    }
}

package com.yy.controller;

import com.yy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author LYY
 * @Date 2020/9/10 9:35
 * @Version 1.0
 * @Title
 */
@Controller
public class StudentController {

    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    @Autowired   //如果是set方法，就一定要写上@Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

//    无参构造函数并不能吧studentService给注入进去
//    @Autowired
//    public StudentController(){}


    public void study() {
        studentService.study();
    }
}

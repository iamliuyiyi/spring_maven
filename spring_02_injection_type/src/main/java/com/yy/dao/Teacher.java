package com.yy.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author LYY
 * @Date 2020/9/8 9:02
 * @Version 1.0
 * @Title
 */
public class Teacher {
    private String name;  // 老师的名字
    private Student daughter;  // 女儿
    private List<Student> studentList;  // 学生们
    private Map<String,String> books; // 所有书籍
    private Set<String> hobbies;  // 所有爱好
    private Student son;  // 儿子，null
    private Properties prop;  //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getDaughter() {
        return daughter;
    }

    public void setDaughter(Student daughter) {
        this.daughter = daughter;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Map<String, String> getBooks() {
        return books;
    }

    public void setBooks(Map<String, String> books) {
        this.books = books;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Student getSon() {
        return son;
    }

    public void setSon(Student son) {
        this.son = son;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "老师个人信息{" +'\n'+
                "   姓名：" + name +'\n'+
                "   女儿：" + daughter +'\n'+
                "   学生信息：" + studentList +'\n'+
                "   喜欢看的书：" + books +'\n'+
                "   爱好：" + hobbies +'\n'+
                "   儿子：" + son +'\n'+
                "   属性：" + prop +'\n'+
                '}';
    }
}

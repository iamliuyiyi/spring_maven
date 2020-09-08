package com.yy.pojo;

/**
 * @Author LYY
 * @Date 2020/8/31 17:37
 * @Version 1.0
 * @Title
 */
public class User {
    private String name;
    private Integer age;

//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("我的名字:"+name+"年龄："+age);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

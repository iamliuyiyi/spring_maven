package com.yy.service;

import com.yy.dao.UserDao;
import com.yy.service.UserService;

/**
 * @Author LYY
 * @Date 2020/8/31 20:14
 * @Version 1.0
 * @Title
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    // 方法二：setter方法实例化bean
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    // 方法一：由spring根据构造函数注入依赖对象




    public void animals() {
        userDao.animals();
    }
}

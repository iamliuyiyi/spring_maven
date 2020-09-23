package com.yy.service.impl;

import com.yy.dao.UserDao;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LYY
 * @Date 2020/9/22 10:14
 * @Version 1.0
 * @Title
 */
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void eat() {
        userDao.eat();
    }

    public void play() {
        userDao.play();
    }
}

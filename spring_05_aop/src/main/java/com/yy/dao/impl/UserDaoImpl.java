package com.yy.dao.impl;

import com.yy.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author LYY
 * @Date 2020/9/22 10:13
 * @Version 1.0
 * @Title
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void eat() {
        System.out.println("吃饭");
    }

    public void play() {
        System.out.println("玩耍");
    }
}

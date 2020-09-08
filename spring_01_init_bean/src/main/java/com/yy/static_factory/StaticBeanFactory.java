package com.yy.static_factory;


import com.yy.service.UserService;
import com.yy.service.impl.UserServiceImpl;

/**
 * @Author LYY
 * @Date 2020/8/31 20:34
 * @Version 1.0
 * @Title
 */
public class StaticBeanFactory {
    public static UserService getUserService() {
        return new UserServiceImpl();
    }
}

package com.yy.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author LYY
 * @Date 2020/9/11 11:50
 * @Version 1.0
 * @Title
 */
// 使用这个类，自动生成代理类
public class ProxyFactory {

    // 目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 使用lambda表达式
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
                Object returnValue;
                if (method.getName().equals("rent1")) {
                    System.out.println("代理前");
                    returnValue = method.invoke(target, args);   // 注意：这里是执行目标对象的方法，所以参数是target不是proxy
                    System.out.println("代理后");
                } else
                    returnValue = method.invoke(target, args);
                return returnValue;

        });
    }



//    public Object getProxy() {
//        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Object returnValue;
//                if (method.getName().equals("rent1")) {
//                    System.out.println("代理前");
//                    returnValue = method.invoke(target, args);
//                    System.out.println("代理后");
//                } else
//                    returnValue = method.invoke(target, args);
//                return returnValue;
//            }
//        });
//    }
}


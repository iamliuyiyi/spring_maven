package com.yy.proxy_static;

/**
 * @Author LYY
 * @Date 2020/9/10 10:12
 * @Version 1.0
 * @Title  中介（代理类）
 */
public class ZhongJie implements Renting{
    private Renting fd;   //维护一个代理对象

    public ZhongJie(Renting fd) {
        this.fd = fd;
    }

    @Override
    public void rent() {
        fd.rent();   // 代理房东出租房
    }
}

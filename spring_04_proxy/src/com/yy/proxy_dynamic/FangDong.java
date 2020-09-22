package com.yy.proxy_dynamic;

/**
 * @Author LYY
 * @Date 2020/9/10 10:12
 * @Version 1.0
 * @Title 房东（被代理类）
 */
public class FangDong implements Renting {

    @Override
    public void rent() {
        System.out.println("房东提供租房功能……");
    }
}

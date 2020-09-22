package com.yy.proxy_dynamic;

/**
 * @Author LYY
 * @Date 2020/9/10 10:15
 * @Version 1.0
 * @Title 租房客
 */
public class Wo {
    public static void main(String[] args) {
        // 被代理角色
//       Renting target = new FangDong();
//       ProxyFactory pf = new ProxyFactory(target);

        // 获取代理对象
        Renting proxy = (Renting) new ProxyFactory(new FangDong()).getProxy();
        proxy.rent();


    }
}

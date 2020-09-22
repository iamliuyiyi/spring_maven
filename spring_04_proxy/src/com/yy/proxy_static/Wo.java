package com.yy.proxy_static;

/**
 * @Author LYY
 * @Date 2020/9/10 10:15
 * @Version 1.0
 * @Title  租房客
 */
public class Wo {
    public static void main(String[] args) {
        Renting fd = new FangDong();
        Renting zj = new ZhongJie(fd);
        zj.rent();
    }
}

package com.xiaoxin.day07.demo03;

import java.util.Random;

/**
 * Random 类用来生成随机数。三步骤：
 * 1.导包
 * util.Random
 * 2.创建
 * Random r = new Random();//小括号当中留空即可
 * 3.使用
 * 获取一个int数字：(范围是int所有范围，有正负两种)int num = r.nextInt()
 * 获取一个随机数int数字（参数代表范围，左闭右开区间）
 * int num = r.nextInt(3);
 * 实际含义是：[0,3)  也就是0~2
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数为："+num);
    }
}

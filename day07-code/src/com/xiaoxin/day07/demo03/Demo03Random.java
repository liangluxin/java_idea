package com.xiaoxin.day07.demo03;

import java.util.Random;

/**
 * 题目要求：
 * 根据int变量n的值，来获取随机数字，范围是【1，n】  左闭右闭
 * 思路：
 * 1.定义一个int变量n，随意赋值
 * 2.使用Ramdom  三步骤：1.导包2.创建3.使用
 * 3.如果写10那么就是0~9  然而想要的是1-10
 * 可以发现:整体加1
 * 4打印
 */
public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //本来范围是[0，n） 整体加1变成[1,n+1)，也就是【1，n】
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}

package com.xiaoxin.day07.demo01;

import java.util.Scanner;

/**
 * 题目：键盘输入两个int数字，并且求出和值
 * 思路：
 * 1.既然输入，那么Scanner
 * 2.三个步骤  1.导包  2.创建 3 使用
 * 3.需要两个数字，所以要调用两次nextInt方法
 * 4.得到两个数字，就需要加在一起
 * 5.将结果打印输出。
 *
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("结果是："+result);
    }
}

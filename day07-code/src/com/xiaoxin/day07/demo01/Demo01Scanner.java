package com.xiaoxin.day07.demo01;

import java.util.Scanner;//1.导包

/**
 * Scanner类的功能，可以实现键盘输入数据，到程序中
 * 引用类型的一般使用步骤：
 * 1.导包
 * import 包路径.类名称；
 * 位于同一包下，可以省略
 * 只有java.lang包下的内容不需要导包，其他的包都需要导入
 * 2.创建
 * 类名称 对象名 = new 类名称();
 * 3.使用
 * 对象名.成员方法名();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建  System.in表示从键盘输入
        Scanner sc = new Scanner(System.in);
        //3.使用  获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的int数字是："+num);

        //4.获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串："+str);

    }
}

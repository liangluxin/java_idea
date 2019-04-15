package com.xiaoxin.demo05.Debug;

/**
 * Debug调试程序：
 * 可以让代码逐行执行，查看代码执行过程，调试程序中出现的bug
 * 使用方式：
 *      行号点击，添加断点（每个方法的第一行，哪里有bug添加到哪里）
 *      右键选择Debug执行程序
 *      程序就会停在断点处
 *      执行程序：
 *      f8：逐行执行程序
 *      f7：进入方法中
 *      shift +f8 跳出方法
 *      f9：跳到下一个断点，没有断点就停止
 *      ctrl+f2  退出debug模式，停止程序
 *
 */
public class Demo01Debug {
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);*/

    /*    for(int i = 0;i<3;i++){
            System.out.println(i);
        }*/
    printt();
    }

    private static void printt() {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
    }
}

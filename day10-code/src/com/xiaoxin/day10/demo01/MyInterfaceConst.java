package com.xiaoxin.day10.demo01;

/**
 * 接口当中，也可以定义成员变量 但是必须使用
 * public static final 三个关键字进行修饰。
 * 从效果看着其实就是接口的常量
 * 格式：
 * public static final 数据类型 常量民称 =数据值；
 * 一旦使用final关键字进行修饰，说明不可改变
 * 接口当中的常量，可以省略 public static final
 * 注意：
 * 1.不写照样是这样。
 * 2.接口当中的常量，必须进行赋值，不能不赋值
 * 3.接口中常量的民称，使用完全大写的字母，用下划线分割
 */
public class MyInterfaceConst {

    //这其实就是一个常量 一旦赋值，无法修改。
    public static final int NUM_OF_MY_CLASS = 10;
}

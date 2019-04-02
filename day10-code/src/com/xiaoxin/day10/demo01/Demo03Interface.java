package com.xiaoxin.day10.demo01;

/**
 * 注意：不能通过接口实现列的对象来调用接口当中的静态方法。
 * 正确用法：直接通过接口名称，直接调用其中的静态方法。
 * 格式：
 * 接口名称.静态方法(参数);
 */
public class Demo03Interface {
    public static void main(String[] args) {

        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        //impl.methodStatic();
        //直接使用接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}

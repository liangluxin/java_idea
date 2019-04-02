package com.xiaoxin.day10.demo01;

/**
 * 从jdk8开始，接口当中允许定义静态方法。
 * 格式：
 * public static 返回值类型 方法名（参数列表）{
 *     方法体
 * }
 * 提示：就是将abstract或者default换成stataic即可
 *
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}

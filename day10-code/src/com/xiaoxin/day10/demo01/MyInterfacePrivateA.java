package com.xiaoxin.day10.demo01;

/**
 * 问题描述：
 * 我们需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题。
 * 但是这个共有方法不应该让实现类使用。私有化
 *  解决方案：
 *  jdk9 开始，接口当中允许定义私有化方法。
 *  1.普通私有方法，解决多个默认方法之间的重复代码问题
 *  2.静态私有方法，解决多个静态方法之间的重复代码问题
 *  格式：
 *  private 返回值类型 方法民称（参数列表）{
 *      方法体
 *  }
 *  private static 返回值类型 方法名称（参数列表）{
 *      方法体
 *  }
 *
 */
public interface MyInterfacePrivateA {

    public default void methodDefault1(){
        System.out.println("这是默认方法1");
       // common();

    }
    public default void methodDefault2(){
        System.out.println("这是默认方法1");
        //common();

    }
/*    private void common(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/
}

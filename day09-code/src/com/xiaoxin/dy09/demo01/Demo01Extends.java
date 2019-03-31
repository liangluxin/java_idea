package com.xiaoxin.dy09.demo01;

/**
 * 在继承的关系中，“子类就是父类”，也就是说，子类可以被当做父类来看待
 * 例如:父类是员工，子类是讲师，那么“讲师就是一个员工”，关系：is a
 * 定义父类的格式（一个普通的类定义）
 * public class 父类民称{
 *     //...
 * }
 * 定义子类的格式：
 * public class 子类的名称 extends 父类民称{
 *     //..
 * }
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
    }
}

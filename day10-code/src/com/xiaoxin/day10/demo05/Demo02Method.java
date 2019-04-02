package com.xiaoxin.day10.demo05;

/**
 * 在多态的代码当中，成员方法的访问规则是：
 * 看new 的是谁，就优先用谁，没有则向上找。
 *
 * 口诀；
 * 编译看左边，运行看右边。
 * 对比：
 * 成员变量：编译看左边，运行看左边
 * 成员方法：编译看左边，运行看右边
 *
 */
public class Demo02Method {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//父子都有，优先用子  new的是子
        obj.methodFu();//子类没有，向上找到父类

        //编译看左边，左边是Fu,Fu当中没有此方法，所有编译报错，
        //obj.methodZi();
    }
}

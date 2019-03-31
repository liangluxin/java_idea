package com.xiaoxin.dy09.demo02;

/**
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象是，访问两种方式:
 *
 * 直接：通过子类对象访问成员变量：
 * 等号左边是谁，就优先用谁，没有则向上找。
 * 间接：通过成员方法访问成员变量
 * 方法属于谁，就优先用谁。没有则向上找
 *
 */
public class Demo01ExtendField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类的内容

        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);
        System.out.println("===============");
        // * 等号左边是谁，就优先用谁，没有则向上找。
        System.out.println(zi.num);
        System.out.println("===============");

        //这个方法是子类的，优先用子类的，不再向上找。
        zi.methodZi();

        zi.methodFu();



    }
}

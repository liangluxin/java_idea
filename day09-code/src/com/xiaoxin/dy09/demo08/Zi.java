package com.xiaoxin.dy09.demo08;

/**
 * super关键字的用法有三种：
 * 1.在子类的成员方法中，访问父类的成员变量。
 * 2.在子类的成员方法中，访问父类的成员方法
 * 3.在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu{

    int num = 20;

    //3
    public Zi(){
        super();
    }

    //1
    public void methodZi(){
        System.out.println(num);
        System.out.println(super.num);//父类中的num
    }
    //2
    public void method(){
        super.method();//访问父类中的method
        System.out.println("子类方法");
    }
}

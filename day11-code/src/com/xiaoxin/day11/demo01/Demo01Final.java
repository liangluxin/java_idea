package com.xiaoxin.day11.demo01;

/**
 * final关键字代表最终、不可改变的，
 * 常见四种方法：
 * 1.可以用来修饰一个类
 * 2.可以用来修饰一个方法
 * 3.可以用来修饰一个局部变量
 * 4.还可以用来修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 =20;
        System.out.println(20);
        //一旦使用final用来修饰局部变量，那么这个变量就不能再进行更改了
        //一次赋值，终身使用
        final int num2 = 200;

        //对于基本类型来说，不可变说的是变量当中的数据㐓改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("小新新");
        System.out.println(stu1);
        System.out.println(stu1.getName());


        System.out.println("=======");
        final Student stu2 = new Student("高圆圆");
        System.out.println(stu2.getName());
        stu2.setName("远远");
        System.out.println(stu2.getName());
    }
}

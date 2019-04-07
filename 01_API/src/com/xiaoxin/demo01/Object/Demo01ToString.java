package com.xiaoxin.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * java.lang.Object
 * 类Object 是类层次结构的根类
 * 每个类（Person、Student。。） 都使用Object作为超类
 * 所有对象、数组都实现这个类的方法
 */
public class Demo01ToString {
    public static void main(String[] args) {
        //Person 类默认继承了Object类，所有可以使用Object类中的toString方法
        /*
        String toString()返回该对象的字符串表示
         */
        Person p = new Person("小新",24);
        String s = p.toString();
        //com.xiaoxin.demo01.Object.Person@4554617c
        System.out.println(s);
        //直接打印对象的名字，其实就是调用对象的toString
        System.out.println(p);

        //看一个类是否重写了toString，直接打印这个类的对象即可，如果没重写，打印地址值

        Random r = new Random();
        System.out.println(r);//么有重写toString

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]重写了toString方法

    }

}

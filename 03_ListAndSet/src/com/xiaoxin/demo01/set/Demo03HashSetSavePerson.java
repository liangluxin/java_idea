package com.xiaoxin.demo01.set;

import java.util.HashSet;

/**
 * HashSet存储自定义类型元素
 * set集合保证元素为：
 * 存储的元素(String,Integer,...Student,Person),必须重写hashCode和equals方法
 *
 * 要求：
 * 同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建集合  存储perosn
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("迪丽热巴",25);
        Person p2 = new Person("迪丽热巴",25);
        Person p3 = new Person("迪丽热巴",26);
        //没有重写hash值
        System.out.println(p1.hashCode());//1163157884
        System.out.println(p2.hashCode());//1956725890
        //比较equals方法，默认比价两个对象地址值
        System.out.println(p1==p2);//false
        //没有重写，比较的是两个地址值
        System.out.println(p1.equals(p2));//false.重写之后 true
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //没重写，同名同年龄首先比价两个hash值
        System.out.println(set);

    }
}

package com.xiaoxin.demo01.Object;

import java.util.ArrayList;

public class Demo02Equals /*extends Object*/{
    public static void main(String[] args) {
        /**
         * 默认继承了Object类，所以可以使用Object类的equals方法
         *  boolean equals(Object obj) 指示其他某个对象时候与此对象相等
         *  equals方法源码：
         *      public boolean equals(Object obj) {
                return (this == obj);
                }
         参数：
         Object obj：可以传递任意的对象
         == 比较运算符   返回的是一个布尔值  true false
         基本数据类型：比较的是值
         引用数据类型：比较的是两个对象的地址值。
          */
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("古力娜扎",19);

        ArrayList<String>  list = new ArrayList<>();

       // boolean b = p1.equals(p2);
        boolean b = p1.equals(list);
        System.out.println(b);
    }
}

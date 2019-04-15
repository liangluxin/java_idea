package com.xiaoxin.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型的通配符：
 * ?:代表任意的数据类型
 * 使用方式：
 * 不能创建对象使用
 * 只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("abc");
        list02.add("a");

        printArray(list01);
        printArray(list02);

        //定义的时候不能用，作为参数传递的时候可以
       // ArrayList<?> list03 = new ArrayList<?>();


        /**
         * 定义一个方法，能遍历所有类型的ArrayList集合
         * 这时候我们不知道ArrayList集合使用什么数据类型，可以使用泛型通配符?接受数据类型
         *注意：
         * 泛型没有继承概念的，
         *  printArray(list01);
         //printArray(list02);
         printArray(ArrayList<Integer> list) 错误的 类型也不能写Object
         */
    }
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            //it.next()方法，取出的元素是Object类型，可以接受任意数据类型
            Object next = it.next();
            System.out.println(next);
        }

    }
}

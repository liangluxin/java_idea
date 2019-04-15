package com.xiaoxin.demo01.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.list接口  extends Collection接口
 * list接口特点：
 * 1.有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
 * 2.有索引，包含了一些带索引的方法
 * 3.允许存储重复的元素
 * list接口中带索引的方法（特有）：
 * public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
 * public E get(int index) :返回集合中指定位置的元素。
 * public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
 * public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素
 * 注意：
 * 操作索引的時候，一定要防止索引越界异常
 * IndexOutOfBoundException:索引越界异常，集合一般会报
 * ArrayOutOfBoundException：数组索引越界异常
 * StringOutOfBoundException：字符串索引越界异常
 */
public class Demo01List  {
    public static void main(String[] args) {
        //创建一个list集合，多态形式
        List<String> list = new ArrayList<>();
        //往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);//[a,b,a]不是地址，重写了toString方法

        // * public void add(int index, E element) :
        // 将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加元素
        list.add(3,"itjava");
        System.out.println(list);
        // * public E remove(int index) :
        // 移除列表中指定位置的元素, 返回的是被移除的元素。
        String remove = list.remove(2);
        System.out.println("被移除的元素："+remove);
        System.out.println(list);

        // * public E set(int index, E element)
        // :用指定元素替换集合中指定位置的元素,返回值的更新前的元素
        //吧最后一个a替换A
        String set = list.set(4, "A");
        System.out.println("被替换的元素："+set);
        System.out.println(list);

        //list集合 遍历三种方式
        //1.普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("----------");
        //2.使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        //3.使用增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}

package com.xiaoxin.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * 有两个常用的方法：
 * `public E next()`:返回迭代的下一个元素。
 * 取出集合中的下一个元素
 * `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
 *  判断集合中还有没有下一个元素，有就返回true，没有就返回false
 *  Iterator 迭代器面试一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象
 *  获取实现类的方式比较特殊：
 *  Collection接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象
 *
 *  迭代器的使用步骤：
 *  1.使用集合中的方法iterator()获取迭代器的实现对象，使用Iterator接口接受他（多态）
 *  2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
 *  3.使用Iterator接口中的方法next取出集合中的下一步
 *
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("小新");
        coll.add("徐璐");

        /*
         *  1.使用集合中的方法iterator()获取迭代器的实现对象，使用Iterator接口接受他（多态）
         *  注意：
         *  Iterator<E> 接口也是泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         *
         */
        //多态   接口           实现类对象
        Iterator<String> it = coll.iterator();
        //2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        boolean b = it.hasNext();
        System.out.println(b);
       // *  3.使用Iterator接口中的方法next取出集合中的下一步
        String s = it.next();
        System.out.println(s);
        /*
        循环优化
        不知道集合中有多少元素，使用while循环
        循环结束的条件，hasNext方法返回false
         */
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("-------------------");



    }
}

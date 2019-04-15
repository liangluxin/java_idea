package com.xiaoxin.demo01.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * java.utils.Collections是集合工具类，用来对集合操作吗，部分方法如下：
 * public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序
 *
 * 注意：
 *  sort(List<T> list)使用前提：
 *  被排序的集合里边存储的元素，必须实现Comparable接口，并重写compareTo方法，定义自己排序的规则
 *
 * Comparable接口的排序规则：
 *      自己(this)-参数：升序
 *      参数-自己(this):降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);//[1, 3, 2]

     // * public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序
        Collections.sort(list);//默认是升序
        System.out.println(list);//[1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);//[a, c, b]

        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("迪丽热巴",22));
        list03.add(new Person("古力娜扎",20));
        list03.add(new Person("小新",25));
        System.out.println(list03);
       /*  无论泛型为Integer还是String都实现了Comparable接口，
       并且都重写了compareTo方法，按照自己的规则进行排序
       现在要对Person这个类排序，那么这个类必须Comparable这个接口
       并重写compareTo方法
        */
        Collections.sort(list03);
        System.out.println(list03);


    }
}

package com.xiaoxin.demo04.JDK9;

import java.util.List;
import java.util.Set;

/**
 * JDK9新特性：
 * List接口，Set接口，Map接口：里边增加了一个静态方法of，可以给集合一次性添加多个元素
 * static <E> List<E> of (E... elements)
 * 使用前提：
 *      当集合中存储的元素的个数已经确定了，不能再改变时
 *      注意：
 *      1.of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
 *      2.of方法的返回值是一个不能改变的集合，集合不能在使用add，put方法添加元素，会抛出异常
 *      3.Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
 *
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        //List<String> list = List.of("a","b","c");
        //list.add("d");//抛出异常，UnsupportedOperationException不支持
       // Set<String> set = Set.of("a","a","b");//IllegalArgumentException非法参数异常，有重复元素


    }
}

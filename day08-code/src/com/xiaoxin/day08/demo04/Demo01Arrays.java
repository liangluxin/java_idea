package com.xiaoxin.day08.demo04;

import java.util.Arrays;

/**
 * java.util.Arrays是一个与数组相关的工具类，里边提供了大量静态方法，用来实现数组的常见的操作，
 * public static String toString(数组)，将参数数组变成字符串（按照默认格式：[元素1，元素2，。。。]）
 * public static void sort(数组),按照默认升序对数组的元素进行排序。
 *
 * 备注：
 * 1.如果是数值，sort默认按照升序从小到 大
 * 2.如果是字符串，sort默认按照字母升序
 * 3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Compartor接口的支持。
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {1,32,6,3,7,66};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] arrays2 = {"bbb","aaa","ccc"};
        Arrays.sort(arrays2);
        System.out.println(Arrays.toString(arrays2));
    }
}

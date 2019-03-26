package com.xiaoxin.day08.demo04;

import java.util.Arrays;

/**
 * 题目：
 * 使用Arrays相关API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class ArraysTest {
    public static void main(String[] args) {
        String str = "kjhgfdsaoiuytrdesamnbvcxz";
        //如何进行升序排列
        //必须是一个数组，才能用arrays.sort方法
        //String-->数组，也能够toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        //倒序排列forr
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

package com.xiaoxin.day08.demo01;

/**
 * 字符串常量池，程序当中直接写红色那个的双引号字符串，就在字符串常量池中。
 * 对于基本类型来说，==是进行数值的比较
 * 对于以后用类型来说，==是进行地址值的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        //比较
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
    }
}

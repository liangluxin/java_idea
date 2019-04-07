package com.xiaoxin.demo06.StringBuilder;

/**
 * java.lang.StringBulider类：字符串缓冲区，可以提高字符串的效率
 * 构造方法；
 * StringBuilder() 构造一个不带任何字符的字符串生成器，容量为16个字符
 * StringBuilder(String str) 构造一个字符串生成器，并初始化指定字符串内容
 *
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);

        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);

    }
}

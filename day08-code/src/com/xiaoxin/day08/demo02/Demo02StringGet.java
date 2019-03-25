package com.xiaoxin.day08.demo02;

/**
 * String 当中与获取相关的常用方法有：
 * public int length();获取字符串当中含有的字符个数，拿到字符串长度
 * public String concat(String str) 将当前字符串和参数字符串拼接成为返回值新的字符串。
 * public char chaAt(int index);获取指定索引位置的单个字符
 * public int indexOf（String str） 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 *
 */
public class Demo02StringGet {

    public static void main(String[] args) {
        int length = "asdgasfgkashgansgasfvsfdb".length();
        System.out.println("字符串的长度："+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char c = "Hello".charAt(1);
        System.out.println("在一号索引位置的字符是:"+c);

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //若果根本没有，返回-1值
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是："+index);
        System.out.println("HelloWorld".indexOf("abc"));

    }
}

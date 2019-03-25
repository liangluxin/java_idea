package com.xiaoxin.day08.demo02;

/**
 * String当中与换换相关的常用方法
 * public char[] toCharArray();将当前字符串拆分为字符数组作为返回值。
 * public byte[] getBytes();获得当前字符串底层的字节数组。
 * public String replace(CharSequence oldString,CharSequence newString);
 * 将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串
 * 备注：CharSequence意思就是说可以接受字符串类型。
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        System.out.println("==============");

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");

        String str1 = "how do you do";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "你会不会玩儿，你大爷的！";
        String lang2 = lang1.replace("你大爷的", "*");
        System.out.println(lang2);
    }
}

package com.xiaoxin.demo06.StringBuilder;

/**
 * StringBuilder和String可以相互转换：
 * String -》StringBuilder：可以使用StringBuilder的构造方法
 * StringBuilder(String str) 构造一个字符串生成器，并初始化指定的字符串内容。
 * stringBuilder =》string：可以使用StringBuilder中的toString方法
 */
public class demo03StringBuilder {
    public static void main(String[] args) {
        //String -》StringBuilder
        String str = "hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:"+bu);


        // stringBuilder =》string
        String s = bu.toString();
        System.out.println("s:"+s);

    }
}

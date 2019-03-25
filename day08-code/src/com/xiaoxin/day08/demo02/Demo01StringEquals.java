package com.xiaoxin.day08.demo02;

/**
 * ==是进行对象的地址值比较，如果确实需要字符串内容比较，可以使用两个方法
 * public boolean equals(Object obj):参数可以是任何对象，只有参数是一个
 * 字符串并且内容相同的才会给true，否则返回false
 * 备注：
 * 1.任何对象都能使用Object进行接收。
 * 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
 * 3.如果比较双方一个是常量和一个变量，推荐把常量字符串卸载前边。
 * 推荐："abc".equals(str1)
 * 不推荐：str.equals("abc")
 * public boolean equalsIgnoreCase(String str);忽略大小写，进行内容比较。
 *
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));

        String str4 ="Hello";
        System.out.println(str4.equals(str1));

        String str5 = "abc";
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));
        String str51 = null;
        System.out.println("abc".equals(str51));//推荐  false
     //   System.out.println(str51.equals("abc"));//报错，空指针异常


        System.out.println("=============");
        String strA = "JAVA";
        String strB = "java";
        System.out.println(strA.equals(strB));//区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}

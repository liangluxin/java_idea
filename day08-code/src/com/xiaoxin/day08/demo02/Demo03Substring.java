package com.xiaoxin.day08.demo02;

/**
 * 字符串的截取方法：
 * public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
 * public String substring(int begin,int end)截取从begin 到end 结束中间的字符串
 * 备注：[begin,end)左闭右开区间，包含左不包含右
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";//光标从H前按着向右键数
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(4,7);
        System.out.println(str3);


        //下边这种写法，字符串的内容仍然没有改变
        String strA = "Hello";
        System.out.println(strA);
        strA = "JAVA";
        System.out.println(strA);

    }
}

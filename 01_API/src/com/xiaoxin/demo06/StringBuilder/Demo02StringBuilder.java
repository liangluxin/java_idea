package com.xiaoxin.demo06.StringBuilder;

/**
 * StringBuilder常用的方法：
 * public StringBuilder append(..);添加任意类型数据的字符串形式，并返回当前对象自身。
 *
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append添加数据
        //append方法返回的是this，调用方法的对象bu，this==bu
        StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu==bu2);
    }
}

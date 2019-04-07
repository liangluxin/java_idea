package com.xiaoxin.demo04.Calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    /**
     * public Date GetTime():返回一个表示此Calendar时间值（从元年到现在）的Date对象
     * 把日历对象转换为日期对象
     */
    private static void demo04() {

        Calendar c =Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /**
     * public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
     * 把指定的字段增加或减少指定的值
     * 参数：
     * int field：传递指定的日历字段（YEAR,MONTH..）
     * int amount：把指定的字段增加或减少指定的值
     * 正数：增加
     * 负数：减少
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
    public void set(int field,int value) 将给定的日历字段设置为给定值
    参数：
    int field：传递指定的日历字段（YEAR,MONTH..）
    int value：给指定字段设置的值


     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);

        c.set(Calendar.MONTH,9);

        //同时设置年月日
        c.set(8888,8,8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MARCH);
        System.out.println(month);//西方月份0-11   我国的：1-12

        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);


    }

    /*
    public int get(int field)  返回给定日历字段的值
    参数：传递指定的日历字段（YEAR,MONTH..）
    返回值：日历字段代表的具体值
     */
    private static void demo01() {
        //1。使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MARCH);
        System.out.println(month);//西方月份0-11   我国的：1-12

        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }
}

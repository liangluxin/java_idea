package com.xiaoxin.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /**
     * Long getTime() 吧日期转换成毫秒值（等价于System.currentTimeMillis()）
     * 返回自原点以来Date对象那个表示的毫秒数
     *
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /**
     * Date类的带参构造方法
     * Date(Long date):传递毫秒值，吧毫秒值转换成Date日期
     */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    /**
     * Date类的空参数构造方法：
     * Date 获取当前系统日期和时间
     */
    private static void demo01() {

        Date date = new Date();
        System.out.println(date);
    }
}

package com.xiaoxin.demo04.Calendar;

import java.util.Calendar;

/**
 * 获取对象的方式：
 *java.util.Calendar:日历类
 * 是一个抽象类，里边提供了很多操作日字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR）
 * 无法直接创建对象，里边有一个静态方法：getInstance(),该方法返回了Calendar
 * static Calendar getInstance()使用默认时区和语言获得一个日历
 *
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);

    }
}

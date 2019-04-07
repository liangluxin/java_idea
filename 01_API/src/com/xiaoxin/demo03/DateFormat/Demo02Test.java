package com.xiaoxin.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习：计算一个人已经出生多少天
 * 分析：
 * 1.使用Scanner 类中的next获取出生日期
 * 2.DateFormat 类中的方法parse 把字符串的出生日期，解析为Date格式的出生日期
 * 3.把Date格式的出生日期转换为毫秒值
 * 4.获取当前的日期，转换为毫秒值
 * 5.使用当前日期的毫秒值，出生日期的毫秒值
 * 6.把毫秒值转换为天
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的日期，格式：yyyy-MM-dd");
        String birthdayDateString = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        long birthdayDateTime = birthdayDate.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime-birthdayDateTime;
        System.out.println(time/1000/60/60/24);

    }
}

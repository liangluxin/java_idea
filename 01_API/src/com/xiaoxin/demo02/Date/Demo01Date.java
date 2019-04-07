package com.xiaoxin.demo02.Date;

/**
 * java.util.Date 表示日期和实现的类
 * Date 表示特定的瞬间，精确到毫秒
 * 毫秒：千分之一秒   1000毫秒=1秒
 * 毫秒的作用：可以对时间和日期进行计算
 * 2099-01-03  2088-01-01中一共有多少天
 * 可以将日期转换为毫秒进行计算，计算完再把毫秒转换为日期
 * 把日期转换为毫秒：
 * 当前的日期：2088-01-01
 * 时间原点（0毫秒）：1970年1月1日 00:00:00  （英国格林威治）
 *
 * 把毫秒转换成日期：
 *
 * 注意：中国属于东八区  会把时间增加8小时
 *1970年1月1日 08:00:00
 *
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到原点经历了多少毫秒

    }
}

package com.xiaoxin.demo05.System;

import java.util.Arrays;

/**
 * java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或者系统级操作，在system类的API常用方法有：
 * public static long currentTimeMills();返回以毫秒为单位的系统时间
 * public static void arraycopy()  将数组中指定的数据拷贝到另一数组中。
 */
public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /**
     * arraycopy
     * 参数：
     * src 源数组。
     * srcPos 源数组的起始索引
     * dest  目标数组
     * destPos  目标数据中的起始位置
     * length  要赋值的数组元素数量
     * 练习：
     * [1,2,3,4,5]====>[1,2,3,9,10]
     */
    private static void demo02() {

        //定义源数组
        int[] src = {1,2,3,4,5};
        //定义目标数组
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        //使用System中的方法复制前三个元素
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));


    }

    /**
     * currentTimeMills
     * 用来测试程序效率
     */
    private static void demo01() {
        //程序执行先，获取一次毫秒值
        long s = System.currentTimeMillis();
        for(int i=1;i<=9999;i++){
            System.out.println(i);
        }
        //程序执行后，获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时；"+(e-s)+"毫秒");

    }
}

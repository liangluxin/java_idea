package com.xiaoxin.day07.demo04;

import java.util.ArrayList;

/**
 * 数组长度不可以发生改变
 * 但是ArrayList集合长度是可以改变的
 * 对于ArrayList来说，有一个尖括号<E>代表泛型
 * 泛型:也就是装在集合当中的所有元素，全都是统一的什么类型
 * 注意：泛型只能是引用类型，不能是基本类型
 */
public class demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里边装的全是string字符串类型的数据
        //备注：从jdk1.7开始，右侧内容可以不写，但<>还需要
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加一些数据，add（）方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        System.out.println(list);
        //错误写法，因为创建的时候泛型为String，添加进入的元素必须为String类型才行
        //list.add(100);


    }
}

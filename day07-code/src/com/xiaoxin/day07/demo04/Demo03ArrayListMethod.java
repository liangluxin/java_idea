package com.xiaoxin.day07.demo04;

import java.util.ArrayList;

/**
 * AarrayList当中的常用方法：
 * public boolean add(E e);向集合当中添加元素，参数的类型和泛型一致
 * 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
 * 但是对于其他集合（今后学习）来说，add不一定成功
 * public E get int（int index）;从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
 * public E remove(int index);从集合当中删除元素
 * public int size();获取集合的长度，返回值就是集合中包含的元素个数
 *
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //向集合中添加元素，add
        boolean success = list.add("小新新");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("高圆圆");
        list.add("测试");
        System.out.println(list);
        String remove = list.remove(4);
        System.out.println(list);
        System.out.println("被删除的人是："+remove);
        System.out.println(list);


        int size = list.size();
        System.out.println("集合的长度："+size);
    }
}

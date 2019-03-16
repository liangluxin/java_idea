package com.xiaoxin.day07.demo05;

import java.util.ArrayList;

/**
 * 题目：
 * 定义以指定格式打印集合的方法（ArrayList类型做参数），使用{}阔起元素，使用@分割每个元素
 * 格式：{元素@元素}；
 *
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("徐璐");
        list.add("高圆圆");
        System.out.println(list);
        printArrayList(list);
    }
    /*
    定义方法三要素
    返回值类型  只是进行打印，没有运算，没有结果。void
    方法名称    printArrayList
    参数列表    ArrayList
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size()-1){
                System.out.println("}");
            }else{
                System.out.print(name+"@");
            }
        }
    }

}

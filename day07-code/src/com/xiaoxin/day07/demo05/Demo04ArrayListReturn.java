package com.xiaoxin.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：
 * 用一个大集合存放20个随机数，然后筛选其中偶数元素，放到小集合
 * 要求使用自定义方法来实现筛选
 *
 * 分析：
 * 1.需要创建一个集合，用来存储int数字，<Integer>
 * 2.随机数字 Random nextInt()
 * 3.循环20次 吧随机数字放入大集合，for  add
 * 4.定义一个方法，用来进行筛选
 * 筛选:根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 返回值类型：ArrayList小集合
 * 方法民称：getSmallList
 * 参数列表:ArrayList大集合
 * 5.判断是偶数 num%2 ==0
 * 6.如果是偶数，就放到小集合中
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数总共有："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    //这个方法介绍大集合方法，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        //创建小集合，用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}

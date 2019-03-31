package com.xiaoxin.dy09.demo14;


import java.util.ArrayList;

//群主的类
public class Manager extends User {
    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalManey,int count){
        //首先需要一个集合，用来存储若干个红包的金额。
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下群主有多少钱,群主当前的余额
        int leftMoney = super.getMoney();
        if(totalManey > leftMoney){
            System.out.println("您的余额不足");
            return redList;
        }
        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalManey);

        //发红包需要平均拆分为count份
        int avg = totalManey / count;
        int mod = totalManey % count;//余数，零头
        //除不开的零头，包在最后一个红包当中
        //下边吧红包一个一个放到集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg +mod;
        redList.add(last);

        return redList;
    }
}

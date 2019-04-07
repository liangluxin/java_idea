package com.xiaoxin.day11.demo08;

import com.xiaoxin.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        //随机分配，有可能多  有可能少
        //最少1分钱，最多不超过“剩下平均金额的2倍”
        //第一次发红包，随机范围是0.01~6.66
        //第一次发完之后，剩下的至少是3.34。
        //此时还需要在发两个红包
        //此时的再发范围应该是0.01~3.34（娶不到右边，剩下0.01）

        //总结一下，范围的公式：1+random.nextInt(leftMoney / (leftCount*2));
        Random r = new Random();
        //totalMoney  totalCount 不变
        //额外定义两个变量，分别代表剩下的钱，剩下多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        //随机发前n-1个最后一个不需要随机
        for(int i = 0; i<totalCount-1;i++){
            int money = r.nextInt(leftMoney / (leftCount*2))+1;

            list.add(money);
            leftMoney-=money;//剩下的金额越发越少
            leftCount--;//剩下还应该在发的红包个数，递减

        }

        //最后一个红包不需要随机，直接放进去
        list.add(leftMoney);

        return list;
    }
}

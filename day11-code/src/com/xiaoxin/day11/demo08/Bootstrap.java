package com.xiaoxin.day11.demo08;


import com.xiaoxin.day11.red.OpenMode;

/*
 场景说明：
 红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己
 大多说代码都是现成的，我们所需要做的是填空题。
 我们要做的事情：
 1.设置一下程序的标题，通过构造方法的字符串参数
 2。设置群主名称
 3.设置分发策略:平均还是随机？

红包分发的策略：
1.普通红包(平均)  ：totalMoney / totalCount,余数放在最后一个红包当中。
2.手气红包（随机） ：最少一分钱，最多不超过平均数的二倍。 余额越发越少
 */
public class Bootstrap {
    public static void main(String[] args) {

        MyRed red = new MyRed("传智播客双元课程");

        //设置群主名称
        red.setOwnerName("小新新");
        //普通
      /*  NormalMode normal = new NormalMode();
        red.setOpenWay(normal);
*/

        //随机红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);


    }
}

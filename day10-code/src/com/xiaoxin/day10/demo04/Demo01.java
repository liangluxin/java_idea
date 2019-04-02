package com.xiaoxin.day10.demo04;

/**
 * 代码当中体现多态性，：父类引用指向子类对象
 * 父类名称 对象名 = new 子类名称();
 * 或者：
 * 接口名称 对象名 = new 实现类名称();
 *
 */
public class Demo01 {
    public static void main(String[] args) {
       //多态写法
        //左侧父类的引用，指向右侧子类的对象。
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}

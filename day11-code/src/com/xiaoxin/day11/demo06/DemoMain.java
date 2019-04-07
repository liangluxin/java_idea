package com.xiaoxin.day11.demo06;

/**
 * 成员变量不仅能使用基本类型，还可以使用自定类
 * 其实任何一种数据类型都可以作为成员变量的类型
 */
public class DemoMain {
    public static void main(String[] args) {
        //创建一个Hero角色
        Hero hero = new Hero();
        hero.setName("小新");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("AK-47");
        //为英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();
        //
    }
}

package com.xiaoxin.day10.demo06;

/**
 * 向上转型一定是安全的，没有问题的，但也有个弊端
 * 对象一旦向上转型为父类，那么就无法使用子类原本特有的方法
 *
 * 要想使用  解决方案：
 * 用对象的向下转型还原。
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象  多态
        Animal animal = new Cat();
        animal.eat();


        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //下边错误转型
        //本来new的是一只猫，现在非要当做狗
        //错误写法，编译不报错，但会出现运行异常
        //ClassCastException 类型转换异常
        //Dog dog = (Dog) animal;

    }
}

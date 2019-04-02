package com.xiaoxin.day10.demo02;

/*8
使用接口的时候，需要注意：
1.接口是没有静态代码块或者构造方法的。
2.一个类的直接父亲是唯一的，但是一个类可以实现多个接口
3.如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
4.如果实现类没有覆盖重写所有接口中的所有抽象方法，那么实现类就必须是一个抽象类。
5.如果实现类实现的多个接口当中，存在重复默认的方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
6.一个类如果实现直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类。继承优先于接口

 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceImpl mi = new MyInterfaceImpl();
        mi.methodA();
        mi.methodB();
        mi.mehtodAbs();
    }
}

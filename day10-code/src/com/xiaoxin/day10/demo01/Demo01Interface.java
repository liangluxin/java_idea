package com.xiaoxin.day10.demo01;

/**
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型 ，最重要的内容就是抽象方法
 * 如何定义：
 * public interface 接口名称{内容}
 *
 * 备注：换成了关键字interface 之后编译：.java---》.class
 * jdk7:接口中可以包含的内容：
 * 1.常量
 * 2.抽象方法
 * jdk8 还可以包含：
 * 3.默认方法
 * 4.静态方法
 * jdk9：
 * 5.私有方法
 * 接口的使用步骤：
 * 1.接口不能直接使用，必须有一个实现类来实现该接口。
 * 格式：
 * public class 实现类名称 implements 接口{};
 * 2.接口的实现类必须覆盖重写（实现）接口中的所有方法
 * 3.创建实现类的对象，进行使用。
 *
 * 注意事项：
 * 如果实现类并没有覆盖重写接口中所有的方法，那么这个实现类自己就必须是抽象类
 *
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法
       // MyInterfaceAbstract a = new MyInterfaceAbstract;

        //创建实现列的对象使用。
        MyInterfaceAbstractImpl mi = new MyInterfaceAbstractImpl();
        mi.methodAbs();
        mi.methodAbs2();
    }
}

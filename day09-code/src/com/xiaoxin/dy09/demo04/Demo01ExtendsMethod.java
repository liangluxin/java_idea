package com.xiaoxin.dy09.demo04;

/**
 * 在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
 *  创建的对象是谁，就优先使用谁，如果没有就向上找
 *  注意事项；
 *  无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。
 *
 *  重写（Override）
 *  概念：在继承关系中，方法的名称一样，参数列表也一样
 *  重写（Override）：发生在继承当中，方法的名称一样，参数列表也一样
 *  重载（OverLoad）：方法的名称一样，参数列表不一样
 *
 *  方法的覆盖重写的特点：创建的是子类对象，则优先用子类方法。
 */
public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        zi.method();

    }
}

package com.xiaoxin.day11.demo05;

/**
 * 如果接口的实现类，或者是父类的子类，只需要使用唯一的一次。
 * 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称(){
 *   //..覆盖重写所有抽象方法
 * };  大括号为类
 * MyInterfaceImpl为单独的文件 使用时必须new。
 * 匿名内部类解决的问题：为了解决为一个一方法不得不写一个实现文件，并且只是用一次的，较麻烦
 * 直接new接口算错误，补上一个大括号相当于一个类文件。
 *
 * 对格式“new 接口名称(){}”进行解析:
 * 1.new 代表创建对象的动作。
 * 2.接口名称就是匿名内部类需要实现那个接口
 * 3.{...}这才是匿名内部类的内容
 * 注意几点:
 * 1.匿名内部类适用怎么的场景
 * 这个类只想用一次，之后不再使用 如：MyInterfaceImpl
 * 匿名内部类，在创建对象的时候，只能使用唯一一次。
 *如果希望多次创建对象，而且类的内容一样的话，匿名就必须定义单独的实现类了。
 * 2.接口当中有两个方法，
 *匿名对象，在调用方法的时候，只能调用唯一一次。
 * 如果希望同一个对象，调用多次方法，那么必须给对象起个名字
 * 3.匿名内部类是省略了实现类、子类名称。但是匿名对象省略了对象名称。
 * 强调：匿名内部类和匿名对象不是一回事！！！！！！！！
 */
public class DemoMain {
    public static void main(String[] args) {
      /*  MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();*/
      //多态
       /* MyInterface obj = new MyInterfaceImpl();
        obj.method();*/

        //使用匿名内部类 但不是匿名对象，对象名就叫objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法11111111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222222222-A");

            }
        };
        objA.method1();
        objA.method2();
        System.out.println("==============");
        //使用匿名内部类，二而且省略了对象名称，也是匿名对象
        /*MyInterface objB =*/ new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法1111111-B");

            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222222-B");
            }
        }.method1();
        //因为匿名对象无法调用第二次方法，所以需要在创建一个匿名内部类的匿名对象
       /* objB.method1();
        objB.method2();*/
    }
}

package com.xiaoxin.day11.demo04;

/**
 * 局部内部类，如果希望访问所在方法的的局部变量，那么这个局部变量必须是有效final的
 * 备注：从jdk8开始，只要局部变量事实不变，那么final关键字可以省略
 * 原因：和生命周期有关
 * 1.new出来的对象在堆内存中，
 * 2.但是局部变量是跟着方法走的，在栈内存中。
 * 3.方法运行结束之后，立刻出站，局部变量就会立刻消失。
 * 4.new出来的对象会在堆当中持续存在，直到垃圾回收消失。
 *
 */
public class MyOuter {
    public void methodOuter(){
        /*final*/ int num = 10;//可省略
        class MyInner{
            public void mehtodInner(){
                System.out.println(num);
            }
        }
    }
}

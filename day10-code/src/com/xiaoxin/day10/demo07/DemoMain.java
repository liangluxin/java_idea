package com.xiaoxin.day10.demo07;


public class DemoMain {
    public static void main(String[] args) {
        //首先创建电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标
        Mouse mouse = new Mouse();
        //首先向上转型为USB
        USB usb = new Mouse();
        //参数USB类型，传递正好为USB鼠标
        computer.useDevice(usb);

        //创建USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态
        //方法参数为USB类型，传递的为实现类对象
        computer.useDevice(keyboard);
        computer.useDevice(new Keyboard());//匿名对象
        computer.powerOff();

        System.out.println("========");
        method(10.0);
        method(20);//int ===》double  自动类型转换
    }
    public static void method(double num){
        System.out.println(num);
    }
}

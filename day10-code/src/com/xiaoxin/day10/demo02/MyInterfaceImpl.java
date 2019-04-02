package com.xiaoxin.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void mehtodAbs() {
        System.out.println("覆盖重写AB接口都有的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B 方法");
    }
}

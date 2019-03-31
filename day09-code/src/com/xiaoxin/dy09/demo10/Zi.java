package com.xiaoxin.dy09.demo10;

public class Zi extends Fu {
    int num = 20;
    @Override
    public void method(){
        super.method();
        System.out.println("子类方法");
    }
    public void show(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}

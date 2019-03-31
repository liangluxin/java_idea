package com.xiaoxin.dy09.demo12;

public class Zi extends Fu{

    public Zi(){

        //默认的super
        System.out.println("子类构造方法执行");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}

package com.xiaoxin.demo03.Generic;

public class Demo02GenericMain {
    public static void main(String[] args) {
        //不谢泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        //创建对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("迪丽热巴");
        String name1 = gc3.getName();
        System.out.println(name1);


        //普通
       // String name = gc.getName();
        //System.out.println(name);
    }
}

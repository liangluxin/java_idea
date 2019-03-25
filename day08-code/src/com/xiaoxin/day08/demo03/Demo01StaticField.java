package com.xiaoxin.day08.demo03;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是多个对象共享
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one =new  Student ("迪丽热巴",22);
        one.room="701";
        System.out.println("学号："+one.getId()+",姓名："
                +one.getName()+",年龄："+one.getAge()+"，教室："+one.room);
        Student two = new Student("小新",24);
        System.out.println("学号："+two.getId()+",姓名："
                +two.getName()+",年龄："+two.getAge()+"，教室："+one.room);

    }
}
package com.xiaoxin.day07.demo04;

/**
 * 题目：
 * 顶一个数组，用来存储三个person对象
 * 缺点：一旦创建，程序运行期间长度不能发生改变
 */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里边用来存放peron类型的对象
        Person[] array = new Person[3];
        //System.out.println(array[0]); null
        Person one = new Person("迪丽热巴",23);
        Person two = new Person("古力娜扎",25);
        Person three = new Person("小新新",25);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        //地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //取值
        System.out.println(array[1].getName());
     /*   Person person = array[1];
        person.getName();*/

    }
}

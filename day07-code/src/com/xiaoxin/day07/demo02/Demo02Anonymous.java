package com.xiaoxin.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用
       /* Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();*/
        //匿名对象方式
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num);
        methoParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int i = sc.nextInt();
        System.out.println("输入的是："+i);
    }
    public static void methoParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);

    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}

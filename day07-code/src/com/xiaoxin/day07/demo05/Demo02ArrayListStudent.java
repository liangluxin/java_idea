package com.xiaoxin.day07.demo05;

import java.util.ArrayList;

/**
 * 题目：
 * 自定义四个学生对象，添加到集合，并遍历
 * 思路：
 * 1.既然想要学生对象，肯定要先有学生类
 * 定义学生类  四部分 private、无参构造、全参构造、setter、getter
 * 2.四个对象 需要集合存储，创建一个集合，用来存储学生对象，泛型：Student
 * 3.根据类创建四个学生对象，并且赋值
 * 4.将四个对象添加到集合中add
 * 5。遍历集合 for、size、get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("迪丽热巴",23);
        Student two = new Student("古力娜扎",24);
        Student three = new Student("高圆圆",25);
        Student four = new Student("徐璐",26);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+",年龄:"+stu.getAge());
        }
    }
}

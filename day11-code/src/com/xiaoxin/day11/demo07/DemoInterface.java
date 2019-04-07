package com.xiaoxin.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * 在我们的程序当中，只要涉及到类型的时候，任何数据类型都能使用，局部变量什么类型？都行，基本类型，字符串、自定义的类和接口都行。
 * 成员变量也可以，方法的参数和返回值也可以。
 * 接下来尝试使用接口作为方法的参数和返回值。
 */
/*
java.util.list正是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
       //使用左父右子  接口的实现关系也能实现多态性
        //左边是接口名称，右边是实现类名称，这就是多态写法
       List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }
}

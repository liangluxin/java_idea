package com.xiaoxin.demo07Integer;

/**
 * 自动装箱和自动拆箱：jdk1.5以后
 *
 */
public class Demo02Integer {
    public static void main(String[] args) {

        //自动装箱：直接把int类型的整数赋值包装类

        Integer in= 1;
        //自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本数据在进行计算
         in = in +2;
    }
}


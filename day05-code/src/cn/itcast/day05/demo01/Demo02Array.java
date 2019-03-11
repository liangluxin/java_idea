package cn.itcast.day05.demo01;

/**
 * 动态初始化：在创建数组的时候，直接指定数组当中的数据元素个数；
 * 静态初始化：在创建数组的时候，不指定数据个数多少，而是直接将具体的数据内容进行指定。
 * 静态初始化基本格式：
 * 数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，。。};
 */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，里边装的全是int数字，具体为：5,25,365
        int [] arrayA = new int[]{5,25,365};
        //创建一个数组，用来装字符串。
        String[] arrayB = new String[]{"hello","idea"};
    }
}

package cn.itcast.day05.demo01;

/**
 * 访问数组元素进行获取。
 * 访问数组元素的格式：数组名称[索引值];
 * 索引值：就是一个int数字，代表数组当中元素的编号。
 * 【注意】：索引值从0开始，一直到“数组长度-1”为止；
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态省略
        int[] array = {10,20,30};
        //直接打印，得到的是数组对应的内存哈希值。
        System.out.println(array);//[I@4554617c
        System.out.println(array[0]);//不要说第几个，第几号元素。
        //也可以将数组当中的某一个单个元素，赋值交给变量。
        int num = array[2];
        System.out.println(num);
    }
}

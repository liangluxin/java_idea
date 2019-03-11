package cn.itcast.day05.demo03;

/**
 * 遍历数组，说的就是对数组当中的没一个元素进行逐一、挨个处理，默认的处理方式就是打印输出。
 *
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //首先使用原始方法：
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("==============");
        //使用循环
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            System.out.println(array.length);
        }
        //array.fori 快捷键
        for (int i = 0; i < array.length; i++) {
            
        }
    }
}

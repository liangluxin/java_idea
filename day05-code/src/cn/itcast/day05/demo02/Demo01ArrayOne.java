package cn.itcast.day05.demo02;


public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array);//地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0

        //改变数组当中元素的内容。
        array[1] = 10;
        array[2] = 20;

    }
}

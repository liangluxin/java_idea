package cn.itcast.day04.demo03;

/**
 * 题目要求：
 * 定义一个方法，用来判断两个数字是否相同。
 *
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));

    }
    /*
     *方法定义三要素：
     * 1.返回值类型：是否  Boolean
     * 2.方法名称：isSame
     * 3.参数列表：int a ,int b
     */
    public static boolean isSame(int a ,int b){

        /*写法1
        boolean same;
        if(a==b){
            same=true;
        }else{
            same=false;
        }*/
        //第二种写法：boolean same = a ==b ? true : false;
     // boolean  same = a == b;
        return a==b;
    }
}

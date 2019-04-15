package com.xiaoxin.demo01.VarArgs;

/**
 * 可变参数：是jdk1.5以后出现的新特性
 * 使用前提：
 *      当方法的参数列表数据类型已经确定，但是参数的个数不确定是，就可以使用可变参
 *      使用格式：定义方法时使用
 *      修饰符 返回值类型 方法名(数据类型。。变量民称){}
 *      可变参数的原理：
 *      可变参数的底层原理就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这个参数
 *      传递的参数格式可以是0个（不传递） 1,2，，，，
 *
 *
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
       /* int i = add();
        System.out.println(i);
        int i1 = add(10);
        System.out.println(i1);*/
        int i2 = add(10, 20);
        System.out.println(i2);
        method("abc",5.5,10,1,2,3,4);
    }

    /**
     * 可变参数的注意事项：
     * 1.一个方法的参数列表，只能有一个可变参数
     * 2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
     */
   /* public static void method(int...a,String...b){

    }*/
/*   public static void method(int...a,String b,double d){

   }*/
    public static void method(String b,double c,int d,int...a){

    }
    //可变参数的特殊（终极）写法
  /*  public static void method(Object...obj){

    }*/

    /*
    定义计算（0-n）整数和的方法
    已知计算整数的和，数据类型已经确定 int
    但是参数的个数不确定，使用可变参数
    add();就会创建一个长度为0的数组  new int[0]
    add(10);就会创建一个长度为1的数组，存储传递过来的参数  new int[]{10}
    add(10, 20);就会创建一个长度为2的数组，存储传递过来的参数 new int[]{10,20};
     */
    public static int add(int...arr){
       // System.out.println(arr);//[I@4554617c  底层是一个数组
        //System.out.println(arr.length);//0
      //定义一个初始化的变量，记录累加求和
        int sum = 0;
        //遍历数组，获取数组中的没一个元素
        for (int i : arr) {
            //累加求和
            sum+=i;
        }
        //把结果返回
        return sum;
    }


   /* //定义一个方法，计算三个int类型整数的和
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    //定义一个方法，计算两个int类型整数的和
    public static int add(int a,int b){
        return a+b;
    }*/

}

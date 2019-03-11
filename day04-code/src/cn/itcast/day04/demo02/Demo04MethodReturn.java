package cn.itcast.day04.demo02;

/**
 *题目要求：定义一个方法，用来【求出】两个数字之和。（你帮我算，算完之后把结果告诉我）
  题目变形:定义一个方法，用来【打印】两个数字之和。（你来计算，算完之后你自己显示结果，不用告诉我结果）
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你
        //我调用你，你来帮我计算一下，算完之后，吧结果告诉我的number变量
        int number = getSum(10,20);
        System.out.println("返回值："+number);
        System.out.println("================");
        printSum(10,20);
    }
    //我是一个方法，我负责两个数字的相加
    //我有返回值int，谁调用我，我就把计算结果返回给谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责两个数字相加。
    //我没有返回值，不会吧结果告诉任何人，我自己进行打印输出
    public static void printSum(int a,int b){
        int result = a+b;
        System.out.println("结果是："+result);

    }

}

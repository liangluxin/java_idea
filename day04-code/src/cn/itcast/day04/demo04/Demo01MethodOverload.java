package cn.itcast.day04.demo04;

/**
 * 学习新技术的四点要求：
 * 1.该技术是什么？
 * 2.该技术有什么特点（使用注意、有什么用）？
 * 3.该技术怎么用？demo
 * 4.该技术什么时候用？test
 */

/*
 *对于功能类似的方法来说，因为参数列表不同，却要书那么多不同的方法名称。
 * 1.方法的重载（Overload）：多个方法的名称一样，但是参数列表不一样。
 * 好处：只需要记住唯一个方法民称，就可以实现类似的多个功能。
 * 方法重载和下列因素有关：
 * 1.参数个数不同。
 * 2.参数类型不同。
 * 3.参数的多类型顺序不同。sum（int a ,double b）、sum（double a,int b）
 * 方法重载和下列因素无关：
 * 1.与参数的名称无关。
 * 2.与方法的返回值（类型）无关。
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));

    }
    public static int sum(int a,int b){
        System.out.println("有两个参数的方法执行！");
        return a+b;
    }
    public static int sum(int a,int b,int c){
        System.out.println("有三个参数的方法执行！");
        return a+b+c;
    }
}

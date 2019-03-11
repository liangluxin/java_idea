package cn.itcast.day05.demo04;

/**
 * 一个方法可以有0、1多个参数，但是只能有0或者1个返回值，不能有多个返回值
 * 如果希望一个方法当中产生多个可过数据进行返回，怎么办？
 * 解决方案：使用一个数组作为返回值类型即可。
 */
public class Demo02ArrayReturn {

    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("总和："+result[0]);
        System.out.println("平均值："+result[1]);

    }
    public static int[] calculate(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
        //两个结果都希望进行返回
        //需要一个数组，塑料兜，数组可以保存多个结果
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;
    }
}

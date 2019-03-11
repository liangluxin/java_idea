package cn.itcast.day05.demo05Test;

/**
 * ## 第一题：需求实现

 * 模拟大乐透号码：

 * 一组大乐透号码由10个1-99之间的数字组成
 * 定义方法，打印大乐透号码信息

 * 代码实现，效果如图所示：

 ![](img\1.jpg)

 * 开发提示：

 * 使用数组保存录入的号码
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array ={10,20,30,40,50,60,66,70,80,99};
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.println("您的大乐透号码为:");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

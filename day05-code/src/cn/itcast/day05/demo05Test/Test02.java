package cn.itcast.day05.demo05Test;


/**
 * ## 第二题：需求实现
 * 打印扑克牌.
 * 代码实现，效果如图所示：
 ![](img\2.jpg)
 * 开发提示：
 * 使用两个字符串数组，分别保存花色和点数
 */
public class Test02 {
    public static void main(String[] args) {
        String[] array1 = {"黑桃","红桃","梅花","方片"};
        String[] array2 = {"A","2","3","4", "5","6","7","8","9","10","J","Q","K"};
        printCard(array1,array2);
    }
    public static void printCard(String[] array1,String[] array2){
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j <array2.length; j++) {
                String s = array1[i]+array2[j];
                System.out.print(s+" ");
            }
            System.out.println();
        }

    }
}

package cn.itcast.day05.demo03;

/**
 * 如何获取数组的长度：
 * 数组名称.length
 * 这将得到一个int数字，代表数组的长度。
 * 数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,20,30,40,50,60};
        int len = arrayB.length;
        System.out.println("arrayB的数组长度："+len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}

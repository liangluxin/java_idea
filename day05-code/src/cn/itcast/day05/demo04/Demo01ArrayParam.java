package cn.itcast.day05.demo04;

/**
 * 数组可以作为方法的参数
 * 当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        printArray(array);
        System.out.println("=========]");

    }
    /*
        三要素：
        返回值类型：只是进行打印而已，不需要进行计算也没有结果，用void
        方法民称：printArray
        参数列表：必须给我数组，我才能的打印其中的元素，int[] array
        注意：任何数据类型都可以作为方法的参数类型
     */
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}

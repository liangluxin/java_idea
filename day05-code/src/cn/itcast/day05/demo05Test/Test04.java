package cn.itcast.day05.demo05Test;

import java.util.Arrays;

/**
 * ## 第四题：需求实现
 * <p>
 * 统计字符
 * <p>
 * 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
 * 定义printCount方法，统计每个字符出现的次数并打印到控制台。
 * <p>
 * 代码实现，部分效果如图所示：
 * <p>
 * ![](img\4.jpg)
 * <p>
 * 开发提示：
 * <p>
 * 将数字强制转换，根据ASCII码表转换为字符。
 * 可以定义长度26的数组，每个元素，对应去保存每种字符的出现次数，比如0索引保存a的次数，1索引保存b的次数，以此类推。
 */
public class Test04 {
    public static void main(String[] args) {
        char[] array = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n', 'a'};
        count(array);
    }

    public static void count(char[] array) {
        //先对数组排序：
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
        int count = 0;
        char temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp == array[i]) {
                count++;
                if (i == array.length - 1) {
                    System.out.println(array[i] + "--" + count);
                }
            } else {
                System.out.println(array[i - 1] + "--" + count);
                count = 0;
                temp = array[i];
                i -= 1;
            }
        }


    }

}

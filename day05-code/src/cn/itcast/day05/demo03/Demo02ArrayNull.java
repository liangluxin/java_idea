package cn.itcast.day05.demo03;

/**
 * 所有的引用类型变量，兜可以赋值为一个null，代表其中什么都没有。
 * 数组必须进行new初始化才能使用其中的元素。
 * 如果只是赋值一个null，没有进行new创建，
 * 那么将会发生：
 * 空指针异常：NullPointerException
 * 原因：没有new
 *
 */
public class Demo02ArrayNull {
    int[] array = null;

}

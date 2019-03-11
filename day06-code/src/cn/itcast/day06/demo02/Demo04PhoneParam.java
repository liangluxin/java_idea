package cn.itcast.day06.demo02;

/**
 *任何数据类型都能作为方法的参数或者返回值
 * 本次问题：使用自定义Phone来作为方法的参数类型
 */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 6789.0;
        one.color = "土豪金";
        method(one);

    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}

package cn.itcast.day04.demo02;

/**
 * 练习矩形的打印
 */
public class Demo01Method {
    /**
     * @param args
     * 不使用方法
     * idea 智能代码提示。如for循环
     * 可以是使用 5.fori 意思是循环五次
     */
    public static void main(String[] args) {
        printMethod();
    /*    for (int i = 0; i < 5; i++) {
            for(int j = 1;j<=20;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

    }

    /*使用方法进行练习
    * 方法的定义：
    * public static void method（）;
    * 方法的使用：
    * method（）;
    * 注意事项：
    * 1.方法定义的先后顺序无所谓
    * 2.方法必须是挨着的，不能方法中嵌套另一个方法。
    * 3。方法定义后，自己不会执行，一定要进行方法的调用。
    * */
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println("*");
            }

            System.out.println();
        }
    }
}

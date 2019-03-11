package cn.itcast.day06.demo04;

/**
 * 当方法的局部变量和类的成员变量重名时，根据就近原则，优先使用局部变量。
 * 如果需要访问本类中的成员变量：
 * this.成员变量名
 *
 * "通过谁调用的方法，谁就是this"  谁调用的sayHello
 */
public class Person {
    String name;//我自己的名字


    //参数who是对方的名字
    //成员变量name是自己的名字
    //参数name是对方的名字
    //成员变量name是自己的名字
    public void sayHello(String name){
        System.out.println(name+",你好。我是："+this.name);
    }


}

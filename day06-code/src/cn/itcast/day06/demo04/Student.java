package cn.itcast.day06.demo04;

/**
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new创建对象时，其实就是在调用构造方法
 * 格式：
 * public 类名称(参数类型 参数名称){}
 * 注意：
 * 1.构造方法的名称必须和所在的类名称完全一样，就连大小写也一样
 * 2.构造方法不要写返回值类型，连void都不写
 * 3.构造方法不能return一个具体的返回值
 * 4.如果没有编写任何构造方法，那么会有一个默认的构造方法，没有参数，方法体什么事情都不做
 * 5.一旦编写至少一个构造方法，则不在赠送。
 * 6.构造方法也可以重载的
 * 重载：方法名称相同，参数列表不同。
 */
public class Student {

    private String name;
    private int age;
    public Student(){
        System.out.println("无参构造方法执行了");
    }
    public Student(String name ,int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("小新新",25);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
        //如果需要改变对象当中的成员变量数据内容，仍然使用setXxx方法
        stu2.setAge(22);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
        }
}

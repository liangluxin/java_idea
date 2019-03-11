package cn.itcast.day06.demo03;


public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "小新新";
        person.setAge(20);
      //  person.age = 25;//直接访问private内容错误写法
        person.show();
    }
}

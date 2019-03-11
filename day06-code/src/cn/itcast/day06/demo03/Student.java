package cn.itcast.day06.demo03;

/**
 * 对于基本类型当中的boolean值，Getter方法一定要写成isXxx形式，setXxx不变
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
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

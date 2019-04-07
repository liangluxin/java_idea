package com.xiaoxin.day11.demo03;

public class Body {
    public class Heart{//成员内部类

        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动，蹦蹦蹦！");
            System.out.println("我叫："+name);
        }

    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
        //匿名对象  new Heart().beat();
    }
}

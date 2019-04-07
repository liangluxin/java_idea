package com.xiaoxin.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");//设置英雄的名称
        //设置英雄的技能 第一种，创建impl文件
        //hero.setSkill(new SkillImpl());


        //还可以改成使用匿名内部类 第二种
      /*  Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("pia~pia~pia");
            }
        };
        hero.setSkill(skill);*/

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~pia");
            }
        });
        hero.attick();

    }
}

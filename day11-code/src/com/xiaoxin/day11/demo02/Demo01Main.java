package com.xiaoxin.day11.demo02;

/**
 * java中有四种权限修饰符：
 *                      public >  protected > (default) >private
 *同一个类 （我自己）      yes        yes         yes       yes
 * 同一个包 （我邻居）     yes        yes         yes       no
 * 不同包子类 （我儿子）   yes         yes        no        no
 * 不同包非子类 （陌生人）  yes        no          no       no
 *
 * 注意事项：default 不是关键  而是根本不写
 */
public class Demo01Main {
}

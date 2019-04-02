package com.xiaoxin.day10.demo03;

/**
 * 这个字接口当中有几个方法？  四个
 * methodA（）；来源于接口A
 * methodB（）；来源于接口B
 * common（）；同时来源A  B
 * 自己一个method（）；
 *
 */
public interface MyInteface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();
}

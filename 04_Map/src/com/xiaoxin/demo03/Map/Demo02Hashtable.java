package com.xiaoxin.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * java.util.Hashtable<K,V>集合 implements Map<K,V>接口
 * Hashtable：底层也是一个哈希表，是一个线程安全的集合，单线程，速度慢
 * HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快
 * HashMap集合（之前学的所有集合）：可以存储null键，null值
 * Hashtable集合不能存储null键、值；
 * Hashtable 和 Vector集合一样在jdk1.2之后被更先进的集合（HashMap，ArrayList）取代了
 *
 * Hashtable 的子类 还在使用
 * properties集合是一个唯一和IO流结合的集合
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,"a");//NullPointerException
    }
}

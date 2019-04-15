package com.xiaoxin.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<k,v>集合
 * Map集合的特点；
 * 1.Map是一个双列集合，一个元素包含两个值（一个key，一个value）
 * 2.Map集合中的元素，key和value的数据类型可以相同，也可以不相同
 * 3.Map集合中的元素，key是不允许重复的，value是可以重复的
 * 4.Map集合中的元素，key和value是一一对应的
 *
 * java.util.HasMap<k,v>集合，implements Map<k,v> 接口
 * HashMap集合的特点：
 * 1.HashMap集合底层是哈希表：查询的速度特别的快
 *      jdk1.8之前：数组+单项链表
 *      jdk1.8之后：数组+单向链表/红黑树（链表的长度超过8） 提高查询的速度
 * 2.hashMap集合是一个无序的集合，存储的元素和取出的元素的顺序有可能不一样
 * java.util.linkedHashMap<k,v>集合 extends HashMap<k,v>
 * linkedHashMap的特点:
 *     1.linkedHashMap集合底层是哈希表+链表 (保证迭代的顺序)
 *     2.linkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的。
 */
public class Demo01Map {
    public static void main(String[] args) {
        //show01();
        //show02();
        show03();
        show04();
    }

    /*
    boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。
        包含返回true，不包含返回false
     */
    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",170);
        map.put("古力娜扎",166);
        map.put("徐璐",160);
        boolean b1 = map.containsKey("迪丽热巴");
        System.out.println("b1:"+b1);
        boolean b2 = map.containsKey("小新");
        System.out.println("b2:"+b2);

    }

    /*
    public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        返回值：
        key存在，返回对应的value值
        key不存在，返回null
     */
    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",170);
        map.put("古力娜扎",166);
        map.put("徐璐",160);
        Integer v1 = map.get("迪丽热巴");
        System.out.println("v1:"+v1);
        Integer v2 = map.get("林志玲");
        System.out.println("v2:"+v2);//null


    }

    /*
    public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的 值。
            返回值：v
            key存在，v返回被删除的值
            key不存在，v返回null
     */
    private static void show02() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("徐璐",165);
        map.put("林志玲",178);
        System.out.println(map);
        Integer v1 = map.remove("林志玲");
        System.out.println("v1:"+v1);

        //int v2 = map.remove("林志");//自动拆箱  返回为null  NullPointerException
        //多实用包装类，少使用基本的。
        Integer v2 = map.remove("林志");
        System.out.println("v2:"+v2);

        System.out.println(map);


    }

    /*
    public V put(K key, V value) :  把指定的键与指定的值添加到Map集合中。
    返回值：v
    存储键值对的时候，key不重复，返回值v是null
    存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值

     */
    private static void show01() {
        //创建Map集合，多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("小新", "迪丽热巴1");
        System.out.println("v1:"+v1);

        String v2 = map.put("小新", "迪丽热巴2");
        System.out.println("v2:"+v2);//v2:迪丽热巴1
        System.out.println(map);
        map.put("llx","古力娜扎");
        map.put("小新新","杨幂");
        map.put("lx","徐璐");
        System.out.println(map);


    }
}

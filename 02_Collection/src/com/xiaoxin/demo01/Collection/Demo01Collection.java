package com.xiaoxin.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口
 * 所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
 * 任意的单列集合都可以使用Collection接口中的方法
 *
 *   共性的方法:
     public boolean add(E e)：  把给定的对象添加到当前集合中 。
     public void clear() :清空集合中所有的元素。
     public boolean remove(E e): 把给定的对象在当前集合中删除。
     public boolean contains(E e): 判断当前集合中是否包含给定的对象。
     public boolean isEmpty(): 判断当前集合是否为空。
     public int size(): 返回集合中元素的个数。
     public Object[] toArray(): 把集合中的元素，存储到数组中。
 *
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法 []

        /*
             public boolean add(E e)：  把给定的对象添加到当前集合中 。
             返回值是一个boolean值，一般返回true，所有不用接收
         */
        boolean b1 = coll.add("迪丽热巴");
        System.out.println("b1:"+b1);
        System.out.println(coll);
        coll.add("小新");
        coll.add("古力娜扎");
        coll.add("xiaoxin");
        System.out.println(coll);

        /*
           public boolean remove(E e): 把给定的对象在当前集合中删除。
           返回值是一个boolean值，集合存在元素，删除元素，返回true
                                集合不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("xiaoxin");
        System.out.println("b2:"+b2);
        boolean b3 = coll.remove("123");
        System.out.println("b3："+b3);
        System.out.println(coll);

        /**
         * public boolean contains(E e): 判断当前集合中是否包含给定的对象。
         * 包含返回true
         * 不包含返回false
         */
        boolean b4 = coll.contains("迪丽热巴");
        System.out.println("b4:"+b4);
        boolean b5 = coll.contains("xiaoxin");
        System.out.println("b5:"+b5);
        /**
         * public boolean isEmpty(): 判断当前集合是否为空。
         * 集合为空返回true，不为空返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6:"+b6);

        /**
         *      public int size(): 返回集合中元素的个数。
         */
        int size = coll.size();
        System.out.println("size:"+size);

        /*
         public Object[] toArray(): 把集合中的元素，存储到数组中。
         */
        //public Object[] toArray();把集合中的元素，存储到数组中

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*
          public void clear() :清空集合中所有的元素。
          但是不删除集合，集合还存在
         */
       /* coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());*/

    }
}

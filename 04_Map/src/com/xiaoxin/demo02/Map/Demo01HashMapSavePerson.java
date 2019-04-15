package com.xiaoxin.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap存储自定义类型键值
 * Map集合保证key是唯一的：
 *      作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
       // show01();
        show02();

    }

    /**
     * HashMap存储自定义类型键值
     * key:Person类型
     *      Person类就必须重写hashCode方法和equals方法  以保证key唯一
     * value：String类型
     *      可以重复
     */
    private static void show02() {
        //创建HahsMap集合
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"北极");
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            //没有重写会有重复，重写Person的hashCode方法和equals方法后没有重复值
            System.out.println(key+"---->"+value);
        }


    }

    /**
     * HashMap存储自定义类型键值
     * key：String类型
     *      String类重写hashCode方法和equals方法，可以保证key唯一
     * value：Person类型
     *      value可以重复(同名同年龄的人视为同一个)
     *
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("迪丽热巴",25));
        map.put("上海",new Person("古力娜扎",26));
        map.put("广州",new Person("马化腾",45));
        map.put("北京",new Person("徐璐",25));
        //使用keySet加增强for遍历Map集合
        Set<String> set = map.keySet();
        for(String key : set){
            Person value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}

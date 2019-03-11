package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {10,15,20,30,40};
        int max = array[0];//擂台
        for(int i =0;i<array.length;i++){
            //如果当前元素比max大的，则换人
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("最大值："+max);
    }
}

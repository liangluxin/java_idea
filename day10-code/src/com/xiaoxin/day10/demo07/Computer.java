package com.xiaoxin.day10.demo07;

public class Computer {

    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关闭");
    }
    //只用usb设备方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.in();
        }
        usb.close();
    }
}

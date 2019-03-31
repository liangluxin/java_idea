package com.xiaoxin.dy09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=============");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.show();
        newPhone.send();
    }
}

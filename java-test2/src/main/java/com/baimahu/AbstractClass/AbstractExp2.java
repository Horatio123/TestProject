package com.baimahu.AbstractClass;

public class AbstractExp2 {
    public static void main(String[] args){
        Iphone iphone = new Iphone();
        show(iphone);
        Honor honor = new Honor();
        show(honor);
    }

    public static void show(Phone phone){
        phone.showConfig();
    }
}

abstract class Phone{
    abstract void showConfig();
}

class Iphone extends Phone{
    @Override
    void showConfig() {
        System.out.println("2G ios");
    }
}

class Honor extends Phone{
    @Override
    void showConfig() {
        System.out.println("4G android");
    }
}

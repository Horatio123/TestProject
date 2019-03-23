package com.baimahu.AbstractClass;

public class AbstractExp {
    public static void main(String[] args){
        Iphone1 iphone = new Iphone3();
        iphone.call();
        iphone.move();
        iphone.dance();
    }
}

abstract class Iphone1 {
    void call() {
        System.out.println("calling");
    }
    public abstract void move();
    public abstract void dance();
}

abstract class Iphone2 extends Iphone1 {
    @Override
    public void move() {
        System.out.println("moving");
    }
}

class Iphone3 extends Iphone2 {
    @Override
    public void dance() {
        System.out.println("iphone3 can dancing");
    }
}

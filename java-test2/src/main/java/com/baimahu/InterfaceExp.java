package com.baimahu;

public class InterfaceExp {
    public static void main(String args[]){
        Animal pig = new Pig();
        pig.show();
        ((Pig) pig).eat();

        Pig pig2 = new Pig();
        pig2.eat();
        pig2.show(999);
        xxx.prt();

        Animal dog = new Animal(){
            @Override
            public void show() {
                System.out.println("wangwangwang");
            }
        };

        Animal cat = () -> System.out.println("miaomiao");

        dog.show();

        cat.show();
    }
}

interface Animal{
    void show();
}

interface xxx{
    static void prt(){
        System.out.println("static");
    }

    void show(int i);
}

class Pig implements Animal, xxx{
    @Override
    public void show() {
        System.out.println("ooooooo");
    }

    public void eat(){
        System.out.println("eat kang");
    }

    @Override
    public void show(int i) {
        System.out.println(i);
    }
}
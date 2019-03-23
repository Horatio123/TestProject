package com.baimahu;

import java.util.ArrayList;
import java.util.List;

public class MarkerInterfaceExp {
    public static void main(String args[]){
        Apple apple = new Apple();
        Peach peach = new Peach();
        ArrayList list = new ArrayList();
        list.add(apple);
        list.add(peach);

        for(Object obj:list){
            if(obj instanceof Permission){
                System.out.println(obj.getClass() + " is An example of Permission");
            } else {
                System.out.println(obj.getClass() + " is not a Permission");
            }
        }
    }
}
interface Permission{}

class Apple implements Permission{
    public void show(){
        System.out.println("Apple");
    }
}

class Peach{
    public void show(){
        System.out.println("peach");
    }
}
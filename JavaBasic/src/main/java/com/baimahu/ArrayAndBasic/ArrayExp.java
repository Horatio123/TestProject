package com.baimahu.ArrayAndBasic;

import java.util.Arrays;
import java.util.List;

public class ArrayExp {
    public static void main(String[] args){
        // test multi dimension array
        int [][] array2 = {
                {1, 2, 3},
                {2, 3, 4, 5},
                {3, 4, 5, 6, 7}
        };

        for(int[] i :array2){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // test static method
        int[] array = {9, 8, 7};
        Display.show(array);
        System.out.println();
        // Display.show(6); wrong
        new Display().show(array);
        System.out.println("anomy object");
        Display.show2(array);
        Display.show2(8000);

        //array to list

        //Raw use of parameterized class 'List' change List to List<Integer>
        List<Integer> list =  Arrays.asList(3, 5, 7);
        for(Object i:list){
            System.out.print(i + " ");
        }

        System.out.println();
        new AnonymousDisplay().show();

        //array of object
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("spike", 8);
        dogs[1] = new Dog("tom", 7);
        dogs[2] = new Dog("jerry", 6);

        for (Dog dog: dogs) {
            System.out.println(dog.toString());
        }
    }
}
class Display{
    public static void show(int[] a){
        for(int i: a){
            System.out.println(i);
        }
    }

    public static void show2(int ...a){
        for(int i: a){
            System.out.println(i);
        }
    }
}
class AnonymousDisplay{
    int a = 9;

    public void show(){
        System.out.println("anonymousDisplay+" + a);
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
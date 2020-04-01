package com.baimahu.ArrayAndBasic;

import java.util.Arrays;
import java.util.List;

public class ArrayExp {
    public static void main(String[] args){
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

        int[] array = {9, 8, 7};
        Display.show(array);
        System.out.println();
        // Display.show(6); wrong
        new Display().show(array);
        System.out.println("anomy object");
        Display.show2(array);
        Display.show2(8000);

        List list =  Arrays.asList(3, 5, 7);
        for(Object i:list){
            System.out.print(i + " ");
        }

        System.out.println();
        new AnonymousDisplay().show();

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

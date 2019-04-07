package com.baimahu.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        //size of array is fixed, but collection is can shrink and expand
        ArrayList arrayList = new ArrayList();
        arrayList.add(9);
        arrayList.add("pig");
        arrayList.add(6.666);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (Object o: arrayList) {
            System.out.println(o);
        }
        System.out.println();

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(666);
        integerArrayList.add(555);
        integerArrayList.add(999);
        integerArrayList.add(999);
        integerArrayList.add(1, 111);
        integerArrayList.remove((Integer)999);

        for (int i: integerArrayList) {
            System.out.println(i);
        }
        System.out.println();

        Collections.sort(integerArrayList);
        integerArrayList.forEach(System.out::println); //stream api lambda expression

    }
}

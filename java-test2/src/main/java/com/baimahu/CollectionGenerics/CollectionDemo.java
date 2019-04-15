package com.baimahu.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        integerArrayList.add(646);
        integerArrayList.add(557);
        integerArrayList.add(999);
        integerArrayList.add(999);
        integerArrayList.add(1, 118);
        integerArrayList.remove((Integer)999);

        for (int i: integerArrayList) {
            System.out.println(i);
        }
        System.out.println();

        //Collections.sort(integerArrayList);
        //Collections.reverse(integerArrayList);
        ComImpl comImpl = new ComImpl();
        Collections.sort(integerArrayList, comImpl);
        integerArrayList.forEach(System.out::println); //stream api lambda expression
        System.out.println();

        Comparator<Integer> comparator = (o1, o2) -> {
                if (o1%10 > o2%10)
                    return 1;
                else
                    return -1;
        };
        Collections.sort(integerArrayList, comparator);
        integerArrayList.forEach(System.out::println);
        System.out.println();

        Collections.sort(integerArrayList, (value1, value2)->{
            return value1/100 > value2/100? 1: -1;
        });
        integerArrayList.forEach(System.out::println);
        System.out.println();



    }
}

class ComImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;

        return -1;
    }
}

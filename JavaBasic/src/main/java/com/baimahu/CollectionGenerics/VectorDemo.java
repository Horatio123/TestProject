package com.baimahu.CollectionGenerics;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v.capacity());
        v.add(1);
        v.add(2);
        System.out.println(v.capacity());
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(77);
        System.out.println(v.capacity());
        v.remove((Integer)77);
        v.remove(3);

        System.out.println(v.capacity());
        //vector is a dynamic array in which we can increase array
        //if it exceed limit it will increase capacity by 100% arraylist is 50% (begin 10)
        //vector is synchronized thread safe arraylist is not
        //vector is slow than arraylist

        //arraylist(dynamic array) is faster than linkedlist(double linkedlist) in fetch value, but slow in add/insert value
    }
}

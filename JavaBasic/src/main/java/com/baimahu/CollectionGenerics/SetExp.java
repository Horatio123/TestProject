package com.baimahu.CollectionGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExp {

    public static void main(String[] args) {
        System.out.println("hashset get in randomly all collection are identical");
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(5));
        System.out.println(hashSet.add(4));
        System.out.println(hashSet.add(41));
        System.out.println(hashSet.add(99));
        System.out.println(hashSet.add(99));
        hashSet.forEach(System.out::println);

        System.out.println("treeset get in descending order");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.forEach(System.out::println);


    }
}

package com.baimahu.CollectionGenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateOfArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("pig");
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("pig");
        Set<String> set = new HashSet<>();

        for (String arg: arrayList){
            if(!set.add(arg))
                System.out.println(arg);
        }
        System.out.println(System.currentTimeMillis());
    }
}

package com.baimahu.CollectionGenerics;

import java.util.*;

public class MapExp {
    public static void main(String[] args) {
        // TreeMap is sorted by key
        // Map<String, String> map = new TreeMap<>();
        Map<String, String> map = new HashMap<>();
        // linkedHashMap is in order by the time put the value
        //Map<String, String> map = new LinkedHashMap<>();
        map.put("Allen", "pig");
        map.put("Bob", "dog");
        map.put("Cathy", "cat");
        // replace dog with shark in key Bob
        map.put("Bob", "shark");
        System.out.println(map);
        System.out.println();

        Set<String> keys = map.keySet();
        for(String key:keys) {
            System.out.println(key + " " + map.get(key));
        }
        // hashTable is synchronized, hashMap is not but faster allow one null key

    }
}

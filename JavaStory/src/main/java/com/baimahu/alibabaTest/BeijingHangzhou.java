package com.baimahu.alibabaTest;

import java.util.HashMap;

public class BeijingHangzhou {
    public static void main(String[] args) {
        String pattern="abba"; String str="北京 杭州 杭州 北京";
        System.out.println(isMatched(pattern, str));

        pattern="aabb"; str="北京 杭州 杭州 北京";
        System.out.println(isMatched(pattern, str));

        pattern="baab"; str="北京 杭州 杭州 北京";

        System.out.println(isMatched(pattern, str));
    }

    public static boolean isMatched(String pattern, String place) {
        HashMap<Character, String> map = new HashMap<>();
        String[] places = place.split(" ");
        // 查看模式和输入字符串长度是否匹配
        if (pattern.length() != places.length) {
            return false;
        }

        for (int i = 0; i < places.length; i++) {
            //如果hashmap中存在相应字母，查看该字母对应的value与place是否匹配
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(places[i])) return false;
            } else {
                //如果hashmap中不存在相应字母，查看hashmap中是否记录该place，存在返回false，不存在将字母和place放入map中
                if (map.containsValue(places[i])) return false;
                map.put(pattern.charAt(i), places[i]);
            }
        }
        return true;
    }

}

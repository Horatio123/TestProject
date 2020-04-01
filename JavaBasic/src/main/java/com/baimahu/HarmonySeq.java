package com.baimahu;

import java.util.HashMap;
import java.util.Map;

public class HarmonySeq {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7,3};
        System.out.println(Solution.findLHS(nums));
    }
}

class Solution {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int max = 0;
        for (int j: map.keySet()) {
            if (map.containsKey(j + 1)) {
                max = Integer.max(map.get(j) + map.get(j + 1), max);
            }
        }
        return max;
    }
}

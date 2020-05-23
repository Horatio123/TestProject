package com.baimahu.alibabaTest;

public class Poke {
    public static int min = Integer.MAX_VALUE;
    //检查牌是否出光
    public static boolean check(int[] nums) {
        boolean flag = false;
        for (int num : nums) {
            if (num > 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    //深度优先搜索，找出每一种可以出牌的方式，记录出牌的最小次数，然后返回
    public static void dfs(int[] nums, int count) {
        if(count>min)
        {
            return;
        }
        if (check(nums)) {
            int i = 0;
            while (nums[i] == 0) {
                i++;
            }
            //单张
            if (nums[i] > 0) {
                nums[i]--;
                dfs(nums, count+1);
                nums[i]++;
            }
            //对子
            if (nums[i] > 1) {
                nums[i] -= 2;
                dfs(nums,count+1);
                nums[i] += 2;
            }
            //五连
            if (i + 5 <= nums.length && nums[i] > 0 && nums[i + 1] > 0 && nums[i + 2] > 0 && nums[i + 3] > 0 && nums[i + 4] > 0) {
                for (int j = 0; j < 5; j++) {
                    nums[i + j]--;
                }
                dfs(nums, count+1);
                for (int j = 0; j < 5; j++) {
                    nums[i + j]++;
                }
            }
            //三双
            if (i + 3 <= nums.length && nums[i] > 1 && nums[i + 1] > 1 && nums[i + 2] > 1) {
                nums[i] -= 2;
                nums[i + 1] -= 2;
                nums[i + 2] -= 2;
                dfs(nums, count+1);
                nums[i] += 2;
                nums[i + 1] += 2;
                nums[i + 2] += 2;
            }
        } else {
            if(count<min)
            {
                min = count;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 2, 2, 2, 1, 1};
        dfs(nums, 0);
        System.out.println(min);

        nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        dfs(nums, 0);
        System.out.println(min);

    }
}

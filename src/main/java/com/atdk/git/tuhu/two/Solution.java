package com.atdk.git.tuhu.two;

import java.util.*;


/**
 * 数组元素可重复，而且求数组求能组合成指定值的集合
 * leetcode  1681 最小不兼容
 */
public class Solution {
    int countMin = Integer.MAX_VALUE;

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param oils int整型一维数组
     * @param box  int整型
     * @return int整型
     */
    public int change(int[] oils, int box) {
        // write code here
        travel(oils, box, new ArrayList<>());
        return countMin;
    }

    private void travel(int[] nums, int target, List<Integer> list) {
        // 递归结束
        if (target <= 0) {
            if (list.size() < countMin) {
                countMin = list.size();
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) continue;
            list.add(nums[i]);
            target = target - nums[i];
            travel(nums, target, list);
            //  回溯
            list.remove(list.size() - 1);
            target += nums[i];
        }
    }
}
package com.atdk.git.yuewen.one;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums1 int整型一维数组
     * @param m     int整型
     * @param nums2 int整型一维数组
     * @param n     int整型
     * @return int整型一维数组
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // write code here
        int[] ints1 = Arrays.copyOfRange(nums1, 0, m);
        //int[] ints2 = Arrays.copyOfRange(nums2, 0, n);

        int[] nums = Arrays.copyOf(ints1, m + n);

        for (int i = m, j = 0; i < n + m; i++, j++) {
            nums[i] = nums2[j];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[][] merge (int[][] arr) {
        // write code here
        ArrayList<int[]> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0]<= arr[i-1][1]){
                result.remove(result.size()-1);
                result.add(new int[]{arr[i-1][0],arr[i][1]});
            }else {
                result.add(arr[i]);
            }
        }
        int[][] r = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }
        return r;
    }
}

package com.atdk.git.quna.one;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 运动员可得到的最高分
     *
     * @param energy  int整型 运动员体力值
     * @param actions int整型二维数组 二维数组i为动作号 actions[i][0]为动作i+1消耗体力,actions[i][1]为动作i+1得分
     * @return int整型
     */
    int MAX_SCORE = Integer.MIN_VALUE;

    public int maxScore(int energy, int[][] actions) {
        if (actions == null || actions.length == 0) return 0;
        // write code here
        travel(actions, energy, 0, 0, 0);
        return MAX_SCORE;
    }


    public void travel(int[][] actions, int energy, int startIndex, int costEnergy, int curScore) {
        if (costEnergy > energy) return;
        for (int i = startIndex; i < actions.length; i++) {
            costEnergy += actions[i][0];
            curScore += actions[i][1];
            travel(actions, energy, i + 1, costEnergy, curScore);
            if (costEnergy <= 10 && curScore > MAX_SCORE) {
                MAX_SCORE = curScore;
            }
            // 回溯
            costEnergy -= actions[i][0];
            curScore -= actions[i][1];
        }
    }
}

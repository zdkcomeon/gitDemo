package com.atdk.git.game.Demo1;

public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 计算dag 路径上起始到目的节点的路径数目
     *
     * @param nodes int整型二维数组 第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些结点（译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a ），若为空，就是没有下一个节点了。
     * @return int整型
     */
    public int DagPathNum(int[][] nodes) {
        if (nodes == null) return 0;
        // write code here
        travel(nodes, 0, 4);
        return count;
    }

    int count;

    public void travel(int[][] nodes, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            count++;
            return;
        }
        // 当前节点可以到达的节点集合
        for (int i = 0; i < nodes[startIndex].length; i++) {
            travel(nodes, nodes[startIndex][i], endIndex);
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.DagPathNum(new int[][]{{1, 2, 3}, {3}, {3}, {4}, {}});

    }
}
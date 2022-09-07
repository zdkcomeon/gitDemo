package com.atdk.git.b.two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型
     */
    public int maxValue(TreeNode root) {
        if (root == null) return 0;
        // write code here
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxValue = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int curMaxValue = 0;
            List<TreeNode> curNodes = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                curNodes.add(curNode);
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            // 执行层序遍历
            curMaxValue = travel(curNodes, 0, curMaxValue);
            if (curMaxValue > maxValue) {
                maxValue = curMaxValue;
            }
        }
        return maxValue;
    }

    private int travel(List<TreeNode> curNodes, int startIndex, int curMaxValue) {
        //
        if (curNodes.size() == startIndex) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = startIndex; i < curNodes.size(); i++) {
            //  求三个节点的最大值
            int curMaxNodeValue = maxNodeValue(curNodes.get(i));
            curMaxValue += curMaxNodeValue;
            int travel = travel(curNodes, i, curMaxValue);
            max = Math.max(travel, max);
            // 回溯
            curMaxValue -= curMaxNodeValue;
        }
        return 0;
    }

    private int maxNodeValue(TreeNode treeNode) {
        int value = treeNode.val;
        if (treeNode.left != null && treeNode.val < treeNode.left.val) {
            value = treeNode.left.val;
        }
        if (treeNode.right != null && treeNode.val < treeNode.right.val) {
            value = treeNode.right.val;
        }
        return value;
    }

}
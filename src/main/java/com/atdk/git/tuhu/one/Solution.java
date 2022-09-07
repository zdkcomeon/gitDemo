package com.atdk.git.tuhu.one;


import java.util.HashMap;


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
     * <p>
     * 烟花颜色数
     *
     * @param root TreeNode类 烟花二叉树
     * @return int整型
     */
    HashMap<Integer, Integer> map = new HashMap<>(16);

    public int numColor(TreeNode root) {
        // write code here
        travel(root);
        return map.size();
    }

    private void travel(TreeNode root) {
        if (root == null) return;
        if (!map.containsKey(root.val)) {
            map.put(root.val, root.val);
        }
        travel(root.left);
        travel(root.right);
    }
}
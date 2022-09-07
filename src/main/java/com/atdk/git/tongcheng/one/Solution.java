package com.atdk.git.tongcheng.one;


/**
 * 最长的前后缀长度 字串
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * longestPrefix
     *
     * @param s string字符串 输入字符串
     * @return string字符串
     */
    public String longestPrefix(String s) {
        if (s == null || s.trim().length() == 0) return "";
        // write code here
        s = s.trim();
        String MAX_SIZE_S = "";
        for (int leftIndex = 0, rightIndex = s.length() - 1; leftIndex < s.length() - 1; leftIndex++, rightIndex--) {
            String pre = s.substring(0, leftIndex + 1);
            String sux = s.substring(rightIndex);
            if (pre.equals(sux) && pre.length() > MAX_SIZE_S.length()) {
                MAX_SIZE_S = pre;
            }
        }
        return MAX_SIZE_S;
    }
}
package com.atdk.git.quna.three;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 翻牌
     *
     * @param inHand string字符串 一组以单空格间隔的手牌(例如：SA HK H9 D8 C5 S5 H4)
     * @return string字符串
     */
    public String showDown(String inHand) {
        inHand = inHand.substring(1, inHand.length() - 1);
        String[] inHands = inHand.split(" ");
        Map<Character, Character> KV = new HashMap<>(16);
        for (int i = 0; i < inHands.length; i++) {
            KV.put(inHands[i].charAt(1), inHands[1].charAt(0));
        }
        return null;
    }
}
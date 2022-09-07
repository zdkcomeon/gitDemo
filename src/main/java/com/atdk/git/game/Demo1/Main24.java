package com.atdk.git.game.Demo1;

import java.util.*;

/**
 * @className: com.atdk.git.game.Demo1.Main24
 * @description: TODO
 * @author: 张山
 * @create: 2022-08-15 21:28
 */
public class Main24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String keyword = in.nextLine();
    }
}

class Solution {
    public String rearrangeString(String str, int k) {
        if (k == 0) {
            return str;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch ,map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        PriorityQueue<Character> queue = new PriorityQueue<>((c1, c2) -> {
            if (map.get(c2).intValue() != map.get(c1).intValue()) {
                return map.get(c2) - map.get(c1);
            } else {
                return c1.compareTo(c2);
            }
        });
        for (char c: map.keySet()) {
            queue.offer(c);
        }
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        while (!queue.isEmpty()) {
            List<Character> tempChars = new ArrayList<>();
            int n = Math.min(k, len);
            for (int i = 0; i < n; i++) {
                if (queue.isEmpty()) {
                    return "";
                }
                char ch = queue.poll();
                sb.append(ch);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) > 0) {
                    tempChars.add(ch);
                }
                len--;
            }
            for (Character tempChar : tempChars) {
                queue.offer(tempChar);
            }
        }

        return sb.toString();
    }
}
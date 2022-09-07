package com.atdk.git.guanglianda.one;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 粒子数
        int n = scanner.nextInt();
        int[] start, end;
        scanner.nextLine();
        String s1 = scanner.nextLine();
        String[] s2 = s1.split(" ");
        start = new int[s2.length];
        for (int i = 0; i < start.length; i++) {
            start[i] = Integer.valueOf(s2[i]);
        }
        s1 = scanner.nextLine();
        s2 = s1.split(" ");
        end = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            end[i] = Integer.valueOf(s2[i]);
        }
        HashMap<Integer, Integer> startMap = new HashMap<>(16);
        for (int i = 0; i < n; i++) {
            // 存储数据索引
            startMap.put(start[i], i);
        }
        System.out.println(n);
    }
}

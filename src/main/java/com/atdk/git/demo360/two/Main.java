package com.atdk.git.demo360.two;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        int[][] s = new int[T][4];
        for (int i = 0; i < T; i++) {
            String s1 = scanner.nextLine();
            String[] s2 = s1.split(" ");
            for (int j = 0; j < 4; j++) {
                s[i][j] = Integer.valueOf(s2[j]);
            }
        }
        int[] count = new int[T];
        for (int i = 0; i < T; i++) {
            // 四个人的队伍
            count[i] += s[i][3];
            // 三个人的队伍填充
            if (s[i][2] > 0 && s[i][2] <= s[i][0]) {
                // 三个人队伍少于1个人队伍
                count[i] += s[i][2];
                s[i][0] -= s[i][2];
            } else if (s[i][0] > 0) {
                // 三个人的队伍多余1个人的队伍
                count[i] += s[i][0];
                s[i][0] = 0;
            }
            //  两个人的队伍填充
            // 两个两个填充
            int v2 = s[i][1] / 2;
            if (v2 > 0) {
                count[i] += v2;
                s[i][1] -= (v2 * 2);
            }
            // 两个 填充1个
            if (s[i][1] > 0 && s[i][0] >= 2) {
                count[i]++;
                s[i][0] -= 2;
            }
            // 4个 1
            int v4 = s[i][0] / 4;
            if (s[i][0] >= 4 && v4 >= 0) {
                count[i] += v4;
            }
            System.out.println(count[i]);
        }
    }
}

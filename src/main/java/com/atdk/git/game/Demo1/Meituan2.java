package com.atdk.git.game.Demo1;

import java.util.Scanner;

/**
 * @className: com.atdk.git.game.Demo1.Meituan2
 * @description: TODO
 * @author: 张山
 * @create: 2022-08-20 10:16
 */
public class Meituan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 棋盘大小
        int n = scanner.nextInt();
        scanner.nextLine();
        // 第一个信标位置
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int x1 = Integer.valueOf(s1[0]);
        int y1 = Integer.valueOf(s1[1]);
        // 第二个信标位置
        s = scanner.nextLine();
        String[] s2 = s.split(" ");
        int x2 = Integer.valueOf(s2[0]);
        int y2 = Integer.valueOf(s2[1]);
        // 第三个信标位置
        s = scanner.nextLine();
        String[] s3 = s.split(" ");
        int x3 = Integer.valueOf(s3[0]);
        int y3 = Integer.valueOf(s3[1]);

        // 距离
        s = scanner.nextLine();
        String[] s4 = s.split(" ");
        int l1 = Integer.valueOf(s4[0]);
        int l2 = Integer.valueOf(s4[1]);
        int l3 = Integer.valueOf(s4[2]);
        scanner.close();
        //  计算

    }
}


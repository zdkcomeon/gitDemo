package com.atdk.git.game.Demo1;

import java.util.Scanner;

/**
 * @className: com.atdk.git.game.Demo1.MeiTuan1
 * @description: TODO
 * @author: 张山
 * @create: 2022-08-20 10:04
 */
public class MeiTuan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 烤串的长度
        int n = scanner.nextInt();
        // 荤菜 种类i
        String A = scanner.next();
        // 素菜种类
        String B = scanner.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(A.charAt(i));
            result.append(B.charAt(i));
        }
        System.out.println(result.toString());
    }
}

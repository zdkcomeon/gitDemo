package com.atdk.git.demo360.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            int length = s[i].length();
            if (length > 10) {
                flag = false;
            } else {
                for (int j = 0; j < length; j++) {
                    if (!(65 <= s[i].charAt(j) && s[i].charAt(j) <= 90) && !(97 <= s[i].charAt(j) && s[i].charAt(j) <= 122)) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}
